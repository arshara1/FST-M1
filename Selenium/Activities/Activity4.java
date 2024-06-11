package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/target-practice");
        //print the title
        System.out.println("Home page title: " + driver.getTitle());

        String thirdHeaderText = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println(" ThirdHeader on the page: " + thirdHeaderText);

        String FirthHeaderColour = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
        System.out.println("Fifth header colour: " + FirthHeaderColour);

        String VletButtonClass = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println("Violet button Classes: " + VletButtonClass);

        String GreyButtontext = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
        System.out.println("Grey button Text: " + GreyButtontext);

        //Close the driver
        driver.quit();

    }
}
