package controllers;

import dao.UserDaoImplements;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joshua on 28/01/2017.
 */
public class Controller extends HttpServlet {

    private List<User> userList = new ArrayList<User>();
    private static ApplicationContext beans = new ClassPathXmlApplicationContext("spring-conf.xml");

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDaoImplements udi = (UserDaoImplements)beans.getBean("userDaoImp");

        try {
            userList = udi.getAllUser();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        req.setAttribute("list", userList);
        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }
}
