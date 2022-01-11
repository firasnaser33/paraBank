package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class openAccountPage extends BasePage{

@FindBy (xpath = "//select[@id='type']")
    public WebElement accountDropdown;

@FindBy(xpath ="//input[@type='submit']")
public WebElement submitButton;

@FindBy (xpath = "//p[.='Congratulations, your account is now open.']")
public WebElement openedAccountMessage;







public void setAccountDropdown(String account){

    Select select= new Select(accountDropdown);
    select.selectByVisibleText(account);



}
}
