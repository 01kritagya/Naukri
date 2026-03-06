package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class homePage extends BaseClass {

	public homePage(WebDriver driver) 
	{
		super(driver);
	}
	Actions action = new Actions(driver);
	@FindBy(xpath="//span[@class='ni-gnb-icn ni-gnb-icn-search']") WebElement iconSearch;
	@FindBy(xpath="//input[@class=\"suggestor-input \"]") WebElement txt_Job_Search;
	@FindBy(xpath="//span[normalize-space()='3 years']") WebElement drop_Year_Search;
	@FindBy(xpath="//span[normalize-space()='Search']") WebElement btnSearch;
	
	@FindBy(xpath="//a[@class='nI-gNb-menuItems__anchorDropdown']") WebElement jobs;
	@FindBy(xpath="//a[@href=\"/mnjuser/recommendedjobs\"]") WebElement remmdJob;
	@FindBy(xpath="//button[@class=\"styles_ss__menu-btn__4s9fF styles_sort-droop-label__TxC3K\"]") WebElement sortby;
	@FindBy(xpath="//a[@data-id=\"filter-sort-f\"]") WebElement sortbydate;
	public void setSearch(String jobName) throws InterruptedException
	{
		iconSearch.click();
		txt_Job_Search.sendKeys(jobName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='opt  ']")).click();
	}
	
	public void setYear()
	{
		driver.findElement(By.xpath("//input[@id=\"experienceDD\"]")).click();
		drop_Year_Search.click();
	}
	public void clickBtnSearch()
	{
		
		btnSearch.click();
	}
	
	public void JobDropDownIcon() throws InterruptedException
	{
		Thread.sleep(5000);
		action.moveToElement(jobs).perform();
		
	}
	public void recommendedJob()
	{
		remmdJob.click();
	}
	public void sortby() 
	{
		sortby.click();
	}
	public void sortbydate()
	{
		sortbydate.click();
	}
}
