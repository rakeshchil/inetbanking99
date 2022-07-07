package inetbanking9.com.testcases;

import org.testng.annotations.Test;

import inetbanking9.com.pageobjects.Loginpage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void logintest() {
		driver.get(baseurl);
		Loginpage lp = new Loginpage(driver);
		lp.userid(uids);
		lp.securepassword(pid);
		lp.button();
	}	
	
	
}
