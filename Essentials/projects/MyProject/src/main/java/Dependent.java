import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dependent {

    ////This is the Test case
/*
    @Test
    public void Test1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("Email");
        driver.findElement(By.id("pass")).sendKeys("Password");

        System.out.println("This is the Independent TEst Case");
    }


    ///This test case is purely dependent upon the upper test case i.e., Test1. If the Test1 testcase fail this particular test case i.e., Test@ test case
    // will be skipped.

    @Test (dependsOnMethods = {"Test1"})
    public void Test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Log In")).click();

        System.out.println("This is Dependent on Test1");
    }

*/




    /////Making a single Test Case Dependent on multiple test case


    //here we are making this class dependent other two test cases, so the order of execution is the series we mentioned i.e., meth1, meth2, meth
    @Test (dependsOnMethods = {"meth1","meth2"})
        public void meth(){
        System.out.println("This should Execute last");

        }
        @Test
        public void meth2(){
        System.out.println("This should Execute Middle");

        }

        @Test
        public void meth1(){
        System.out.println("This should Execute First");


    }


}
