package com.pageLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SearchPageLocators {
	//All Button
	@FindBy (xpath = "//a[@id='nav-hamburger-menu']")
	public WebElement All;
	
	@FindBy (xpath = "//div[@class='nav-sprite hmenu-close-icon']")
	public WebElement Cancle;
	@FindBy(linkText =  "Sell")
	public WebElement Sell ;
	@FindBy(xpath  =  "//a[contains(text(),'Best Sellers')]")
	public WebElement Best;
	@FindBy(xpath  =  "//a[contains(text(),\"Today's Deals\")]")
	public WebElement Deals;
	@FindBy(xpath  =  "//a[contains(text(),\"Mobiles\")]")
	public WebElement Mobile;
	@FindBy(xpath  =  "//a[contains(text(),\"Gift Ideas\")]")
	public WebElement Gift;
	@FindBy(xpath  =  "//a[contains(text(),\"Electronics\")]")
	public WebElement Electronics;
	@FindBy(xpath  =  "//input[@id='twotabsearchtextbox']")
	public WebElement iphone;
	@FindBy(xpath  =  "//div[@class='nav-search-scope nav-sprite']")
	public WebElement Relect;
	@FindBy(xpath  =  "//select [@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']")
	 public WebElement dropDown;
	@FindBy(linkText   =  "Amazon Launchpad")
	 public WebElement Pad;
	@FindBy(xpath   =  "//a[contains(text(),'Body')]")
	 public WebElement body;
	@FindBy(linkText   =  "Beauty")
	 public WebElement Beauty;
	@FindBy(linkText   =  "Drugstore")
	 public WebElement Drugstore;
	@FindBy(linkText   =  "Fashion")
	 public WebElement Fashion;
	@FindBy(partialLinkText =  "Sports & Outdoo")
	 public WebElement Sports;
	@FindBy(xpath   =  "//a[contains(text(),'Movers and Shakers')]")
	 public WebElement Mover;
	@FindBy(xpath   =  "//*[@id=\"B0CTYCFYJ3\"]/a[2]/span/div")
	 public WebElement Book;
	@FindBy(xpath   =  "//input[@name='submit.add-to-cart']")
	 public WebElement Cart;
	@FindBy(xpath   =  "//input[@name='proceedToRetailCheckout']")
	 public WebElement Proceed;
	
	
	
	
	
	
}