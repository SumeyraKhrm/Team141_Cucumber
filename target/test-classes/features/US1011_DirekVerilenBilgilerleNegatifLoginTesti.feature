Feature: US1011 Direk verilen yanlis bilgilerle giris yapilamaz

  Scenario Outline: TC17 direk verilen gecersiz bilgilerle giris yapilamamali

    Given l'utilisateur est "toUrl" sur la page d'accueil
    Then il clique sur le bouton account
    When il saisit directement  "<verilenEmail>" comme adresse électronique
    And  il saisit directement "<verilenPassword>" comme mot de passe
    And attente 3 secondes
    Then il clique sur le bouton signIn
    And attente 2 secondes
    And il teste que l'entrée n'a pas réussi
    And attente 2 secondes
    And il ferme la page
    
    #Then sayfayi kapatir

    Examples:
      |verilenEmail    	|verilenPassword   |
      |murat@akar.com  	|76jrf6 	|
      |selcuk@gmail.com	|53535  	|
      |selin@wise.com 	|rdgdtds 	|
      |damra@gmail.com	|g56435 	|
      |bugra@gmail.com	|23456  	|