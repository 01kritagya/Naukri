package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecommendedJobPage extends BaseClass {

	public RecommendedJobPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='dspIB span-right']")
	List<WebElement> allJobs;

	@FindBy(xpath = "//div[@id='preference']")
	WebElement preference;
	@FindBy(xpath = "//div[@id='apply']")
	WebElement apply;
	@FindBy(xpath = "//div[@id='similar_jobs']")
	WebElement similar_jobs;
	@FindBy(xpath ="//div[contains(text(),'Applies (75)')]")WebElement profile;

	public void ClickOnPreference() {
		preference.click();
	}

	public void ClickOnapplies() {
		apply.click();
	}

	public void ClickOnprofile() {
		profile.click();
	}

	public void ClickOnsimilar_jobs() {
		similar_jobs.click();
	}

	public void ClickOnJobs(int i) throws InterruptedException {
		
		Thread.sleep(5000);
			System.out.println("Total job in this " + driver.getTitle() + " page -> " + allJobs.size());
			for (int x = 1; x <= i; x++) {
				allJobs.get(x).click();

			}

		}
	}
