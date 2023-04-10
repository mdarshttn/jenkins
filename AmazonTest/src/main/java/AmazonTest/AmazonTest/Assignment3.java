package AmazonTest.AmazonTest;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Assignment3 {
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Md Arsh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Md");

		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Arsh");

		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Najafgarh");

		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("md.007arsh@gmail.com");

		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9540220952");

		driver.findElement(By.xpath("//input[@value='Male']")).click();

		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		
		
		

		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		Thread.sleep(3000);

		WebElement address = driver.findElement(By.xpath("//select[@id='country']"));
		Select s = new Select(address);
		s.selectByVisibleText("India");

		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		s = new Select(skills);
		s.selectByVisibleText("Java");

		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		s = new Select(year);
		s.selectByVisibleText("1999");

		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		s = new Select(month);
		s.selectByVisibleText("September");
		driver.
		
		Thread.sleep(3000);

		WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		s = new Select(day);
		s.selectByVisibleText("10");

		driver.findElement(By.id("firstpassword")).sendKeys("arsh@123");
		driver.findElement(By.id("secondpassword")).sendKeys("arsh@123");
        
		
		s.selectByIndex(1);
		driver.findElement(By.id("submitbtn")).click();

		Thread.sleep(10000);
		
	}

}