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

import PageObject.CakePageObject;
import base.Browser;


public class ChocolateCake extends Browser{
	WebDriverWait wait;
	@Test(priority=1, enabled=false)
	public void Cake() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		//Search Product
		CakePageObject.searchBox.sendKeys("cake"+Keys.ENTER);
		Thread.sleep(3000L);
		int totalCakes = CakePageObject.cakes.size();
		System.out.println(totalCakes);
		
		//Log.startTestCase("Browser is started");
		//chocolate cake list
		List<WebElement>  cakes = driver.findElements(By.cssSelector("div.product-card_product-title__32LFp"));
		//Log.startTestCase("Total number of cakes is " + cakes.size());
				
		System.out.println("Number of Cake "+ cakes.size());
		String itemsNeed = "Fruit Chocolate Cake";
		//List cartItems = Arrays.asList(itemsNeed);
		String flavour = "Chocolate"; 

		List <String> list= new ArrayList <String>();
		for (WebElement str : cakes) {
			String name = str.getText();
			//System.out.println(name);
			if (name.contains(flavour)) {
				list.add(name);	
			}
		}
		
		System.out.println("chocolate cake list " + list);
		int j=0;
		//finding fruit cake
		for (String element : list){
			if (element.equals(itemsNeed)){
				System.out.println(element);

				Thread.sleep(1000L);
				WebElement getIt = driver.findElement(By.partialLinkText(element));
				getIt.click();
				j++;
				System.out.println("Clicked" + getIt);
			}
		}

		if( j==1) {	
			System.out.println("checkout product");

		} 
		
		//switching control of handle
		Set<String> windowHandle = driver.getWindowHandles();
		for (String string : windowHandle) {
			driver.switchTo().window(string);
		}
		Thread.sleep(3000L);
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
				System.out.println("Hello! After click");
				
			}
		}
		}
		System.out.println("Particular amount cake was clicked");	
		Thread.sleep(2000L);
		JavascriptExecutor jsed = (JavascriptExecutor)driver;
		jsed.executeScript("window.scrollBy(0,250)","");
		//enter the pin code and date of delivery
		String pin = "560002";
		driver.findElement(By.id("pincode-search")).sendKeys("56");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='react-autosuggest__suggestion']//span")));
		List<WebElement> pincode = driver.findElements(By.xpath("//li[@class='react-autosuggest__suggestion']//span"));
		System.out.println("pincode available "+ pincode);
		for (WebElement element : pincode) {
			System.out.println(element.getText());
			if(element.getText().contains(pin)) {
				element.click();
				break;
			}
		}
	Thread.sleep(1000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.delivery-textbox_dateSelectWrapper__1mrT8")));
		driver.findElement(By.cssSelector("div.delivery-textbox_dateSelectWrapper__1mrT8")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@ class='delivery-on-calender_calenderNavigationArrows__1P4V6 delivery-on-calender_desktopCalenderNav__3lRI6']/button[2]")).click();
		String dateOrder = "2";
		List<WebElement> date = driver.findElements(By.xpath("//div [@class='cell-block desktop-calender']"));
		for (WebElement ele: date) {
			if (ele.getText().equals(dateOrder)){
				ele.click();
			}
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='shipping-method_scrollPane__9RckD']/ul/li[1]/label")));
		driver.findElement(By.xpath("//div[@class='shipping-method_scrollPane__9RckD']/ul/li[1]/label")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='time-slot_slot__2IYtU']/li[1]/label/span")));
		driver.findElement(By.xpath("//ul[@class='time-slot_slot__2IYtU']/li[1]/label/span")).click();
		Thread.sleep(1000L);

		driver.findElement(By.xpath("//span[contains(text(),'ADD TO CART')]")).click();
		WebElement cart = driver.findElement(By.xpath("//div[@class='cart-preview_cart-icon-container__ZIRS0']"));

		// mouse hover the cart and checkout
		String zoomoutJS;
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		zoomoutJS = "document.body.style.zoom='0.90'";
		jse1.executeScript(zoomoutJS);
		Thread.sleep(5000L);

		Actions action = new Actions(driver);
		action.moveToElement(cart).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg.MuiSvgIcon-root.addon_add-on-close__2gQfU")));
		driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.addon_add-on-close__2gQfU")).click();
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='CONTINUE WITHOUT ADD ONS']")));
		//driver.findElement(By.xpath("//span[text()='CONTINUE WITHOUT ADD ONS']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='cartButton_login_content__2j1f7']")));
		WebElement checkout = driver.findElement(By.xpath("//span[@class='cartButton_login_content__2j1f7']"));
		action.moveToElement(checkout).click().build().perform(); 
	
		
		Thread.sleep(3000);
		zoomoutJS = "document.body.style.zoom='1'";
		
		//Log.startTestCase("Total number of cakes is " + " " + cakes.size());
		//	Log.startTestCase("Test message");

	}
	
	
	
}



