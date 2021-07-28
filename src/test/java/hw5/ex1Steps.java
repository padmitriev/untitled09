package hw5;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.qameta.allure.Step;

public class ex1Steps {
//     private WebDriver driver;
    PageSteps pageSteps;

//    @BeforeTest
//    public void setupTest() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
////        pageSteps.driverSetup();
//    }

    @Test
    public void simpleTest2() {
        pageSteps.checkSumStep(3, 2, 5);
        pageSteps.checkSumStep(5, 4, 9);
    }

//    @Test
//    public void ex1() {
////        pageSteps.driverSetup();
////        JdiPage page = new JdiPage(driver);
////        page.setup();
////        @Step
//        PageSteps pageSteps = new PageSteps(driver);
//
//
//////  1. Open test site by URL
////        assertEquals(driver.getCurrentUrl(), page.getURL());
//        pageSteps.OpenTestSiteByURL();
//
//
////
//////  2. Assert Browser title
////        String expectedTitle = "Home Page";
////        assertEquals(page.getPageTitle(), expectedTitle);
//        pageSteps.AssertBrowserTitle();
//
////
//////  3. Perform login
////        page.login();
//
//        pageSteps.PerformLogin();
////
//////  4. Assert Username is logged in
////        assertTrue(page.getLoggedName().isDisplayed());
////        assertEquals(page.getLoggedName().getText(), "ROMAN IOVLEV");
//        pageSteps.AssertUsernameIsLoggedIn();
//
//
////
//////  5. Assert that there are 4 items on the header section are displayed and they have proper texts
////        List<WebElement> headerElements = page.getHeaderMenu();
////        for (WebElement element : headerElements) {
////            assertTrue(element.isDisplayed());
////        }
////        assertEquals(headerElements.get(0).getText(), "HOME");
////        assertEquals(headerElements.get(1).getText(), "CONTACT FORM");
////        assertEquals(headerElements.get(2).getText(), "SERVICE");
////        assertEquals(headerElements.get(3).getText(), "METALS & COLORS");
//
//        pageSteps.AssertItemsOnTheHeaderSection();
////
//////  6. Assert that there are 4 images on the Index Page and they are displayed
////        assertEquals(page.getAllimagesSize(), 4);
//
//        pageSteps.Assert4Images();
////
//////  7. Assert that there are 4 texts on the Index Page under icons and they have proper text
////        for (int i=0; i< page.getAllimagesSize(); i++) {
////            assertEquals(page.getAllTexts().get(i).getText(), page.getExpectedTexts()[i]);
////        }
//        pageSteps.Assert4Texts();
////
//////  8. Assert that there is the iframe with “Frame Button” exist
////        boolean ifButtonExists = false;
////
////        for (WebElement iframe : page.getIframes()) {
////            driver.switchTo().frame(iframe);
////            if (page.getFrameButton() != null) {
////                ifButtonExists = true;
////                break;
////            }
////        }
////        assertTrue(ifButtonExists);
////        driver.switchTo().defaultContent();
//
//        pageSteps.AssertIframeWithFrameButton();
////
//////  9. Switch to the iframe and check that there is “Frame Button” in the iframe
////        page.switchTo("frame");
////        assertFalse(page.getFrameButton().isEmpty());
////        driver.switchTo().defaultContent();
//        pageSteps.SwitchToTheIframeAndCheckThatThereIsFrameButton();
//
////
//////  10. Switch to original window back
////        assertEquals(page.getActualWindow(), "Home Page");
////
////////  11. Assert that there are 5 items in the Left Section are displayed and they have proper text
////        List<WebElement> leftElements = page.getLeftSection();
////
////        for (WebElement webElement : leftElements) {
////            assertTrue(webElement.isDisplayed());
////        }
////        assertEquals(leftElements.get(0).getText(),"Home");
////        assertEquals(leftElements.get(1).getText(),"Contact form");
////        assertEquals(leftElements.get(2).getText(),"Service");
////        assertEquals(leftElements.get(3).getText(),"Metals & Colors");
////        assertEquals(leftElements.get(4).getText(),"Elements packs");
//
//        pageSteps.AssertThatThereAre5ItemsInTheLeftSection();
////
//////  12. Close Browser
////        driver.quit();
////        assertEquals(((RemoteWebDriver) driver).getSessionId(), null);
//
////        driver.quit();
//
//
//    }

//     @AfterMethod
//     public void teardown() {
//         driver.quit();
    }
}
