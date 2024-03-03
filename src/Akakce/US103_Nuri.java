package Akakce;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US103_Nuri extends BaseDriver{
    @Test
    public void Test1()
    {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(1);

        WebElement girisButonu = driver.findElement(By.xpath("//div[@class='g-3_v8 hm_hp_v8']/div[1]/a[.='Giriş Yap']"));
        girisButonu.click();
        MyFunc.Bekle(1);

        WebElement email = driver.findElement(By.id("life"));
        email.sendKeys("aslicelikz@outlook.com");
        MyFunc.Bekle(1);

        WebElement sifre = driver.findElement(By.id("lifp"));
        sifre.sendKeys("Testtitans_01");
        MyFunc.Bekle(1);

        WebElement girisyap = driver.findElement(By.id("lfb"));
        girisyap.click();
        MyFunc.Bekle(2);

        WebElement hesabim = driver.findElement(By.id("H_a_v8"));
        hesabim.click();
        MyFunc.Bekle(2);

        WebElement cikisYap = driver.findElement(By.cssSelector("[href='#Çık']"));
        cikisYap.click();

        BekleVeKapat();







    }





}
