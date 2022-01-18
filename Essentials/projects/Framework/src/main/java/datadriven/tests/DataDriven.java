package datadriven.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDriven {
    public  static void main(String[] arhs) throws IOException, InterruptedException {

        //Creating referance for the File INput Stream class
        FileInputStream f= new FileInputStream("C:\\Users\\sahas\\Desktop\\Sahas\\projects\\Framework\\src\\main\\java\\datadriven1\\utilities\\dd.properties");

        //Creating referance for Properties class
        Properties p= new Properties();

        ///Loading properties with
        p.load(f);

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://github.com/");
        driver.manage().window().maximize();

        String signin = p.getProperty("SignIn");
        String username = p.getProperty("Username");
        String pswd = p.getProperty("Password");
        String submit = p.getProperty("submit");
        String click = p.getProperty("Click");



        driver.findElement(By.xpath(signin)).click();
        driver.findElement(By.xpath(username)).sendKeys("sahas1797@gmail.com");
        driver.findElement(By.xpath(pswd)).sendKeys("Sahas@174");
        driver.findElement(By.xpath(submit)).click();
        driver.findElement(By.xpath(click)).click();
        Thread.sleep(2000);

        driver.quit();





    }

}