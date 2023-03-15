package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
	WebElement selectTool=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	Select se=new Select(selectTool);
	se.selectByVisibleText("Selenium");
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s ui-c']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("j_idt87:city_label")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("ui-autocomplete-multiple-container ui-autocomplete-dd-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-left")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("j_idt87:lang_label")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("j_idt87:value_label")).click();
	Thread.sleep(2000);
	}
	
		
}