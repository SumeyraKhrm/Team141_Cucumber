Feature: US1006 kullanici fake bilgilerle facebook'ta kayit olusturur

  Scenario: TC12 Kullanici fake bilgilerle facebook'da kayit olusturabilmeli

    Given l'utilisateur est "faceUrl" sur la page d'accueil
    Then il accepte les cookies de facebook
    And  il clique sur le bouton créer un nouveau compte sur facebook
    And  attente 1 secondes
    When il remplit le formulaire d'inscription à Facebook selon Faker class
    And  attente 2 secondes
    And  il clique sur le bouton d'inscription à Facebook
    Then attente 8 secondes
    And  il ferme la page

