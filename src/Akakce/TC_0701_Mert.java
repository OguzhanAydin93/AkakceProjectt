package Akakce;


import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_0701_Mert extends BaseDriver {

    @Test

    public void hesapSilme() {
        driver.get("https://www.akakce.com/");

        WebElement loginBtn = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        loginBtn.click();
        bekle.until(ExpectedConditions.urlToBe("https://www.akakce.com/akakcem/giris/"));

        WebElement eMail = driver.findElement(By.cssSelector("[id='life']"));
        eMail.sendKeys("avmertozmen93@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("[id='lifp']"));
        password.sendKeys("Merhaba11");

        WebElement lgnBtn = driver.findElement(By.cssSelector("[id='lfb']"));
        lgnBtn.click();
        bekle.until(ExpectedConditions.urlToBe("https://www.akakce.com/"));

        WebElement hover = driver.findElement(By.cssSelector("[id='H_a_v8']"));
        new Actions(driver).moveToElement(hover).build().perform();

        WebElement account = driver.findElement(By.xpath("//*[text()='Mert']"));
        account.click();
        bekle.until(ExpectedConditions.urlToBe("https://www.akakce.com/akakcem/"));

        WebElement deleteMyAccount = driver.findElement(By.xpath("//*[text()='Hesabımı Sil']"));
        deleteMyAccount.click();

        WebElement confirmedPassword = driver.findElement(By.cssSelector("[id='p']"));
        confirmedPassword.sendKeys("Merhaba11");

        WebElement deleteThis = driver.findElement(By.cssSelector("[id='u']"));
        deleteThis.click();
        bekle.until(ExpectedConditions.urlToBe("https://www.akakce.com/akakcem/kullanici-bilgilerim/uyelik-iptali/iptal-tamamlandi/"));

        WebElement textIsTrue = driver.findElement(By.xpath("//p/i"));


        Assert.assertTrue("The text isn't appeared.",textIsTrue.getText().contains("Hesabın silindi.\nSeni tekrar aramızda görmek isteriz."));



        BekleVeKapat();

    }


}
