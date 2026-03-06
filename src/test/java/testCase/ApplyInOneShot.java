package testCase;

import org.testng.annotations.Test;

import PageObject.ApplyButton;
import PageObject.RecommendedJobPage;
import PageObject.homePage;

public class ApplyInOneShot extends TC_BaseClass {
	@Test(priority = 1)
	public void apply1() throws InterruptedException {
		homePage hp = new homePage(driver);
		Thread.sleep(3000);
		hp.JobDropDownIcon();
		hp.recommendedJob();
		RecommendedJobPage rjp = new RecommendedJobPage(driver);
		Thread.sleep(2000);
		rjp.ClickOnJobs(20);
		ApplyButton ab = new ApplyButton(driver);
		ab.clickApply();

	}

	@Test(priority = 2)
	public void apply2() throws InterruptedException {
		homePage hp = new homePage(driver);
		Thread.sleep(3000);
		hp.JobDropDownIcon();
		hp.recommendedJob();
		RecommendedJobPage rjp = new RecommendedJobPage(driver);
		Thread.sleep(2000);
		rjp.ClickOnapplies();
		rjp.ClickOnJobs(20);
		ApplyButton ab = new ApplyButton(driver);
		ab.clickApply();
	}

	@Test
	public void apply3() throws InterruptedException {
		homePage hp = new homePage(driver);
		Thread.sleep(3000);
		hp.JobDropDownIcon();
		hp.recommendedJob();
		RecommendedJobPage rjp = new RecommendedJobPage(driver);
		Thread.sleep(2000);

		rjp.ClickOnPreference();

		rjp.ClickOnJobs(20);
		ApplyButton ab = new ApplyButton(driver);
		ab.clickApply();
	}

	@Test(priority = 4)
	public void apply4() throws InterruptedException {
		homePage hp = new homePage(driver);
		Thread.sleep(3000);
		hp.JobDropDownIcon();
		hp.recommendedJob();
		RecommendedJobPage rjp = new RecommendedJobPage(driver);
		Thread.sleep(2000);
		rjp.ClickOnsimilar_jobs();
		rjp.ClickOnJobs(20);
		ApplyButton ab = new ApplyButton(driver);
		ab.clickApply();

	}
}
