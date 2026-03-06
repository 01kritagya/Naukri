package testCase;

import org.testng.annotations.Test;
import PageObject.homePage;
import PageObject.SearchJob;

public class TC_JobSearch extends TC_BaseClass {
	@Test(priority = 1)
	public void SearchJob() throws InterruptedException {
		homePage sp = new homePage(driver);
		Thread.sleep(3000);
		sp.setSearch(p.getProperty("jobName"));

		sp.setYear();
		sp.clickBtnSearch();
		
		Thread.sleep(3000);
		sp.sortby();
		sp.sortbydate();
		SearchJob sj = new SearchJob(driver);
		sj.allJobs();
		sj.applyForJob();
	}

}
