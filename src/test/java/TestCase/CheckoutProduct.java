package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import base.Browser;

public class CheckoutProduct extends Browser{
	
@Test(priority=2, enabled=false)
public void shippingDetails() throws Exception {
	driver.findElement(By.cssSelector("#standard-basic")).sendKeys("dharshinichandran13@gmail.com");
	driver.findElement(By.xpath("//button[@title='Login to continue']")).click();
	Thread.sleep(2000L);
	driver.findElement(By.cssSelector("#standard-adornment-password")).sendKeys("Asd123");
	driver.findElement(By.xpath("//button[@title='Login to continue']")).click();
	Thread.sleep(2000L);
	
	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	jse2.executeScript("window.scrollBy(0,400)","");
	Thread.sleep(1000L);
	driver.findElement(By.xpath("//button[@title='Proceed To Checkout']")).click();
	//driver.findElement(By.xpath("//label[contains(text(),'Card Number')]//parent::div")).sendKeys("32327897423");
	driver.findElement(By.xpath("//div[contains(@class,'MuiFormControl-root MuiTextField-root jss34 credit-card_card-number-input__2sdUe')]//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline Mui-error Mui-error MuiInputBase-formControl MuiInput-formControl MuiInputBase-adornedEnd']//input[@type='text']")).sendKeys("2344 3334 332");
	driver.findElement(By.xpath("//div[contains(@class,'MuiFormControl-root MuiTextField-root jss34 credit-card_card-name-input__g7ogG')]//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl MuiInputBase-adornedEnd']//input[@type='text']")).sendKeys("4673783889");
	/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),\"* Recipient's Name\")]")));
	driver.findElement(By.xpath("//div[@xpath='1']")).sendKeys("Anand");
	driver.findElement(By.xpath("//label[contains(text(),'* Recipient's Address')]")).sendKeys("kempa");
	driver.findElement(By.xpath("//label[contains(text(),'Landmark')]")).sendKeys("petrol Bunk");
	driver.findElement(By.xpath("//label[contains(text(),'* Recipient's Mobile')]")).sendKeys("9907654372");
	driver.findElement(By.xpath("//label[contains(text(),'Recipient's Alt. Mobile')]")).sendKeys("9089089954");
	driver.findElement(By.xpath("//label[contains(text(),'Recipient's Email (optional)')]")).sendKeys("kempa@gmail.com");*/
}
}