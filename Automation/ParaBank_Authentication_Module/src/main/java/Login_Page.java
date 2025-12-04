import Hook.hook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page extends Setup_page {
    public Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By username_Log_path = By.cssSelector("[name='username']");
    By password_Log_path = By.cssSelector("[name='password']");
    By login_btn_path = By.cssSelector("[value='Log In']");
    By message_path = By.linkText("Accounts Overview");

    public void fill_form(String us, String pass) {
        driver.findElement(username_Log_path).sendKeys(us);
        driver.findElement(password_Log_path).sendKeys(pass);
    }

    public void submit() {
        driver.findElement(login_btn_path).click();
    }



    public void assertion() {
        Wait(driver.findElement(message_path));
        String actual = driver.findElement(message_path).getText();
        System.out.println(actual);
        a_ssert.assertEquals(actual, "Accounts Overview", "Error in login function ⚠️⚠️⚠️");
    }



}
