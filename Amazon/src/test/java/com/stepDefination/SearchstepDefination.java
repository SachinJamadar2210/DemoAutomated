package com.stepDefination;
import com.helperclass.HelperClass;
import com.pageActions.SearchPageActions;
import com.pageLocators.SearchPageLocators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SearchstepDefination {
	SearchPageLocators objLogin = new SearchPageLocators();
	SearchPageActions objhome = new SearchPageActions();
	
	@Given("Open Browser {string}")
	public void open_browser(String url) {
      HelperClass.openpage(url);	
	}
	@When("User Enters Searchs the product")
	public void user_enters_searchs_the_product() throws Exception {
	objhome.All();
	objhome.Order();
	}
	@Then("User should Specify the Product")
	public void user_should_specify_the_product() {
		objhome.Pad();
	}
	@Then("Click on rhe product")
	public void click_on_rhe_product() {
		objhome.Book();
		System.out.println("Done till this");
	}
}
