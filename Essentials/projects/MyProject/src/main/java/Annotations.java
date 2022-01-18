/* Code for Annotation in TestNG */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Annotations {
    WebDriver driver;
    @AfterSuite
    public void Suit(){
        System.out.println("This is AfterSuite");
    }

    @AfterTest
    public void Test(){

        System.out.println("This is AfterTest");
    }

    @AfterClass
    public void mkc(){
        System.out.println("This is AfterClass");
    }

    @AfterMethod
    public void Method(){
        System.out.println("This is AfterMethod");
    }
    @BeforeMethod
        public void Method2(){
        System.out.println("This is Before Method");
    }

    @BeforeSuite
    public void Suit1(){
        System.out.println("This is BeforeSuite");
    }

    @BeforeTest
    public void Test1(){

        System.out.println("This is BeforeTest");
    }

    @BeforeClass
    public void mkc1(){
        System.out.println("This is BeforeClass");
    }


    @Test
    public void first() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("EMAIL");

        driver.quit();

        System.out.println("This is the First Test Case");

    }

    @Test
    public void second() {

        WebDriverManager.chromedriver().setup();

        WebDriver d= new ChromeDriver();

        d.get("https://www.facebook.com/");

        d.findElement(By.id("pass")).sendKeys("EMAIL");

        d.quit();

        System.out.println("This is the Second Test Case");


    }
}

/*NOTE ::
            The @AfterMethod  and @BeforeMethod in TestNg are executed after and before every Test case */