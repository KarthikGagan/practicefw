package com.mindtree.uistore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookap {

	public WebDriver driver;

	public bookap(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='et-main-area']/div/div/div[2]/div/div[2]/div[2]/div[2]/button[3]")
	WebElement nextmonth;

	public WebElement getnextmonth() {
		return nextmonth;
	}
	
	@FindBy(xpath = "//td[@data-date='30']")
	WebElement date;

	public WebElement getdate() {
		return date;
	}
	
	@FindBy(xpath = "//input[@id='emsb_user_fullName']")
	WebElement name;

	public WebElement getname() {
		return name;
	}
	
	@FindBy(xpath = "//input[@id='emsb_user_email']")
	WebElement mail;

	public WebElement getmail() {
		return mail;
	}
	
	@FindBy(xpath = "//input[@id='emsb_user_telephone']")
	WebElement phone;

	public WebElement getphone() {
		return phone;
	}
	
	@FindBy(xpath = "//button[@id='submitForm']")
	WebElement submit;

	public WebElement getsubmit() {
		return submit;
	}
	
	@FindBy(xpath = "//*[@id='emsb_booking_ticket']/div[2]/h4")
	WebElement ty;

	public WebElement getty() {
		return ty;
	}
}
