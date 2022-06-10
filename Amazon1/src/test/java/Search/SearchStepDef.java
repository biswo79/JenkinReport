package Search;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDef {
	String url="https://www.amazon.in/";
	WebDriver driver=null;
	
	@Given("browser opened and url is navigated")
	public void browser_opened_and_url_is_navigated() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Selenium\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
	}
	
	@When ("I search for product as {string}")
	public void i_search_for_product_as(String Product) {

		WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iPhone 11");
		WebElement searchbutton = driver.findElement(By.xpath("//input[@value='Go']"));
		searchbutton.click();
		
		
	}
	
	@And ("user should click on the product")
	public void user_should_click_on_the_product() {
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	}
	
	@When("user should click on wishlist")
	public void user_should_clickon_wishlist() {
		Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
   
        driver.manage().window().maximize();
        //wait
        //driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	       
        //wishlist
        driver.findElement(By.xpath("//*[@id=\"wishListMainButton\"]")).click();
	}
	
	@Then("user should click on view your list")
	public void user_should_click_on_view_your_list() {
		 driver.findElement(By.xpath("//*[@id=\"huc-view-your-list-button\"]/span")).click();
	}
	
	@And("user should click on add to cart")
	public void user_should_click_on_add_to_cart() {
		driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[8]/div[1]/div[1]/ul[1]/li[2]/span[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/a[1]")).click();
	}

}
