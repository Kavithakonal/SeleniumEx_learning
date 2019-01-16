package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OwnexampleMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_collapse.asp");
		System.out.println("Before clicking on click me button");
		System.out.println(driver.findElement(By.cssSelector("#demo")).isDisplayed());
		driver.findElement(By.cssSelector(".btn.btn-danger")).click();
		System.out.println("After clicking on click me button");
		System.out.println(driver.findElement(By.cssSelector("#demo")).isDisplayed());

	}

}
