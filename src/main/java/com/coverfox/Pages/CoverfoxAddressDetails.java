package com.coverfox.Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CoverfoxAddressDetails {
	
	//Variable
	
	@FindBy(className="mp-input-text") private WebElement pincodeField;
	@FindBy(id="want-expert") private WebElement mobileNoField;
	@FindBy(className="next-btn") private WebElement continueButton;
	@FindBy(xpath="//div[contains(text(),'pincode')]") private WebElement pincodeErrormsg;
	@FindBy(xpath="//div[contains(text(),'mobile')]") private WebElement mobileErrormsg;
	
	//Constructor
	
	public CoverfoxAddressDetails(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	
	public void enterPincodeField(String pincode) throws EncryptedDocumentException, IOException
	{
		pincodeField.sendKeys(pincode);
		System.out.println("enterning pincode value is: "+pincode);
		
	}
	public void enterMobileNoFieldeField(String mobileNo) throws EncryptedDocumentException, IOException
	{
		mobileNoField.sendKeys(mobileNo);
		System.out.println("enterning mobile number value is: "+mobileNo);
	}
	public void clickOnContinueButton()
	{
		System.out.println("AddressDetails:Click on ContinueButton");
		continueButton.click();
	}
	public String  getPincodeErrormsg()
	{
		return pincodeErrormsg.getText();
	}
	public String getMobileErrormsg()
	{
		return mobileErrormsg.getText();
	}

}
