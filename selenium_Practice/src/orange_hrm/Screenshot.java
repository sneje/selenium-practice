package orange_hrm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {
	static WebDriver driver;
public void ssrn() throws IOException {
	TakesScreenshot screenshoot=(TakesScreenshot)driver;
File soure=screenshoot.getScreenshotAs(OutputType.FILE);
File destination=new File("D:\\ScreenShot\\aa.png");
FileHandler.copy(soure,destination);
}
public static void main(String[]args) throws IOException {

	System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	Screenshot b=new Screenshot();
	b.ssrn();
}
}
