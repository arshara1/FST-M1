package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Activity5 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        Actions builder =  new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/input-events");

        System.out.println("Home page title : " + driver.getTitle());

        builder.click().pause(1000).build().perform();
        // Print the front side text
        String frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        // Perform double  click
        builder.doubleClick().pause(1000).build().perform();
        // Print the front side text
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        // Perform Right click
        builder.contextClick().pause(1000).build().perform();
        // Print the front side text
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        // Close the browser
        driver.quit();




    }
}
