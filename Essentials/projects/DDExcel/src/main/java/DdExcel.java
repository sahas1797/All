import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DdExcel {

   public static void main(String[] args) throws IOException {


       File file = new File("C:\\Users\\sahas\\Desktop\\Sahas\\Automation.xlsx");

       FileInputStream fis= new FileInputStream(file);

       XSSFWorkbook wb= new XSSFWorkbook(fis);

       XSSFSheet sheet= wb.getSheet("Sheet1");

       XSSFRow row= sheet.getRow(2);

       XSSFCell cell= row.getCell(0);

       String sol= cell.getRawValue();



       System.out.println(sol);

       WebDriverManager.chromedriver().setup();
       WebDriver driver= new ChromeDriver();
       driver.get("https://www.google.com/");

       driver.findElement(By.className("q")).sendKeys(sol.toString());




    }
}
