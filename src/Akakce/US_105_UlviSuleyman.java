package Akakce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utlity.BaseDriver.bekle;
import static Utlity.BaseDriver.driver;

public class US_105_UlviSuleyman {
    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");

        Actions driverAction = new Actions(driver);

        bekle.until(ExpectedConditions.urlToBe("https://www.akakce.com/"));
        WebElement loginPage = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        loginPage.click();

        WebElement email = driver.findElement(By.cssSelector("[id='life']"));
        email.sendKeys("aslicelikz@outlook.com");

        WebElement password = driver.findElement(By.cssSelector("[id='lifp']"));
        password.sendKeys("Testtitans_01");


        bekle.until(ExpectedConditions.urlToBe("https://www.akakce.com/akakcem/giris/"));
        WebElement loginClick = driver.findElement(By.cssSelector("[id='lfb']"));
        loginClick.click();

        WebElement myAccount = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        driverAction.moveToElement(myAccount).build().perform();

        WebElement myAccountDetails = driver.findElement(By.xpath("//a[text()='Hesabım']"));
        myAccountDetails.click();
        bekle.until(ExpectedConditions.urlContains("https://www.akakce.com/akakcem/"));

        WebElement orders = driver.findElement(By.linkText("Siparişlerim"));
        orders.click();

        WebElement message = driver.findElement(By.xpath("//div[text()='Kayıtlı siparişiniz bulunmuyor.']"));

        Assert.assertTrue(message.getText().contains("bulunmuyor"));

    }
}
