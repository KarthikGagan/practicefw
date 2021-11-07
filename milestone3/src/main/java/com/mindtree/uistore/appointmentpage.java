package com.mindtree.uistore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class appointmentpage {

	public WebDriver driver;

	public appointmentpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='et-main-area']//h2")
	WebElement title;

	public WebElement gettitle() {
		return title;
	}
	
	@FindBy(xpath = "//article[@id='post-219082']//button")
	WebElement homeserivice;

	public WebElement gethomeservice() {
		return homeserivice;
	}
	
}
