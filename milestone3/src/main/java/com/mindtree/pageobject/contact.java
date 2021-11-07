package com.mindtree.pageobject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertiesFile;
import com.mindtree.uistore.appointmentpage;
import com.mindtree.uistore.bookap;
import com.mindtree.uistore.contacts;
import com.mindtree.uistore.homepage;

public class contact extends ReadPropertiesFile {

	public static Logger log = LogManager.getLogger(ReadPropertiesFile.class.getName());
	
	@BeforeTest
	public void loadpage() throws IOException {
		driver = initDriver();
		driver.get(p.getProperty("url"));
		log.info("Page loaded Successfully");
	}

	@Test
	public void mainpage() throws InterruptedException {
		homepage hp = new homepage(driver);
		
		hp.getcontact().click();
		
		contacts co = new contacts(driver);
		co.getnname1().sendKeys("Gagan");
		co.getmail1().sendKeys("abc@xyz.com");
		co.getmssg().sendKeys("Test message");
		log.info("Contact details submitted");
		co.getsub().click();
	}
	

	@AfterTest
	public void terminate() {
		driver.close();
		log.info("Closed the browser");
	}
}
