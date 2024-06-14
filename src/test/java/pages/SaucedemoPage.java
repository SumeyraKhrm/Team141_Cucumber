package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SaucedemoPage {


    public SaucedemoPage(){PageFactory.initElements(Driver.getdriver(),this);}


    @FindBy (id = "user-name")
    public WebElement usernameKutusu ;

    @FindBy (id = "password")
    public WebElement passwordKutusu ;

    @FindBy (id = "login-button")
    public WebElement loginButton ;

    @FindBy(xpath = "(//*[@class='inventory_item_name '])[1]")
    public WebElement ilkUrunIsimElementi;
    //class dan gitmek gerekir yazısını almamalıyız cunku ilkurun degısebilir

    @FindBy (id = "add-to-cart")
    public WebElement  addtocartButton ;


    @FindBy(xpath = "//*[@class='shopping_cart_link']")
    public WebElement alısverisSepeti;

    //*[@class="inventory_item_name"]

    @FindBy(xpath = "//*[@class='inventory_item_name']")
    public WebElement sepettekiUrunIsimElementi;



}
