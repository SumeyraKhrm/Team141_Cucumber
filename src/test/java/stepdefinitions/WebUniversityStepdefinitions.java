package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniversityStepdefinitions {

    WebUniversityPage webUniversityPage = new WebUniversityPage();
    Faker faker = new Faker();
    //Actions actions = new Actions(Driver.getdriver());


    @Then("Il descend jusqu'au portail de login")
    public void ıl_descend_jusqu_au_portail_de_login() {
       // actions.sendKeys(Keys.PAGE_DOWN);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getdriver();

        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", webUniversityPage.loginPortalButonu);

    }
    @Then("il clique sur le portail de login")
    public void il_clique_sur_le_portail_de_login() {
        webUniversityPage.loginPortalButonu.click();

    }
    @When("il passe à l'autre fenêtre ouverte")
    public void il_passe_à_l_autre_fenêtre_ouverte() {

        ReusableMethods.windowaGec("https://webdriveruniversity.com/Login-Portal/index.html",Driver.getdriver());

    }
    @When("il saisit faker valeurs dans les cases username et password")
    public void il_saisit_faker_valeurs_dans_les_cases_username_et_password() {

        webUniversityPage.usernameKutusu.sendKeys(faker.name().username());
        webUniversityPage.passwordKutusu.sendKeys(faker.internet().password());
    }
    @When("il clique sur le bouton de login")
    public void il_clique_sur_le_bouton_de_login() {
        webUniversityPage.loginButonu.click();

    }
    @Then("il teste que le texte de popup est {string}")
    public void il_teste_que_le_texte_de_popup_est(String expectedPopupYazisi) {

        String actualPopupYazisi = Driver.getdriver()
                .switchTo().alert()
                .getText();

        Assertions.assertEquals(expectedPopupYazisi,actualPopupYazisi);

    }


    @And("il ferme la fenêtre popup en disant ok")
    public void ilFermeLaFenêtrePopupEnDisantOk() {

        Driver.getdriver().switchTo().alert().accept();

    }
    @Then("il revient ensuite à la première fenêtre")
    public void il_revient_ensuite_à_la_première_fenêtre() {

        ReusableMethods.windowaGec("https://webdriveruniversity.com/",Driver.getdriver());

    }

    @Then("il teste pour voir s'il est revenu à la première fenêtre.")
    public void il_teste_pour_voir_s_il_est_revenu_à_la_première_fenêtre() {
        String expectedUrl = ConfigReader.getProperty("webUniUrl");
        String actualUrl = Driver.getdriver().getCurrentUrl();

        Assertions.assertEquals(expectedUrl,actualUrl);
    }



}
