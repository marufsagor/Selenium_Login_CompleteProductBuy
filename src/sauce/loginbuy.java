package sauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class loginbuy {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	  
	        // URL of the login website that is tested
	        driver.get("https://www.saucedemo.com/");
	  
	        // Maximize window size of browser
	        driver.manage().window().maximize();
	       // Enter your login email id
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  
	        // Enter your login password
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  
	        driver.findElement(By.id("login-button")).click();
	        
	        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	        driver.findElement(By.className("shopping_cart_badge")).click();
	        driver.findElement(By.id("checkout")).click();
	        
	        driver.findElement(By.id("first-name")).sendKeys("Maruf");
	        driver.findElement(By.id("last-name")).sendKeys("Sagor");
	        driver.findElement(By.id("postal-code")).sendKeys("1250");
	        driver.findElement(By.id("continue")).click();
	        driver.findElement(By.id("finish")).click();
	        
	        /*WebElement ThankMessageActual = driver.findElement(By.className("complete-header"));
	        String text=ThankMessageActual.getText();
	        String ExpectedText = "Thank you for your order!";
	        Assert.assertEquals(text,ExpectedText);
	        WebElement actualString = driver.findElement(By.className("complete-header"));
	        //Assert.assertEquals(ExpectedText,ThankMessageActual.isDisplayed());
	        //Assert.assertEquals(ExpectedText, ThankMessageActual.getText());
	        //System.out.println(“IRCTC text is a expected – Assert passed”);*/
	        //Change
	       

	}

}
