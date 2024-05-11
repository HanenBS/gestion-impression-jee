package iit.jee.gestionimpressionjee.filters;

import iit.jee.gestionimpressionjee.models.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SecurityFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpSession session = httpRequest.getSession(false);

        if (session == null || session.getAttribute("user") == null) {
            // User not logged in, redirect to login
            ((HttpServletResponse) servletResponse).sendRedirect("login.jsp");
            return;
        }

        // Check user role and allowed roles (replace with your logic)
        User user = (User) session.getAttribute("user");
        if (User.isAuthorized(user.getRole(), httpRequest.getRequestURI())) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            ((HttpServletResponse) servletResponse).sendRedirect("login.jsp");
        }
    }

    @Override
    public void destroy() {

    }

}
