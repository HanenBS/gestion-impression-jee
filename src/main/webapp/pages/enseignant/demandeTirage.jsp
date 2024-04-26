<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Demande de tirage</title>
</head>
<body>
<h1>Demande de tirage</h1>
<form action="DemandeImpression" method="post">
    <label for="matiere">Matière :</label>
    <select name="matiere" id="matiere">
        <option value="maths">Mathématiques</option>
        <option value="physique">Physique</option>

    </select><br><br>
    <label for="document">Document à imprimer (PDF) :</label>
    <input type="file" name="document" id="document"><br><br>
    <label for="dateHeure">Date et heure de récupération :</label>
    <input type="datetime-local" name="dateHeure" id="dateHeure"><br><br>
    <label for="nombreCopies">Nombre de copies :</label>
    <input type="number" name="nombreCopies" id="nombreCopies" min="1"><br><br>
    <input type="submit" value="Envoyer la demande">
</form>
</body>
</html>

