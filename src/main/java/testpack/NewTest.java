package testpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
  WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Devops_Sam\\chromedriver_win32 (1)\\chromedriver.exe");
      driver=new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
	  Thread.sleep(5000);
     
  }

  @AfterMethod
  public void afterMethod() {
	  Assert.assertTrue(driver.getTitle().contains("Flight"));
	  driver.close();
  }

}
