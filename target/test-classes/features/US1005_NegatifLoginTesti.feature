
Feature: US1005 kullanici gecersiz bilgilerle giris yapamaz

  Scenario: TC09 Kullanici gecersiz password ile giris yapamamali

    Given l'utilisateur est "toUrl" sur la page d'accueil
    Then il clique sur le bouton account
    And  il saisit  "toGecerliEmail" comme adresse électronique
    And  il saisit  "toGecersizPassword" comme mot de passe
    Then il clique sur le bouton signIn
    And  il teste que l'entrée n'a pas réussi
    And  attente 3 secondes
    And  il ferme la page



  Scenario: TC10 Kullanici gecersiz email ile giris yapamamali

    Given l'utilisateur est "toUrl" sur la page d'accueil
    Then il clique sur le bouton account
    And  il saisit  "toGecersizEmail" comme adresse électronique
    And  il saisit  "toGecerliPassword" comme mot de passe
    Then il clique sur le bouton signIn
    And  il teste que l'entrée n'a pas réussi
    And  attente 2 secondes
    And  il ferme la page



  Scenario: TC11 Kullanici gecersiz email ve gecersiz password ile giris yapamamali

    Given l'utilisateur est "toUrl" sur la page d'accueil
    Then il clique sur le bouton account
    And  il saisit  "toGecersizEmail" comme adresse électronique
    And  il saisit  "toGecersizPassword" comme mot de passe
    Then il clique sur le bouton signIn
    And  il teste que l'entrée n'a pas réussi
    And  attente 2 secondes
    And  il ferme la page