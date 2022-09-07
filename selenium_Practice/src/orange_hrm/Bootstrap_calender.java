package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_calender {
public static void main(String[]arg) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://demo.automationtesting.in/Datepicker.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("datepicker1")).click();
	
	
	Thread.sleep(2000);
	
	
	int i=1;
	while(i==1) {
		String year=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
	
	System.out.println(year);
	
	if(!(year.equals("June 1996"))) {
		
		driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	}
	else
	break;
}
driver.findElement(By.xpath("//a[text()='16']")).click();
}
}