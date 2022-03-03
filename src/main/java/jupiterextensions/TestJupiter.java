package jupiterextensions;

import io.github.bonigarcia.seljup.SeleniumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.edge.EdgeDriver;

/*
just by changing the parameter in the test method we can
*/

@ExtendWith(SeleniumExtension.class)
public class TestJupiter {

   @Test
    public void test(EdgeDriver driver) {
        driver.navigate().to("https://mvnrepository.com/artifact/io.github.bonigarcia/selenium-jupiter");
    }
}
