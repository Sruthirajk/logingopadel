package GoPadelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GoPadelLoginPage {

	WebDriver driver;
	WebDriverWait wait;

	private static final Logger log = LogManager.getLogger(GoPadelLoginPage.class);

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//*[text()='Log in']")
	WebElement login;

	@FindBy(xpath = "//*[text()='Contact Us']")
	WebElement ContactUs;
	
	@FindBy(xpath = "//*[text()='About Us']")
	WebElement AboutUs;

	@FindBy(xpath = "//*[text()='Services']")
	WebElement Services;
	
	@FindBy(xpath = "//*[text()='FAQ']")
	WebElement FAQ;
	
	@FindBy(xpath = "//*[text()='Forgot Password?']")
	WebElement ForgotPassword;

	
	
	@FindBy(xpath = "/html/body/div/div/div/div/div/div[1]/div/div/ul[1]/li[1]/a")
	WebElement linkedin;
	
	@FindBy(xpath = "/html/body/div/div/div/div/div/div[1]/div/div/ul[1]/li[2]/a/i")
	WebElement Facebook;
	
	@FindBy(xpath = "/html/body/div/div/div/div/div/div[1]/div/div/ul[1]/li[3]/a/i")
	WebElement Twitter;
	
	@FindBy(xpath = "/html/body/div/div/div/div/div/div[1]/div/div/ul[1]/li[4]/a")
	WebElement Googleplus;
	
	@FindBy(xpath = "//*[text()='Submit']")
	WebElement Submit;
	
	@FindBy(xpath = "//*[text()='Submit']")
	WebElement arrow;
	
	@FindBy(xpath = "//*[text()='Logout']")
	WebElement logout;
	
	
	
	
	public GoPadelLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String uname) {
		username.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickSubmitButton() {
		Submit.click();
	}

	public String signinLabel() {
		return login.getText();
	}

	public void displayusername() {
		Assert.assertEquals(true, username.isDisplayed());
		System.out.println("Username field displayed");
		System.out.println("=======================================");
	}

	public void displayPassword() {
		Assert.assertEquals(true, password.isDisplayed());
		System.out.println("Password field displayed");
		System.out.println("=======================================");
	}

	public void displayContactUs() {
		Assert.assertEquals(true, ContactUs.isDisplayed());
		System.out.println("ContactUs is displayed ");
		System.out.println("=======================================");
	}
	
	
	public void displayAboutUs() {
		Assert.assertEquals(true, AboutUs.isDisplayed());
		System.out.println("AboutUs is displayed ");
		System.out.println("=======================================");
	}
	

	public void displayServices() {
		Assert.assertEquals(true, Services.isDisplayed());
		System.out.println("Services  is displayed ");
		System.out.println("=======================================");;
	}
	
	public void displayFAQ() {
		Assert.assertEquals(true, FAQ.isDisplayed());
		System.out.println("FAQ is displayed ");
		System.out.println("=======================================");
	}
	
	public void displayForgotPassword() {
		Assert.assertEquals(true, ForgotPassword.isDisplayed());
		System.out.println("loginbutton field displayed");
		System.out.println("=======================================");
	}
	
	public void  displaylinkedin() {
		Assert.assertEquals(true, linkedin.isDisplayed());
		System.out.println(" linkedin is displayed");
		System.out.println("=======================================");
	}
	
	public void  displayfacebook() {
		Assert.assertEquals(true, Facebook.isDisplayed());
		System.out.println(" facebook is displayed");
		System.out.println("=======================================");
	}
	
	public void  displayTwitter() {
		Assert.assertEquals(true, Twitter.isDisplayed());
		System.out.println(" Twitter is displayed");
		System.out.println("=======================================");
	}
	
	public void  displayGoogleplus() {
		Assert.assertEquals(true, Googleplus.isDisplayed());
		System.out.println(" Googleplus is displayed");
		System.out.println("=======================================");
	}
	
	public GoPadelDashboardPage login(String UserName, String Password) {
		log.info("Logging with username - " + username + " and password - " + password);
		setUsername(UserName);
		setPassword(Password);
		clickSubmitButton();
		return new GoPadelDashboardPage(driver);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void forgetpassword()
		{
		WebElement forgetpassword = wait.until(ExpectedConditions
				.visibilityOfElementLocated (By.xpath("//*[text()='Forgot Password?']")));
		forgetpassword.click();
		
		
	}
}
	
