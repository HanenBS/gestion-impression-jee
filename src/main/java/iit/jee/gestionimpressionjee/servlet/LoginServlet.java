package iit.jee.gestionimpressionjee.servlet;


import iit.jee.gestionimpressionjee.dao.UserDao;
import iit.jee.gestionimpressionjee.dao.UserDaoImp;
import iit.jee.gestionimpressionjee.models.User;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;



import jakarta.servlet.RequestDispatcher;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = (RequestDispatcher) request.getRequestDispatcher("login.jsp");
        try {
            dispatcher.forward((ServletRequest) request, (ServletResponse) response);
        } catch (jakarta.servlet.ServletException e) {
            throw new RuntimeException(e);
        }
    }

    private UserDao userDao = new UserDaoImp();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Retrieve user from database based on username and password
        User user = userDao.getUserByUsernameAndPassword(username, password);
        System.out.println("User ID Retrieved: " + user.getUserId());

        if (user != null && user.isActive()) {
            // User found, set session attribute and redirect to home page
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("home.jsp");
        } else {
            // User not found, redirect to login page with error message
            response.sendRedirect("login.jsp?error=Invalid credentials");
        }
    }
}