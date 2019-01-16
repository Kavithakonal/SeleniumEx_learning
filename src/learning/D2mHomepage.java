package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class D2mHomepage {
	WebDriver driver;
By homePageUserName=By.cssSelector(".pageHeading" );
    public D2mHomepage(WebDriver driver){

        this.driver = driver;}
      //Get the User name from Home Page

        public String getHomePageDashboardUserName(){

         return   driver.findElement(homePageUserName).getText();

        }
}
