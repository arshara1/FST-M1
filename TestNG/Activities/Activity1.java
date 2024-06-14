package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        //Setup the Firefox
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        //Open browser
        driver.get("https://v1.training-support.net");
        Reporter.log("Browser opened");
    }
    @Test
    public void exampleTestCase() {
        String title = driver.getTitle();
        System.out.println("Home page: " + title);
        Assert.assertEquals("Training Support", title);
        Reporter.log("Homepage loaded");

        driver.findElement(By.id("about-link")).click();

        String newtitle = driver.getTitle();
        System.out.println("New page title: " + newtitle);
        Assert.assertEquals("About Training Support", newtitle);
        Reporter.log("About us page loaded");
    }
        @AfterClass
        public void afterMethod() {
        Reporter.log("Brower closed");
            driver.quit();
        }

    }

