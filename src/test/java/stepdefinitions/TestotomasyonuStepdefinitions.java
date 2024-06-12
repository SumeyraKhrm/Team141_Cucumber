package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestotomasyonuStepdefinitions {

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();


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
    public void ilRechercheDansLaBoîteDeRecherche(String motDemandé) {
        testotomasyonuPage.aramakutusu.sendKeys(motDemandé + Keys.ENTER);
    }

    @And("attente {int} secondes")
    public void attenteSecondes(int délaiAttente) {
        try {
            Thread.sleep(délaiAttente*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}