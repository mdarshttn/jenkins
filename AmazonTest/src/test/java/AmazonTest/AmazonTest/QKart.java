package AmazonTest.AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QKart {
	
public WebDriver driver;


@BeforeTest
public void hiturl() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Md Arsh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://crio-qkart-frontend-qa.vercel.app/");
	  Thread.sleep(1000);
}

@Test(priority=1)
public void ispageloaded() {
	WebElement image = driver.findElement(By.xpath("//img[@src='logo_light.svg']"));
	Assert.assertTrue(image.isDisplayed());
		
}

@Test(priority=2)
public void isloginbuttonavailable() {
	WebElement loginbutton= driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButtonBase-root  css-1urhf6j'][1]"));
	Assert.assertTrue(loginbutton.isDisplayed());
}

@Test(priority=3)
public void isregisterbuttonavailable() {
	WebElement register= driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-177pwqq'][1]"));
	Assert.assertTrue(register.isDisplayed());	
}

@Test(priority=4)
public void issearchbaravailable() {
	WebElement searchbar= driver.findElement(By.xpath("//input[@placeholder='Search for items/categories'][1]"));
	Assert.assertTrue(searchbar.isDisplayed());	
	Assert.assertTrue(searchbar.isEnabled());	
}
@Test(priority=5)
public void issearchbarenalbled() {
	WebElement searchbar= driver.findElement(By.xpath("//input[@placeholder='Search for items/categories'][1]"));	
	Assert.assertTrue(searchbar.isEnabled());	
}

@Test(priority=6)
public void isbannervisible() {
	WebElement banner = driver.findElement(By.xpath("//div[@class='hero MuiBox-root css-0']"));
	Assert.assertTrue(banner.isDisplayed());
}

@Test(priority=7)
public void isproductavailable() {
	WebElement firstproduct= driver.findElement(By.xpath("//img[@class='MuiCardMedia-root MuiCardMedia-media MuiCardMedia-img css-rhsghg']"));
	Assert.assertTrue(firstproduct.isDisplayed());
}



@Test(priority=8)
public void titlecheck() {
	String expectedtitle="QKart";
	String title=driver.getTitle();
	if(expectedtitle.equals(title)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}


@Test(priority=9)
public void areproductloading() throws InterruptedException {
	WebElement searchbar= driver.findElement(By.xpath("//input[@placeholder='Search for items/categories'][1]"));	
	searchbar.sendKeys("Kindle");
	Thread.sleep(3000);
	WebElement product = driver.findElement(By.xpath("//img[@class='MuiCardMedia-root MuiCardMedia-media MuiCardMedia-img css-rhsghg']"));
	Assert.assertTrue(product.isDisplayed());
}

@Test(priority=10)
public void isaddtocartbuttonavailable() {
	WebElement button= driver.findElement(By.xpath("//img[@class='MuiCardMedia-root MuiCardMedia-media MuiCardMedia-img css-rhsghg']"));
	Assert.assertTrue(button.isDisplayed());

}

@AfterTest
public void closewindow() {
	driver.close();
;}



}
