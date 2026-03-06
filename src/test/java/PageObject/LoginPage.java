package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//a[@id='login_Layer']") WebElement btn_Login;
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']") WebElement txt_Email;
	@FindBy(xpath="//input[@placeholder='Enter your password']") WebElement txt_Pwd;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_Sumit;
	
	public void openLogin() 
	{
		btn_Login.click();
	}
	public void setEmail(String email)
	{
		txt_Email.sendKeys(email);
	}
	public void setPwd(String  pwd)
	{
		txt_Pwd.sendKeys(pwd);
	}
	public void btn_sumbit()
	{
		btn_Sumit.click();
	}
}
