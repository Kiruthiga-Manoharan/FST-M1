package HRMProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {
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
    public void testCase1() {
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "OrangeHRM");
    }
    @AfterTest
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}
