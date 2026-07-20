package testCase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import PageObject.LoginPage;

public class TC_BaseClass 
{
	public WebDriver driver;
	public Properties p;
	@BeforeClass
	void setup() throws IOException, InterruptedException
	{
		FileReader file= new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		//-----------------------------------------
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		//-----------------------------------------
		LoginPage lp = new LoginPage(driver);
		lp.openLogin();
		Thread.sleep(3000);
		lp.setEmail(p.getProperty("email"));
		lp.setPwd(p.getProperty("password"));
		lp.btn_sumbit();
		//------------------------------------------
	}
	//@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
