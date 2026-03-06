package testCase;

import org.testng.annotations.Test;

import PageObject.ApplyButton;
import PageObject.RecommendedJobPage;
import PageObject.homePage;

public class TC_Recommended_prefrences extends TC_BaseClass {
	@Test
	public void apply() throws InterruptedException 
	{
		homePage hp= new homePage(driver);
		Thread.sleep(3000);
		hp.JobDropDownIcon();
		hp.recommendedJob();
		RecommendedJobPage rjp =new RecommendedJobPage(driver);
		
		
		rjp.ClickOnPreference();
		
		rjp.ClickOnJobs(40);
		
		ApplyButton ab=new ApplyButton(driver);
		ab.clickApply();
		
		
	}
}



