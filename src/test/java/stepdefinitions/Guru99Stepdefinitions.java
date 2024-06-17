package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Guru99Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Guru99Stepdefinitions {

    Guru99Page guru99Page = new Guru99Page();

    @And("il écrit toutes les valeurs dans la colonne {string}")
    public void il_écrit_toutes_les_valeurs_dans_la_colonne(String istenenSutunBasligi) {

        List<String> basliklarListesi = ReusableMethods.stringListesineDonustur(guru99Page.baslikElementleriListesi);


        int sutunIndexi = basliklarListesi.indexOf(istenenSutunBasligi);


        // tablodaki sutunlarin dinamik xpath'ini bulmaliyiz
        // (//tbody)[2]//tr/td[      4      ]

        String dinamikXpath = "(//tbody)[2]//tr/td[" + (sutunIndexi+1) + "]" ;

        List<WebElement> istenenSutundakiWebelementlerListesi =
                Driver.getdriver().findElements(By.xpath(dinamikXpath));

        System.out.println(ReusableMethods.stringListesineDonustur(istenenSutundakiWebelementlerListesi));
    }

    @And("il fait une capture d'écran de la page entière et l'enregistre sous le nom {string}")
    public void il_fait_une_capture_d_écran_de_la_page_entière_et_l_enregistre_sous_le_nom(String raporAdiStr) {


    }
}

