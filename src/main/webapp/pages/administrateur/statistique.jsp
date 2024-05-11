<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Statistiques</title>
  <link rel="stylesheet" href="styles.css"> <!-- Lien vers une feuille de styles pour la mise en page -->
</head>
<body>
<!-- En-tête de la page -->
<header>
  <h1>Statistiques</h1>
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
  <!-- Section des statistiques -->
  <section id="statistiques">
    <h2>Statistiques sur l'utilisation de la Plateforme</h2>
    <!-- Insérer ici les graphiques ou les données statistiques -->
    <p>Nombre total d'impressions effectuées : 100</p>
    <p>Nombre d'impressions par type de document :</p>
    <ul>
      <li>Document A : 40 impressions</li>
      <li>Document B : 30 impressions</li>
      <li>Document C : 20 impressions</li>
    </ul>
  </section>
</main>
<!-- Pied de page -->
<footer>
  <p>Plateforme de Gestion d'Impression &copy; 2024</p>
</footer>
</body>
</html>
