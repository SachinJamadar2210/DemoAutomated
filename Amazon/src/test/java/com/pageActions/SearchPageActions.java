package com.pageActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.helperclass.HelperClass;
import com.pageLocators.SearchPageLocators;
public class SearchPageActions {
	SearchPageLocators SearchPage = null;
	WebDriver driver ;	
	public SearchPageActions() {
		this.SearchPage = new SearchPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), SearchPage);
	}
	public void All() throws Exception {
		SearchPage.All.click();
		Thread.sleep(1000);
		SearchPage.Cancle.click();
		Thread.sleep(1000);
	//	SearchPage.Fresh.click();
		Thread.sleep(1000);
		SearchPage.Sell.click();
		Thread.sleep(1000);
		SearchPage.Best.click();
		Thread.sleep(1000);
		SearchPage.Mobile.click();
		Thread.sleep(1000);
		SearchPage.Deals.click();
		Thread.sleep(1000);
		SearchPage.Electronics.click();
		Thread.sleep(1000);
		//SearchPage.Gift.click();
	}
	public void Order() throws Exception {
		SearchPage.iphone.sendKeys("Iphone",Keys.ENTER);
		Thread.sleep(2000);
		SearchPage.Select.click();		
		Thread.sleep(2000);
			
	}
	public void Pad() {
		SearchPage.dropDown.click();
		SearchPage.Best.click();
		SearchPage.Pad.click();
		SearchPage.body.click();
		SearchPage.Beauty.click();
		SearchPage.Drugstore.click();
	//	SearchPage.Fashion.click();
		SearchPage.Sports.click();
		SearchPage.All.click();
	}
	public void Book(){
		SearchPage.Mover.click();
		SearchPage.Book.click();
		SearchPage.Cart.click();
		SearchPage.Proceed.click();
	}
}