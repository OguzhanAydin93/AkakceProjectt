package US_001;


import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class US_106_OguzhanAydin extends BaseDriver {

    @Test
    public void test(){

        driver.get("https://www.akakce.com/");

        List<WebElement> consent = driver.findElements(By.xpath("//button[@id='L2AGLb']/div"));
        if (consent.size() > 0)
            consent.get(0).click();



        Actions aksiyonlar=new Actions(driver);

        WebElement girisYap=driver.findElement(By.cssSelector("[id='H_rl_v8'] > :nth-child(2)"));
        girisYap.click();

        WebElement eposta=driver.findElement(By.cssSelector("[id='life']"));
        eposta.sendKeys("aslicelikz@outlook.com");

        WebElement sifre=driver.findElement(By.cssSelector("[id='lifp']"));
        sifre.sendKeys("Testtitans_01");

        WebElement girisYapClick=driver.findElement(By.cssSelector("[id='lfb']"));
        girisYapClick.click();

        WebElement hamburgerMenu=driver.findElement(By.cssSelector("[id='H_a_v8']"));
        Action hover=aksiyonlar.moveToElement(hamburgerMenu).build();

        WebElement hesaplarim=driver.findElement(By.cssSelector("[id='HM_p_v8'] +li+li+li+li > a"));
        hesaplarim.click();

        BekleVeKapat();










    }






}




