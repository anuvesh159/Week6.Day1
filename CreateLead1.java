package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead1 extends BC {
	
	@And ("load the url")
	public void loadurl () {
		 driver.get("http://leaftaps.com/opentaps");
	}
	@Given ("Enter the username as DemoSalesManager")
	public void enterusername () {
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		}
	@And ("Enter the password as crmsfa")
	public void enterpassword () {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("I was clicking the Login button")
	public void clicklogin () {
		driver.findElement(By.className("decorativeSubmit")).click();
		}
	@Then("Home page was showing")
	public void verifyHomepage() {
		String Title = driver.getTitle();
		if (Title.contains("Testleaf")) {
			System.out.println("login is successfull");
		}}
	@When("click on crmsfa")
	public void createLead() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
    @When("click on createlead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter the Company name")
	public void enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VIVO");
	}
	@Given("Enter the FirstName")
	public void enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aniveshu");
	}
	@Given("Enter the LastName")
	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
	}
	@Given("Enter the MailId")
	public void enterMailid()  {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anuvesh159@gmail.com");
		}
	@When("Click the Submit button")
	public void clickCreateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
		
	}
	@Then ("Lead page should be displayed")
    public void  VerifyNewLead () {
    	String title2 = driver.getTitle();
		System.out.println(title2);
		
    }


	
	

}
