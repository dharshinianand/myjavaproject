package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeShots {

	public static void captureScreenshots(WebDriver driver, String ScreenshotName) throws Exception {
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/"+ScreenshotName+".png"));
		System.out.println("Screenshot is taken");
		}
		catch(Exception e) {
			System.out.println("Screeshot is not taken"+e.getMessage());
		}
		}
	}

