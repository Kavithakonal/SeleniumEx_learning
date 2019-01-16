package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Documents\\Selenum related\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("kavitha.konal@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/content/form/div[1]/div/div[1]/div/div[1]/input")).sendKeys("shavumadhu");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).click();
		//driver.close();
	}
}


