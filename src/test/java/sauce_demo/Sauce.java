package sauce_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Sauce {
	
	 void testContactPage () {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
		WebElement frstNameTxtBox = driver.findElement(By.name("user-name"));
		frstNameTxtBox.sendKeys("Anamika");
		
		WebElement paswrdTxtBox = driver.findElement(By.id("password"));
	paswrdTxtBox.sendKeys("Anamika@@");
	
	WebElement loginBtn = driver.findElement(By.id("login-button"));
	loginBtn.click();
		

		
		
 }
	

	public static void main(String[] args) {
		
		Sauce obj = new Sauce();
		obj.testContactPage();
					
				
		

	}

}
