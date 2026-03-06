package testCase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import PageObject.ForDailyupdate;
import PageObject.ShareInterest;

public class TC_ShareInterest2 extends TC_BaseClass {

    @Test
    public void moveToAppare() throws Exception {
        ForDailyupdate fdu = new ForDailyupdate(driver);
        ShareInterest si = new ShareInterest(driver);

      //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        fdu.click3bar();
      //  wait.until(ExpectedConditions.elementToBeClickable(fdu.clickViewAll())).click(); // Assuming you have a WebElement for "View All"

        scrollPage(-500); // Scroll up

        si.openAllCompany();
     //   wait.until(ExpectedConditions.elementToBeClickable(si.firstShareInterestButton())).click(); // Assuming you have a WebElement for the first share interest

        System.out.println("Clicked on first share interest");

        scrollPage(1000); // Scroll down

        System.out.println("Current Page Title: " + driver.getTitle());
    }

    private void scrollPage(int pixels) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0," + pixels + ")", "");
        } catch (Exception e) {
            System.err.println("Error while scrolling: " + e.getMessage());
        }
    }
}
