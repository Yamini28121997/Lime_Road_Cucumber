package com.Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import de.erichseifert.vectorgraphics2d.Document;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver;
	protected static JavascriptExecutor javascript = (JavascriptExecutor) driver;
	 

	//Browser Launch
	public static WebDriver browserLaunch(String browser) {


		if(browser.equalsIgnoreCase("chrome")) {
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		return driver;

	}
	//URL Launch

	public static WebDriver urlLaunch(String url) {

		driver.get(url);
		return driver;

	}

	//Close Browser

	public static void closeBrowser() {

		driver.close();
	}

	//Terminate Browser

	public static void terminateBrowser() {

		driver.quit();
	}

	public static void clickAnElement(WebElement element) {
		//explicitWait(element);
		element.click();
	}
	

	public static void inputValue(WebElement element,String value) {
		element.sendKeys(value);
	}

	public static void javscriptclick(WebElement element) {  
			javascript.executeScript("arguments[0].click();", element);
	}
	
	public static void javscriptinput(WebElement element,String input) {
		
		javascript.executeScript("document.getElementById('element').value='input')");
	}
	
	public static void actionsclickMethod(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element);
	}
	
	public static void actionMovemethod(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public static void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
		}
}
