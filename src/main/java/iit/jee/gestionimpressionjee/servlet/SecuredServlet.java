package iit.jee.gestionimpressionjee.servlet;


import iit.jee.gestionimpressionjee.enums.UserRole;
import iit.jee.gestionimpressionjee.models.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public abstract class SecuredServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        User user = (User) session.getAttribute("user");
        UserRole userRole = user.getRole();

        if (isAuthorized(userRole)) {
            // User has proper role, continue processing request (dispatch to JSP)
            doGetInternal(request, response);
        } else {
            // User doesn't have access, redirect to unauthorized page
            response.sendRedirect("login.jsp");
        }
    }
    private boolean isAuthorized(UserRole userRole) {
        for (UserRole allowedRole : UserRole.values()) {
            if (userRole == allowedRole)
            {

                return true;
            }
        }
        return false;
    }
    protected abstract void doGetInternal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
}
