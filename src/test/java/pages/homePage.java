package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PropertiesReadingUtil;

public class homePage extends BasePage{


    @FindBy(id = "headerPanel")
    public WebElement title;


    @FindBy(xpath = "//p[.='Experience the difference']")
    public WebElement header;


    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement logInButton;




    public void logIn(){
        usernameBox.sendKeys(PropertiesReadingUtil.getProperties("username"));
        passwordBox.sendKeys(PropertiesReadingUtil.getProperties("password"));
        logInButton.click();
    }
}




