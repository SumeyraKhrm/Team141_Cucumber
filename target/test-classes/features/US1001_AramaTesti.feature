
  Feature: US1001 Testotomasyonu arama testi

    Scenario: TC01 Kullanici sitede phone aratabilmeli

      <!---
    --->

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusunda phone yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir