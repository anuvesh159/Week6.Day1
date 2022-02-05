package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLead extends BC {

	
	@Given ("Enter username as DemoSalesManager")
	public void enterusername () {
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		}
	@Given ("Enter password as crmsfa")
	public void enterpassword () {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	@When("Click on Login Button")
	public void clicklogin () {
		driver.findElement(By.className("decorativeSubmit")).click();
		}
	@When("Click on CRMSFA Link")
	public void createLead() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Click on Leads Link")
	public void clickLeadslink() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("Click MergeLeads")
	public void clickMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	@When("Click From")
	public void clickFrom() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	
	@Then("Get  LeadID")
	public void getFromStringLeadid() throws InterruptedException {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Aniveshu");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Karanam");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
	}

	@When("click FindLead")
	public void ClickFindLeads() {
		
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Given("Enter the value")
	public void enterValue() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("leadID");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	     System.out.println("Text not matched");
		
	}

	
	
	
	
	
}
