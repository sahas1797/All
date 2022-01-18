/* Code on TestNG priorities .
    In TestNG the tests will be executing purely based upon the priorities. we can mention negative numbers as priority as well. If no priority is given they will
    execute in the order they have written. If equal priority is given then also they execute in the order they have written.
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priorities {

    //This will execute second as the priority is greater than second test case
    @Test (priority = 1)
    public void first() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("EMAIL");

        driver.quit();

        System.out.println("This is the First Test Case");

    }


    //This will execute first as this value is less
    @Test (priority = 0)
    public void second() {

        WebDriverManager.chromedriver().setup();

        WebDriver d= new ChromeDriver();

        d.get("https://www.facebook.com/");

        d.findElement(By.id("pass")).sendKeys("EMAIL");

        d.quit();

        System.out.println("This is the Second Test Case");


    }

}
