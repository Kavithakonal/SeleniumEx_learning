package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_OpenBrowser {
	public void openbrowser() {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	}

}
