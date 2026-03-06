package testCase;

import org.testng.annotations.Test;

import PageObject.ForDailyupdate;

public class TC_dailyUpdate extends TC_BaseClass
{
	
	@Test()
	void update() throws InterruptedException
	{
		ForDailyupdate fd=new ForDailyupdate(driver);
		Thread.sleep(5000);
		fd.ClickProfile();
		fd.setHeadline(p.getProperty("headline"));
		Thread.sleep(5000);

		fd.ClickresumeHeadlineTxtsave();
	}	

}
