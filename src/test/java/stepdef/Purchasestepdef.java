package stepdef;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginPage;
import pageobject.Purchase;


public class Purchasestepdef {

	
	WebDriver driver=BaseClass.driver;
	LoginPage lp=new LoginPage();
	Purchase pp = new Purchase();
	
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String uname, String pass) {
		lp.loginFunc(uname, pass);
	    
	}

	@When("click on the login button")
	public void click_on_login_button() {
	    lp.login();
	} 
	
/*	@Then("user should see the Home page")
	public void user_should_see_the_home_page() {
		System.out.println(lp.homePagetitle());
	    assertEquals("Medicare - Home", lp.homePagetitle());
	} */

	@When("user click on View Products tab")
	public void user_click_on_View_Products_tab() throws Exception {
		pp.viewpoducts();
		Thread.sleep(1000);
	    
	}

	@When("click on cart icon of the selected product")
	public void click_on_cart_icon_of_the_selected_product() throws Exception {
	    pp.addcart1();
	    Thread.sleep(1000);
	}

	@When("click on Continue shopping button")
	public void click_on_Continue_shopping_button() throws Exception {
	    pp.cntshop();
	    Thread.sleep(1000);
	}

	@Then("user goes back to products page")
	public void user_goes_back_to_products_page() {
	    assertEquals("Medicare - All Products", pp.pageTitle());
	}

	@When("user click on cart icon")
	public void user_click_on_cart_icon() {
	    pp.addcart2();
	}

	@When("click on checkout button")
	public void click_on_checkout_button() {
	    pp.chkout();
	}

	@Then("check shipping address and click on select button")
	public void check_shipping_address_and_click_on_select_button() throws Exception {
	    pp.selectbutton();
	    Thread.sleep(1500);
	}

	@Then("provide Card number expiry date and CVV code")
	public void provide_Card_number_expiry_date_and_CVV_code() throws Exception {
	    pp.carddetails();
	    Thread.sleep(2000);
	}

	@Then("click on Pay button")
	public void click_on_Pay_button() {
	    pp.paybutton();
	}

	@Then("user should get the confirmation message {string}")
	public void user_should_get_the_confirmation_message(String cmsg) throws Exception {
		
		String cnfrmsg = driver.findElement(By.xpath("//h3[normalize-space()='Your Order is Confirmed!!']")).getText();
		assertEquals(cmsg, cnfrmsg);
		Thread.sleep(1500);
	    
	}

}

