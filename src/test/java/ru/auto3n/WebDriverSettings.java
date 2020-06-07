package ru.auto3n;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/IntelliJ IDEA/webDriver/chromedriver.exe");

        driver = new ChromeDriver();
    }

    @After
    public void close() {
        driver.quit();
    }

}
