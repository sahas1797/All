import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class Hello {
        WebDriver driver;
        @AfterSuite
            public void Suit(){
            System.out.println("Suite");
        }

        @AfterTest
                public void Test(){

        System.out.println("Test");
        }

        @AfterClass
                public void mkc(){
            System.out.println("Class");
        }

        @AfterMethod
                public void Method(){
            System.out.println("Method");
        }



        @Test (priority=0)
        public void first() {

            WebDriverManager.chromedriver().setup();

            WebDriver driver= new ChromeDriver();

            driver.get("https://www.facebook.com/");

            driver.findElement(By.id("email")).sendKeys("EMAIL");

        }

    @Test (priority = 0)
    public void second() {

        WebDriverManager.chromedriver().setup();

        WebDriver d= new ChromeDriver();

        d.get("https://www.facebook.com/");
        d.findElement(By.id("pass")).sendKeys("EMAIL");

    }

}


