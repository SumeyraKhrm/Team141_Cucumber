package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.HeroPage;
import org.openqa.selenium.NoSuchElementException;

public class HeroStepdefinitions {

    HeroPage heroPage = new HeroPage();

    @When("il clique sur le bouton Ajouter un élément")
    public void il_clique_sur_le_bouton_ajouter_un_élément() {
        heroPage.addElementButonu.click();
    }
    @When("il teste que le bouton Supprimer est visible")
    public void il_teste_que_le_bouton_supprimer_est_visible() {
        Assertions.assertTrue(heroPage.deleteButonu.isDisplayed());
    }
    @Then("il clique sur le bouton Supprimer")
    public void il_clique_sur_le_bouton_supprimer() {
        heroPage.deleteButonu.click();

    }
    @Then("il teste que le bouton Supprimer est invisible")
    public void il_teste_que_le_bouton_supprimer_est_invisible() {


        boolean deleteButonuKayipMi = false;

        try {
            Assertions.assertFalse(heroPage.deleteButonu.isEnabled());
            // Olmayan bir elementin assert'i olmaz
            // olmayan elementi kullanmak istedigimizde NoSuchElementException olusur
            // biz de bunu try catch ile firsata cevirdik
            //
        } catch (NoSuchElementException e) {

            deleteButonuKayipMi = true ;
        }

        // bizden istenen asil assertion'i simdi yapalim

        Assertions.assertTrue(deleteButonuKayipMi);

    }

    @Then("il teste que le bouton Ajouter Supprimer des éléments est visible")
    public void il_teste_que_le_bouton_ajouter_supprimer_des_éléments_est_visible() {
        Assertions.assertTrue(heroPage.AddElementText.isDisplayed());
    }

}
