/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtest;

/**
 *
 * @author Momin
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class signup {

    /**
     * @param args the command line arguments
     */
    private static WebDriver driver = null; 
    
    public static void main(String[] args) {
       
        // TODO code application logic here
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Momin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    
    
driver = new ChromeDriver();

// get URL
driver.get("https://twitter.com/i/flow/signup");
driver.manage().window().maximize();

driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[2]/div[2]/div/div[2]/label/div[2]/div/input")).sendKeys("Momin");

driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[2]/div[2]/div/div[3]/label/div[2]/div/input")).sendKeys("03228499948");


//driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/div[2]/button")).click();


//driver.quit();

    }








}