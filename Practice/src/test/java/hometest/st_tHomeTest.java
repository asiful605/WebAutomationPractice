package hometest;

import common.WebAPI;
import homepage.at_tHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class at_tHomeTest extends WebAPI {

    static at_tHomePage basicHomepage;

    public void getInitElements(){
        basicHomepage=PageFactory.initElements(driver,at_tHomePage.class);
    }

    // get subMenu From Menu Tab By Mouse Hovering

    @Test(priority = 1)

    public void testhoveringOnMenuElement() throws InterruptedException {
        getInitElements();
        basicHomepage.hoveringOnMenuElement();
    }


//
























}
