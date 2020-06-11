package ru.stageAuto3n;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.auto3n.WebDriverSettings;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class SignUp extends WebDriverSettings {

    @Test
    public void signUp() {
        driver.manage().window().setSize(new Dimension(2000,1000)); //устанавливаем размер окна
        driver.get("https://stage.auto3n.ru");                                  //открываем сайт

        WebDriverWait wait = new WebDriverWait(driver, 10);      //вводим переменную для ожидания

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("geo-data-rage-message"))); //ждем появления окна с геолокацией
        driver.findElement(By.className("x-icon")).click();                                               //закрываем окно

        driver.findElement(By.linkText("Зарегистрируйтесь")).click();                                     //переходим на страницу регистрации

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ymaps-2-1-76-inner-panes"))); //ждем когда загрузится карта

        driver.findElement(By.name("profile[phone]")).sendKeys("0000000002365989"); //заполняем поля
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("green")));

        driver.findElement(By.name("profile[email]")).sendKeys("lopute+153@mail.ru");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("green")));

        driver.findElement(By.name("profile[name]")).sendKeys("Гога");

        driver.findElement(By.name("profile[surname]")).sendKeys("Второй");

        driver.findElement(By.id("password-field")).sendKeys("12345678900");

        JavascriptExecutor jse = (JavascriptExecutor)driver;                                      //прокручиваем до кнопки
        jse.executeScript("window.scrollBy(0,250)", "");

        WebElement rightColumn = driver.findElement(By.className("right-column"));                //стучимся к кнопке, так как нет четких опозновательных
                                                                                                  // знаков, стучимся через вложенность
        System.out.println("Find right-column");
        WebElement submitWrapper = rightColumn.findElement(By.className("submit-wrapper"));
        System.out.println("Find submit-wrapper");
        WebElement physical =submitWrapper.findElement(By.className("physical"));
        physical.findElement(By.name("agent_type")).click();                                       //кликаем на кнопку регистрации

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Получить код повторно")));  //ждем пока загрузится страница подтверждения
                                                                                                          // регистрации


        //driver.findElement(By.cssSelector("button[class=\"registration-btn\"]")).click();

    }

}
