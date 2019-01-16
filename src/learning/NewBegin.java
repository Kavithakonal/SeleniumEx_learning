package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewBegin {

	public void test() {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		String s1 = driver.getCurrentUrl();
		System.out.println(s1);
		String s2 = driver.getPageSource();
		System.out.println(s2);
		//driver.close();
		driver.get("http:yahoo.com");
		driver.navigate().back();
	}

}
