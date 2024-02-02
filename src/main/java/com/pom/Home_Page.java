package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public class Home_Page extends Base_Class  {
	
	public Home_Page() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "shopWomen")
	private WebElement element;

	public WebElement getElement() {
		return element;
	}
	
	@FindBy(id = "women_category")
	private WebElement womenCategory;
	
	public WebElement getwomencategory() {
		return womenCategory;
	}
	
	@FindBy(xpath = "(//a[@class = 'c5 subCatItem tdN vT cuP'])[22]")
	private WebElement jeans;
	
	public WebElement getjeans() {
		return jeans;
	}
	
	@FindBy(xpath = "(//div[text() ='trending'])[2]")
	public WebElement trending;
	
	public WebElement gettrending() {
		return trending;
	}
	
	@FindBy(xpath = "(//img[@alt = 'Product image'])[1]")
	private WebElement firstJean;
	
	public WebElement getJean() {
		return firstJean;
	}
	
	@FindBy(xpath = "//span[text() =' 36 ']")
	private WebElement size;
	
	public WebElement getsize() {
		return size;
	}
	
	@FindBy(xpath = "//div[text() = 'ADD TO CART']")
	private WebElement cartbutton;
	
	public WebElement getcart() {
		return cartbutton;
	}

	@FindBy(xpath = "//a[text() = 'BUY NOW']")
     private WebElement buynow;
	
	public WebElement getbuy() {
		return buynow;
	}
	
	@FindBy(name = "user_id")
	private WebElement mobnumb;
	
	public WebElement getmob() {
		return mobnumb;
	}
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	private WebElement otpbutton;
	
	public WebElement getotp() {
		return otpbutton;
	}
	
	@FindBy(name = "pincode")
	private WebElement pincode;
	
	public WebElement getpin() {
		return pincode;
	}
	
	@FindBy(name = "first_name")
	private WebElement firstname;
	
	public WebElement getname() {
		return firstname;
	}
	
	@FindBy(name = "locality")
	private WebElement locality;
	
	public WebElement getlocality() {
		return locality;
		
	}
	
	@FindBy(name = "address1")
	private WebElement address1;
	
	public WebElement getaddress1() {
		return address1;
	}
	
	@FindBy(name = "address2")
	private WebElement address2;
	
	public WebElement getaddress2() {
		return address2;
	}
	
	
}
