package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DeleteLead extends BC {
	
	
	@Given("Enter the username as DemoSalesManager")
	public void enterUsername() {
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("DemoSalesManager");
	}
	
	@Given("Enter the password as crmsfa")
	public void enterPassword() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	
	@When("Click Login")
	public void clickLogin() {
	driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@When("Click crm/sfa link")
	public void clickCRMSFA() {
	driver.findElement(By.className("crmsfa")).click();
	}
	
	@When("Click Leads link")
	public void clickLeads() {
	driver.findElement(By.linkText("Leads")).click();
	}
	
	@When ("Click Find leads")
	public void clickFindLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("Click on Phone")
	public void clickPhone() {
	driver.findElement(By.linkText("Phone")).click();
	}
	
	@Given("Enter phone number")
    public void enterPhoneNumber() {
	driver.findElement(By.name("phoneNumber")).sendKeys("8610220898");
	}
	
	@When("Click find leads button")
	public void findLeads() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(5000);
	}
	
	@When("Click first resulting lead")
    public void clickFirstResultingLead() {
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")).click();
	}
	
	@When("Click Delete")
	public void clickDelete() {
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		System.out.println("Deleted Successfully");
	}


}
