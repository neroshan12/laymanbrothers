package domain;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

import junit.framework.TestCase;

public class TestDeposit extends TestCase {
	
	
	    private WebDriver driver;
	  
	    @Test
	    public void testDeposit() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",Arrays.asList("ignore-certificate-errors"));
        String exePath = "chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);    
        this.driver = new ChromeDriver();
        this.driver.get("localhost:8080/homepage");
        driver.findElement(By.xpath("//*[@id=\"signup\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Joe");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Ingram");
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Croydon");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("joe@joe.com");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("gijoe");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("gojoego");
        driver.findElement(By.xpath("//*[@id=\"register\"]/fieldset/p[13]/input[1]")).click();
        this.driver.get("localhost:8080/balance");
        driver.findElement(By.xpath("/html/body/div[1]/div/a[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("500.0");
        this.driver.get("localhost:8080/balance");
        assertEquals("1500.0",driver.findElement(By.xpath("//*[@id=\"currentbalance\"]")).getText());
        
        this.driver.quit();
    }

	   
	    
	    


	
}
