Feature: US1012 Excelde verilen urunlerin sonuc sayisi test edilir

  Scenario Outline: TC18 sitede istenen urunlerin minumum miktarda sonucu olmali

    Given l'utilisateur est "toUrl" sur la page d'accueil
    Then il enregistre la quantité min. et le nom du produit dans "<istenenSatir>" dans le produit excel
    And  il recherche le nom du produit sur la page d'automatisation des tests et enregistre le nombre de résultats
    And  il teste que le nombre d'articles trouvés est égal ou supérieur à la quantité min. indiquée dans "<istenenSatir>"
    And il ferme la page

    Examples:
      |istenenSatir|
      |2           |
      |3           |
      |4           |
      |5           |
      |6           |
      |7           |
      |8           |
      |9           |
      |10          |