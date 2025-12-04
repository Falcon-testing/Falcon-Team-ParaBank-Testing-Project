import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends Setup_test {


@BeforeMethod
public void setup(){
openBrowser();

}

    @Test(priority = 1 )
    public void tc1(){
        log.fill_form(
                "Valid56",
                "P@ssw0rd"
        );
        log.submit();
        log.assertion();
    }

    @Test(priority = 2)
    public void tc2(){
        log.fill_form(
                "V",
                "P@ssw0rd"
        );
        log.submit();
        log.assertion();
    }

    @Test(priority = 3)
    public void tc3(){
        log.fill_form(
                "Va",
                "P@ssw0rd"
        );
        log.submit();
        log.assertion();
    }

    @Test(priority = 4)
    public void tc4(){
        log.fill_form(
                "Keriksomgngjjfhfhyrierherherll",
                "P@ssw0rd"
        );
        log.submit();
        log.assertion();
    }

    @Test(priority = 5)
    public void tc5(){
        log.fill_form(
                "V@lid",
                "P@sswor"
        );
        log.submit();
        log.assertion();
    }

    @Test(priority = 6)
    public void tc6(){
        log.fill_form(
                "Valid",
                "P@ssw0rd56565"
        );
        log.submit();
        log.assertion();
    }

    @Test(priority = 7)
    public void tc7(){
        log.fill_form(
                "Valid",
                "password"
        );
        log.submit();
        log.assertion();
    }


    @Test(priority = 8)
    public void tc8(){
        log.fill_form(
                "Valid88",
                "P@ssw0rd"
        );
        log.submit();
        a_ssert.assertEquals(driver.findElement(By.id("rightPanel")).getText(),"Error!\n" +
                "The username and password could not be verified.");
    }

    @Test(priority = 9)
    public void tc9(){
        log.fill_form(
                "",
                ""
        );
        log.submit();
        a_ssert.assertEquals(driver.findElement(By.id("rightPanel")).getText(),"Error!\n" +
                "Please enter a username and password. ");
    }

    @Test(priority = 10)
    public void tc10(){
        log.fill_form(
                "566",
                "P@ssw0rd"
        );
        log.submit();
        log.assertion();
    }

    @Test(priority = 11)
    public void tc11(){
        log.fill_form(
                "Valid56",
                "5565855458"
        );
        log.submit();
        log.assertion();
    }



    @AfterMethod
    public void close(){
closeBrowser();
        }

}
