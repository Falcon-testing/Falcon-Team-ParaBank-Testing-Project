import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class system extends Setup_page{

    public system(WebDriver driver) {
        this.driver = driver;
    }



    //locators

    //system
    By logout= By.linkText("Log Out");
    By message= By.cssSelector("#leftPanel > h2");
    By logo=By.className("logo");

    //profile
    By update_con_info_path=By.linkText("Update Contact Info");
    By update_text_path=By.cssSelector("#updateProfileForm > h1");
    By firstname_path=By.cssSelector("[name='customer.firstName']");
    By lasttname_path=By.cssSelector("[name='customer.lastName']");
    By address_path=By.cssSelector("[name='customer.address.street']");
    By city_path=By.cssSelector("[name='customer.address.city']");
    By state_path=By.cssSelector("[name='customer.address.state']");
    By zip_path=By.cssSelector("[name='customer.address.zipCode']");
    By phone_path=By.cssSelector("[name='customer.phoneNumber']");
    By update_btn_path=By.cssSelector("[value='Update Profile']");
    By updated_message=By.cssSelector("#updateProfileResult > h1");

    //loan
By loan_path=By.linkText("Request Loan");
By loan_amount_path=By.id("amount");
By down_payment_path=By.id("downPayment");
By account_dropdown_path=By.id("fromAccountId");
By loan_btn_path=By.cssSelector("[value='Apply Now']");
By loan_message_path=By.cssSelector("#requestLoanResult > h1");


//system
    //logout
    public void logout(){
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(logout)));
        driver.findElement(logout).click();
    }

    //assertion logout
    public void as_logout(){
        driver.findElement(message);
        System.out.println(driver.findElement(message).getText());
        a_ssert.assertEquals(driver.findElement(message).getText(),"Customer Login","Error in logout ");
    }

//ParaBank Logo Redirection
    public void redirection(){
        driver.findElement(logo).click();
    }

    //Assertion
    public void as_redirectopn(){
       String actual= driver.findElement(By.cssSelector("#rightPanel > ul.services")).getText();
        System.out.println(actual);
    }

//profile
//update contact info
    public void navigate_to_update_contact_info(){
        driver.findElement(update_con_info_path).click();

        a_ssert.assertEquals(driver.findElement(update_text_path).getText(),"Update Profile","Error to navigate");

    }


    public void getdata(){

        WebElement firstname=driver.findElement(firstname_path);
        WebElement lastname=driver.findElement(lasttname_path);
        WebElement address=driver.findElement(address_path);
        WebElement city=driver.findElement(city_path);
        WebElement state=driver.findElement(state_path);
        WebElement zipcode=driver.findElement(zip_path);
        WebElement phone=driver.findElement(phone_path);

        System.out.println(firstname.getAttribute("value")+'\n'
                +lastname.getAttribute("value")+'\n'
                +address.getAttribute("value")
                +'\n'+city.getAttribute("value")
                +'\n'+state.getAttribute("value")+'\n'+
                zipcode.getAttribute("value")+'\n'+
                phone.getAttribute("value"));



    }



    public void clearIfNotEmpty(WebElement element) {
        String value = element.getAttribute("value");
        if (!value.isEmpty()) {
            element.clear();
        }
    }




    public void update_contact_info(String fn, String ln ,String add ,String ci, String st , String zip , String ph  ){
        WebElement firstname=driver.findElement(firstname_path);
        WebElement lastname=driver.findElement(lasttname_path);
        WebElement address=driver.findElement(address_path);
        WebElement city=driver.findElement(city_path);
        WebElement state=driver.findElement(state_path);
        WebElement zipcode=driver.findElement(zip_path);
        WebElement phone=driver.findElement(phone_path);

        //clear
        clearIfNotEmpty(firstname);
        clearIfNotEmpty(lastname);
        clearIfNotEmpty(address);
        clearIfNotEmpty(city);
        clearIfNotEmpty(state);
        clearIfNotEmpty(zipcode);
        clearIfNotEmpty(phone);

        //send
        firstname.sendKeys(fn);
        lastname.sendKeys(ln);
        address.sendKeys(add);
        city.sendKeys(ci);
        state.sendKeys(st);
        zipcode.sendKeys(zip);
        phone.sendKeys(ph);

    }

    public void submit_updated_date(){
        driver.findElement(update_btn_path).click();


    }


    public void assertion(){
        Wait(driver.findElement(updated_message));
        a_ssert.assertEquals(driver.findElement(updated_message).getText(),"Profile Updated", "Error in update");
        System.out.println(driver.findElement(updated_message).getText());

    }


    //loan

    public void navigate_to_loan(){
        driver.findElement(loan_path).click();
        a_ssert.assertEquals(driver.findElement(By.cssSelector("#requestLoanForm > h1")).getText(),"Apply for a Loan","Error to navigate");
        System.out.println(driver.findElement(By.cssSelector("#requestLoanForm > h1")).getText());

    }

public void submit_data(String la, String dp){
        WebElement loan_a=driver.findElement(loan_amount_path);
        WebElement down_p=driver.findElement(down_payment_path);

        loan_a.sendKeys(la);
        down_p.sendKeys(dp);

}


public void s_dropdown(String acc_num){

    Select dropdown=new Select(driver.findElement(account_dropdown_path));
    dropdown.selectByValue(acc_num);
    a_ssert.assertEquals(dropdown.getAllSelectedOptions(),acc_num,"Error in selection");
    System.out.println(dropdown.getAllSelectedOptions().get(0).getText());
}


public void send(){
        driver.findElement(loan_btn_path).click();
}


public void loan_assert(){
        System.out.println(driver.findElement(loan_message_path).getText());
        a_ssert.assertEquals(driver.findElement(loan_message_path).getText(),"Loan Request Processed","Error in create loan");



}










}
