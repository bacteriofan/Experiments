package selenium.slowloadablecomponent;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {

    ChromeDriver driver;

    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://learn.javascript.ru/callbacks");
        Button b = new Button(By.cssSelector(".buy-book-button"), driver);
        b.get();
        b.click();
    }

    public void test2() {
        driver.navigate().to("https://eviltester.github.io/synchole/buttons.html");
        PageObject o = new PageObject(driver);
        LoadableUtil lu = new LoadableUtil(o.getElement());
        lu.get();
    }

    public void afterStories() {
        driver.quit();
    }
}
