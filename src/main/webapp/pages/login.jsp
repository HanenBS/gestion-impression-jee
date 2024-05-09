<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Page de Connexion</title>
</head>
<body>
<h2>Connexion</h2>
<%-- Afficher un message d'erreur si les identifiants sont incorrects --%>
<% if (request.getParameter("error") != null) { %>
<p style="color: red;">Identifiants incorrects. Veuillez réessayer.</p>
<% } %>
<form action="LoginServlet" method="post">
    <label for="username">Nom d'utilisateur:</label>
    <input type="text" id="username" name="username" required><br><br>
    <label for="password">Mot de passe:</label>
    <input type="password" id="password" name="password" required><br><br>
    <input type="submit" value="Se connecter">
</form>
</body>
</html>
