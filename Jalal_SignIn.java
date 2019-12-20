/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Saud
 */
public class ST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saud\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://stackoverflow.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("/html/body/header/div/ol[2]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("email");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
    }
    
}
