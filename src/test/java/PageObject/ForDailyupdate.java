package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForDailyupdate extends BaseClass
{

	public ForDailyupdate(WebDriver driver) 
	{
		super(driver);
		
	}

	//click on proile pic 
	@FindBy(xpath="//div[@class='nI-gNb-drawer__icon']") WebElement profilePic;
	@FindBy(css="div[class='nI-gNb-de__perf-card'] a[class='nI-gNb-de__perf-card-view']") WebElement viewAll;
	@FindBy(xpath="//a[normalize-space()='View & Update Profile']") WebElement ViewUpdate;
	@FindBy(xpath="//span[@class='edit icon']")WebElement editIcon;
	@FindBy(xpath="//textarea[@id='resumeHeadlineTxt']") WebElement resumeHeadlineTxt;
	@FindBy(xpath="//button[@type='submit']") WebElement resumeHeadlineTxtsave;
	
	//after login
	public void ClickProfile() throws InterruptedException
	{
		
		profilePic.click();
		Thread.sleep(2000);

		ViewUpdate.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		editIcon.click();
		Thread.sleep(2000);

	
		resumeHeadlineTxt.clear();
		
		}
	
	
	public void click3bar()
	{
		profilePic.click();
	}
	public void setHeadline(String hd)
	{
		resumeHeadlineTxt.sendKeys(hd);
	}
	public void ClickresumeHeadlineTxtsave()
	{resumeHeadlineTxtsave.click();}
	
	public  void clickViewAll()
	{
		viewAll.click();
		
	}

}
