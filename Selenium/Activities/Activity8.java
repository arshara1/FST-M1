package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Home Page title: " + driver.getTitle());
        //Find the toggle button
        WebElement togglebutton = driver.findElement(By.id("toggleCheckbox"));
        togglebutton.click();
        //Find the dynamic button
        WebElement dynamicbutton = driver.findElement(By.id("dynamicCheckbox"));
        wait.until(ExpectedConditions.invisibilityOf(dynamicbutton));
        System.out.println(dynamicbutton.isDisplayed());
        togglebutton.click();

        wait.until(ExpectedConditions.visibilityOf(dynamicbutton));
        System.out.println(dynamicbutton.isDisplayed());

        driver.quit();

    }
}
