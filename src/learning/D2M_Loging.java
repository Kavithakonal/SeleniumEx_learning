package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class D2M_Loging {
	WebDriver driver;
	  By userName1 = By.id("userName");

	    By password = By.id("password");

	    By login = By.id("inputOrganizationName");
	    
	    
	    public D2M_Loging(WebDriver driver){

	        this.driver = driver;

	    }
	    
	  //Set user name in textbox

	    public void setUserName()
	   {

	        driver.findElement(userName1).sendKeys("admin@day2mobility.com");
	    }

	    //Set password in password textbox

	    public void setPassword(){

	         driver.findElement(password).sendKeys("password");

	    }
	    //Click on login button

	    public void clickLogin(){

	            driver.findElement(login).click();

	    }
	    public void loginToGuru99(String username1 ,String pasword){

	        //Fill user name

	        this.setUserName(username1);

	        //Fill password

	        this.setPassword(pasword);

	        //Click Login button

	        this.clickLogin();        

	        

	    }

	private void setUserName(String username1) {
			// TODO Auto-generated method stub
			
		}

	private void setPassword(String pasword) {
			// TODO Auto-generated method stub
			
		}

	

		

	public static void main(String[] args) {
		
	}

}
