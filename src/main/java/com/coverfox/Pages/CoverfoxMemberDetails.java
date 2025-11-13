package com.coverfox.Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coverfox.Utils.Utility;



public class CoverfoxMemberDetails {
	
	//Variable
	
	@FindBy(id="Age-You") private WebElement ageDropDown;
	@FindBy(className="next-btn") private WebElement nextButton;
	
	//Constructor
	
	public CoverfoxMemberDetails(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
		
	}
	
	//Methods
	
	public void handleAgeDropDown(String age) throws EncryptedDocumentException, IOException
	{
          Utility.handleDropDownUsingVisibleText(ageDropDown,""+ age +" years ");

		
	}
	
	public void clickOnNextButton()
	{
		System.out.println("MemberDetails:Click on NextButton ");
		nextButton.click();
	}
	
	

}
