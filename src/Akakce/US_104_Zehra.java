package Akakce;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_104_Zehra extends BaseDriver {
    @Test
    public void Login() {
        driver.get("https://www.akakce.com/");
        Actions driverAksiyon=new Actions(driver);

        WebElement login = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        login.click();
        bekle.until(ExpectedConditions.urlContains("https://www.akakce.com/akakcem/giris/"));

        WebElement email = driver.findElement(By.xpath("//input[@name='life']"));
        email.sendKeys("zehragkrl@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='lifp']"));
        password.sendKeys("Q1q2q3q4.");

        WebElement giris=driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        giris.click();
        bekle.until(ExpectedConditions.urlContains("https://www.akakce.com/"));

        WebElement myAccount= driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        driverAksiyon.moveToElement(myAccount).build().perform();











    }

}
