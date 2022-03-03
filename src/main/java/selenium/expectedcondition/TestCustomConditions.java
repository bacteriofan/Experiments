package selenium.expectedcondition;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCustomConditions {

    @Test
    void test() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.pollingEvery(Duration.ofMillis(6));

        driver.navigate().to("https://translate.yandex.ru/?lang=en-ru");

        driver.executeScript("document.title=argument[0];", "lol");

        WebElement element = driver.findElement(By.xpath("//*[@id='fakeArea']"));

       wait.until(MyExpectedCondition.loadedFully(element));

       driver.quit();


    }
}
