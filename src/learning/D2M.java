package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class D2M {
	 
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("WebDriver.chrome.driver",
					"C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://18.223.153.239:8080/d2m-web-test/login");
			driver.findElement(By.id("userName")).sendKeys("admin@day2mobility.com");
			driver.findElement(By.id("password")).sendKeys("password");
			/*driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/form/div[3]")).click();
			driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/form/div[3]/button")).click();
			driver.findElement(By.id("inputOrganizationName")).sendKeys("Testing123");*/
			
			
		}}
