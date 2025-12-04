import Hook.hook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Setup_page extends hook {

    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public SoftAssert a_ssert = new SoftAssert();

    public void Wait(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
    }
}
