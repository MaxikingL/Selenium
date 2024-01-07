package Section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L06_Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sbrun\\OneDrive - Learn Automation\\Desktop\\Resources\\driver_v1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/iframes.html");

		driver.switchTo().frame(0);

		driver.findElement(By.cssSelector(".toggle")).click();

		Thread.sleep(2000);

		driver.switchTo().parentFrame();

		driver.findElement(By.cssSelector(".toggle")).click();

		Thread.sleep(2000);

		driver.switchTo().frame(1);

		driver.findElement(By.cssSelector("[aria-label='Play']")).click();
	}

}
