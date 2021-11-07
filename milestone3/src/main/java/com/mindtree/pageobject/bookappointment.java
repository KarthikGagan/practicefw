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
import com.mindtree.uistore.homepage;

public class bookappointment extends ReadPropertiesFile {

	public static Logger log = LogManager.getLogger(ReadPropertiesFile.class.getName());

	@BeforeTest
	public void loadpage() throws IOException {
		driver = initDriver();
		driver.get(p.getProperty("url"));
		log.info("Page loaded Successfully");
	}

	@Test(dataProvider = "getDataa")
	public void mainpage(String name, String email, String phone) throws InterruptedException {
		homepage hp = new homepage(driver);
		hp.getappointment().click();

		log.info("Services Page loaded Successfully");

		appointmentpage ap = new appointmentpage(driver);

		ap.gethomeservice().click();
		
		//selectdate
		bookap ba =new bookap(driver);
		
		ba.getnextmonth().click();
		Thread.sleep(2000);
		ba.getdate().click();
		
		//enter details
		ba.getname().sendKeys(name);
		ba.getmail().sendKeys(email);
		ba.getphone().sendKeys(phone);
		log.info("Submitted details");
		//submit details
		ba.getsubmit().click();
		Thread.sleep(2000);
		
		//verifying thank you page
		Assert.assertEquals(ba.getty().getText(), "Thank You");
		System.out.println(ba.getty().getText());
	}
	
	@DataProvider
	public Object[][] getDataa() {
		Object[][] obj = new Object[1][3];
		obj[0][0] = "Gagan Karthik";
		obj[0][1] = "gagan@gmail.com";
		obj[0][2] = "1234567899";

		return obj;
	}

	@AfterTest
	public void terminate() {
		driver.close();
		log.info("Closed the browser");
	}
}
