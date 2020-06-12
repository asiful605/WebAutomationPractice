package basicTest;
import basic.BasicHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BasicHomePageTest extends WebAPI {
    static BasicHomePage basicHomePage;// Reference variable/object of CignaHomePage

    public static void getInitElements(){
        basicHomePage= PageFactory.initElements(driver,BasicHomePage.class);
    }

// Mousehovering

    @Test
    public void TestUserHoverOnSeeOptionsTab(){
        getInitElements();
        basicHomePage.UserHoverOnSeeOptionsTab();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

//click On Button

    @Test
    public void testUserclickOnOpenNowTab(){
        getInitElements();
        basicHomePage.userclickOnOpenNowTab();
    }


    @Test
    public void testuserclickOnRadiobutton() throws InterruptedException {
        getInitElements();
        basicHomePage.userclickOnRadiobutton();
        Thread.sleep(2000);
    }


// Dynamic way to click on Check Box

    @Test
    public void testUsercanClickOnDynamicCheckBox() throws InterruptedException {
        getInitElements();
        Thread.sleep(3000);
        basicHomePage.UsercanClickOnDynamicCheckBox();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

// Click on dropButton

    @Test(priority = 1)
    public void testUserClickOnDropButton(){
        getInitElements();
        basicHomePage.ClickOnDropButton();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }


// Handeling Multiple Windows/Tabs

    @Test(priority=9)
    public void testUserCanSwitchWindow() throws InterruptedException {
        getInitElements();
        basicHomePage.switchWindow(1);


    }


// click on Button

    @Test(priority = 10)
    public void testUserclickOnButton(){
        getInitElements();
        basicHomePage.clickOnButton();

    }

