
package club.pokerfree.java.web.service;

import java.sql.SQLException;
import java.util.List;
import club.pokerfree.java.web.model.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService {

    User find(Integer id);
    List<User> findAll() throws SQLException;
    int save(User u);
    void insertUser(User u);
}
