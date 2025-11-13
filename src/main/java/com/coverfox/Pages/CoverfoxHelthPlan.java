package com.coverfox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxHelthPlan {
	
	//Variable
	@FindBy(className = "next-btn")private WebElement nextButton;
	
	//Constructor
	
	public CoverfoxHelthPlan(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	public void clickOnNextButton()
	{
		System.out.println("HelthPlan:Click on nextButton");
		nextButton.click();
	}
	
	
	
	

	

	

}
