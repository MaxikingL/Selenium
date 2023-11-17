package org.example.interactingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L04_Checkboxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\malema\\workSpace\\Selenium\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/dropdown.html");

		// tests the first check box which is ticked on page load
		System.out.println(driver.findElement(By.cssSelector("input#cb_red")).isSelected());

		// tests the second check box which is not ticked on page load
		System.out.println(driver.findElement(By.cssSelector("input#cb_green")).isSelected());

	}

}
