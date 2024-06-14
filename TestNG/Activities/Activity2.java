package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeTest
    public void beforeMethod() {
        //Setup the Firefox
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
        Reporter.log("Browser opened");
    }
    @Test
    public void testcase1() {
        String title = driver.getTitle();
        System.out.println("Title of the page" + title);
        Assert.assertEquals("Target Practice",title);
    }
    @Test
    public  void testcase2() {
        WebElement blackbutton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackbutton.isDisplayed());
        Assert.assertEquals(blackbutton.getText(),"black");
    }
@Test(enabled = false)
    public void testcase3() {
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }

    @Test
    public void testcase4() {
        throw  new SkipException("Skipping Test case");
    }

    @AfterTest
    public void afterMethod(){
        driver.quit();
    }
}
