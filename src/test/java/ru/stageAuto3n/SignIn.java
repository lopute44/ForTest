package ru.stageAuto3n;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.auto3n.WebDriverSettings;

public class SignIn extends WebDriverSettings {

    @Test
    public void signIn() {
        driver.manage().window().setSize(new Dimension(2000,1000)); //устанавливаем размер окна
        driver.get("https://stage.auto3n.ru");                                  //открываем сайт

        WebDriverWait wait = new WebDriverWait(driver, 10);      //вводим переменную для ожидания

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("geo-data-rage-message"))); //ждем появления окна с геолокацией
        driver.findElement(By.className("x-icon")).click();                                               //закрываем окно

        driver.findElement(By.className("cBox-inner-right")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cboxLoadedContent")));

        driver.findElement(By.name("Login[username]")).sendKeys("lopute+1@mail.ru");
        driver.findElement(By.name("Login[password]")).sendKeys("123456");

        WebElement popup = driver.findElement(By.id("personal-office-popup"));
        popup.findElement(By.cssSelector("button[type=\"submit\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phoneback-module-320")));



    }
}
