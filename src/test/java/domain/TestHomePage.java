package domain;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Arrays;

public class TestHomePage extends TestCase {
    private WebDriver driver;
    @Test
    public void testSimple() throws Exception {
    		ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",Arrays.asList("ignore-certificate-errors"));
    		String exePath = "chromedriver";
    		System.setProperty("webdriver.chrome.driver", exePath);    
    		this.driver = new ChromeDriver();
        this.driver.get("localhost:8080/homepage");
        assertEquals("LAYMAN BROTHERS",driver.findElement(By.id("homepageheader")).getText()); 
        this.driver.quit(); 
    }
}