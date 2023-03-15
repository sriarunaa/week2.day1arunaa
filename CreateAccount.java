package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
	
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='selected']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Arunaa");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("training insitutue");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@id=groupNameLocal']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@id=officeSiteName']")).sendKeys("efgh");
		driver.findElement(By.xpath("//input[@class=inputBox']")).sendKeys("1 lakhs");
		WebElement industryName=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select type=new Select(industryName);
		type.selectByValue(" ComputerSoftware");
		WebElement ownership=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select Scorp=new Select(ownership);
		Scorp.selectByVisibleText("S-Corporation");
		WebElement source=driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select emp=new Select(source);
		emp.selectByValue("Employee");
		WebElement marketingcampaign=driver.findElement(By.xpath("//select[@id='Marketing Campaign']"));
		Select eCommerce=new Select(marketingcampaign);
		eCommerce.selectByIndex(2);
		WebElement state=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select tx=new Select(state);
		tx.selectByValue("texas");
		driver.findElement(By.xpath("//input[@class='smallSubmit']"));
	}
}
		
		
	


