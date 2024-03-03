package US_001;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US101_Asli extends BaseDriver {

        @Test
   public void Test101() {


            driver.get("https://www.akakce.com/");


            WebElement hesapAcma=driver.findElement(By.xpath("(//a[@href='/akakcem/giris/?m=1&s=1'])[1]"));
            hesapAcma.click();


            bekle.until(ExpectedConditions.urlToBe("https://www.akakce.com/akakcem/giris/?m=1&s=1"));

            WebElement name=driver.findElement(By.cssSelector("[id='rnufn'][name='rnufn']"));
            name.sendKeys("Aslı");



            WebElement soyad=driver.findElement(By.cssSelector("[name='rnufs'][id='rnufs']"));
            soyad.sendKeys("Çelık");

            WebElement email=driver.findElement(By.cssSelector("[id='rnufe1'][name='rnufe1']"));
            email.sendKeys("aslicelikz@outlook.com");

            WebElement emailTekrar=driver.findElement(By.cssSelector("[id='rnufe2']"));
            emailTekrar.sendKeys("aslicelikz@outlook.com");

             WebElement sifre=driver.findElement(By.cssSelector("[id='rnufp1']"));
             sifre.sendKeys("Testtitans_01");

            WebElement sifreTekrar=driver.findElement(By.cssSelector("[id='rnufp2'][type='password']"));
            sifreTekrar.sendKeys("Testtitans_01");


            WebElement cinsiyet=driver.findElement(By.xpath("(//input[@name='rngc'])[1]"));
            cinsiyet.click();

            WebElement il=driver.findElement(By.cssSelector("[id='locpr']"));
            Select iller=new Select(il);
            iller.selectByVisibleText("Balıkesir");// gorunen text

            WebElement ilce=driver.findElement(By.cssSelector("[id='locds']"));
            Select ilceler=new Select(ilce);
            ilceler.selectByVisibleText("Burhaniye");



            WebElement gun= driver.findElement(By.cssSelector("[id='bd']"));
            Select gunler=new Select(gun);
            gunler.selectByValue("20");


            WebElement ay=driver.findElement(By.cssSelector("[id='bm']"));
            Select aylar=new Select(ay);
            aylar.selectByIndex(5);

            WebElement yil=driver.findElement(By.cssSelector("[id='by']"));
            Select yillar=new Select(yil);
            yillar.selectByValue("2003");

            WebElement kabulSozlesme=driver.findElement(By.cssSelector("[id='rnufpca']"));
            kabulSozlesme.click();
            Assert.assertTrue(kabulSozlesme.isSelected(),"Kabul Sözleşmesine Tıklanmadı");


            WebElement kampanyaSozleme=driver.findElement(By.cssSelector("[id='rnufnee']"));
            kampanyaSozleme.click();
            Assert.assertTrue(kampanyaSozleme.isSelected(),"Kampanya Sözleşmesine Tıklanmadı");



            WebElement hesapAcBtn=driver.findElement(By.cssSelector("[id='rfb']"));
            hesapAcBtn.click();

            BekleVeKapat();

   }

    }



