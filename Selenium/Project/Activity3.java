package HRMProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 {
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
    public void testCase3() {
        WebElement username = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));


        username.sendKeys("orange");
        password.sendKeys("orangepassword123");


        driver.findElement(By.id("btnLogin")).click();

        String loginMessage = driver.findElement(By.xpath("//a[contains(text(),'Welcome orange')]")).getText();
        Assert.assertEquals("Welcome orange", loginMessage);
    }



    @AfterTest
    public void afterMethod() {
        //Close browser
        driver.close();
    }

}
