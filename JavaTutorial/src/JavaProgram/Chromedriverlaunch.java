package JavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chromedriverlaunch
{
	public static void main(String[] args)
	{

		System.setProperty("webdriver.gecko.driver", "D://Software//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();

	}

}
//done
