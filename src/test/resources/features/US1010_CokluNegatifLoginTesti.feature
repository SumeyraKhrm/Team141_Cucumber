
Feature: US1010 liste olarak verilen gecersiz bilgilerle giris yapilamaz

  Scenario Outline: TC16 Yanlis bilgilerle giris yapilamamali
    #control + üstne gelirsen o sorguya gider

    Given l'utilisateur est "toUrl" sur la page d'accueil
    Then il clique sur le bouton account
    When il saisit  "<verilenEmail>" comme adresse électronique
    And il saisit  "<verilenPassword>" comme mot de passe
    Then il clique sur le bouton signIn
    And attente 5 secondes
    And il teste que l'entrée n'a pas réussi
    And attente 2 secondes
    Then il ferme la page

    Examples:
      |verilenEmail    	|verilenPassword    	|
      |toGecerliEmail  	|toGecerliPassword   	|
      |toGecersizEmail 	|toGecerliPassword  	|
      |toGecersizEmail 	|toGecersizPassword 	|
      |toGecersizEmail2	|toGecersizPassword2	|
      |toGecersizEmail3	|toGecersizPassword3	|