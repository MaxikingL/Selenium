package org.example.Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03_ImplicitWait {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\malema\\workSpace\\Selenium\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// setting an implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.automationtesting.co.uk/loader.html");

		driver.findElement(By.cssSelector("button#loaderBtn")).click();

	}

}
