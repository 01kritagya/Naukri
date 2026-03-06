package PageObject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplyButton extends BaseClass {

	public ApplyButton(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[@id='apply-button']")
	WebElement btnApply;
	@FindBy(xpath = "//div[@class='styles_jhc__apply-button-container__5Bqnb']//button[2]")
	WebElement flag;

	public void clickApply() {
		Set<String> wh = driver.getWindowHandles();
		for (String x : wh) {
			driver.switchTo().window(x);
			if (driver.getTitle().equals("Recommended Jobs | Mynaukri")) {
				driver.close();
			} 
			else {

				if (flag.getAttribute("id").equals("company-site-button")) {
					driver.close();
				} 
				else {
					btnApply.click();
				}

			}

		}
	}
}
