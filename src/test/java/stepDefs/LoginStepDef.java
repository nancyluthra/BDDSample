package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStepDef {
	WebDriver driver;

	@Given("when user is on login page")
	public void when_user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
	    
	}
	@When("User enters login credentials")
	public void user_enters_login_credentials() {
		driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector(".radius")).click();
	    
	}
	@Then("should display success msg")
	public void should_display_success_msg() {
		boolean isdis = driver.findElement(By.className("success")).isDisplayed();
		Assert.assertTrue(isdis);
	    driver.quit();
	}




}
