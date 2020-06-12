package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

import static homepage.AllWebElements.*;

public class at_tHomePage extends WebAPI {


    @FindBy(how= How.CSS,using=hoverOnMenu)
    WebElement MenuElement;

    @FindBy(how=How.XPATH,using=InternetElement)
    WebElement netElement;

    @FindBy(how=How.XPATH,using=ExploretElement)
    WebElement ExploreNetElement;













// get subMenu from Menu Tab By mouse hovering

    public void hoveringOnMenuElement() throws InterruptedException {

        driver.get(url);
        driver.manage().window().maximize();
        Actions actions =new Actions(driver);
        actions.moveToElement(MenuElement).perform();
        actions.moveToElement(netElement).click().perform();
        Thread.sleep(3000);
        actions.moveToElement(ExploreNetElement).click();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }




































}
