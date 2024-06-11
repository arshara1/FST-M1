package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("Home Page title: " + driver.getTitle());

        //Find Element Footbal
        WebElement football = driver.findElement(By.id("draggable"));
        //Find Element Dropzone 1
        WebElement Dropzone1 = driver.findElement(By.id("droppable"));
        //Find Element Dropzone2
        WebElement Dropzone2 = driver.findElement(By.id("dropzone2"));

        builder.clickAndHold(football).moveToElement(Dropzone1).pause(2000).release().build().perform();
        String dropzone1verify = Dropzone1.findElement(By.tagName("p")).getText();
        if (dropzone1verify.equals("Dropped!")) {
            System.out.println("Ball was dropped to dropzone1");
            
        }


        builder.clickAndHold(football).moveToElement(Dropzone2).pause(2000).release().build().perform();
        String dropzone2verify = Dropzone2.findElement(By.tagName("p")).getText();
        if(dropzone2verify.equals("Dropped!")){
            System.out.println("Ball was dropped 2 Dropzone2");

            //Close the browser
            driver.quit();
        }
    }
}
