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
        log.fill_form("kerolos19","kerolos19");
        log.submit();
        log.assertion();
        system.navigate_to_loan();
        system.submit_data("100","50");
        system.s_dropdown("13899");
        system.send();
        system.loan_assert();

    }

    @AfterMethod
    public void close(){
        closeBrowser();
    }





}
