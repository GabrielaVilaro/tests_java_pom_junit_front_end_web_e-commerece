package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Config;

import java.util.concurrent.TimeUnit;

public class TestBase{

    public static WebDriver driver;


    @Before
    public void before() {
        System.setProperty(Config.BROWSER, Config.PATH);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Config.BASE_URL);
        driver.manage().window().maximize();

    }
    @After
    public void after() {
        driver.quit();
    }
}