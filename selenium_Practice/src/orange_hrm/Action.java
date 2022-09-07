package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action {
	public static void main(String[] arg) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	WebElement username=driver.findElement(By.xpath("//*[@name='username']"));
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	act.sendKeys(username, "Admin").keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
	act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).build().perform();
	driver.findElement(By.name("password")).click();
	act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
	
	
	}

}
