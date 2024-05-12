<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Accueil Enseignant</title>
    <!-- Mettez ici vos liens vers les fichiers CSS -->
</head>
<body>
<h1>Bienvenue, <%= request.getAttribute("nomEnseignant") %></h1>
<p>Enseignant de <%= request.getAttribute("matieresEnseignees") %></p>
<hr>
<h2>Menu principal :</h2>
<ol>
    <li><a href="demandeTirage.jsp">Faire une demande de tirage</a></li>
    <li><a href="etatDemandes.jsp">Etat des demandes</a></li>
    <li><a href="modifierProfil.jsp">Modifier mon profil</a></li>
    <li><a href="deconnexion.jsp">Déconnexion</a></li>
</ol>
<!-- Mettez ici vos scripts JavaScript -->
</body>
</html>