package selenium.jsexecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Js {

    ChromeDriver driver;

    @BeforeMethod
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test() {
        driver.navigate().to("https://learn.javascript.ru/callbacks");

        // Creation of a custom function. Note that you need to call the created function right away
        driver.executeAsyncScript("function test(r, myCallback) {\n" +
                "  document.title = r;\n" +
                "  myCallback();\n" +
                "}\n" +
                "\n" +
                "function display() {\n" +
                "  alert('end');\n" +
                "}\n" +
                "\n" +
                "test('some', display());");

        // executeAsyncScript - Selenium waits for the callback function to complete while executeScript doesn't
        driver.executeAsyncScript("setTimeout(function(){ alert(\"Hello\"); }, 25000)");

        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.jsReturnsValue("return (window.totalMessagesReceived == 4 ? 'true' : null)"));
    }

    @Test
    public void test3() {
        // can help to solve the issues with delays on UI
        driver.navigate().to("https://eviltester.github.io/synchole/messages.html");

        ExpectedCondition<Boolean> condition = dr -> {
            ChromeDriver d = (ChromeDriver) dr;
            Boolean value = (Boolean) d.executeScript("return window.totalMessagesReceived == 5");
            System.out.println(value);
            return value;
        };


        new WebDriverWait(driver, 20)
                .until(condition);
    }


    @Test
    public void test2() {
        driver.navigate().to("https://foxford.ru/wiki/informatika/ternarnyy-operator-v-java");
        driver.manage().window().maximize();

        // need to cast driver
        //new WebDriverWait(driver, 10).until((dr) -> ((Boolean) driver.executeScript("return window.totalMessagesReceived == 5") ? true : false));

        new WebDriverWait(driver, 10).until((dr) -> (dr.findElement(By.cssSelector(".Button_text__1Mtef")).getText().equals("Выбрать курсы") ? true : false));

        FunInt g = (lol) -> lol;
        g.apply("enpty");

        driver.quit();
    }
}
