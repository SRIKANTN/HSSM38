package com_ActiTime_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Com_ActiTime_Generic.BasePage;

public class actiTIMELoginPage extends BasePage
{
	// Declaration
	@FindBy(id = "username")
	private WebElement unTB;
	
	@FindBy(name = "pwd")
	private WebElement pwTB;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement lgBT;
	
	@FindBy(xpath ="//span[text()='Username or Password is invalid. Please try again.']")
	private WebElement error;
	
	@FindBy(xpath = "//nobr[contains(text(),'actiTIME')]")
	private WebElement version;
	
	//Intiliziation
	public actiTIMELoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void EnterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void EnterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void ClickOnLoginButton()
	{
		lgBT.click();
	}
	
	public String verifyErrorMSG()
	{
		verifyElement(error);
		String aerror = error.getText();
		return aerror;
	}
	public String verifyVersion()
	{
		verifyElement(version);
		String aversion = version.getText();
		return aversion;
	}

}
