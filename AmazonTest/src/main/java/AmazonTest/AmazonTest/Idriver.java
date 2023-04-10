package AmazonTest.AmazonTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Idriver {
	
	
	private static final String FileType = null;

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Md Arsh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://en.wikipedia.org/wiki/Mahatma_Gandhi");
		Actions ac = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//input[@id='vector-main-menu-dropdown-checkbox']"));
		ac.moveToElement(element).build().perform();
	    Set <String> s= driver.getWindowHandles();
	    driver.switchTo().alert().sendKeys("text");
	    WebDriverWait wait = new WebDriverWait(driver, 2);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	    driver.switchTo().frame(3);
	    
	    TakesScreenshot t= (TakesScreenshot) driver;
	    t.getScreenshotAs(FileType.FILE);
	    File f= new File(path);
	    FileUtils.copypath(t,path)
	    
	    
	    
	    
	    
	    
 		Thread.sleep(3000);
		driver.close();
		
		
	
		
		
	}

}
