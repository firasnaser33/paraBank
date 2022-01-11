package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accountOverView extends BasePage {




    @FindBy(linkText = "Open New Account")
    public WebElement createNewAccount;

    @FindBy(linkText = "Transfer Funds")
    public WebElement transferFunds;

}
