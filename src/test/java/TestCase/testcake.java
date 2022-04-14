package TestCase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Screenshot.TakeShots;
import base.Browser;
import base.log;


public class testcake extends Browser{
	log obj = new log();
	WebDriverWait wait;
	@Test(priority=1)
	public void Cake() throws Exception {
		 wait = new WebDriverWait(driver, Duration.ofSeconds(80));
		 
		//Search Product
		log.logger.info("Searching for the product");
		driver.findElement(By.id("header-search-input")).sendKeys("cake"+Keys.ENTER);
		Thread.sleep(3000L);
		log.logger.info("Entered the Search product");
		
		//chocolate cake list
		List<WebElement>  cakes = driver.findElements(By.cssSelector("div.product-card_product-title__32LFp"));
		log.logger.info("Total number of cakes is " + cakes.size());
		TakeShots.captureScreenshots(driver, "Search product is passed");
		System.out.println("Number of Cake "+ cakes.size());
		Thread.sleep(2000L);
		List <String> list= new ArrayList <String>();
		for (WebElement str : cakes) {
			String name = str.getText();
			System.out.println(name);
			if (name.contains(prop.getProperty("flavour"))) {
				list.add(name);	
			}
		}
		log.logger.info("chocolate cake list " + list);
		System.out.println("chocolate cake list " + list);
		
		//finding fruit cake
		//String itemsNeed="Chocolate Cream Cake";
		int j=0;
		Thread.sleep(3000L);
		for (String element : list){
			if (element.equals(prop.getProperty("itemsNeed"))){
				//if (element.equals(itemsNeed)){
				System.out.println(element);
				log.logger.info("Element has to be selected is: " + element);
				Thread.sleep(3000L);
				WebElement getIt = driver.findElement(By.partialLinkText(element));
				getIt.click();
				j++;
				System.out.println("Clicked" + getIt);
				log.logger.info("Clicked"+ getIt);
				TakeShots.captureScreenshots(driver, "Search product is clicked");
			}
		}

		if( j==1) {	
			System.out.println("checkout product");
			log.logger.info("Particular Chocolate Cake is filtred");

		} 

		//switching control of handle
		Set<String> windowHandle = driver.getWindowHandles();
		for (String string : windowHandle) {
			driver.switchTo().window(string);
		}
		log.logger.info("Switched the handle");
		TakeShots.captureScreenshots(driver, "New tab for Product selected");
		
		//Applying the price Range
		Thread.sleep(4000L);
		List<WebElement> kg = driver.findElements(By.xpath("//div[@class='gifts-you-may-like_variantScroll__2SRdI']/div"));
		Thread.sleep(2000L);
		for (WebElement findkg : kg) {
			System.out.println("Each cake"+ findkg);
			String weight = findkg.getAttribute("data-product-price");
			Thread.sleep(2000L);
			if ((Integer.parseInt(weight)>1000) && (Integer.parseInt(weight)<2000))  {
				Thread.sleep(2000L);
				if(findkg.isSelected()) {
					System.out.println("It is a default cake selected");
				}
				else {
					findkg.click();
					System.out.println("Hello! Price range cake click");
					TakeShots.captureScreenshots(driver, "Product selected in particularprice range");
				}
			}
		}
		System.out.println("Particular amount cake was clicked");
		log.logger.info("Particular amount cake was clicked");
		Thread.sleep(2000L);
		JavascriptExecutor jsed = (JavascriptExecutor)driver;
		jsed.executeScript("window.scrollBy(0,250)","");

		//enter the pin code and date of delivery
		driver.findElement(By.id("pincode-search")).sendKeys(prop.getProperty("EnterPin"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='react-autosuggest__suggestion']//span")));
		List<WebElement> pincode = driver.findElements(By.xpath("//li[@class='react-autosuggest__suggestion']//span"));
		System.out.println("pincode available "+ pincode);
		log.logger.info("pincode available "+ pincode);
		for (WebElement element : pincode) {
			System.out.println(element.getText());
			if(element.getText().contains(prop.getProperty("pin"))) {
				element.click();
				TakeShots.captureScreenshots(driver, "Pincode has been Selected");
				break;
			}
		}
		Thread.sleep(1000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.delivery-textbox_dateSelectWrapper__1mrT8")));
		driver.findElement(By.cssSelector("div.delivery-textbox_dateSelectWrapper__1mrT8")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@ class='delivery-on-calender_calenderNavigationArrows__1P4V6 delivery-on-calender_desktopCalenderNav__3lRI6']/button[2]")).click();

		List<WebElement> date = driver.findElements(By.xpath("//div [@class='cell-block desktop-calender']"));
		for (WebElement ele: date) {
			if (ele.getText().equals(prop.getProperty("dateOrder"))){
				ele.click();
			}
		}
		TakeShots.captureScreenshots(driver, "Date and timing has been selected");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='shipping-method_scrollPane__9RckD']/ul/li[1]/label")));
		driver.findElement(By.xpath("//div[@class='shipping-method_scrollPane__9RckD']/ul/li[1]/label")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='time-slot_slot__2IYtU']/li[1]/label/span")));
		driver.findElement(By.xpath("//ul[@class='time-slot_slot__2IYtU']/li[1]/label/span")).click();
		Thread.sleep(1000L);
		TakeShots.captureScreenshots(driver, "Cart icon has mouse hover");
		driver.findElement(By.xpath("//span[contains(text(),'ADD TO CART')]")).click();
		WebElement cart = driver.findElement(By.xpath("//div[@class='cart-preview_cart-icon-container__ZIRS0']"));
		TakeShots.captureScreenshots(driver, "Add to cart button was clicked");
		// mouse hover the cart and checkout
		String zoomoutJS;
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		zoomoutJS = "document.body.style.zoom='0.90'";
		jse1.executeScript(zoomoutJS);
		Thread.sleep(5000L);
		log.logger.info("Zooming out the page");
		TakeShots.captureScreenshots(driver, "Zoom out the addons page");
		Actions action = new Actions(driver);
		action.moveToElement(cart).perform();
		log.logger.info("Clicking on CartButton");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg.MuiSvgIcon-root.addon_add-on-close__2gQfU")));
		driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.addon_add-on-close__2gQfU")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='CONTINUE WITHOUT ADD ONS']")));
		//driver.findElement(By.xpath("//span[text()='CONTINUE WITHOUT ADD ONS']")).click();
		log.logger.info("Closing the Addons");
		TakeShots.captureScreenshots(driver, "closing the add ons page");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='cartButton_login_content__2j1f7']")));
		WebElement checkout = driver.findElement(By.xpath("//span[@class='cartButton_login_content__2j1f7']"));
		action.moveToElement(checkout).click().build().perform(); 
		log.logger.info("Clicking on Cart Checkout Button");
		TakeShots.captureScreenshots(driver, "Chekout the product");
		Thread.sleep(3000);
		zoomoutJS = "document.body.style.zoom='1'";
	}
}



