Feature: US1002 Kullanici scenario baslarindaki ortak adimlari Background ile kullanabilir

  Background: anasayfaya gitme
     Given l'utilisateur est sur la page d'accueil
        # sadece baslangictaki ortak adimlar Background olarak tanimlanabilir


  Scenario: TC04 Kullanici sitede phone aratabilmeli

    When  il recherche phone dans la boîte de recherche
    Then  il devrai voir un produit est trouvé à la fin d'une recherche
    And   il ferme la page


  Scenario: TC05 Kullanici sitede dress aratabilmeli

    When  il recherche dress dans la boîte de recherche
    Then  il devrai voir un produit est trouvé à la fin d'une recherche
    And   il ferme la page

  Scenario: TC05 Kullanici sitede samsung aratabilmeli

    When il recherche samsung dans la boîte de recherche
    Then il devrai voir un produit est trouvé à la fin d'une recherche
    And  il ferme la page