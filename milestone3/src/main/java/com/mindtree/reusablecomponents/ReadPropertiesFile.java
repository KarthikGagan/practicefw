package com.mindtree.reusablecomponents;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertiesFile {

	public static WebDriver driver;
	public Properties p;


	public WebDriver initDriver() throws IOException {
		// TODO Auto-generated method stub
		p = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\Eclipse\\framework-workspace\\milestone3\\src\\main\\java\\com\\mindtree\\utilities\\configure.properties");
		p.load(fis);
		String browsername = p.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Stuff\\googlechromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Selenium_Stuff\\geckodriver.exe"); // Setting system properties of FirefoxDriver
			driver = new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C://Selenium_Stuff//edgedriver.exe");// Setting system properties of Edge Browser
			driver = new EdgeDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
