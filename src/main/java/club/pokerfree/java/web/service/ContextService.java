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
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alexandr
 */
@Transactional
public interface ContextService {
    
   List<Faq> findAllFaq() throws SQLException;
   List<News> findAllNews() throws SQLException; 
   List<Pokerroom> findAllPokerroom() throws SQLException;
   List<Shares> findAllShares() throws SQLException;
}
