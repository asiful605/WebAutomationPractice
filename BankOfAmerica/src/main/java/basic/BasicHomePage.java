package basic;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static webElements.WebElementsForBoA.*;

public class BasicHomePage extends WebAPI {

    @FindBy(how=How.CSS,using = seeOptionsWebElement)
    public WebElement hoverOnSeeOptionsTab;

    @FindBy(how= How.CSS,using=openNowWebElement )
    WebElement clickOnOpenNowTab;

    @FindBy(how=How.XPATH,using = radioButtonWebElement)
    WebElement clickOnRadiobutton;

    @FindBy(how=How.CSS,using=DynamicheckBoxWebElement)
    WebElement DynamicClickOnCheckBox;

    @FindBy(how=How.CSS,using= DropButton)
    WebElement DropButtonWebElement;

    @FindBy(how=How.XPATH,using= buttonWebelement)

    WebElement buttonElement;

    @FindBy(how=How.CSS,using=clickelement)
    WebElement clickOnElement;


    // MouseHovering

    public void UserHoverOnSeeOptionsTab() {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOnSeeOptionsTab).perform();

    }

//    MouseHovering

    public void userclickOnOpenNowTab(){
        String showsTitle =driver.getTitle();
        System.out.println("It will shows Title of " +  showsTitle);
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(clickOnOpenNowTab).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

// Radio Button

    public void userclickOnRadiobutton(){
        driver.manage().window().maximize();
        String url="https://www.bankofamerica.com/deposits/checking/advantage-safebalance-banking-account/before-you-apply/";
        driver.get(url);
        boolean radiobuttonDisplayed=clickOnRadiobutton.isDisplayed();
        if(clickOnRadiobutton.isSelected()) {
            System.out.println("selected");
        }else{
            System.out.println("not selected");
        }
    }


    // Dynamic way to click on Check Box


    public void UsercanClickOnDynamicCheckBox() {

        driver.get(url1);

        // size() can get how many checkbox are exits in the webpage
        int count = driver.findElements(By.cssSelector(DynamicheckBoxWebElement)).size();
        for (int i = 0; i < count; i++) {
            // get() use for index . It will be change by index number
            driver.findElements(By.cssSelector(DynamicheckBoxWebElement)).get(0);
        }
    }



    //  Click on dropButton

    public void ClickOnDropButton(){
        String url=   "https://promo.bankofamerica.com/hp-oaa2/";
        driver.get(url);
        DropButtonWebElement.click();
    }



// Handeling Multiple Windows/Tabs

    public void switchWindow(int index) throws InterruptedException {
        driver.get(cignaUrl);
        driver.get(At_tUrl);
        String windowId=null;
        Set<String> windows=driver.getWindowHandles();
        Iterator<String>iter=windows.iterator();
        for(int i =1; i<=index;i++){
            windowId=   iter.next();
        }
        driver.switchTo().window(windowId);
        System.out.println("It will switch At_T window"+driver.getTitle());
        Thread.sleep(2000);
        driver.close();
    }


// click on Button

    public void clickOnButton(){
        driver.get("https://www.bofaml.com/content/boaml/en_us/home.html");
        buttonElement.click();
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(clickOnElement).perform();



    }












}