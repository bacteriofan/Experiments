package jupiterextensions;

import io.github.bonigarcia.seljup.SeleniumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

/*
just by changing system property we can change the a browser
*/

@ExtendWith(SeleniumExtension.class)
public class TestJupiter2 {

    static {
        System.setProperty("sel.jup.default.browser", "edge");
    }

   @Test
    public void test(WebDriver driver) throws InterruptedException {
        driver.navigate().to("https://mvnrepository.com/artifact/io.github.bonigarcia/selenium-jupiter");
        Thread.sleep(5);
    }


}
