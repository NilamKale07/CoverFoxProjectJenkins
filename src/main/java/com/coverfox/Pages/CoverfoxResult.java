package com.coverfox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxResult {
	
	//Variable
	
	@FindBy(xpath="//div[contains(text(),'Insurance Plans')]") 
	private WebElement matchingResults;
	
	//Constructor
	
	public CoverfoxResult(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//methods
	
	public String getMatchingResultCount()
	{
		String result=matchingResults.getText();
		System.out.println("Fetching Matching Result");
		String[] temp=result.split(" ");
		String finalResult=temp[0];
		return finalResult;
	}
	
	

}
