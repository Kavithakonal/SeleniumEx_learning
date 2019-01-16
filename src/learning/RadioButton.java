package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\admin\\Documents\\For selenium chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//To click on Radio button.
		driver.findElement(By.cssSelector("input[value='radio2']")).click();
		//to get number of count radio button presents on webpage
		//here we need to find by giving common name in xpath there are 3 buttons with common name
		//name="radioButton" so we need to use findelements pruler word and we can get size of that
		System.out.println(driver.findElements(By.xpath("//input[@name='radioButton']")).size());
		
//Handling Radio button dynomically if radio button dont have value how to handle
		//here we are storing size in count variable by using for loop we will call radio button list based on index 
		//and clicking on one by one .
		int count=driver.findElements(By.xpath("//input[@name='radioButton']")).size();
		for(int i=0; i<count; i++) {
			//driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).click();
			//now we will get the attrubute valyues of radio buttons by using get attribute
			String text=(driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).getAttribute("value"));
			System.out.println(text);
			if( text.equals("radio2")) {
				driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).click();
			}}
			
			//to check checbox is selected or not
		//if condition is false then it will allow to continue to execute if out put is true it will not match with 
		//mentioned assertion so execution will stop
			Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
			driver.findElement(By.cssSelector("#checkBoxOption1")).click();
			Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
			driver.findElement(By.cssSelector("#checkBoxOption2")).click();
			
			
	
	}

}
