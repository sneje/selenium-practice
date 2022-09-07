package orange_hrm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class s {
	static WebDriver driver;
	public void screen() throws IOException {
		TakesScreenshot srn=(TakesScreenshot) driver;
		File Source=srn.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\sudarshan.png");
		FileHandler.copy(Source,destination);
		
	}
public static void main(String[]arg) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	s screenshoo=new s();
	Thread.sleep(5000);
	screenshoo.screen();
	
	
	
	
}
}
