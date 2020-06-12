package basicTest;

import BoAHomePage.LogIn;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BoATest extends WebAPI {
    static LogIn logIn;// Reference variable/object of CignaHomePage

    public static void getInitElements(){
        logIn= PageFactory.initElements(driver,LogIn.class);
    }


// Input Box

    @Test
    public void testUserenterKeyword(){
        getInitElements();
        logIn.enterKeyword();

    }

// Input Box

    @Test
    public void testUserenterPassword() throws InterruptedException {
        getInitElements();
        logIn.enterPassword();


    }

// Checking Box

    @Test
    public void testUsercheckOnsaveOnlineIdBox(){
        getInitElements();
        logIn.checkOnsaveOnlineIdBox();
    }








