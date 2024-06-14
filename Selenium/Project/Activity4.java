package project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
    }

    @Test
    public void addEmployee(){
        String title = driver.getTitle();
        System.out.println("Login Page title: " + title);
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
        driver.findElement(By.id("firstName")).sendKeys("Arshiya");
        driver.findElement(By.id("lastName")).sendKeys("Ara");
        driver.findElement(By.id("employeeId")).sendKeys("12345");
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
        driver.findElement(By.id("empsearch_id")).sendKeys("244312345");
        driver.findElement(By.id("searchBtn")).click();


    }
    /*@AfterClass
    public void afterClass(){
        driver.quit();
    }*/
}
