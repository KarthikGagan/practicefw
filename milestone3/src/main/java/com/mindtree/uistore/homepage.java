package com.mindtree.uistore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	
	public WebDriver driver;
	
	public homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//a[@href='http://c2ta.co.in/healthcare/book-service/']")
	WebElement appointment;
	
	public WebElement getappointment()
	{
		return appointment;
	}
	
	@FindBy(xpath = "(//a[@href='http://c2ta.co.in/healthcare/#contact'])[1]")
	WebElement contact;
	
	public WebElement getcontact()
	{
		return contact;
	}
	
	
}
