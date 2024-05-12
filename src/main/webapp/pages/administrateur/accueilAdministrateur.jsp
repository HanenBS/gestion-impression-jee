<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 26/04/2024
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Accueil Administrateur</title>
    <link rel="stylesheet" href="styles.css"> <!-- Lien vers une feuille de styles pour la mise en page -->
</head>
<body>
<!-- En-tête de la page -->
<header>
    <h1>Plateforme de Gestion d'Impression - Administrateur</h1>
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
    <!-- Section des notifications -->
    <section id="notifications">
        <h2>Notifications</h2>
        <!-- Ici peuvent s'afficher des notifications importantes pour l'administrateur -->
        <p>Aucune notification pour le moment.</p>
    </section>
    <!-- Section des tâches à gérer -->
    <section id="taches">
        <h2>Tâches à Gérer</h2>
        <!-- Tableau affichant les tâches à gérer -->
        <table>
            <thead>
            <!-- En-tête du tableau avec les colonnes -->
            <tr>
                <th>Nom de l'Enseignant</th>
                <th>Nombre de Copies</th>
                <th>Date de Réception</th>
                <th>Document à Imprimer</th>
            </tr>
            </thead>
            <tbody>
            <!-- Contenu du tableau rempli dynamiquement -->
            <!-- Exemple de ligne de tâche :
            <tr>
                <td>Nom de l'Enseignant</td>
                <td>Nombre de Copies</td>
                <td>Date de Réception</td>
                <td>Document à Imprimer</td>
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