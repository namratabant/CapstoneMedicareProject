package stepdef;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	public static WebDriver driver;
	
	@Before
	public static void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@After
	
	public static void tearDown() {
		
		driver.close();
	} 
	
	public static String randomString() {
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return(generatedString);
		

	}

}


