package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.FacebookPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class FacebookStepdefinitions {

    FacebookPage facebookPage = new FacebookPage();


    @Then("il accepte les cookies de facebook")
    public void il_accepte_les_cookies_de_facebook() {
        facebookPage.cookiesKabulButonu.click();
    }

    @Then("il clique sur le bouton créer un nouveau compte sur facebook")
    public void il_clique_sur_le_bouton_créer_un_nouveau_compte_sur_facebook() {
        facebookPage.yeniKayitOlusturButonu.click();
    }

    @When("il remplit le formulaire d'inscription à Facebook selon Faker class")
    public void il_remplit_le_formulaire_d_inscription_à_facebook_selon_faker_class() {
        Actions actions = new Actions(Driver.getdriver());
        Faker faker = new Faker();

        String fakeEmail= faker.internet().emailAddress();

        actions.sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys("domates@biber.com").perform();
        ReusableMethods.bekle(2);
        actions .sendKeys(Keys.TAB)
                .sendKeys("domates@biber.com")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("Mar")
                .sendKeys(Keys.TAB)
                .sendKeys("1989")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .perform();

    }
    @When("il clique sur le bouton d'inscription à Facebook")
    public void il_clique_sur_le_bouton_d_inscription_à_facebook() {
        facebookPage.signUpButonu.click();

    }


}
