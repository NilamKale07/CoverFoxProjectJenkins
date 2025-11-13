package com.coverfox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxHomePage {
	
	//varible
	
	@FindBy(xpath="//button[@title='Get Started']")private WebElement getStartedButton;
	
	//Constructor
	
	public CoverfoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void clickonGetStartedButton()
	{
		System.out.println("HomePage:Click on GetStartedButton");
		getStartedButton.click();
	}
	

}
