package inetbanking9.com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class Readconfig {
	
	Properties pro;
	
	public Readconfig() {
		
		File src = new File("./Configuration//config.properties");
	
		
		try {
			
		FileInputStream fis  = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		 
		
		
	}
		catch(Exception e){
			System.out.println("no file found");
		}

	}
	




	public String getapplicationurl() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getuser() {
		String users = pro.getProperty("userinet");
		return users;
	}
	
	public String getpass() {
		String passes = pro.getProperty("passwordinet");
		return passes;
	}
	
	public String getchrome() {
		String chromepath = pro.getProperty("chrome");
		return chromepath;
	}
	
	public String getfirefox() {
		String firefoxpath = pro.getProperty("firefox");
		return firefoxpath;
	}
	
	
	
	
	
	
	
}