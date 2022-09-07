package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[]arg) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");;
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement d=driver.findElement(By.xpath("//*[text()='Create New Account']"));
		JavascriptExecutor jss=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		jss.executeScript("arguments[0].click()",d);

}
}