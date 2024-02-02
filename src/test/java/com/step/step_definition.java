package com.step;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.Base.Base_Class;
import com.pom.Home_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class step_definition extends Base_Class {

	 Home_Page hp = new Home_Page();	     

	@When("User launch the Url {string}")
	public void user_launch_the_url(String string) {
	    urlLaunch(string);
	}

	@When("User clicks the women button")
	public void user_clicks_the_women_button() {
	    actionsclickMethod(hp.getElement());
	}

	@Given("To navigate to womencategory section")
	public void to_navigate_to_womencategory_section() {
	    actionMovemethod(hp.getwomencategory());
	}

	@When("User select women jeanandjeggings options")
	public void user_select_women_jeanandjeggings_options() throws InterruptedException {
		Thread.sleep(2000);
	   clickAnElement(hp.getjeans());
	}
	
//	@When("apply filter to sort by trending")
//	public void apply_filter_to_sort_by_trending() throws InterruptedException  {
//		Thread.sleep(2000);
//	    javscript(hp.gettrending());
//	}
	
	@When("Select jean")
	public void select_jean() throws InterruptedException {
		Thread.sleep(2000);
	    clickAnElement(hp.getJean());
	}

//	@Given("User selects particular jean")
//	public void user_selects_particular_jean() {
//	    
//	}

	@When("User select specific size")
	public void user_select_specific_size() throws InterruptedException {
		Thread.sleep(2000);
	    clickAnElement(hp.getsize());
		
	}

	@When("Adding jean to cart value")
	public void adding_jean_to_cart_value() {
	 clickAnElement(hp.getcart());
	 
	}
 
	@Given("User clicks buy now for purchasing")
	public void user_clicks_buy_now_for_purchasing() throws InterruptedException {
		Thread.sleep(2000);
		clickAnElement(hp.getbuy());
	}

	@When("User enters mobile number for otp verification")
	public void user_enters_mobile_number_for_otp_verification() throws InterruptedException {
		Thread.sleep(2000);
		javscriptinput(hp.getmob(), "9019523648");
		
	}

	@When("User clicks get otp option")
	public void user_clicks_get_otp_option() {
	    clickAnElement(hp.getotp());
	}

	@Given("User enters all personal details")
	public void user_enters_all_personal_details() {
	   
	}

	@When("User clicks confirm order for order placing")
	public void user_clicks_confirm_order_for_order_placing() {
	    
	}



}
