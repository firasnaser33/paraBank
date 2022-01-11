package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.accountOverView;
import pages.homePage;
import pages.openAccountPage;
import pages.transferPage;
import utils.PropertiesReadingUtil;
import utils.browserUtils;
import utils.driverUtil;

public class paraBankTest {

    homePage homePage= new homePage();
    accountOverView accountOverView = new accountOverView();
    openAccountPage accountPage = new openAccountPage();
    browserUtils browserUtils=new browserUtils();
    transferPage transferPage= new transferPage();





    @Test
    public void TC1_VerifyHeader(){

        driverUtil.getDriver().get(PropertiesReadingUtil.getProperties("url"));

        Assert.assertEquals(driverUtil.getDriver().getTitle(),"ParaBank | Welcome | Online Banking","Failed Title is not a match");

        Assert.assertEquals(homePage.header.getText(), "Experience the difference", "Failed Header ");

    }


    @Test
    public  void positiveLogIn(){
        driverUtil.getDriver().get(PropertiesReadingUtil.getProperties("url"));
        homePage.logIn();


    }

    @Test
    public void createNewAccount() throws InterruptedException {
        driverUtil.getDriver().get(PropertiesReadingUtil.getProperties("url"));
        homePage.logIn();
        accountOverView.createNewAccount.click();

        accountPage.setAccountDropdown("CHECKING");
        accountPage.submitButton.click();

        browserUtils.hardWait(2);

        Assert.assertEquals(accountPage.openedAccountMessage.getText(),"Congratulations, your account is now open.","Failed couldn't open account");

    }

    @Test
    public void createSavingAccount() throws InterruptedException {
        driverUtil.getDriver().get(PropertiesReadingUtil.getProperties("url"));
        homePage.logIn();
        accountOverView.createNewAccount.click();

        accountPage.setAccountDropdown("SAVINGS");
        accountPage.submitButton.click();

        browserUtils.hardWait(2);

        Assert.assertEquals(accountPage.openedAccountMessage.getText(),"Congratulations, your account is now open.","Failed couldn't open account");



    }

    @Test
    public void transferFunds() throws InterruptedException {
        driverUtil.getDriver().get(PropertiesReadingUtil.getProperties("url"));
        homePage.logIn();
        accountOverView.transferFunds.click();


        //transferPage.amountBox.sendKeys("100");



        transferPage.fromAccountDrop("24777","24333");


//        browserUtils.hardWait(2);
//        transferPage.transferButton.click();



    }


}
