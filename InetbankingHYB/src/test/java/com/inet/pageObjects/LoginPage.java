package com.inet.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
    public WebDriver driver;
    
    //constructor
    public LoginPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    	
    }
	
	//webelements
    @FindBy(name="uid")
    WebElement txtUserName;
     
    @FindBy(name="password")
    WebElement txtpassword;
	
    @FindBy(name="btnLogin")
    WebElement btnLogin;
    
   @FindBy(tagName="a")
    List<WebElement> list;
	
    
    //Corresponding actions
    
    public void SetUserName(String user)
    {
    	txtUserName.sendKeys(user);
    }
    
    public void SetPassword(String pwd) 
    {
    	txtpassword.sendKeys(pwd);
    }
    
    public void Login()
    {
    	btnLogin.click();
    }
}
