package com.demo;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListnersDemo.class)

public class DemoWebShop {
	
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	
	

@Test
  public void loginDetails() {
	  driver.get("https://demowebshop.tricentis.com/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sachin1jam@gmail.com");
	  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sachin123");
	  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click(); 
  }
  @Test(dependsOnMethods = "loginDetails",alwaysRun = true,priority = 1)
  public void AssertTheId() {
	  String Actual = "Sachin1jam@gmail.com";
	  String Expected = driver.findElement(By.xpath("//a[contains(text(),'Sachin1jam@gmail.com')]")).getText();
	  Assert.assertEquals(Expected,Actual);
	  System.out.println(Actual + Expected);
  }
  
  @Test(dependsOnMethods = { "AssertTheId","loginDetails"},alwaysRun = true,priority = 2)
  public void Computer() {
	  driver.findElement(By.partialLinkText("Compute")).click();
	  driver.findElement(By.partialLinkText("Deskto")).click();
	  js.executeScript("scrollBy(0, 200)");
	  driver.findElement(By.linkText("Build your own computer")).click();
	  js.executeScript("scrollBy(0, 350)");
	  driver.findElement(By.xpath("//input[@id='product_attribute_16_3_6_18']")).click();
	  driver.findElement(By.xpath("//input[@id='add-to-cart-button-16']")).click();
  }
  @Test(dependsOnMethods = {"Computer","AssertTheId","loginDetails"},alwaysRun = true)
  public void Cart() {
	  driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
	  driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
	  driver.findElement(By.xpath("//button[@id='checkout']")).click();
	  driver.findElement(By.xpath("//input[@title='Continue']")).click();
  }
  @Test(dependsOnMethods = {"Cart","Computer","AssertTheId","loginDetails"},alwaysRun = true)
  public void Clothes() {
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")).click();
	  js.executeScript("scrollBy(0, 200)");
	  driver.findElement(By.linkText("50's Rockabilly Polka Dot Top JR Plus Size")).click();
	  WebElement testDropDown = driver.findElement(By.id("product_attribute_5_7_1"));  
	  Select dropdown = new Select(testDropDown);  
	  dropdown.selectByValue("3");
	  WebElement ref =  driver.findElement(By.cssSelector("#addtocart_5_EnteredQuantity"));
	  js.executeScript("arguments[0].value='3'",ref);
	  driver.findElement(By.xpath("//input[@id='add-to-cart-button-5']")).click(); 
  }
  
  @Test(alwaysRun = true,dependsOnMethods = {"Cart","Computer","AssertTheId","loginDetails,","Clothes"})
  public void Verify() {
	  driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	  driver.quit();
	  
  }
}
