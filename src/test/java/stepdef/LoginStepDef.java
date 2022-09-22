package stepdef;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import pageobject.LoginPage;


public class LoginStepDef {
	WebDriver driver=BaseClass.driver;
	LoginPage lp=new LoginPage();
	
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		BaseClass.setup();
	    
	}
	
	@When("I have opened the mediCare application in browser")
	public void i_have_opened_the_mediCare_application_in_browser() {
		driver.get("http://localhost:8082/medicare/home");
	}
	
	@Given("click on login link")
	public void click_on_login_link() throws Exception {
	    lp.loginlink();
	}

	@When("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String usrname, String passwd) {
		lp.loginFunc(usrname, passwd);
	    
	}

	@When("I click on the login Button")
	public void i_click_on_the_login_Button() {
	    lp.login();
	}

	@Then("I should be Landed on the products page")
	public void i_should_be_Landed_on_the_products_page() throws Exception {
		WebElement name = driver.findElement(By.xpath("//li[@id='userModel']"));
		String user= name.getText();
		System.out.println(user);
		//Assert.assertEquals(user, "Kavita Nigam");
		lp.logout();
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String errmsg) throws Exception {
	    
		WebElement errmsgele = driver.findElement(By.xpath("//div[@class='alert alert-danger fade in']"));
		String msg= errmsgele.getText();
		assertEquals(msg, errmsg);
		Thread.sleep(2000);
	}

}

	
	
	
	
	