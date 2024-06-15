Feature: US1009 kullanici testotomasyonu sayfasinda toplu arama yapar

  Scenario Outline: TC15 kullanici coklu urun aramasi yapabilmeli

    Given l'utilisateur est "toUrl" sur la page d'accueil
    Then il recherche "<aranacakKelime>" dans la boîte de recherche
    And  il devrai voir un produit est trouvé à la fin d'une recherche
    And  il ferme la page

    Examples:
      |aranacakKelime|
      |phone  |
      |java   |
      |nutella|
      |dress  |
      |apple  |
      |samsung|