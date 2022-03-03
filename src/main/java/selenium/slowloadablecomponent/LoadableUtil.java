package selenium.slowloadablecomponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.SlowLoadableComponent;

import java.time.Clock;

// SlowLoadableComponent will wait for us
public class LoadableUtil extends SlowLoadableComponent<LoadableUtil> {

    private final WebElement element;

    public LoadableUtil(WebElement element) {
        super(Clock.systemDefaultZone(), 10);
        this.element = element;
    }

    @Override
    protected void load() {
    }

    @Override
    protected void isLoaded() throws Error {
        if (element.isDisplayed() && element.isEnabled()) {
            return;
        } else {
            throw new Error();
        }
    }
}
