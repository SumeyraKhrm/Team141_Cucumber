Feature: US1014 Guru99 sayfasindaki tablodan istenen sutunu yazdirma

  Scenario: TC20 kullanici tablodan istedigi sutunu yazdirabilmeli

    Given l'utilisateur est "guruUrl" sur la page d'accueil
    And il écrit toutes les valeurs dans la colonne "Prev Close (Rs)"
    And il fait une capture d'écran de la page entière et l'enregistre sous le nom "guruWebTableTest"
    And il ferme la page



