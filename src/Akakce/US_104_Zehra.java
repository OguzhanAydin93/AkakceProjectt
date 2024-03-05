package Akakce;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_104_Zehra extends BaseDriver {
    @Test
    public void Login(){
        driver.get("https://www.akakce.com/");

        WebElement login = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        login.click();
        bekle.until(ExpectedConditions.urlContains("https://www.akakce.com/akakcem/giris/"));



    }

}
