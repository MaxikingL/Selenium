package org.example.interactingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L06_DropdownMenu {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\malema\\workSpace\\Selenium\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/dropdown.html");
		
		Select menuItem = new Select(driver.findElement(By.cssSelector("select#cars")));
		
		//selecting by visible text as it appears on the web page:
		menuItem.selectByVisibleText("Honda");
		
		//selecting by option value (as it appears in the HTML):
		menuItem.selectByValue("jeep");
		
		
	}

}
