package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleCalander {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Documents\\Selenum related\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com");
		/*Select selectvalue=new Select(driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1")));
		selectvalue.selectByValue("GOI");*/
		//to select calender date 
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	}}
