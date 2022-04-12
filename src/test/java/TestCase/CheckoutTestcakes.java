package TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Browser;
import base.log;

public class CheckoutTestcakes extends Browser {

	WebDriverWait wait1;
	@Test(priority=2, enabled=true)
	public void shippingDetails() throws Exception {
		wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
		log.logger.info("Entered into shipping Details");
		driver.findElement(By.cssSelector("#standard-basic")).sendKeys("dharshinichandran13@gmail.com");
		log.logger.info("Entered into gmail ID");
		driver.findElement(By.xpath("//button[@title='Login to continue']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("#standard-adornment-password")).sendKeys("Asd123");
		log.logger.info("Entered into gmail password");
		driver.findElement(By.xpath("//button[@title='Login to continue']")).click();
		Thread.sleep(2000L);
		log.logger.info("Entered into Checkout Page");

		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,400)","");
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//button[@title='Proceed To Checkout']")).click();
		log.logger.info("Proceed to checkout has been clicked");

		Thread.sleep(3000L);
		JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Card Number')]//parent::div")));
		WebElement cardNum = driver.findElement(By.xpath("//label[contains(text(),'Card Number')]//parent::div"));
		//jse3.executeScript("arguments[0].sendKeys(908765789)",cardNum);
		jse3.executeScript("arguments[0].value='908765789'", cardNum);

		JavascriptExecutor jse4 = (JavascriptExecutor)driver;
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Name On Card')]//parent::div")));
		WebElement cardName = driver.findElement(By.xpath("//label[contains(text(),'Name On Card')]//parent::div"));
		jse4.executeScript("arguments[0].value='Ananand'", cardName);


		//driver.findElement(By.xpath("//div[contains(@class,'MuiFormControl-root MuiTextField-root jss34 credit-card_card-number-input__2sdUe')]//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline Mui-error Mui-error MuiInputBase-formControl MuiInput-formControl MuiInputBase-adornedEnd']//input[@type='text']")).sendKeys("2344 3334 332");
		//driver.findElement(By.xpath("//div[contains(@class,'MuiFormControl-root MuiTextField-root jss34 credit-card_card-name-input__g7ogG')]//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl MuiInputBase-adornedEnd']//input[@type='text']")).sendKeys("4673783889");
		/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),\"* Recipient's Name\")]")));
		driver.findElement(By.xpath("//div[@xpath='1']")).sendKeys("Anand");
		driver.findElement(By.xpath("//label[contains(text(),'* Recipient's Address')]")).sendKeys("kempa");
		driver.findElement(By.xpath("//label[contains(text(),'Landmark')]")).sendKeys("petrol Bunk");
		driver.findElement(By.xpath("//label[contains(text(),'* Recipient's Mobile')]")).sendKeys("9907654372");
		driver.findElement(By.xpath("//label[contains(text(),'Recipient's Alt. Mobile')]")).sendKeys("9089089954");
		driver.findElement(By.xpath("//label[contains(text(),'Recipient's Email (optional)')]")).sendKeys("kempa@gmail.com");*/
	}

}
