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
	
	@FindBy(xpath = "(//a[contains(text(),'western wear')]//following::a[text()='jeans & jeggings'])[1]")
	private WebElement jeans;
	
	public WebElement getjeans() {
		return jeans;
	}
	
	////div[text()='filter & sort']//following::a[@class="c9 dB fs11 wp96 oH tdN ttC wsN pt4"]//preceding::div[@class="tdS dIb vM fs12 c9"]//preceding::img[@src="//img3.junaroad.com/uiproducts/20717543/zoom_0-1703687919.jpg"]
	@FindBy(xpath = "(//div[text()='filter & sort']//following::div[@class=\"conW fs0 taC pR an-zeroResult  \"]//following::a[@class=\"dB pR taC ldr gtm-p h412 bs oH phref\"])[1]")
	private WebElement firstJean;
	
	public WebElement getJean() {
		return firstJean;
	}
	
	// //span[text()=' S ']   //(//div[text()='SELECT SIZE']//following::div[@class="br10 dIb mr10 vT c4 pt12 fs16 ttU taC wsN size "])[1]
	@FindBy(xpath = "(//div[text()='SELECT SIZE']//following::span[@class=\"br10  bd3  p410 hcP hbxs bxs bs size\"])[1]")
	private WebElement size;
	
	public WebElement getsize() {
		return size;
	}
	
	@FindBy(xpath = "//div[@data-pgn=\"Add to Cart\"]")
	private WebElement cartbutton;
	
	public WebElement getcart() {
		return cartbutton;
	}

	@FindBy(xpath = "//a[@data-pgn=\"Checkout One Step\"]")
     private WebElement buynow;
	
	public WebElement getbuy() {
		return buynow;
	}
	
	@FindBy(id="emph")
	private WebElement mobnumb;
	
	public WebElement getmob() {
		return mobnumb;
	}
	
	@FindBy(xpath = "//input[@value=\"GET OTP\"]")
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
