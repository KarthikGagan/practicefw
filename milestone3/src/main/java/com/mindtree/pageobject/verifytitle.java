package com.mindtree.pageobject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertiesFile;
import com.mindtree.uistore.appointmentpage;
import com.mindtree.uistore.homepage;





public class verifytitle extends ReadPropertiesFile {

	public static Logger log = LogManager.getLogger(ReadPropertiesFile.class.getName());

		@BeforeTest
		public void loadpage() throws IOException {
			driver = initDriver();
			driver.get(p.getProperty("url"));
			log.info("Page loaded Successfully");
		}

		@Test
		public void mainpage() {
			homepage hp = new homepage(driver);
			hp.getappointment().click();

			log.info("Services Page loaded Successfully");

			appointmentpage ap = new appointmentpage(driver);
			
			//verify title
			Assert.assertEquals(ap.gettitle().getText(), "Book-Service");
			System.out.println(ap.gettitle().getText());
			log.info("Verified the page");
		}

		@AfterTest
		public void terminate() {
			driver.close();
			log.info("Closed the browser");
		}
}
