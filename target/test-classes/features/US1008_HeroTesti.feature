

Feature: US1008 Kullanici elementler icin bekler

  Scenario: TC14 sonradan gorunen elementler gorunur oluncaya kadar beklenebilmeli


    Given l'utilisateur est "heroUrl" sur la page d'accueil
    When il clique sur le bouton Ajouter un élément
    And attente 2 secondes
    And il teste que le bouton Supprimer est visible
    Then il clique sur le bouton Supprimer
    And attente 5 secondes
    And il teste que le bouton Supprimer est invisible
    And il teste que le bouton Ajouter Supprimer des éléments est visible
    And attente 2 secondes
    And il ferme la page