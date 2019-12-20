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
        driver.get("http://35.188.106.57");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/div/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"id_first_name\"]")).sendKeys("ST Group 04");
             driver.findElement(By.xpath("//*[@id=\"id_username\"]")).sendKeys("hareemtahir2c@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"id_password1\"]")).sendKeys("group8828");
          driver.findElement(By.xpath("//*[@id=\"id_password2\"]")).sendKeys("group8828");
           driver.findElement(By.xpath("/html/body/div[1]/div/div/form/p[5]/input")).sendKeys("C:\\Users\\Saud\\Desktop\\Profile.jpg");
           driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/label/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/form/input[2]")).click();
    }
    
}
