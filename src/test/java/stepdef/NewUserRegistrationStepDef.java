package stepdef;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import pageobject.NewUserRegistration;

public class NewUserRegistrationStepDef {
	
	WebDriver driver=BaseClass.driver;
	NewUserRegistration newuser = new NewUserRegistration();
	
	
	@Given("click on Sign Up link")
	public void click_on_Sign_Up_link() {
		newuser.signuplink();
	}

	@When("user enter all customer details")
	public void user_enter_all_customer_details() {
		
		String email1= BaseClass.randomString()+"@gmail.com";
	    String name1=BaseClass.randomString();
	    String name2=BaseClass.randomString();
		newuser.setFname(name1);
		newuser.setLname(name2);
		newuser.setemail(email1);
		newuser.setphone("9007653215");
		newuser.setpass("123456");
		newuser.setcnfrmpass("123456");
		newuser.setrole("supplier");
	}

	@When("click on Next button")
	public void click_on_Next_button() {
	    newuser.clicknxt();
	}

	@When("user enter sign up address details")
	public void user_enter_sign_up_address_details() {
	    newuser.setaddrs1("009, sai poorna heights");
	    newuser.setaddrs2("hsr layout");
	    newuser.setcity("Bangalore");
	    newuser.setpincode("560102");
	    newuser.setstate("karnataka");
	    newuser.setcountry("India");
	    
	}

	@When("click on Next-Confirm button")
	public void click_on_Next_Confirm_button() {
	    newuser.setbtns("confirm");
	}

	@Then("user details will be displayed")
	public void user_details_will_be_displayed() {
		String persdetails= driver.findElement(By.xpath("//h4[normalize-space()='Personal Details']")).getText();
		assertEquals(persdetails, "Personal Details");
	}

	@Then("click on confirm button")
	public void click_on_confirm_button() throws Exception {
		Thread.sleep(3000);
	    newuser.cnfrm();
	}

	@Then("user can see the confirmation message {string}")
	public void user_can_see_the_confirmation_message(String string1) {
		String cnfrmmsg = driver.findElement(By.xpath("//h6[contains(text(),'You can use your email address as username to logi')]")).getText();
		   System.out.println("confirm msg  " +cnfrmmsg);
		   assertEquals(string1, cnfrmmsg); 
	}
}

