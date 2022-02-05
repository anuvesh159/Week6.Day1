package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends BC {

	
    @Given("Enter username as Demosalesmanager")
    public void enterUserName() {
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("DemoSalesManager");
    }
    
    @Given("Enter the password as crmsfa")
    public void enterPassword() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
    }
    
    @When("Click on Login button") 
    public void clickLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
    }
    
    @When ("Click on Crmsfa")
    public void CRMSFA() {
	driver.findElement(By.className("crmsfa")).click();
    }
    
    @When ("Click Leads link")
    public void leadsLink() {
	driver.findElement(By.linkText("Leads")).click();
    }
    
    @When ("Click Find leads")
    public void findLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
    }
    
    @When ("Click on Email")
    public void clickonEmail() {
	driver.findElement(By.linkText("Email")).click();
    }
    
    @Given ("Enter Email")
    public void enterMail() {
	driver.findElement(By.name("emailAddress")).sendKeys("anuvesh159@gmail.com");
    }
    
    @When("Click find leads button")
    public void leadsButton() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(5000);
    }
	
    @Then ("Capture name of First Resulting lead")
    public void captureNameOfFirstResultingLead() {
	String firstResultinglead = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']")).getText();
	System.out.println(firstResultinglead);
    }
    
    @When("Click First Resulting lead")
    public void clickFirstResultingLead() {
    	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
    }
    
    @When("Click Duplicate Lead")
    public void clickDuplicateLead() {
    	driver.findElement(By.linkText("Duplicate Lead")).click();
    }
    
    @Then("Verify the title as Duplicate Lead")
    public void verifyTheTitleAsDuplicateLead() {
    	System.out.println(driver.getTitle());
    }
    
    @When("Click Create Lead")
    public void clickCreateLead() {
    	driver.findElement(By.xpath("//input[@class='smallSubmit'][@value='Create Lead']")).click();
    }
    
    @Then("Duplictae Lead will be displayed")
    public void duplictaeLeadWillBeDisplayed() {
    	String DuplicateTitle = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
    	System.out.println(DuplicateTitle);
    }
	
	
	
	
}
