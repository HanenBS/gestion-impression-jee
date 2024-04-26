package iit.jee.gestionimpressionjee.servlet;

import iit.jee.gestionimpressionjee.models.Matiere;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MatiereServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Matiere> matieres = new ArrayList<>();
        matieres.add(new Matiere("Mathématiques"));
        matieres.add(new Matiere("Physique"));
        matieres.add(new Matiere("Chimie"));

        request.setAttribute("matieres", matieres);
        RequestDispatcher view = request.getRequestDispatcher("listeMatieres.jsp");
        view.forward(request, response);
    }
}

