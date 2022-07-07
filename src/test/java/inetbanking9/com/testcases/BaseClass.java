package inetbanking9.com.testcases;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import inetbanking9.com.utilities.Readconfig;

public class BaseClass {
	
	Readconfig readconfig = new Readconfig();
	
	public String baseurl = readconfig.getapplicationurl();
	public String uids = readconfig.getuser();
	public String pid = readconfig.getpass();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass()
	public void  setup(String br) {
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", readconfig.getchrome());
		driver = new ChromeDriver();
		logger = Logger.getLogger("ebanking");
		logger.info("chrome opened");
		}
		
		else if(br.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", readconfig.getfirefox());
			driver = new FirefoxDriver();
			logger = Logger.getLogger("ebanking");
			logger.info("firefox opened");
		}
		
		
	}
	
	
	  @AfterClass() public void teardown() {
		  driver.quit();
		  }
	 

}
