package GoPadelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GoPadelforgetpasswordpage {
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath ="//*[text()='Forgot Password?']")
	WebElement ForgotPassword;

	@FindBy(name = "Email")
	WebElement Emaild;

	@FindBy(xpath = "//*[@id=\"forgotpasswordsubmit\"]")
	WebElement submit;

	@FindBy(xpath = "/html/body/div/div/div/div/div/div[1]/div/div/ul[2]/li[1]/a")
	WebElement contactus;

	@FindBy(xpath = "/html/body/div/div/div/div/div/div[1]/div/div/ul[2]/li[2]/a")
	WebElement AboutUs;

	@FindBy(xpath = "/html/body/div/div/div/div/div/div[1]/div/div/ul[2]/li[3]/a")
	WebElement Services;

	@FindBy(xpath = "/html/body/div/div/div/div/div/div[1]/div/div/ul[2]/li[4]/a")
	WebElement FAQ;
	
	
	
	@FindBy(xpath = "/html/body/div/div/div/div/div/div[2]/div/a")
	WebElement login;
	
	public GoPadelforgetpasswordpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void Forgetdisplay() {

		 ForgotPassword.click();

		Assert.assertEquals(true, ForgotPassword.isDisplayed());
		System.out.println("ForgotPassword tittle is displayed");
		System.out.println("=======================================");

		Assert.assertEquals(true, Emaild.isDisplayed());
		System.out.println(" Emaild field is displayed");
		System.out.println("=======================================");

		Assert.assertEquals(true, submit.isDisplayed());
		System.out.println(" submit field is displayed");
		System.out.println("=======================================");

		Assert.assertEquals(true, contactus.isDisplayed());
		System.out.println(" contactus is displayed");
		System.out.println("=======================================");

		Assert.assertEquals(true, Services.isDisplayed());
		System.out.println("  Services field is displayed");
		System.out.println("=======================================");

		Assert.assertEquals(true, FAQ.isDisplayed());
		System.out.println("  FAQ is displayed");
		System.out.println("=======================================");

		Assert.assertEquals(true, submit.isDisplayed());
		System.out.println(" Emaild field is displayed");
		System.out.println("=======================================");

	}
	
	public void email() {
		wait = new WebDriverWait(driver, 20);
		
		
		WebElement email = wait.until(ExpectedConditions
				.visibilityOfElementLocated (By.xpath("//*[@id=\"forgotemail\"]")));
		email.click();
		email.sendKeys("cihatod357@eosbuzz.com\r\n");
		WebElement submit = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[text()='Submit']")));
		submit.click();
		System.out.println("The reset password link has been sent to your email address");
		System.out.println("=======================================");

		login.click();
	}
		
}
