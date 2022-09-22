package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdef.BaseClass;

public class Purchase {
	
WebDriver driver=BaseClass.driver;
	
	@FindBy(xpath="(//a[normalize-space()='View Products'])[1]")
	WebElement viewproductbtn;
	
	@FindBy(xpath = "(//a[@class='btn btn-success'])[1]")
	WebElement addcartbtn1;
	
	@FindBy(xpath = "(//a[@class='btn btn-success'])[2]")
	WebElement addcartbtn2;
	
	@FindBy(xpath = "(//a[normalize-space()='Next'])[1]")
	WebElement nxtbtn;
	
	@FindBy(xpath = "//a[normalize-space()='Continue Shopping']")
	WebElement cntshopping;
	
	@FindBy(xpath = "//a[normalize-space()='Checkout']")
	WebElement chkout;
	
	@FindBy(xpath = "//a[normalize-space()='Select']")
	WebElement selectbtn;
	
	@FindBy(xpath = "//input[@id='cardNumber']")
	WebElement cardnmbr;
	
	@FindBy(xpath = "//input[@id='expityMonth']")
	WebElement expirymnth;
	
	@FindBy(xpath = "//input[@id='expityYear']")
	WebElement expiryyear;
	
	@FindBy(xpath = "//input[@id='cvCode']")
	WebElement cvvcode;
	
	@FindBy(xpath = "//a[normalize-space()='Pay']")
	WebElement paybtn;
	
	public  Purchase () {
		PageFactory.initElements(driver, this);
	}
	
	public void viewpoducts() {
		JavascriptExecutor js2= (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click();",viewproductbtn);
		
		
	}
	
	public String pageTitle() {
		return driver.getTitle();
	}
	
	public void addcart1() {
		JavascriptExecutor js3= (JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click();",addcartbtn1);
		
	}
	
	public void addcart2() {
		JavascriptExecutor js4= (JavascriptExecutor)driver;
		js4.executeScript("arguments[0].click();",addcartbtn2);
		
	}
	
	public void nxtbtn() {
		JavascriptExecutor js5= (JavascriptExecutor)driver;
		js5.executeScript("arguments[0].click();",nxtbtn);
		
	}
	
	public void cntshop() {
		JavascriptExecutor js5= (JavascriptExecutor)driver;
		js5.executeScript("arguments[0].click();",cntshopping);
		
	}
	
	public void chkout() {
		JavascriptExecutor js5= (JavascriptExecutor)driver;
		js5.executeScript("arguments[0].click();",chkout );
		
	}
	
	public void selectbutton() {
		JavascriptExecutor js5= (JavascriptExecutor)driver;
		js5.executeScript("arguments[0].click();",selectbtn);
		
	}
	public void carddetails() {
		cardnmbr.sendKeys("123458762143");
		expirymnth.sendKeys("06");
		expiryyear.sendKeys("27");
		cvvcode.sendKeys("234");
	}
	
	public void paybutton() {
		JavascriptExecutor js5= (JavascriptExecutor)driver;
		js5.executeScript("arguments[0].click();",paybtn);
		
	}
	

}
