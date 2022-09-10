package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	
	WebDriver driver;
	
	@Given("^User able to open any browser$")
	public void user_able_to_open_any_browser()  {
	    
	System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		
	driver = new ChromeDriver();
	    
	}

	@Given("^User able to enter the URL$")
	public void user_able_to_enter_the_URL()  {
	  
		driver.get("http://automationpractice.com/index.php");
	    
	}

	@When("^User able to click on Signin button$")
	public void user_able_to_click_on_Signin_button()  {
		driver.findElement(By.xpath("//*[contains(@class,'login')]")).click();
	    
	}

	@When("^User able to enter the Username$")
	public void user_able_to_enter_the_Username() throws InterruptedException  {
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[contains(@id,'email')])[2]")).sendKeys("j4inul1993@gmail.com");
	    
	}

	
	  @When("^User able to enter the PW$") public void user_able_to_enter_the_PW()
	  { driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[contains(@id,'passwd')]")).sendKeys(
	  "j@inul1993");
	  
	  }
	  
	  @When("^User able to click on submit button$") public void
	  user_able_to_click_on_submit_button() {
	  driver.findElement(By.xpath("(//*[contains(@type,'submit')])[3]")).click();
	  
	  }
	  
	  @Then("^User able to login in susscessfully$") public void
	  user_able_to_login_in_susscessfully() {
	  driver.findElement(By.xpath("(//*[contains(text(),'Dresses')])[5]")).click();
	  }
	  
	  @Then("^User able to verify the page title$") public void
	  user_able_to_verify_the_page_title() { WebDriverWait wait = new
	  WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.elementToBeClickable(By.
	  xpath("(//*[contains(text(),'Printed Dress')])[2]"))).click(); 
	  driver.quit();  
	  }
	

}
