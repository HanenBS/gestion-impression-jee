<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Faire une demande de tirage</title>
    <!-- Mettez ici vos liens vers les fichiers CSS -->
</head>
<body>
<h1>Faire une demande de tirage</h1>
<!-- Formulaire pour la demande de tirage -->
<form action="traitementDemandeTirage.jsp" method="post">
    <!-- Vos champs de formulaire ici -->
    <!-- Par exemple: -->
    Matière: <input type="text" name="matiere"><br>
    Document à imprimer: <input type="file" name="document"><br>
    Date et heure d'arrivée: <input type="datetime-local" name="dateArrivee"><br>
    Nombre de copies: <input type="number" name="nombreCopies" min="1"><br>
    <input type="submit" value="Envoyer demande">
</form>
<!-- Mettez ici vos scripts JavaScript -->
</body>
</html>