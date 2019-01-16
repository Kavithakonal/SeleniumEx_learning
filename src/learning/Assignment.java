package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		// To click on calendar
		driver.findElement(By.id("DepartDate")).click();
		// To select current date from calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		// To select Adults from the Adults dropdown
		Select select = new Select(driver.findElement(By.id("Adults")));
		select.selectByValue("2");
		// To select Childrens from the Childrens dropdown
		Select selectchild = new Select(driver.findElement(By.id("Childrens")));
		selectchild.selectByValue("2");
		// To select "Infants" from the dropdown
		Select infantcount = new Select(driver.findElement(By.id("Infants")));
		infantcount.selectByValue("1");
		driver.findElement(By.id("MoreOptionsLink")).click();
		Select classtravel = new Select(driver.findElement(By.id("Class")));
		classtravel.selectByValue("Business");
		driver.findElement(By.id("SearchBtn")).click();
		String msg_in_alert = driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(msg_in_alert);

	}

}
