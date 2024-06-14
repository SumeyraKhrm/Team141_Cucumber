Feature: US1004 Kullanici gecerli bilgilerle sisteme giris yapabilir

  @regression @smoke @wip  #work In Progress
  Scenario: TC08 Gecerli bilgilerle sisteme giris yapilabilmeli



    Given l'utilisateur est "toUrl" sur la page d'accueil
    Then il clique sur le bouton account
    And  il saisit  "toGecerliEmail" comme adresse électronique
    And  il saisit  "toGecerliPassword" comme mot de passe
    Then il clique sur le bouton signIn
    And  il teste la réussite de l'entrée
    And  attente 3 secondes
    And  il ferme la page