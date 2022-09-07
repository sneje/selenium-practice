package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class launchBriwser {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//String Title=driver.getTitle();
		//System.out.println(Title);
	  //  String url=driver.getCurrentUrl();
	   // System.out.println(url);
	    Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[text()=' Login ]")).click();
	  
	}

}
