package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.jsexecutor.FunInt;

public class SeleniumLocators {

    ChromeDriver driver;

    @BeforeMethod
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test2() {
        driver.navigate().to("https://foxford.ru/wiki/informatika/ternarnyy-operator-v-java");
        driver.manage().window().maximize();
    }
}
