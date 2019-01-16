package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleDropdownCheckbox {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        //to verify beore wether check boxes are selected or not
        System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());//false
        //to select option1 check box
        driver.findElement(By.cssSelector("#checkBoxOption1")).click();
        //after selecting check box to make sure it is selected
        System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());//true
        //To deselect check box option1
        driver.findElement(By.cssSelector("#checkBoxOption1")).click();
        //After deselecting check box
        System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());//false
        //To find number of check boxes are present on web page
       /* List<WebElement> chkBoxs = driver.findElements(By.xpath(".//input[@type='checkbox']")).click();
        System.out.println("Count: "+chkBoxs.size());*/
        //System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(),3 );
        driver.findElement(By.cssSelector("#checkBoxOption1")).click();

    }

	}


