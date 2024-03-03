package Akakce;


import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class US_106_OguzhanAydin extends BaseDriver {

    @Test
    public void test(){

        driver.get("https://www.akakce.com/");

//        List<WebElement> cookies = driver.findElements(By.xpath("//button[@id='L2AGLb']/div"));
//        if (cookies.size() > 0)
//            cookies.get(0).click();

        Actions aksiyonlar=new Actions(driver);

        bekle.until(ExpectedConditions.urlToBe("https://www.akakce.com/"));
        WebElement girisYap=driver.findElement(By.cssSelector("[id='H_rl_v8'] > :nth-child(2)"));
        girisYap.click();

        WebElement eposta=driver.findElement(By.cssSelector("[id='life']"));
        eposta.sendKeys("aslicelikz@outlook.com");

        WebElement sifre=driver.findElement(By.cssSelector("[id='lifp']"));
        sifre.sendKeys("Testtitans_01");

        bekle.until(ExpectedConditions.urlToBe("https://www.akakce.com/akakcem/giris/"));
        WebElement girisYapClick=driver.findElement(By.cssSelector("[id='lfb']"));
        girisYapClick.click();

        WebElement hamburgerMenu=driver.findElement(By.cssSelector("[id='H_a_v8']"));
        Action hover=aksiyonlar.moveToElement(hamburgerMenu).build();
        hover.perform();

        WebElement hesaplarim=driver.findElement(By.cssSelector("[id='HM_p_v8']+li+li+li+li>a"));
        hesaplarim.click();
        bekle.until(ExpectedConditions.urlToBe("https://www.akakce.com/akakcem/"));

        WebElement mesajlar=driver.findElement(By.cssSelector("[href='/akakcem/mesajlarim/']"));
        mesajlar.click();
        bekle.until(ExpectedConditions.urlToBe("https://www.akakce.com/akakcem/mesajlarim/"));

        WebElement bildirimMsj=driver.findElement(By.cssSelector("[style='color: #777;font-size: 1.15em;font-weight: bold;text-align: center;padding-top: 30px;padding-bottom: 60px;']"));
        System.out.println("Bildirim Mesajı = " + bildirimMsj.getText());

        Assert.assertTrue("Mesaj Doğru Gözükmüyor :)",bildirimMsj.getText().contains("Listelenecek mesaj bulunamadı."));

        BekleVeKapat();










    }






}




