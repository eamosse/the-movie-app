# The Moovie App

## Objectifs fonctionnels
Dans ce projet, vous allez créer l'application AnneFlix (The new Netflix).
L'objectif est d'exploiter la base de données TheMoovieDB (https://developers.themoviedb.org/3) afin de permettre aux utilisateurs de l'application de visualiser, noter et voir la bande annonce des films et séries disponible sur la base de données.

## Objectifs techniques
Techniquement, ce projet devrait vous permettre d'expérimenter de manière plus approfondie les notions telles que:
- Kotlin
- Architecture Components
- Data Binding
- Retrofit
- Injection de dépendances
- Navigation
- Persistence de données
- ....

## Quelques librairies à utiliser
- Navigation-fragment
- Hilt : Injection de dépendances
- Moshi : Sérialisation et Désérialisation JSON
- Retrofit: Consommer des web services
- Coil : Pour afficher les images

## Fonctionnalités attendues
### Obligatoires
Pour être acceptable, votre application doit proposer les fonctionnalités suivantes
- Catégories de films/séries
- Liste des films par catégories et auteurs
- Détails des films et séries
- Films et séries à la une
- Visualiser la bande annonce d'un film ou d'une série
- Liste de films et séries en favoris (géré dans une base de données locale)
- Une vue A propos contenant les fonctionalités de l'application, le profile LinkedIn des membres du groupe, le listing des librairies utilisées, ...

### Optionnels
Pour être complète, votre application doit proposer au moins une parmi les fonctionnalités suivantes :
- Noter un film, série ou acteur
- Voir les commentaires d'un film
- Voir la biographie d'un acteur/personnage
- Voir la liste des plateformes pour regarder un film
- Toute autre fonctionnalité intéressante proposée par la plateforme
- Synchroniser la liste des films/séries favoris sur Firebase

### Bonus
Pour être exceptionnelle, votre application doit proposer au moins une parmi les fonctionnalités suivantes :
- Rechercher un film ou une série
- Afficher les plateformes de streaming pour regarder un film
- Rediriger vers une plateforme de streaming pour regarder un film
- ....

## Organisation
- Groupes de 3 

## Critères d'acceptance
- Il n'y a pas de notes de groupes, les commits doivent permettre d'identifier le travail de chaque membre du groupe.
- Utiliser obligatoirement une branche par fonctionnalité + pull request pour merger sur la branche principale.
- Pas de warning dans le code ou dans les fichiers Gradle

## Rendu
- Date limite : 15 Avril 2024 (avant minuit)
- Modalités de rendu : Assurez-vous d'effectuer le dernier commit avant la date limite
- Remplacer le contenu de ce fichier par :
  - La liste des fonctionnalités développées + captures d'écran de chaque fonctionnalité
  - Les noms et prénoms des membres du groupe
  - Captures d'écrans des principales vues
  - Lien vers une vidéo de démonstration de l'application (sur Youtube)


# Première partie : Afficher la liste des catégories (à faire en classe)
- Créer une branche `feature/category_main` pour récupérer le code de base
- Renommer le package ainsi que l'identifiant de l'application
- Migrer les fichiers de configuration gradle vers Kotlin (kts)
- Utiliser version catalogue pour les librairies (https://developer.android.com/build/migrate-to-catalogs)
- Suivre le [tutoriel](https://github.com/eamosse/the-movie-app/blob/master/home_tuto.md) pour afficher la liste des catégories.
