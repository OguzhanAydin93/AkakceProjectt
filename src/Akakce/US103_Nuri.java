package Akakce;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US103_Nuri extends BaseDriver{
    @Test
    public void Test1()
    {
        driver.get("https://www.akakce.com/");

        WebElement girisButonu = driver.findElement(By.xpath("//div[@class='g-3_v8 hm_hp_v8']/div[1]/a[.='Giriş Yap']"));
        girisButonu.click();
        bekle.until(ExpectedConditions.urlToBe("https://www.akakce.com/akakcem/giris/"));

        WebElement email = driver.findElement(By.cssSelector("[id='life']"));
        email.sendKeys("aslicelikz@outlook.com");

        WebElement sifre = driver.findElement(By.cssSelector("[id='lifp']"));
        sifre.sendKeys("Testtitans_01");

        WebElement girisyap = driver.findElement(By.cssSelector("[id='lfb']"));
        girisyap.click();

        WebElement hesabim = driver.findElement(By.cssSelector("[title='Hesabım']"));
        hesabim.click();

        WebElement cikisYap = driver.findElement(By.cssSelector("[href='#Çık']"));
        cikisYap.click();

        BekleVeKapat();

    }
}
