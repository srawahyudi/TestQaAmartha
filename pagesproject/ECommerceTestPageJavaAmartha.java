package pagesproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ECommerceTestPageJavaAmartha {
	
	WebDriver driver = null;
	
	By swaglabsUserNameLogin = By.id("user-name");
	By swaglabPassUserLogin = By.id("password");
	By swaglabsLoginButton = By.xpath("//input[@class='btn_action']");
	By swaglabsAddToCart = By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]");
	By swaglabsAddToCart2 = By.xpath("//body[@class='main-body']//div[@id='inventory_container']//div[@id='inventory_container']//div[2]//div[3]//button[1]");
	By swaglabsAccessCart = By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']");
	By swaglabsCheckout = By.xpath("//a[@class='btn_action checkout_button']");
	By swaglabsCheckoutStepOneFirstname = By.xpath("//input[@id='first-name']");
	By swaglabsCheckoutStepOneLastname = By.xpath("//input[@id='last-name']");
	By swaglabsCheckoutStepOnePostalCode = By.xpath("//input[@id='postal-code']");
	By swaglabsCheckoutStepOneContinueButton = By.xpath("//input[@class='btn_primary cart_button']");
	
	public ECommerceTestPageJavaAmartha(WebDriver driver) {
		this.driver = driver;
	}
	
	public void emailUsernameLogin(String text) {
		driver.findElement(swaglabsUserNameLogin).sendKeys(text);
	}
	
	public void passUserLogin(String text) {
		driver.findElement(swaglabPassUserLogin).sendKeys(text);
	}
	
	public void loginButton() {
		driver.findElement(swaglabsLoginButton).sendKeys(Keys.RETURN);
	}
	
	public void addItemToCart() {
		driver.findElement(swaglabsAddToCart).sendKeys(Keys.RETURN);
		driver.findElement(swaglabsAddToCart2).sendKeys(Keys.RETURN);
	}
	
	public void cart() {
		driver.findElement(swaglabsAccessCart).sendKeys(Keys.RETURN);
	}
	
	public void checkout() {
		driver.findElement(swaglabsCheckout).sendKeys(Keys.RETURN);
	}
	
	public void checkoutStepOneFirstName(String text) {
		driver.findElement(swaglabsCheckoutStepOneFirstname).sendKeys(text);
	}
	
	public void checkoutStepOneLastName(String text) {
		driver.findElement(swaglabsCheckoutStepOneLastname).sendKeys(text);
	}
	
	public void checkoutStepOneZipPostalCode(String text) {
		driver.findElement(swaglabsCheckoutStepOnePostalCode).sendKeys(text);
	}

	public void continueCheckoutStepOne() {
		driver.findElement(swaglabsCheckoutStepOneContinueButton).sendKeys(Keys.RETURN);
	}
}
