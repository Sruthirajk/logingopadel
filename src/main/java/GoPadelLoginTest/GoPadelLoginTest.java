package GoPadelLoginTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GoPadelPages.GoPadelDashboardPage;
import GoPadelPages.GoPadelLoginPage;
import GoPadelPages.GoPadelforgetpasswordpage;
import TestScenario.GoPadelTestBase;

public class GoPadelLoginTest extends GoPadelTestBase {
	GoPadelDashboardPage DashboardPage;
	GoPadelLoginPage loginPage;
	GoPadelforgetpasswordpage Password;
	WebDriverWait wait;

	// Log4j configuration
	private static final Logger log = LogManager.getLogger(GoPadelLoginTest.class);

	@Test(priority = 0)
	public void loginTest() {

		log.info("Verifying successful login.");

		loginPage = new GoPadelLoginPage(driver);

		String expectedSignLabel = "Log in";
		String actualSignLabel = loginPage.signinLabel();
		log.info(" expectedSignLabel-" + expectedSignLabel + " and actualSignLabel - " + actualSignLabel);
		Assert.assertEquals(expectedSignLabel, actualSignLabel);
		System.out.println("Login In is Displayed");

		loginPage.displayusername();
		loginPage.displayPassword();
		loginPage.displayForgotPassword();
		loginPage.clickSubmitButton();
		loginPage.displayAboutUs();
		loginPage.displayContactUs();
		loginPage.displayServices();
		loginPage.displayFAQ();
		loginPage.displaylinkedin();
		loginPage.displayTwitter();
		loginPage.displayfacebook();
		loginPage.displayGoogleplus();

//		GoPadelDashboardPage dashboardPage = loginPage.login("admin", "Admin@12345");
	}

	@DataProvider(name = "loginCredentials")
	public Object[][] getData() {
		return new Object[][] {

			{ "gkg","Admin@12345", "Wrong username or password." },
			{ "admin","12345", "Wrong username or password.." },
			{ "kjfkdf","23135", "Wrong username or password." },
//			{ "  ","  ", "Please fill out the field" },
			{ "admin","  ", "Please fill out the field" },
//			{ " ","Admin@12345", "Please fill out the field" },
			{ "admin","Admin@12345", " " }, };
	};

	@Test(dataProvider = "loginCredentials")
	public void loginfunction(String UserName, String Password, String Errormessage) {

		WebElement username = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/form/div[1]/input"));
		username.clear();
		username.sendKeys(UserName);
		WebElement password = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/form/div[2]/input"));
		password.clear();
		password.sendKeys(Password);
		WebElement submit = driver.findElement(By.xpath("//*[text()='Submit']"));
		submit.click();
	}


	@Test(priority = 1)
	public void  main() 
	{
		DashboardPage = new GoPadelDashboardPage(driver);
		DashboardPage.Logout();
	}
	
	@Test(priority = 2)
	public void forgetPassword() {
		
		Password = new GoPadelforgetpasswordpage(driver);
		Password.Forgetdisplay();
		Password.email();
	}
}
