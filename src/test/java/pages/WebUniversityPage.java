package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPage {



    public WebUniversityPage(){PageFactory.initElements(Driver.getdriver(),this);}

    @FindBy(id ="login-portal")
    public WebElement loginPortalButonu;

    @FindBy(id = "text")
    public WebElement usernameKutusu;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id = "login-button")
    public WebElement loginButonu;



}
