
  Feature: US1001 Testotomasyonu arama testi

    Scenario: TC01 Kullanici sitede phone aratabilmeli

      Given l'utilisateur est sur la page d'accueil
      When  il recherche phone dans la boîte de recherche
      Then  il devrai voir un produit est trouvé à la fin d'une recherche
      And   il ferme la page


    Scenario: TC02 Kullanici sitede dress aratabilmeli
      Given l'utilisateur est sur la page d'accueil
      When  il recherche dress dans la boîte de recherche
      Then  il devrai voir un produit est trouvé à la fin d'une recherche
      And   il ferme la page


      Scenario: TC03 Kullanici sitede samsung aratabilmeli
        Given l'utilisateur est sur la page d'accueil
        When il recherche samsung dans la boîte de recherche
        Then il devrai voir un produit est trouvé à la fin d'une recherche
        And  il ferme la page


