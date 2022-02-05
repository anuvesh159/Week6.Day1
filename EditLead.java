package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BC {
	
	@Given ("Enter the username as DemoSalesManager")
	public void enterUsername() {
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("DemoSalesManager");
	}
	
	@Given ("Enter the password as crmsfa")
	public void enterPassword() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	@When ("Click Login")
	public void clickLogin() {
	driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@When ("Click crm/sfa link")
	public void clickCRMSFA() {
	driver.findElement(By.className("crmsfa")).click();
	}
	
	@When("Click Leads link")
	public void leadsLink() {
	driver.findElement(By.linkText("Leads")).click();
	}
	
	
	@When("Click Find leads")
	public void findLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
	}
	
	
	@Given("Enter first name")
	public void firstName() {
	driver.findElement(By.linkText("Name and ID")).click();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Aniveshu");
	}
	
	
	@When("When Click Find leads button")
	public void findLeadsButton() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(5000);
	}
	
	@When ("Click on first resulting lead")
	public void firstResultingLead() {
	String firstResultinglead = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']")).getText();
	System.out.println(firstResultinglead);
    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	}
    
    
    @Then ("Verify title of the page")
    public void verifyTitle() {
	System.out.println(driver.getTitle());
    }
    
	@When ("Click Edit")
	public void clickEdit() {
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}
	
	@Given ("Change the company name")
	public void changeCompanyName() {
	WebElement companyName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
	companyName.clear();
	companyName.sendKeys("Deloitte");
	}
	
	
	@When ("Click Update")
	public void clickUpdate() {
	driver.findElement(By.className("smallSubmit")).click();
	}
	
	
	@Then ("Confirm the changed name appears")
	public void confirmChangedName() {
	String confirmChangedNameAppears = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(confirmChangedNameAppears);
	}

}
