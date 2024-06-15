package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HeroPage {

    public HeroPage(){PageFactory.initElements(Driver.getdriver(),this);}


    @FindBy(xpath = "//*[text()='Add Element']")
    public WebElement addElementButonu;

    @FindBy (xpath = "//*[@class='added-manually']")
    public WebElement deleteButonu;


    @FindBy (xpath = "//h3[text()=\"Add/Remove Elements\"]")
    public WebElement AddElementText;



}
