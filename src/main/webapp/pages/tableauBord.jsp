<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Accueil - Plateforme de Gestion d'Impression</title>
    <style>
        /* Ajoutez vos styles CSS personnalisés ici */
        /* Cela peut inclure la mise en forme de texte, des couleurs, etc. */
        body {
            font-family: Arial, sans-serif;
            background: #f2f2f2;
            margin: 0;
            padding: 0;
            font-size: 16px;
            color: #333;
        }

        h1 {
            color: #444;
            margin-bottom: 20px;
        }

        p {
            margin-bottom: 20px;
        }

        h2 {
            color: #555;
            margin-bottom: 10px;
        }

        ul {
            list-style-type: none;
            padding: 0;
            margin: 0;
        }

        li {
            margin-bottom: 10px;
        }

        a {
            color: #007bff;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<h1>Bienvenue sur la Plateforme de Gestion d'Impression</h1>
<p>Cette plateforme facilite la gestion des demandes d'impression dans notre institution.</p>
<h2>Connexion</h2>
<ul>
    <li><a href="authentification/login.jsp?type=agent">Connexion de l'Agent de Tirage</a></li>
    <li><a href="authentification/login.jsp?type=enseignant">Connexion de l'Enseignant</a></li>
    <li><a href="authentification/login.jsp?type=admin">Connexion de l'Administrateur</a></li>
</ul>
</body>
</html>
