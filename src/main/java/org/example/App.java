package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {



    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\malema\\workSpace\\Selenium\\Selenium\\driver\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/");

        driver.findElement(By.linkText("CALCULATOR (JS)")).click();
        driver.findElement(By.id("result")).sendKeys("1234");
        driver.findElement(By.linkText("Automation Testing Test Arena")).click();

        driver.findElement(By.linkText("BUTTONS")).click();
        driver.findElement(By.xpath("// button[@id='btn_three']")).click();

//        driver.findElement(By.id("btn_two")).click();
//        driver.findElement(By.cssSelector("#btn_one")).click();
//        driver.findElement(By.linkText("CALCULATOR (JS)")).click();
//        driver.findElement(By.linkText("BUTTONS")).click();







//        driver.quit();

//        if (text.contains("Automation Testing")){
//            System.out.printf("text is correct");
//        }else{
//            System.out.printf("text is not correct");
//        }



    }
}
