package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.driverUtil;

import java.util.concurrent.TimeUnit;

public class baseTest {



    @BeforeMethod
    public void setUp(){
        driverUtil.getDriver().manage().window().maximize();
        driverUtil.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){

        //driverUtil.closeDriver();

    }


}
