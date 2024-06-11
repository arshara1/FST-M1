package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        //setup Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a instance of firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the page
        driver.get("https://v1.training-support.net/selenium/login-form");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        //Find the user name field and enter the user name
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        //Find the password field and enter the password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

        //Find the login button and click it
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //Print the confirmation
        String message = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
        System.out.println("login message: " + message);

        //Close the browser
        driver.close();
    }
}
