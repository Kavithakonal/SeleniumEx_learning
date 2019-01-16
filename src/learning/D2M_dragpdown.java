package learning;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D2M_dragpdown {
	
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://18.223.153.239:8080/d2m-web-test/login");
        driver.findElement(By.id("userName")).sendKeys("admin@day2mobility.com");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait d= new WebDriverWait(driver,60);
        d.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".fa.fa-tablet"))));
        driver.findElement(By.cssSelector(".fa.fa-tablet")).click();
        driver.findElement(By.cssSelector("#ownerassignment")).click();
        //driver.findElement(By.xpath("//input[@value='5be3cf7c81db9e3bb16e312f']")).click();
        //WebElement source=driver.findElement(By.xpath("//input[@value='5be3cf7c81db9e3bb16e312f']"));
        Actions a=new Actions(driver);
        WebElement source=driver.findElement(By.cssSelector("#unassigned_box_body>div:nth-child(1)"));
        WebElement target=driver.findElement(By.cssSelector("[data-emailid='manuja1@tek-nika.com']"));
        a.dragAndDrop(source, target).build().perform();
    }}
        