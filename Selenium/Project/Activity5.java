package project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
    }
    @Test
    public void addEmployee() {
        String title = driver.getTitle();
        System.out.println("Login Page title: " + title);
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        //Enter values
        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Tajdar");
        driver.findElement(By.id("personal_txtEmpLastName")).clear();
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Ahmad");
        //Enter Gender
        driver.findElement(By.cssSelector("input[type='radio'][value='2']")).click();
        driver.findElement(By.id("personal_cmbNation")).sendKeys("Indian");
        driver.findElement(By.xpath("//*[@id=\"personal_DOB\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"personal_DOB\"]")).sendKeys("1989-06-01");
        driver.findElement(By.id("btnSave")).click();
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
