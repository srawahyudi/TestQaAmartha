package testproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesproject.ECommerceTestPageJava;
import pagesproject.ECommerceTestPageJavaAmartha;
import pagesproject.GoogleSearchPageObjects;

public class ECommerceTestPageAmartha {
	
	public static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest( ) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void loginTest() {
		
		ECommerceTestPageJavaAmartha eCommerceTestPageJavaAmartha = new ECommerceTestPageJavaAmartha(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		eCommerceTestPageJavaAmartha.emailUsernameLogin("standard_user"); // success login
//		eCommerceTestPageJavaAmartha.emailUsernameLogin("locked_out_user"); // locked User login
//		eCommerceTestPageJavaAmartha.emailUsernameLogin("problem_user");  // success login but error show inventory.html images product
//		eCommerceTestPageJavaAmartha.emailUsernameLogin("performance_glitch_user"); // success login
		eCommerceTestPageJavaAmartha.passUserLogin("secret_sauce");
		eCommerceTestPageJavaAmartha.loginButton();
		eCommerceTestPageJavaAmartha.addItemToCart();
		eCommerceTestPageJavaAmartha.cart();
		eCommerceTestPageJavaAmartha.checkout();
		eCommerceTestPageJavaAmartha.checkoutStepOneFirstName("Sra");
		eCommerceTestPageJavaAmartha.checkoutStepOneLastName("Wahyudi");
//		eCommerceTestPageJavaAmartha.checkoutStepOneZipPostalCode("17530");
		eCommerceTestPageJavaAmartha.checkoutStepOneZipPostalCode("Cikarang Pusat"); // It should only be a number but still can continue process
		eCommerceTestPageJavaAmartha.continueCheckoutStepOne();
	}
	
	@AfterTest
	public void AfterTestLogin(){
		//driver.close();
		System.out.println("Test Completed Successfully");
	}
}
