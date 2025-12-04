import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sys_prof_loan_test extends Setup_test{

    @BeforeMethod
    public void setup(){
        openBrowser();

    }

    @Test(priority = 1,groups = "System")
    public void tc1(){
        log.fill_form("kerolos19","kerolos19");
        log.submit();
        log.assertion();
        system.redirection();
        system.as_redirectopn();

    }


    @Test(priority = 2,groups = "System")
    public void tc2(){
        log.fill_form("kerolos19","kerolos19");
        log.submit();
        log.assertion();
        system.logout();
        system.as_logout();

    }

    @Test(priority = 3,groups = "System")
    public void tc3(){
        log.fill_form("kerolos19","kerolos19");
        log.submit();
        driver.navigate().back();
        driver.navigate().forward();
        log.assertion();

    }





    @Test(priority = 4,groups = "profile")
public void tc4(){
        log.fill_form("kerolos19","kerolos19");
        log.submit();
        log.assertion();
        system.navigate_to_update_contact_info();
        system.update_contact_info("Kerolos","George","19ST,haha","cairo","zamalek","15647","012212705504");
        system.submit_updated_date();
        system.assertion();


    }

    @Test(priority = 5,groups = "profile",dependsOnMethods = "tc4")
    public void tc5(){
        log.fill_form("kerolos19","kerolos19");
        log.submit();
        log.assertion();
        system.navigate_to_update_contact_info();
        system.getdata();
    }


    @Test(priority = 6,groups = "loan")
    public void tc6(){
        log.fill_form("kerolos19","kerolos19");
        log.submit();
        log.assertion();
        system.navigate_to_loan();
        system.submit_data("100","50");
        system.s_dropdown("13899");
        system.send();
        system.loan_assert();

    }

    @Test(priority = 7,groups = "loan")
    public void tc7(){
        log.fill_form("Wageeh01","Wageeh01");
        log.submit();
        log.assertion();
        system.navigate_to_loan();
        system.submit_data("50","100");
        system.s_dropdown("19449");
        system.send();
        system.loan_assert();

    }
@Test(priority = 8,groups = "loan")
public void tc8(){
    log.fill_form("Wageeh00","Wageeh00");
    log.submit();
    log.assertion();
    system.navigate_to_loan();
    system.submit_data("100h","50");
    system.s_dropdown("14010");
    system.send();
    a_ssert.assertEquals(driver.findElement(By.cssSelector("#requestLoanError > h1")).getText(),"Error!\n" +
            "An internal error has occurred and has been logged.");
    System.out.println(driver.findElement(By.cssSelector("#requestLoanError > h1")).getText());

}
    @Test(priority = 9,groups = "loan")
    public void tc9(){
        log.fill_form("Wageeh01","Wageeh01");
        log.submit();
        log.assertion();
        system.navigate_to_loan();
        system.submit_data("","");
        system.s_dropdown("13566");
        system.send();
        a_ssert.assertEquals(driver.findElement(By.cssSelector("#requestLoanError > h1")).getText(),"Error!\n" +
                "An internal error has occurred and has been logged.");
        System.out.println(driver.findElement(By.cssSelector("#requestLoanError > h1")).getText());

    }

    @AfterMethod
    public void close(){
        closeBrowser();
    }





}
