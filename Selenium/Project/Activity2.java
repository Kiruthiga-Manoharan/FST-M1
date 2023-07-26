package HRMProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeTest
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open the browser
        driver.get("http://alchemy.hguy.co/orangehrm");
    }
    @Test
    public void testCase2() {
        String headerImageUrl = driver.findElement(By.xpath("//img[contains(@src,'logo.png')]")).getAttribute("src");
        System.out.println("Image url is: " + headerImageUrl);
    }
    @AfterTest
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
}
