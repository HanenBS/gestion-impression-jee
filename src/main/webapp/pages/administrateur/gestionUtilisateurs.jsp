<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestion des Utilisateurs</title>
    <link rel="stylesheet" href="styles.css"> <!-- Lien vers une feuille de styles pour la mise en page -->
</head>
<body>
<!-- En-tête de la page -->
<header>
    <h1>Gestion des Utilisateurs</h1>
    <!-- Menu de navigation pour accéder aux différentes fonctionnalités -->
    <nav>
        <ul>
            <!-- Les liens dirigent vers les URL gérées par la servlet -->
            <li><a href="<%= request.getContextPath() %>/administrateur/">Accueil</a></li>
            <li><a href="<%= request.getContextPath() %>/gestion_utilisateurs">Gestion des Utilisateurs</a></li>
            <li><a href="<%= request.getContextPath() %>/statistiques">Statistiques</a></li>
            <li><a href="<%= request.getContextPath() %>/deconnexion">Déconnexion</a></li>
        </ul>
    </nav>
</header>
<!-- Contenu principal de la page -->
<main>
    <!-- Section des utilisateurs -->
    <section id="utilisateurs">
        <h2>Liste des Utilisateurs</h2>
        <!-- Tableau affichant les utilisateurs -->
        <table>
            <thead>
            <!-- En-tête du tableau avec les colonnes -->
            <tr>
                <th>Nom</th>
                <th>Prénom</th>
                <th>Rôle</th>
                <th>Statut</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <!-- Contenu du tableau rempli dynamiquement -->
            <!-- Exemple de ligne d'utilisateur :
            <tr>
                <td>Nom Utilisateur</td>
                <td>Prénom Utilisateur</td>
                <td>Rôle Utilisateur</td>
                <td>Statut Utilisateur</td>
                <td><a href="modifier_utilisateur.jsp?id=1">Modifier</a> | <a href="supprimer_utilisateur?id=1">Supprimer</a></td>
            </tr>
            -->
            </tbody>
        </table>
    </section>
</main>
<!-- Pied de page -->
<footer>
    <p>Plateforme de Gestion d'Impression &copy; 2024</p>
</footer>
</body>
</html>
