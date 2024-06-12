Feature: US1003 kullanici testotomasyonu sayfasinda istedigi kelimeyi aratir

  Scenario: TC07 Kullanici istedigi kelimeyi aratabilmeli

    Given l'utilisateur est sur la page d'accueil
    When il recherche "iphone" dans la boîte de recherche
    Then il devrai voir un produit est trouvé à la fin d'une recherche
    And  attente 5 secondes
    And  il ferme la page
