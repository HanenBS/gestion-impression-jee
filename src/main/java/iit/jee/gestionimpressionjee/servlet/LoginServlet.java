package iit.jee.gestionimpressionjee.servlet;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import iit.jee.gestionimpressionjee.utils.MongoDBUtil;
import org.bson.Document;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private final MongoDatabase database = MongoDBUtil.connect();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        MongoCollection<Document> usersCollection = database.getCollection("users");
        Document user = usersCollection.find(Filters.eq("username", username)).first();

        if (user != null && user.getString("password").equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("role", user.getString("role"));
            response.sendRedirect(getDashboardURL(user.getString("role")));
        } else {
            response.sendRedirect("login.jsp");
        }
    }

    private String getDashboardURL(String role) {
        if ("admin".equals(role)) {
            return "admin_dashboard.jsp";
        } else if ("teacher".equals(role)) {
            return "teacher_dashboard.jsp";
        } else if ("printer".equals(role)) {
            return "printer_dashboard.jsp";
        } else {
            return "login.jsp";
        }
    }
}

