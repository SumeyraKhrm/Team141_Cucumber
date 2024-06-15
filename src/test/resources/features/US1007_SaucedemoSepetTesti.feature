Feature: US1007 Saucedemo alisveris sepeti testi

  Scenario: TC13 Kullanici sepete dogru urun eklendigini test eder


    Given l'utilisateur est "sauceUrl" sur la page d'accueil
    And attente 2 secondes
    Then il saisit "standard_user" dans la case du nom d'utilisateur
    And il saisit "secret_sauce" dans la case du mot de passe
    And attente 2 secondes
    Then il clique sur le bouton login
    And  il enregistre le nom du premier produit et va sur la page de ce produit
    And attente 2 secondes
    When il clique sur le bouton ajouter au panier
    Then il clique sur le panier d'achat
    And attente 2 secondes
    And il teste que le produit sélectionné a bien été ajouté au panier
    And il ferme la page





