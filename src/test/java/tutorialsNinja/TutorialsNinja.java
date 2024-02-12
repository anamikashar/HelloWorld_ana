package tutorialsNinja;


import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;



public class TutorialsNinja {

void ninjapage() throws InterruptedException



{

WebDriver driver = new ChromeDriver();



driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.manage().window().maximize();

driver.get("https://tutorialsninja.com/demo/index.php");



WebElement currency = driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']/i[@class='fa fa-caret-down']"));

currency.click();



WebElement EUR = driver.findElement(By.xpath("//button[text()='€Euro']"));

EUR.click();

Thread.sleep(1000);



WebElement CameraClick = driver.findElement(By.xpath("//img[@alt='Canon EOS 5D']"));

CameraClick.click();

Thread.sleep(1000);



WebElement CameraAddtocart = driver.findElement(By.id("button-cart"));

CameraAddtocart .click();



WebElement Selectbox = driver.findElement(By.name("option[226]"));

Selectbox.click();

Thread.sleep(1000);



WebElement ErrorMsg = driver.findElement(By.xpath("//select/option"));

String Errormsg = ErrorMsg.getText();

System.out.println("Error message is :" + Errormsg);



WebElement goToHomeButton = driver.findElement(By.xpath("//div[@id='product-product']//a"));

goToHomeButton.click();

Thread.sleep(1000);



WebElement clickIphone = driver.findElement(By.xpath("//div[@class='product-thumb transition']//img[@alt='iPhone']"));

clickIphone.click();

Thread.sleep(1000);



WebElement quantity = driver.findElement(By.xpath("//label[text()='Qty']"));

quantity.click();

Actions action = new Actions(driver);

action.keyDown(Keys.DELETE);

action.sendKeys(quantity, "2").perform();



WebElement AddToCartIphone = driver.findElement(By.xpath("//div[@class='form-group']//button[@id='button-cart']"));

AddToCartIphone.click();

Thread.sleep(1000);


WebElement successMsg = driver.findElement(By.xpath("//div[text()='Success: You have added ']"));

String SuccessMsg = successMsg.getText();

System.out.println(" Success message is : " + SuccessMsg);

WebElement blackCart=driver.findElement(By.cssSelector(".btn.btn-inverse.btn-block.btn-lg.dropdown-toggle"));
blackCart.click();

WebElement viewCart=driver.findElement(By.xpath("//strong[contains(text(),'View Cart')]"));
viewCart.click();

WebElement iphonequantity=driver.findElement(By.xpath("//div[@class='input-group btn-block']//input[@type='text']"));
iphonequantity.click();
iphonequantity.clear();
iphonequantity.sendKeys("3");

WebElement update=driver.findElement(By.xpath("//button[@type='submit']"));
action.moveToElement(update).click().perform();

WebElement ecoTax=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]"));
String ecotaxValue=ecoTax.getText();
System.out.println("Eco Tax : "+ecotaxValue);

WebElement vat=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[2]"));
String vatValue=vat.getText();
System.out.println("Vat : "+vatValue);

WebElement checkout=driver.findElement(By.cssSelector("a[class='btn btn-primary']"));
checkout.click();


WebElement ErrorMsg2 = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible"));
String errorMsg2 = ErrorMsg2.getText();
System.out.println(" Error message is : " + errorMsg2);

WebElement remove=driver.findElement(By.xpath("//i[@class='fa fa-times-circle']"));
remove.click();

WebElement goToHomeButton1 = driver.findElement(By.xpath("//a[text()='Continue']"));
goToHomeButton1.click();

WebElement clickMac = driver.findElement(By.xpath("//div[@class='product-thumb transition']//img[@alt='MacBook']"));
clickMac.click();

WebElement macQuantity=driver.findElement(By.id("input-quantity"));
String macquantity=macQuantity.getAttribute("value"); 
String s="1";

if(macquantity.equalsIgnoreCase(s)) { 

System.out.println("Quantity :" + macquantity);
WebElement addToCart=driver.findElement(By.xpath("//button[@id='button-cart']"));
addToCart.click();
} 
WebElement sucessMsg2= driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
String sucesssmg2=sucessMsg2.getText();
System.out.println("Sucess msg : "+ sucesssmg2);


WebElement shoppingcart=driver.findElement(By.xpath("//span[text()='Shopping Cart']"));
action.moveToElement(shoppingcart).click().perform();

WebElement couponCode=driver.findElement(By.xpath("//a[@class='accordion-toggle']//i[@class='fa fa-caret-down']"));
action.moveToElement(couponCode).click().perform();

WebElement couponCodeTextBox=driver.findElement(By.xpath("//input[@id='input-coupon']"));
couponCodeTextBox.click();
couponCodeTextBox.sendKeys("ABCD123");

WebElement ApplyCouponCode=driver.findElement(By.xpath("//input[@id='button-coupon']"));
action.moveToElement(ApplyCouponCode).click().perform();

Thread.sleep(1000);

WebElement couponErrorMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
String CouponErrorMsg = couponErrorMsg.getText();
   System.out.println(" Error message is : " + CouponErrorMsg); 
        

}

public static void main(String[] args) throws InterruptedException {

TutorialsNinja obj = new TutorialsNinja();

obj.ninjapage();



}



}
