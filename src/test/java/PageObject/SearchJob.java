package PageObject;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchJob extends BaseClass {
	public SearchJob(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath= "//button[@id='filter-sort']")
	WebElement sortBy;
	@FindBy(xpath = "//span[normalize-space()='Relevance']")
	WebElement relevance;
	@FindBy(xpath = "//a[@class='title ']")
	List<WebElement> allNewJobs;
	@FindBy(xpath = "//button[@id='apply-button']")
	WebElement applyButton;
	/*----------------------------------------------------------------
	
	@FindBy(css=)WebElement;
	@FindBy(css=)WebElement;
	------------------------------------------------------------------
	*/

	public void allJobs() throws InterruptedException {
		Thread.sleep(5000);
		//sortBy.click();
		//Thread.sleep(3000);
		//relevance.click();
		Thread.sleep(2000);
		for (WebElement x : allNewJobs) {

			if (x.getAttribute("title").toLowerCase().contains("qa")
					|| x.getAttribute("title").toLowerCase().contains("quality")
					|| x.getAttribute("title").toLowerCase().contains("test")
					|| x.getAttribute("title").toLowerCase().contains("tester")) {
				System.out.println("eligeble for apply-------------------- " + x);
				x.click();
			}
		}
	}

	public void applyForJob() throws InterruptedException {
		Set<String> wh = driver.getWindowHandles();
		for (String x : wh) {

			if (driver.switchTo().window(x).getTitle().toLowerCase().contains("naukri.com")) {
				System.out.println(x+"is closed");
				driver.close();
			}

			else {
				Thread.sleep(5000);
				driver.switchTo().window(x);
				applyButton.click();
				
			}

		}

	}

}
