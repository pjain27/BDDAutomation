package org.paras.autumation.base;

import java.io.File;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CreateDriverInstance {
	WebDriver driver;
ResourceBundle rb=ResourceBundle.getBundle("config.properties");

	public WebDriver startBrowser(String browserName) { 
		 try {	
			 if(rb.getString("browser").equalsIgnoreCase("Chrome"))
				{
				 
				 ChromeOptions options = new ChromeOptions(); 
					options.addArguments("silent=true");
					options.addArguments("verbose=false");
					options.addArguments("start-maximized");
					
					DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();           
					handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);	// Handle SSL
					System.setProperty("webdriver.chrome.driver", "./Driver.chromedriver.exe");
					
					driver = new ChromeDriver(options);
					
					
				} 
				else if(rb.getString("browser").equalsIgnoreCase("Firefox"))
				{
					 
					System.setProperty("webdriver.firefox.bin","./Driver.geckodriver.exe");
					driver=new FirefoxDriver();
						
					} 
					
				else if(rb.getString("browser").equalsIgnoreCase("IE"))
				{
					 
					System.setProperty("webdriver.firefox.bin","./Driver.IRDriverServer.exe");
					driver=new InternetExplorerDriver();
						
					} 
				
		    }catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		  }
		 
	 	 return driver;
		}

	public void CloseDriverInstance(WebDriver driver)
	{
		driver.quit();
	}
}
