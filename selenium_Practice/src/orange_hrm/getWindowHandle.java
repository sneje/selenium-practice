package orange_hrm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {
	 public static void main(String[]args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		String wid1 =driver.getWindowHandle();
		System.out.println(wid1);
		
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(10000);
		Set<String> wid2 =driver.getWindowHandles();
		System.out.println(wid2);
		  for(String wid3:wid2) {
			  if(!wid3.equals(wid1)) {
				  driver.switchTo().window(wid3);
				  
			  }
			 
			  
			  
		  }
		  driver.findElement(By.xpath("//input[@id='myText']")).sendKeys("asdfg");
		  driver.switchTo().window(wid1);
			 driver.findElement(By.name("username")).sendKeys("Admin");
}
}