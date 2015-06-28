/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.pokerfree.java.web.service;

import club.pokerfree.java.web.model.Faq;
import club.pokerfree.java.web.model.News;
import club.pokerfree.java.web.model.Pokerroom;
import club.pokerfree.java.web.model.Shares;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alexandr
 */
@Transactional
@Repository
public class ContextDAO implements ContextService {

    @Autowired
    SessionFactory sf;
    
    @Override
    public List<Faq> findAllFaq() throws SQLException {
         return sf.getCurrentSession().createQuery("from Faq").list();
    }

    @Override
    public List<News> findAllNews() throws SQLException {
         return sf.getCurrentSession().createQuery("from News").list();
    }

    @Override
    public List<Pokerroom> findAllPokerroom() throws SQLException {
        return sf.getCurrentSession().createQuery("from Pokerroom").list();
    }

    @Override
    public List<Shares> findAllShares() throws SQLException {
        return sf.getCurrentSession().createQuery("from Shares").list();
    }
    
}
