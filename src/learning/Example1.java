package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		/*To_OpenBrowser ob = new To_OpenBrowser();
		ob.openbrowser();*/
		StoredInfo ob=new StoredInfo();
		String ps=ob.password;
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("kavitha.konal@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(5000);
		//System.out.println(driver.findElement(By.xpath("//div[contains(@jsname,'txrIk')]")).getText());
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(ps);
		driver.findElement(By.xpath("//div[@id='passwordNext']/content")).click();
		
		
		
	
		
	}

}
