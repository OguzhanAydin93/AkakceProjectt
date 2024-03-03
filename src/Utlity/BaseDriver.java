package Utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BaseDriver {

    public static WebDriver driver;

    public static WebDriverWait bekle;
    static {  //bunun sarti extends olmasi ve basta yer almasi

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // (web sayfasına özel 20 sn bekle)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // (Genel tüm WebElementler için 20 sn bekle)
        bekle=new WebDriverWait(driver,Duration.ofSeconds(20));

    }

    public static void BekleVeKapat(){

        MyFunc.Bekle(3);
        driver.quit();


    }



}
