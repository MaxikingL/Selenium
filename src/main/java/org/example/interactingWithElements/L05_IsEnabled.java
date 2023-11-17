package org.example.interactingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L05_IsEnabled {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\malema\\workSpace\\Selenium\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/buttons.html");
		
		//checks to see if button 4 is enabled (which is disabled on page load by default)
		System.out.println(driver.findElement(By.cssSelector("button#btn_four")).isEnabled());
		
		//checks to see if button 3 is enabled (which is enabled on page load by default)
		System.out.println(driver.findElement(By.cssSelector("button#btn_three")).isEnabled());
		
	}

}
