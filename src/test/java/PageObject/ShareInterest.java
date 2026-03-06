package PageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShareInterest extends BaseClass {
	public ShareInterest(WebDriver driver) {
		super(driver);
	}

	// @FindBy(xpath="//div[@class='s2j__view-all']//span") WebElement viewAll;
	@FindBy(xpath = "//a[normalize-space()='View all']")
	WebElement viewAll;
	@FindBy(xpath = "//button[@class=' unshared'][1]")
	List<WebElement> shareInterest;
	@FindBy(xpath = "//button[@class='share-interest']")
	List<WebElement> rest;

	public void openAllCompany() {
		viewAll.click();
	}

	public void click_FristShareInterest() {
		for (WebElement x : shareInterest)
			x.click();
	}

	public void click_ReseShareInterest() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		for (WebElement x : rest) {
			wait.until(ExpectedConditions.elementToBeClickable(x)).click();

		}
	}

}
