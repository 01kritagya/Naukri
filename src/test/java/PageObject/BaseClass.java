package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

class BaseClass 
{
public  WebDriver driver;
public BaseClass(WebDriver driver)
 {
	this.driver=driver ;
	PageFactory.initElements(driver, this);
	
 }
}
 

  