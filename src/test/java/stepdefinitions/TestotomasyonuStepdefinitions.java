package stepdefinitions;

import com.google.j2objc.annotations.WeakOuter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class TestotomasyonuStepdefinitions  {

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    String exceldeArananUrunIsmi;
    double exceldeArananUrunMinSonucSayisi;
    double aramaSonucundaBulunanSonucSayisi;
    Actions actions = new Actions(Driver.getdriver());


    @Given("l'utilisateur est sur la page d'accueil")
    public void l_utilisateur_est_sur_la_page_d_accueil() {
        Driver.getdriver().get(ConfigReader.getProperty("toUrl"));
    }

    @When("il recherche phone dans la boîte de recherche")
    public void ilRecherchePhoneDansLaBoîteDeRecherche() {
        testotomasyonuPage.aramakutusu.sendKeys("phone" + Keys.ENTER);
    }

    @Then("il devrai voir un produit est trouvé à la fin d'une recherche")
    public void il_devrai_voir_un_produit_est_trouvé_à_la_fin_d_une_recherche() {
        Assertions.assertTrue(testotomasyonuPage.sonucElementleriList.size()>0);

    }
    @Then("il ferme la page")
    public void il_ferme_la_page() {
        Driver.quitDriver();
    }


    @When("il recherche dress dans la boîte de recherche")
    public void ilRechercheDressDansLaBoîteDeRecherche() {
        testotomasyonuPage.aramakutusu.sendKeys("dress" + Keys.ENTER);
    }

    @When("il recherche samsung dans la boîte de recherche")
    public void ilRechercheSamsungDansLaBoîteDeRecherche() {
        testotomasyonuPage.aramakutusu.sendKeys("samsung" + Keys.ENTER);
    }


    @When("il recherche {string} dans la boîte de recherche")
    public void ilRechercheDansLaBoîteDeRecherche(String motDemande) {
        testotomasyonuPage.aramakutusu.sendKeys(motDemande + Keys.ENTER);
    }

    @And("attente {int} secondes")
    public void attenteSecondes(int delaiAttente) {
        try {
            Thread.sleep(delaiAttente*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Given("l'utilisateur est {string} sur la page d'accueil")
    public void l_utilisateur_est_sur_la_page_d_accueil(String configdenIstenenUrl) {
        Driver.getdriver().get(ConfigReader.getProperty(configdenIstenenUrl));
    }

    @Then("il clique sur le bouton account")
    public void ilCliqueSurLeBoutonAccount() {
        testotomasyonuPage.accountLinki.click();

    }

    @Then("il saisit  {string} comme adresse électronique")
    public void il_saisit_comme_adresse_électronique(String configVerilenEmail) {
    testotomasyonuPage.loginEmailKutusu.sendKeys(ConfigReader.getProperty(configVerilenEmail));
    }

    @Then("il saisit  {string} comme mot de passe")
    public void il_saisit_comme_mot_de_passe(String configVerilenPassword) {
        testotomasyonuPage.loginPasswordKutusu
                .sendKeys(ConfigReader.getProperty(configVerilenPassword));
    }

    @Then("il clique sur le bouton signIn")
    public void il_clique_sur_le_bouton_sign_ın() {
        testotomasyonuPage.loginSiginButonu.click();
    }

    @Then("il teste la réussite de l'entrée")
    public void il_teste_la_réussite_de_l_entrée() {
        Assertions.assertTrue(testotomasyonuPage.logOutButonu.isDisplayed());
    }


    @Then("il teste que l'entrée n'a pas réussi")
    public void il_teste_que_l_entrée_n_a_pas_réussi() {


        try {
            Assertions.assertTrue(testotomasyonuPage.loginSiginButonu.isDisplayed());
        } catch (Exception e) {
            actions.sendKeys(Keys.PAGE_DOWN);
            testotomasyonuPage.logOutButonu.click();
            Driver.quitDriver();
            // failed olan assertion'i try catch ile handle ettik
            // logout yaptiktan sonra yeniden testi FAILED etmemiz gerekir
            Assertions.assertTrue(false);
        }

    }

    @When("il saisit directement  {string} comme adresse électronique")
    public void il_saisit_directement_comme_adresse_électronique(String direkVerilenEmail) {
        testotomasyonuPage.loginEmailKutusu.sendKeys(direkVerilenEmail);
    }

    @When("il saisit directement {string} comme mot de passe")
    public void il_saisit_directement_comme_mot_de_passe(String direkVerilenPasword) {
        testotomasyonuPage.loginPasswordKutusu.sendKeys(direkVerilenPasword);
    }


    @Then("il enregistre la quantité min. et le nom du produit dans {string} dans le produit excel")
    public void il_enregistre_la_quantité_min_et_le_nom_du_produit_dans_dans_le_produit_excel(String satirNoStr) throws IOException {

        String dosyaYolu = "src/test/resources/urunListesi.xlsx";
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet1 = workbook.getSheet("Sheet1");

        int satirNo = Integer.parseInt(satirNoStr);
        exceldeArananUrunIsmi = sheet1.getRow(satirNo-1).getCell(0).toString();

        exceldeArananUrunMinSonucSayisi = sheet1.getRow(satirNo-1).getCell(1).getNumericCellValue();

    }

    @Then("il recherche le nom du produit sur la page d'automatisation des tests et enregistre le nombre de résultats")
    public void il_recherche_le_nom_du_produit_sur_la_page_d_automatisation_des_tests_et_enregistre_le_nombre_de_résultats() {
        testotomasyonuPage.aramakutusu.sendKeys(exceldeArananUrunIsmi + Keys.ENTER);

        String sonucYazısı = testotomasyonuPage.aramaSonucElementi.getText();  //4 product Found

        sonucYazısı = sonucYazısı.replaceAll("\\D",""); // "4"

        aramaSonucundaBulunanSonucSayisi = Double.parseDouble(sonucYazısı);
    }

    @Then("il teste que le nombre d'articles trouvés est égal ou supérieur à la quantité min. indiquée dans {string}")
    public void il_teste_que_le_nombre_d_articles_trouvés_est_égal_ou_supérieur_à_la_quantité_min_indiquée_dans(String string) {

        Assertions.assertTrue(aramaSonucundaBulunanSonucSayisi>= exceldeArananUrunMinSonucSayisi);
    }

}