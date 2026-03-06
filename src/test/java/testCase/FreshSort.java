package testCase;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObject.homePage;

public class FreshSort extends TC_BaseClass {
	@Test
	public void jobSearchFres() throws InterruptedException {

		homePage sp = new homePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		sp.setSearch(p.getProperty("jobName"));
		sp.setYear();
		sp.clickBtnSearch();

		Thread.sleep(3000);
		sp.sortby();
		sp.sortbydate();

	}

}
