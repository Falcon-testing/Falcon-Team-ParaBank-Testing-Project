package Hook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class hook {
    public static WebDriver driver;


    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kgorg\\OneDrive\\Desktop\\work\\software\\technical\\Software tester\\Automation\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }


    public void closeBrowser() {

            driver.quit();

    }
}
