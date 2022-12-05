package ru.kata.spring.boot_security.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import ru.kata.spring.boot_security.demo.dao.UserDao;
import ru.kata.spring.boot_security.demo.dao.UserDaoImp;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;
import ru.kata.spring.boot_security.demo.service.UserServiceImp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Main {
    public static void main(String[] args) {
//        SessionFactory factory = new Configuration()
//                .configure("application.properties")
//                .addAnnotatedClass(User.class)
//                .addAnnotatedClass(Role.class)
//                .buildSessionFactory();
//        Session session = null;
//        try {
//            session = factory.getCurrentSession();
//
//            Role role = new Role(1,"ADMIN");
//            User user1 = new User("admin", "admin", 22, "admin", "admin");
//            user1.setToRole(role);
//
//            session.beginTransaction();
//
//            session.save(user1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        }
//        finally {
//            session.close();
//            factory.close();
//        }
//        Role role = new Role(1,"ADMIN");
//        User user1 = new User("admin", "admin", 22, "admin", "admin");
//        user1.setToRole(role);
//        UserDao userDao = new UserDaoImp();
//        userDao.save(user1);

    }
}
