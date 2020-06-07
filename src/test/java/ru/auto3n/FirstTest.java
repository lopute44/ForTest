package ru.auto3n;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings {


    @Test
    public void firstTest() {
        driver.get("https://auto3n.ru");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Auto3N — интернет-магазин автозапчастей | Купить запчасти онлайн."));
    }

}
