package org.example.Locating;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L04_LocatingByLinkText {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\malema\\workSpace\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk");
		
		driver.findElement(By.linkText("ACTIONS")).click();
		
	}

} 
