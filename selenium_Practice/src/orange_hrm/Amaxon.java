package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amaxon {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement houring=driver.findElements(By.xpath("//*[@id='fourth']//a")).get(0);
		WebElement dest=driver.findElement(By.xpath("//*[@id='amt8']//li"));
		Thread.sleep(500);
		Actions act=new Actions(driver);
		//act.dragAndDrop(houring, dest).build().perform();
		act.clickAndHold(houring).moveToElement(dest).release().build().perform();
	}

}
