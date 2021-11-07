package com.mindtree.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mindtree.reusablecomponents.ReadPropertiesFile;


public class screenshot extends ReadPropertiesFile {

	public void getScreenshot(String result) throws IOException {
		java.io.File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,
				new File("D:\\Eclipse\\framework-workspace\\milestone3\\Screenshot\\" + result + "screenshot.png"));

	}
}
