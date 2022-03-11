package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class OpenCartLogin {
	WebDriver driver;
	
	@When("User is on opencart home page")
	public void user_is_on_opencart_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
	    
	}
	@And("User navigates to login page")
	public void user_navigates_to_login_page() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("(//a[contains(@href,\"login\")])[1]")).click();
	    
	}
//	@Given("User login with credentials")
//	public void user_login_with_credentials() {
//		driver.findElement(By.name("email")).sendKeys("nancyluthras@yahoo.com");
//		driver.findElement(By.name("password")).sendKeys("Home@001");
//		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
//	    
//	}
	

//	@Given("User login with {string} and {string}")
//	public void user_login_with_and(String string, String string2) {
//		driver.findElement(By.name("email")).sendKeys(string);
//    	driver.findElement(By.name("password")).sendKeys(string2);
//		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
//	}



	@Then("User navigate to My Account page")
	public void user_navigate_to_my_account_page() {
		Assert.assertEquals("Register Account", driver.getTitle());
	    
	}

    //DataTable as Lists
//	@Given("User login with credentials")
//	public void user_login_with_and(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//		List<List<String>> user = dataTable.asLists();
//		driver.findElement(By.name("email")).sendKeys(user.get(0).get(0));
//    	driver.findElement(By.name("password")).sendKeys(user.get(0).get(1));
//		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
//	    
//	}
	
	//DataTables as Maps
	@Given("User login with credentials")
	public void user_login_with_and(io.cucumber.datatable.DataTable dataTable) {
	   
		List<Map<String , String>> user= dataTable.asMaps();
	    String strUser = user.get(0).get("email");
	    String strPwd = user.get(0).get("pwd");
		driver.findElement(By.name("email")).sendKeys(strUser);
    	driver.findElement(By.name("password")).sendKeys(strPwd);
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	    
	}

	@Then("User Search item")
	public void user_search(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    List<List<String>> itemList = dataTable.asLists();
	    driver.findElement(By.name("search")).sendKeys(itemList.get(0).get(0));
	    driver.findElement(By.cssSelector("span.input-group-btn")).click();
	    driver.quit();
	}





}
