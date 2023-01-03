package com.inet.TestCases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
   public String url="https://demo.guru99.com/v3/index.php";
   public String UserName="mngr466044";
   public String Pasword="EtYgaqe";
   public static WebDriver driver;
   
   @BeforeClass
   public void setup() 
   {
	 System.setProperty("webdriver.chrome.driver","C:/Users/91994/eclipse-workspace/InetbankingHYB/Drivers/chromedriver.exe");
	 driver= new ChromeDriver();
   }
   
   @AfterClass
   public void teardown() 
   {
	   driver.close();
   }
}
