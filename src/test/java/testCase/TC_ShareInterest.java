	package testCase;
	import org.openqa.selenium.JavascriptExecutor;
	import org.testng.annotations.Test;
	import PageObject.ForDailyupdate;
	import PageObject.ShareInterest;
	
	public class TC_ShareInterest extends TC_BaseClass {
	
		@Test
		public void moveToAppare() throws Exception {
			ForDailyupdate fdu = new ForDailyupdate(driver);
			ShareInterest si = new ShareInterest(driver);
			Thread.sleep(5000);
			fdu.click3bar();
			Thread.sleep(3000);
			fdu.clickViewAll();
			Thread.sleep(3000);
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,-500)", "");
			} catch (Exception e) {}
			si.openAllCompany();
			System.out.println("before click_FristShareInterest");
			Thread.sleep(3000);
			try {
					si.click_FristShareInterest();
				}
			catch(Exception e)
			{
				System.out.println("Error on click_FristShareInterest");
			}
			System.out.println("after click_FristShareInterest");
	
			Thread.sleep(5000);
		//	JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,800)", "");
			//Thread.sleep(3000);
	
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			si.click_ReseShareInterest();
			driver.close();
		}
	}
