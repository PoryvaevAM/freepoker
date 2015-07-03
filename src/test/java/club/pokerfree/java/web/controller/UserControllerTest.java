/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.pokerfree.java.web.controller;

import club.pokerfree.java.web.model.User;
import club.pokerfree.java.web.service.UserService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;

/**
 *
 * @author Alexandr
 */
public class UserControllerTest {
    
    class TestableUserController extends UserController{
    
        public void setUserService (UserService userService) {
            this.userService = userService;
        }
    }
    
    public UserControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }



    /**
     * Test of login method, of class UserController.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        ModelMap model = new BindingAwareModelMap();
        UserController instance = new UserController();
        String expResult = "login";
        String result = instance.login(model);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of registration method, of class UserController.
     */
    @Test
    public void testRegistration() {
        System.out.println("registration");
        ModelMap model = new BindingAwareModelMap();
        UserController instance = new UserController();
        String expResult = "registration";
        String result = instance.registration(model);
        assertEquals(expResult, result);
    }

    /**
     * Test of registered method, of class UserController.
     */
    @Test
    public void testRegistered() throws Exception {
        System.out.println("registered");
        String login = "admin";
        String password = "adminka";
        String email = "special fail";
        String fullname = "Dr Captain";
        ModelMap model = new BindingAwareModelMap();
        TestableUserController instance = new TestableUserController();
        instance.setUserService(new UserService() {

            @Override
            public User find(Integer id) {
                return new User();
            }

            @Override
            public List<User> findAll() throws SQLException {
                return new ArrayList<>();
            }

            @Override
            public int save(User u) {
               return 1;
            }

            @Override
            public void insertUser(User u) {
                
            }
        });
        String expResult = "login";
        String result = instance.registered(login, password, email, fullname, model);
        assertEquals(expResult, result);
    }
    
}
