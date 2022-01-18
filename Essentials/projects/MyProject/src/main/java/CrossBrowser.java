/* Cross Browser Testing in TestNG . Here we need to add a testng.xml file in the project and then Build project and then we can use it here in this
    code. Here we are writing the browsers in testNg.xml file and reading them here as a parameter.
    -we need to run this code from the XML file not from Here.
 */


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class CrossBrowser{

    public WebDriver driver;

    @Parameters("browser")


    ///checks for the browser from the testNG.xml file
    @BeforeMethod
        public void checkBrowser(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.get("https://www.facebook.com/");
    }


    @Test
        public void code(){

       driver.findElement(By.id("email")).sendKeys("HelloALl");
    }

    @AfterMethod
        public void after() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }


}
