package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.partialLinkText("Create")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sri");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arunaa");
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select drop1=new Select(source);
	drop1.selectByIndex(4);
	
	drop1.selectByValue("LEAD_PARTNER");
	drop1.selectByVisibleText("Website");
	driver.findElement(By.name("submitButton")).click();
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	
	System.out.println(text);
	String title=driver.getTitle();
	System.out.println("title");
	


	

		}
	}


