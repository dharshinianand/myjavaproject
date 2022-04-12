package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static InputStream input;

	@BeforeTest
	public void openBrowser() throws IOException
	{
		
		if (driver == null) {
			InputStream input = new FileInputStream("src/test/resources/config/config.properties");
			prop.load(input); 

		}
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--disable-notifications");
				driver = new ChromeDriver(option);
				log.logger.info("Browser Launched Succesfully");
				driver.get(prop.getProperty("url"));
				driver.manage().window().maximize();
				log.logger.info("Url Launched Succesfully");
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				
				FirefoxOptions options = new FirefoxOptions();
				options.addPreference("dom.webnotifications.enabled",false);
				driver = new FirefoxDriver(options);
				log.logger.info("Browser Launched Succesfully");
				driver.get(prop.getProperty("url"));
				driver.manage().window().maximize();
				log.logger.info("Url Launched Succesfully");
			}
		}
	

		@AfterTest
		public void closeBrowser() {
			//driver.close();
			//System.out.println("Browser is closed Successfully");
		}
	}
