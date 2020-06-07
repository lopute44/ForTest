package ru.stageAuto3n;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import ru.auto3n.WebDriverSettings;

public class SignUp extends WebDriverSettings {

    @Test
    public void signUp() {
        driver.manage().window().setSize(new Dimension(1000,600));
        driver.get("https://stage.auto3n.ru");

        //WebElement button = driver.findElement(By.className("benefaction"));
        //button.findElement(By.cssSelector("[href=\"https://stage.auto3n.ru/component/auto/user/registration\"]")).click();

        WebElement button = driver.findElement(By.className("item-901"));
        button.findElement(By.cssSelector("[href=\"/akcii-2\"]")).click();

    }
}
