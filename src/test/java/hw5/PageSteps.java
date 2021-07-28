package hw5;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.JdiPage;

import java.util.List;

import static org.testng.Assert.*;


public class PageSteps {

    WebDriver driver;
    JdiPage page;

    public PageSteps(WebDriver driver) {
        this.driver = driver;
        page = new JdiPage(driver);
        page.setup();
    }

//    public void driverSetup() {
//    WebDriverManager.chromedriver().setup();
//    driver = new ChromeDriver();
//    page = new JdiPage(driver);
//    page.setup();
//    }

    @Step
    public static void checkSumStep(int num1, int num2, int expectedSum) {
        assertTrue(num1 + num2 == expectedSum, "Сумма слагаемых не соответствует ожидаемому значению");
    }

//    @Step
    public void OpenTestSiteByURL() {
        assertEquals(driver.getCurrentUrl(), page.getURL());
    }

//    @Step
    public void AssertBrowserTitle() {
        String expectedTitle = "Home Page";
        assertEquals(page.getPageTitle(), expectedTitle);
    }

//    @Step
    public void PerformLogin() {
        page.login();
    }

//    @Step
    public void AssertUsernameIsLoggedIn() {
        assertTrue(page.getLoggedName().isDisplayed());
        assertEquals(page.getLoggedName().getText(), "ROMAN IOVLEV");
    }

//    @Step
    public void AssertItemsOnTheHeaderSection() {
        List<WebElement> headerElements = page.getHeaderMenu();
        for (WebElement element : headerElements) {
            assertTrue(element.isDisplayed());
        }
        assertEquals(headerElements.get(0).getText(), "HOME");
        assertEquals(headerElements.get(1).getText(), "CONTACT FORM");
        assertEquals(headerElements.get(2).getText(), "SERVICE");
        assertEquals(headerElements.get(3).getText(), "METALS & COLORS");;
    }

//    @Step
    public void Assert4Images() {
        assertEquals(page.getAllimagesSize(), 4);
    }

//    @Step
    public void Assert4Texts() {
        for (int i=0; i< page.getAllimagesSize(); i++) {
            assertEquals(page.getAllTexts().get(i).getText(), page.getExpectedTexts()[i]);
        }
    }

//    @Step
    public void AssertIframeWithFrameButton() {
        boolean ifButtonExists = false;

        for (WebElement iframe : page.getIframes()) {
            driver.switchTo().frame(iframe);
            if (page.getFrameButton() != null) {
                ifButtonExists = true;
                break;
            }
        }
        assertTrue(ifButtonExists);
        driver.switchTo().defaultContent();
    }

//    @Step
    public void SwitchToTheIframeAndCheckThatThereIsFrameButton() {
        page.switchTo("frame");
        assertFalse(page.getFrameButton().isEmpty());
        driver.switchTo().defaultContent();
    }

//    @Step
    public void SwitchToOriginalWindowBack() {
        assertEquals(page.getActualWindow(), "Home Page");
    }

//    @Step
    public void AssertThatThereAre5ItemsInTheLeftSection() {
        List<WebElement> leftElements = page.getLeftSection();

        for (WebElement webElement : leftElements) {
            assertTrue(webElement.isDisplayed());
        }
        assertEquals(leftElements.get(0).getText(),"Home");
        assertEquals(leftElements.get(1).getText(),"Contact form");
        assertEquals(leftElements.get(2).getText(),"Service");
        assertEquals(leftElements.get(3).getText(),"Metals & Colors");
        assertEquals(leftElements.get(4).getText(),"Elements packs");
    }
}
