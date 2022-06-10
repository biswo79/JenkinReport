package Signin;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
    import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class AmazonStepDef {
		String url="https://www.amazon.in/";
		WebDriver driver=null;
		
		@Given("I have browser opened and url is navigated")
		public void i_have_browser_opened_and_url_is_navigated() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Selenium\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.get(url);
		}
		@When("^User Navigate to LogIn Page$")
		public void user_Navigate_to_LogIn_Page() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
			}

		@Then("User provide valid {string} and {string}")
		public void user_provide_Email_and_Password(String Email,String Password)  throws Throwable  {
			
			      
			driver.findElement(By.id("ap_email")).sendKeys(Email);
			driver.findElement(By.id("continue")).click();
			
		    driver.findElement(By.id("ap_password")).sendKeys(Password);
		    driver.findElement(By.id("signInSubmit")).click();
		    
		}

		@When("User enters email and password in signin page")
		public void User_enters_email_and_password_in_signin_page(DataTable dataTable) {
//			List<List<String>> data=dataTable.asLists(String.class);
			List<Map<String, String>> listdata= dataTable.asMaps(String.class,String.class);
			
		    
			driver.findElement(By.id("ap_email")).sendKeys(listdata.get(0).get("Email"));
			driver.findElement(By.id("continue")).click();
			
			 
		    driver.findElement(By.id("ap_password")).sendKeys(listdata.get(0).get("Password"));
		    driver.findElement(By.id("signInSubmit")).click();
		    
      }
			
			
	}

