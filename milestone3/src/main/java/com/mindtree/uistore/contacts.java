package com.mindtree.uistore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contacts {

	public WebDriver driver;

	public contacts(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='et_pb_contact_name_0']")
	WebElement name1;

	public WebElement getnname1() {
		return name1;
	}
	
	@FindBy(xpath = "//input[@id='et_pb_contact_email_0']")
	WebElement mail1;

	public WebElement getmail1() {
		return mail1;
	}
	
	@FindBy(xpath = "//textarea[@id='et_pb_contact_message_0']")
	WebElement mssg;

	public WebElement getmssg() {
		return mssg;
	}
	
	@FindBy(xpath = "//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/button")
	WebElement sub;

	public WebElement getsub() {
		return sub;
	}
}
