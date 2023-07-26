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

public class Activity4 {
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
    public void testCase4() throws InterruptedException {
        WebElement username = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));


        username.sendKeys("orange");
        password.sendKeys("orangepassword123");


        driver.findElement(By.id("btnLogin")).click();

       driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
       Thread.sleep(2000);
       WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
       WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
       firstname.sendKeys("Shashank");
       lastname.sendKeys("Athav");
       driver.findElement(By.xpath("//input[@value=\"Save\"]")).click();
       driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
       Thread.sleep(2000);
       WebElement name = driver.findElement(By.xpath("//input[contains(@name,\"empsearch\")]"));
       name.sendKeys("Shashank Athav");
       driver.findElement(By.id("searchBtn"));
       String fname = driver.findElement(By.xpath("//a[contains(text(),'Shashank')]")).getText();
       Assert.assertEquals("Shashank", fname);
    }



    @AfterTest
    public void afterMethod() {
        //Close browser
        driver.close();
    }

}
