package org.example.Locating;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L02_LocatingByID {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\malema\\workSpace\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/buttons.html");
		
		driver.findElement(By.id("btn_one")).click();
		
	}

} 
