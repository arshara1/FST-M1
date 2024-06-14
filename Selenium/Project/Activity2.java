package project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/orangehrm");

        String title = driver.getTitle();
        System.out.println("Title of the page: "+ title);
        WebElement img =
                driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/img"));
        String link1= img.getAttribute("src");
        System.out.println("Header Image URL:" + link1);
        driver.quit();
    }
}
