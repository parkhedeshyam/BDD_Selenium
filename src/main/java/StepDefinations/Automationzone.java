package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationzone {
	WebDriver driver ;
	@Given("User is on Guru99 demo application")
	public void user_is_on_guru99_demo_application() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
	    
	}
	@When("USer enter the {string} and {string}")
	public void u_ser_enter_the_and(String string, String string2) {
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);        
	    }   
		

	@And("User clicks on the login button..")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click(); 
	}

	
	@Then("User is on the home page")
	public void user_is_on_the_home_page() throws InterruptedException {
		Thread.sleep(4000);
	      String title=driver.getTitle();
	      if(title.equals("Login: Mercury Tours"))
	      {
	      System.out.println("Logged in succcessfullyu");
	      }
	      else
	          System.out.println("Invalid login");
	      driver.close();
	}


}
