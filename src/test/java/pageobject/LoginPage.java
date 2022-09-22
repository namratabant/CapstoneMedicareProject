package pageobject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepdef.BaseClass;

public class LoginPage {


		
	WebDriver driver=BaseClass.driver;
	
	@FindBy(css = "a[href='/medicare/login']")
	WebElement loginlink;
	
	@FindBy(id="username")
	WebElement loginid;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//a[@class='btn btn-default dropdown-toggle']")
	WebElement drpdwn;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logout;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginlink() throws Exception {
		JavascriptExecutor js2= (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click();",loginlink );
		//loginlink.click();
		Thread.sleep(2000);
	}
	
	public void login() {
		loginbtn.click();
	}
	public void loginFunc(String usrname,String pwd) {
		loginid.sendKeys(usrname);
		password.sendKeys(pwd);
	}
	
	public String homePagetitle() {
		return driver.getTitle();
	}
	
	public void logout() throws Exception {
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", drpdwn);
		Thread.sleep(5000);
	//	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		logout.click();
	}
	
	public void tearown() {
		driver.close();
	}
	
	

}