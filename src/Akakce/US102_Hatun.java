package Akakce;
import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US102_Hatun extends BaseDriver {
        @Test
        public void test(){

            driver.get("https://www.akakce.com/");

            WebElement girisYap= driver.findElement(By.xpath("(//a[@href='/akakcem/giris/'])"));
            girisYap.click();

            WebElement eposta=driver.findElement(By.cssSelector("[id='life'][name='life']"));
            eposta.sendKeys("hatunyuksel.106@gmail.com");

            WebElement sifre= driver.findElement(By.cssSelector("[id='lifp'][name='lifp']"));
            sifre.sendKeys("Çaykuruüzüm1");

            WebElement girisbtn= driver.findElement(By.cssSelector("[id='lfb']"));
            girisbtn.click();

            WebElement hatun= driver.findElement(By.linkText("Hatun"));
            Assert.assertTrue("Mesaj doğru değil",hatun.getText().equals("Hatun"));


            BekleVeKapat();


    }


    }
