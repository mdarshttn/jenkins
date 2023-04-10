package AmazonTest.AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cart {
	
	WebDriver driver;
	WebElement searchbar;
	WebElement searchbutton;
	
	@BeforeTest
	public void gotoproduct() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Md Arsh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
	    searchbar= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    searchbar.sendKeys("Mobile");
		searchbutton= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Thread.sleep(1000);
		searchbutton.click();
		WebElement firstsearch= driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
		firstsearch.click();
		Thread.sleep(3000);
	    
	}
	
	
	
	
	@Test(priority=1)
	public void isbuttonavailable() throws InterruptedException {
		WebElement button = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", button);
		Thread.sleep(2000);
		
		Assert.assertTrue(button.isDisplayed());
		Thread.sleep(2000);
		
	}
	@Test(priority =2)
	public void ischeckoutbuttonavailable() {
		WebElement checkout = driver.findElement(By.xpath("//span[@id='attach-sidesheet-checkout-button']"));
		Assert.assertTrue(checkout.isDisplayed());
	}
	
	@AfterTest
	
	public void close() {
		driver.close();
	}
	

}
