//package project;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class Activity6 {
//    WebDriver driver;
//    WebDriverWait wait;
//
//    @BeforeClass
//    public void beforeClass(){
//        WebDriverManager.firefoxdriver().setup();
//        driver= new FirefoxDriver();
//        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.get("http://alchemy.hguy.co/orangehrm");
//    }
//    @Test
//    public void addEmployee() {
//        String title = driver.getTitle();
//        System.out.println("Login Page title: " + title);
//        driver.findElement(By.id("txtUsername")).sendKeys("orange");
//        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
//        driver.findElement(By.id("btnLogin")).click();
//        //driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]")).click();
//        WebElement directory = driver.findElement(By.className("firstLevelMenu"));
//        System.out.println("Directory is Displayed: " + directory.isDisplayed());
//        wait.until(ExpectedCondition.elementToBeClickable(By.className("firstLevelMenu")));
//
//
//
//    }
//    /*@AfterClass
//    public void afterClass(){
//        driver.quit();
//    }*/
//}
