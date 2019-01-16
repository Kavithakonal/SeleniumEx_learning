package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMethodsIsdisplayed {

	public static void main(String[] args) throws InterruptedException {
		
		

	System.setProperty("WebDriver.chrome.driver",
					"C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://18.223.153.239:8080/d2m-web-test/login");
	        
	        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	        //To select organization in create ticket page
			driver.findElement(By.cssSelector("#userName")).sendKeys("admin@day2mobility.com");
			driver.findElement(By.cssSelector("#password")).sendKeys("password");
			driver.findElement(By.cssSelector(".loginbtn.btn.btn-warning")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='View']")).click();
			driver.findElement(By.cssSelector("#createTicket")).click();
			//to select organization from dropdown
			Select org=new Select(driver.findElement(By.cssSelector("#organizationDropdown")));
			org.selectByVisibleText("Organization12");
			//To click on tasklist through view
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='View']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Task List']")).click();
			Thread.sleep(3000);
			//To veriy window is displayed 
			System.out.println(driver.findElement(By.cssSelector("#taskList_wrapper")).isDisplayed());
			//To click on minimize button
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(".fa.fa-minus")).click();
			////To veriy window is minimized or not
			System.out.println(driver.findElement(By.cssSelector("#taskList_wrapper")).isDisplayed());
}
	
}