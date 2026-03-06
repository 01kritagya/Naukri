
//.......................LOGIN TO NAUKRI..................................s
package testCase;

//import org.testng.annotations.Test;

import PageObject.LoginPage;

public class TC_Login extends TC_BaseClass 
{	
	//@Test(priority=1)
	public void login() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		lp.openLogin();
		Thread.sleep(3000);
		lp.setEmail(p.getProperty("email"));
		lp.setPwd(p.getProperty("password"));
		lp.btn_sumbit();
	}
}
