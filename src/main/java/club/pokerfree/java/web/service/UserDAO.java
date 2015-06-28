
package club.pokerfree.java.web.service;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import club.pokerfree.java.web.model.User;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "userDAO")
@Transactional
public class UserDAO implements UserService, UserDetailsService {
    @Autowired
    SessionFactory sf;
    
    @Override
    public List<User> findAll() throws SQLException {
        return sf.getCurrentSession().createQuery("from User").list();
    }
    
    @Override
    public int save(User u) {
        return  (Integer) sf.getCurrentSession().save(u);
    }
    
    @Override
    public User find(Integer id) {
        return (User) sf.getCurrentSession().get(User.class, id);
    }

    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        User user = null;
        
        try {
            Query q = sf.getCurrentSession().createQuery("from User u where u.login = :login");
            q.setString("login", string);
            List<User> users = q.list();
            if (users.isEmpty()) {
                throw new UsernameNotFoundException("User " + string + " not found");
            } else {
                return users.get(0);
            }
        } catch (Exception e) {
            System.err.println("trouble!");
        }
        return null;
    }

    @Override
    public void insertUser(User u){
        String query ="INSERT INTO users (login, password, fullname, email)"+" "+ "VALUES"+" "+"('"+u.getLogin()+"', '"+u.getPassword()+"', '"+u.getFullname()+"', '"+u.getEmail()+"')";
        
        sf.getCurrentSession().createSQLQuery(query).executeUpdate();
        
    }
}

