/* Main code for Listeners, and all the Listener methods are implemented in other class and that class must be added here in order to use
* those listeners in this class. This action can be done using "@Listeners(<Class_Name>.class)  and (ListenerSample.java) this is the class
* we have implemented the Listener Interface Methods*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//this line is to connect the class with Listener Implementation with this class
@Listeners(ListenerSample.class)


public class ListnerCode {

    ////this is for the onTestSuccess scenario
   /* @Test
    public void testPass(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("Username");
        driver.findElement(By.id("pass")).sendKeys("Password");

        System.out.println("THis is the Maib Test Case");
    }*/



    //// This is for the test case Fail scenario onTestFailure
    @Test
    public void testFail(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://auth.services.adobe.com/en_US/index.html?callback=https%3A%2F%2Fims-na1.adobelogin.com%2Fims%2Fadobeid%2Fadobedotcomdx%2FAdobeID%2Ftoken%3Fredirect_uri%3Dhttps%253A%252F%252Fbusiness.adobe.com%252Fin%252Fproducts%252Fmagento%252Fmagento-commerce.html%2523old_hash%253D%2526from_ims%253Dtrue%253Fclient_id%253Dadobedotcomdx%2526api%253Dauthorize%2526scope%253DAdobeID%252Copenid%252Ccreative_cloud%252Cgnav%252Cread_organizations%252Cadditional_info.projectedProductContext%252Csao.ACOM_CLOUD_STORAGE%252Csao.stock%252Csao.cce_private%252Cadditional_info.roles%26state%3D%257B%2522ac%2522%253A%2522%2522%252C%2522jslibver%2522%253A%2522v2-v0.28.0-1-gd35e04f%2522%252C%2522nonce%2522%253A%25223432067154174015%2522%257D%26code_challenge_method%3Dplain%26use_ms_for_expiry%3Dtrue&client_id=adobedotcomdx&scope=AdobeID%2Copenid%2Ccreative_cloud%2Cgnav%2Cread_organizations%2Cadditional_info.projectedProductContext%2Csao.ACOM_CLOUD_STORAGE%2Csao.stock%2Csao.cce_private%2Cadditional_info.roles&denied_callback=https%3A%2F%2Fims-na1.adobelogin.com%2Fims%2Fdenied%2Fadobedotcomdx%3Fredirect_uri%3Dhttps%253A%252F%252Fbusiness.adobe.com%252Fin%252Fproducts%252Fmagento%252Fmagento-commerce.html%2523old_hash%253D%2526from_ims%253Dtrue%253Fclient_id%253Dadobedotcomdx%2526api%253Dauthorize%2526scope%253DAdobeID%252Copenid%252Ccreative_cloud%252Cgnav%252Cread_organizations%252Cadditional_info.projectedProductContext%252Csao.ACOM_CLOUD_STORAGE%252Csao.stock%252Csao.cce_private%252Cadditional_info.roles%26response_type%3Dtoken%26state%3D%257B%2522ac%2522%253A%2522%2522%252C%2522jslibver%2522%253A%2522v2-v0.28.0-1-gd35e04f%2522%252C%2522nonce%2522%253A%25223432067154174015%2522%257D&state=%7B%22ac%22%3A%22%22%2C%22jslibver%22%3A%22v2-v0.28.0-1-gd35e04f%22%2C%22nonce%22%3A%223432067154174015%22%7D&relay=78156e55-321d-4a2d-b70d-c4bafd57c9aa&locale=en_US&flow_type=token&idp_flow_type=login#/");

        driver.findElement(By.id("EmailPage-EmailField")).sendKeys("123456789");
        driver.findElement(By.linkText("Continue")).click();

    }

    /*we are trying to skip this test case hence we are makingthi test deopendent on the failure test case,
    When a test is depending on a failure test case, then that test case is Skipped*/

    @Test (dependsOnMethods = {"testFail"})
    public void testSkip(){
            System.out.println("This was Dependent on second method and hence it should not be executed since the second test case is failure");

    }


}

