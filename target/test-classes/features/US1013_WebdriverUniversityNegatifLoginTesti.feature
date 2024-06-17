
Feature: US1013 fake bilgilerle sisteme giris yapilamaz

  Scenario: TC19 Fake bilgilerle sisteme giris yapilamamali

    Given l'utilisateur est "webUniUrl" sur la page d'accueil
    Then Il descend jusqu'au portail de login
    And  il clique sur le portail de login
    When il passe à l'autre fenêtre ouverte
    And  il saisit faker valeurs dans les cases username et password
    And  il clique sur le bouton de login
    Then il teste que le texte de popup est "validation failed"
    And  attente 2 secondes
    And  il ferme la fenêtre popup en disant ok
    Then il revient ensuite à la première fenêtre
    And  il teste pour voir s'il est revenu à la première fenêtre.

