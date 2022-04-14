package GoPadelPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoPadelDashboardPage {

	WebDriver driver;
	WebDriverWait wait;

	public GoPadelDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"minileftbar\"]/ul/li[2]/a")
	WebElement arrow;

	@FindBy(xpath = "//*[@id=\"leftsidebar\"]/div/ul/li[1]/div/div[2]/a")
	WebElement logout;
	

	public void Logout() {
		arrow.click();
		logout.click();
	}
	
}

