package orange_hrm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config_testing {
	public static void main(String[] arg) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		File path=new File("C:\\Users\\DELL\\eclipse-workspace\\selenium_Practice\\Cinfig.properties");
		FileInputStream load=new FileInputStream(path);
		Properties pro=new Properties();
		pro.load(load);
		WebDriver driver=new ChromeDriver();
		driver.get(pro.getProperty("url"));
	}

}
