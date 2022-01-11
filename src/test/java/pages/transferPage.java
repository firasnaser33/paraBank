package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class transferPage extends BasePage {


    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amountBox;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement fromAccount;

    @FindBy(xpath = "//select[@id='toAccountId']")
    public WebElement toAccount;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement transferButton;


    public void fromAccountDrop(String a, String b ){

        Select selectFrom= new Select(fromAccount);
        selectFrom.selectByVisibleText(a);


        Select selectTo= new Select(toAccount);
        selectFrom.selectByVisibleText(b);






    }




}
