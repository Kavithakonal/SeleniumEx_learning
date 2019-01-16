package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2mLogin {

	WebDriver driver;
	By username = By.id("userName");
	By password = By.id("password");
	By logintext = By.cssSelector(".text-center");
	By loginbtn = By.cssSelector(".loginbtn.btn.btn-warning");

	public D2mLogin(WebDriver driver) {
		this.driver = driver;
	}

	// set username in text box
	public void setUserName(String setusername) {
		driver.findElement(username).sendKeys(setusername);
	}
	// //Set password in password textbox

	public void setPassword(String strPassword) {
		driver.findElement(password).sendKeys(strPassword);
	}

	// Click on login button

	public void clickLogin() {
		driver.findElement(loginbtn).click();
	}
		//Get the title of Login Page

	public String getLoginTitle() {
		return driver.findElement(logintext).getText();

	}
	public void loginToGuru99(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();       
}
	
}
