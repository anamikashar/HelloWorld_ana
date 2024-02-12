package day_06;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NumpyNinjaContact {
	
	
	void testContactPage () {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.numpyninja.com/contact");
		
		WebElement frstNameTxtBox = driver.findElement(By.name("first-name"));
		frstNameTxtBox.sendKeys("vijaya");
		
		WebElement lastNameTxtBox = driver.findElement(By.name("last-name"));
		lastNameTxtBox.sendKeys("bharathi");
		
		WebElement emailBox = driver.findElement(By.name("email"));
		emailBox.sendKeys("vijaya@bharathi.com");
		
		WebElement PhoneBox = driver.findElement(By.name("phone"));
		PhoneBox.sendKeys("098765456789");
		
		WebElement enquiryBox = driver.findElement(By.id("textarea_comp-l1c0ku07"));
		enquiryBox.sendKeys("when next SDET batch will start?");
		
		WebElement sendBtn = driver.findElement(By.id("comp-l1c0ku0e3"));
		sendBtn.click();
	}
		
	public static void main(String[] args) {
			
		NumpyNinjaContact obj = new NumpyNinjaContact();
	obj.testContactPage();			
			
		}
	}


