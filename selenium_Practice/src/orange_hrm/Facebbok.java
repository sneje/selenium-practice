package orange_hrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebbok {
	public static void main(String[]arg) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");;
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
	Thread.sleep(2000);
	List<WebElement> days=driver.findElements(By.xpath("//*[@id='day']//option"));
	for(WebElement day:days) {
		if(day.getText().equals("16")) {
			day.click();
		}
		
		}
	Thread.sleep(2000);
	WebElement month=driver.findElement(By.id("month"));
	Select Monthh=new Select(month);
	Monthh.selectByVisibleText("Jun");
	Thread.sleep(2000);
	WebElement Year =driver.findElement(By.id("year"));
	Select Yearr=new Select(Year);
	Yearr.selectByValue("1996");
	
	WebElement redio=driver.findElement(By.xpath("//input[@value='2']"));
	redio.click();
	Thread.sleep(2000);
	boolean redioo=redio.isSelected();
	System.out.println(redioo);
	}
	

}
