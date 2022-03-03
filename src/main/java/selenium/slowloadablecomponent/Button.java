package selenium.slowloadablecomponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.SlowLoadableComponent;

import java.time.Clock;

// SlowLoadableComponent will wait for us
public class Button extends SlowLoadableComponent<Button> {

    private final By locator;
    private final WebDriver driver;

    public Button(By locator, WebDriver driver) {
        super(Clock.systemDefaultZone(), 10);
        this.locator = locator;
        this.driver = driver;
    }

    @Override
    protected void load() {
    }

    @Override
    protected void isLoaded() throws Error {
        WebElement element = this.driver.findElement(this.locator);
        if (element.isDisplayed() && element.isEnabled()) {
            return;
        } else {
            throw new Error();
        }
    }

    public void click() {
        driver.findElement(this.locator).click();
    }
}
