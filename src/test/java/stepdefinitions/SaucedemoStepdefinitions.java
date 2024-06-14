package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.SaucedemoPage;

public class SaucedemoStepdefinitions {

    SaucedemoPage saucedemoPage = new SaucedemoPage();
    String ilkUrunIsmi = "";


    @Then("il saisit {string} dans la case du nom d'utilisateur")
    public void il_saisit_dans_la_case_du_nom_d_utilisateur(String username) {
        saucedemoPage.usernameKutusu.sendKeys(username);
        //verilen gorev direk yollamamızı istemiyor, bu yüzden bana yollana degeri kutuya yolluyorum

    }
    @Then("il saisit {string} dans la case du mot de passe")
    public void il_saisit_dans_la_case_du_mot_de_passe(String password ) {
        saucedemoPage.passwordKutusu.sendKeys(password);

    }
    @Then("il clique sur le bouton login")
    public void il_clique_sur_le_bouton_login() {
        saucedemoPage.loginButton.click();

    }

    @Then("il enregistre le nom du premier produit et va sur la page de ce produit")
    public void il_enregistre_le_nom_du_premier_produit_et_va_sur_la_page_de_ce_produit() {
        ilkUrunIsmi = saucedemoPage.ilkUrunIsimElementi.getText();
        saucedemoPage.ilkUrunIsimElementi.click();


    }
    @When("il clique sur le bouton ajouter au panier")
    public void il_clique_sur_le_bouton_ajouter_au_panier() {
        saucedemoPage.addtocartButton.click();

    }
    @Then("il clique sur le panier d'achat")
    public void il_clique_sur_le_panier_d_achat() {
        saucedemoPage.alısverisSepeti.click();

    }
    @Then("il teste que le produit sélectionné a bien été ajouté au panier")
    public void il_teste_que_le_produit_sélectionné_a_bien_été_ajouté_au_panier() {

        String actualUrun = ilkUrunIsmi;
        String expectedUrun = saucedemoPage.sepettekiUrunIsimElementi.getText();

        Assertions.assertEquals(expectedUrun,actualUrun);

    }

}
