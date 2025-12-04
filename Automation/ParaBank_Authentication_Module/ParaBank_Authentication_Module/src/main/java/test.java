import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class test {
    public static void main(String[] args) {
        System.setProperty("web.chrome.driver", "C:\\Users\\kgorg\\OneDrive\\Desktop\\work\\software\\technical\\Software tester\\Automation\\chromedriver-win64\\chormedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/parabank-5.0.0-SNAPSHOT/index.htm");
        driver.manage().window().maximize();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.linkText("Forgot login info?")).click();


        //firstname
        By first_Log_path=By.id("firstName");
        WebElement firstname_log=driver.findElement(first_Log_path);
        firstname_log.sendKeys("kerolos");

        //lastname
        By last_Log_path=By.id("lastName");
        WebElement lastname_log=driver.findElement(last_Log_path);
        lastname_log.sendKeys("atia");

        //address
        By address_Log_path=By.id("address.street");
        WebElement address_log=driver.findElement(address_Log_path);
        address_log.sendKeys("19S.T HANA TADRS-loxurS,T");


        //city
        By city_Log_path=By.id("address.city");
        WebElement city_log=driver.findElement(city_Log_path);
        city_log.sendKeys("giza");

        //State
        By state_Log_path=By.id("address.state");
        WebElement state_log=driver.findElement(state_Log_path);
state_log.sendKeys("imbaba");


        //Zip code
        By zip_Log_path=By.id("address.zipCode");
        WebElement zip_log=driver.findElement(zip_Log_path);
zip_log.sendKeys("12966");

        //SSN
        By ssn_Log_path=By.id("ssn");
        WebElement ssn_log=driver.findElement(ssn_Log_path);
ssn_log.sendKeys("123456789");


        //forget login button
        By forgetlog_btn_path=By.cssSelector("[value='Find My Login Info']");
        WebElement forgetlog_btn=driver.findElement(forgetlog_btn_path);
        forgetlog_btn.click();


        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#rightPanel > h1")));
        System.out.println(driver.findElement(By.cssSelector("#rightPanel > h1")).getText());




















driver.quit();




    }
}