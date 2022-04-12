package PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CakePageObject {
	@FindBy(id ="header-search-input") public static WebElement searchBox;
	
	@FindBy(css ="div.product-card_product-title__32LFp") public static List<WebElement> cakes;
	
/*	public String sortingChocolateCake(String flavour,String itemsNeed) throws InterruptedException {
		List <String> list= new ArrayList <String>();
		for (WebElement str : cakes) {
			String name = str.getText();
		  if (name.contains(flavour)) {
				list.add(name);	
			} 
		}
		for (String element : list){
			if (element.equals(itemsNeed)){
				System.out.println(element);

				Thread.sleep(1000L);
				WebElement getIt = driver.findElement(By.partialLinkText(element));
			
				getIt.click();
				
				System.out.println("Clicked" + getIt);
			}
		}
		return getIt;
	}*/
//	@FindBy(partialLinkText = element)
//	public static WebElement getIt;
	@FindBy(xpath ="//div[@class='gifts-you-may-like_variantScroll__2SRdI']/div")
	public static WebElement kg;
	
	@FindBy(id ="pincode-search")
	public static WebElement pincodeSearch;
	//@FindBy(xpath ="//li[@class='react-autosuggest__suggestion']//span")
	//public static List<WebElement> pincode;
	@FindBy(css ="div.delivery-textbox_dateSelectWrapper__1mrT8")
	public static WebElement dateSelectBox;
	@FindBy(xpath ="//div[@ class='delivery-on-calender_calenderNavigationArrows__1P4V6 delivery-on-calender_desktopCalenderNav__3lRI6']/button[2]")
	public static WebElement nextMonth;
	//@FindBy(xpath ="//div [@class='cell-block desktop-calender']")
	//public static List<WebElement>  date;
	@FindBy(xpath ="//div[@class='shipping-method_scrollPane__9RckD']/ul/li[1]/label")
	public static WebElement shippingMethod;
	@FindBy(xpath ="//ul[@class='time-slot_slot__2IYtU']/li[1]/label/span")
	public static WebElement shippingTime;
	@FindBy(xpath ="//span[contains(text(),'ADD TO CART')]")
	public static WebElement addToCartButton;
	@FindBy(xpath ="//div[@class='cart-preview_cart-icon-container__ZIRS0']")
	public static WebElement cartIcon;
	@FindBy(css ="svg.MuiSvgIcon-root.addon_add-on-close__2gQfU")
	public static WebElement addOns;
	//@FindBy(xpath ="//span[@class='cartButton_login_content__2j1f7']")
	//public static WebElement checkout;
	
	}


