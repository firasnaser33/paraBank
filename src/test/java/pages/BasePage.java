package pages;

import org.openqa.selenium.support.PageFactory;
import utils.driverUtil;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(driverUtil.getDriver(),this);

    }


}
