package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeTest
    public void beforeClass(){
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/login-form");

        System.out.println("Tile of the Page: " + driver.getTitle());
    }

    @Test
    public void loginpage(){
        WebElement userfield = driver.findElement(By.id("username"));
        WebElement passwordfield = driver.findElement(By.id("password"));

        userfield.sendKeys("admin");
        passwordfield.sendKeys("password");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        String loginmessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin",loginmessage);

    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
