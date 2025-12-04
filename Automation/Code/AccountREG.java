import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AccountREG {

    @Test
    public static void login( ) {
        WebDriver drive = new ChromeDriver() ;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yucef\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        drive.manage().window().maximize();
        drive.get("https://parabank.parasoft.com/parabank/index.htm");

        By username_loc_path = By.xpath("//input[@name=\'username\']");//paste the link for the xpath selected
        By loginBtn = By.xpath("//input[@type='submit']");
        By password_bar = By.xpath("//input[@type='password']");

        WebElement word = drive.findElement(username_loc_path);
        WebElement btn = drive.findElement(loginBtn);
        WebElement passwordpar = drive.findElement(password_bar);
        word.sendKeys("lightss");
        passwordpar.sendKeys("123");
        btn.click();
    }

    @Test
    public static void goToHistoryID(){

        WebDriver drive = new ChromeDriver() ;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yucef\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        drive.manage().window().maximize();
        drive.get("https://parabank.parasoft.com/parabank/index.htm");

        By username_loc_path = By.xpath("//input[@name=\'username\']");//paste the link for the xpath selected
        By loginBtn = By.xpath("//input[@type='submit']");
        By password_bar = By.xpath("//input[@type='password']");

        WebElement word = drive.findElement(username_loc_path);
        WebElement btn = drive.findElement(loginBtn);
        WebElement passwordpar = drive.findElement(password_bar);
        word.sendKeys("lightss");
        passwordpar.sendKeys("123");
        btn.click();



        By transferHistoryL = By.xpath("//a[contains(text(),'Find Transactions')]");
        WebElement transferHistorybtn = drive.findElement(transferHistoryL);
        transferHistorybtn.click();


        //ID
        By transferfunds_IDh = By.xpath("//input[@id='transactionId']");
        By transferfunds_IDbh = By.xpath("//button[@id='findById']");
        WebElement transferfunds_IDH = drive.findElement(transferfunds_IDh);
        WebElement transferfunds_IDBH = drive.findElement(transferfunds_IDbh);


        //the amount changes based on what the correct value is
        transferfunds_IDH.sendKeys("13445");
        transferfunds_IDBH.click();



    }




    @Test
    public static void goToHistoryAmount() throws InterruptedException{

        WebDriver drive = new ChromeDriver() ;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yucef\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        drive.manage().window().maximize();
        drive.get("https://parabank.parasoft.com/parabank/index.htm");

        By username_loc_path = By.xpath("//input[@name=\'username\']");//paste the link for the xpath selected
        By loginBtn = By.xpath("//input[@type='submit']");
        By password_bar = By.xpath("//input[@type='password']");

        WebElement word = drive.findElement(username_loc_path);
        WebElement btn = drive.findElement(loginBtn);
        WebElement passwordpar = drive.findElement(password_bar);
        word.sendKeys("lightss");
        passwordpar.sendKeys("123");
        btn.click();



        By transferHistoryL = By.xpath("//a[contains(text(),'Find Transactions')]");
        WebElement transferHistorybtn = drive.findElement(transferHistoryL);
        transferHistorybtn.click();


        //Amount
        By transferfunds_Amounth = By.xpath("//input[@id='amount']");
        By transferfunds_Amountb = By.xpath("//button[@id='findByAmount']");

        WebElement transferfunds_AmountH = drive.findElement(transferfunds_Amounth);
        WebElement transferfunds_AmountB = drive.findElement(transferfunds_Amountb);

        transferfunds_AmountH.sendKeys("0");
        Thread.sleep(3000);

        transferfunds_AmountB.click();



    }



    @Test
    public static void goToHistoryDate() throws InterruptedException  {

        WebDriver drive = new ChromeDriver() ;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yucef\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        drive.manage().window().maximize();
        drive.get("https://parabank.parasoft.com/parabank/index.htm");

        By username_loc_path = By.xpath("//input[@name=\'username\']");//paste the link for the xpath selected
        By loginBtn = By.xpath("//input[@type='submit']");
        By password_bar = By.xpath("//input[@type='password']");

        WebElement word = drive.findElement(username_loc_path);
        WebElement btn = drive.findElement(loginBtn);
        WebElement passwordpar = drive.findElement(password_bar);
        word.sendKeys("lightss");
        passwordpar.sendKeys("123");
        btn.click();



        By transferHistoryL = By.xpath("//a[contains(text(),'Find Transactions')]");
        WebElement transferHistorybtn = drive.findElement(transferHistoryL);
        transferHistorybtn.click();

        Thread.sleep(3000);

        //date
        By transferfunds_Dateh = By.xpath("//input[@id='transactionDate']");
        By transferfunds_Datebh = By.xpath("//button[@id='findByDate']");

        WebElement transferfunds_DateH = drive.findElement(transferfunds_Dateh);
        WebElement transferfunds_DateBH = drive.findElement(transferfunds_Datebh);

        transferfunds_DateH.sendKeys("11-11-2024");
        transferfunds_DateBH.click();



    }






    public static void main ( String[] args) throws InterruptedException {
       // AccountREG functions = new AccountREG();
        WebDriver drive = new ChromeDriver() ;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yucef\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        drive.manage().window().maximize();
        drive.get("https://parabank.parasoft.com/parabank/index.htm");


        // LOGIN
        By username_loc_path = By.xpath("//input[@name=\'username\']");//paste the link for the xpath selected
        By loginBtn = By.xpath("//input[@type='submit']");
        By password_bar = By.xpath("//input[@type='password']");

        WebElement word = drive.findElement(username_loc_path);
        WebElement btn = drive.findElement(loginBtn);
        WebElement passwordpar = drive.findElement(password_bar);
        word.sendKeys("lightss");
        passwordpar.sendKeys("123");
        btn.click();



        Thread.sleep(500);

        //goes into TRANSFER FUNDS
        By transferfunds = By.xpath("//a[contains(text(),'Transfer Funds')]");
        WebElement transferFUNDS = drive.findElement(transferfunds);
        transferFUNDS.click();

        By transferfunds_amount = By.xpath("//input[@id ='amount']");
        WebElement transfunds_Amount = drive.findElement(transferfunds_amount);
        transfunds_Amount.sendKeys("100",Keys.ENTER);








        Thread.sleep(500);

        //GOES INTO HISOTRY
//        By transferHistoryL = By.xpath("//a[contains(text(),'Find Transactions')]");
//        WebElement transferHistorybtn = drive.findElement(transferHistoryL);
//        transferHistorybtn.click();
//        Thread.sleep(3000);













        /*

        {
            Thread.sleep(2000);
            By transferfunds_IDh = By.xpath("//input[@id='transactionId']");
            By transferfunds_IDbh = By.xpath("//button[@id='findById']");
            WebElement transferfunds_IDH = drive.findElement(transferfunds_IDh);
            WebElement transferfunds_IDBH = drive.findElement(transferfunds_IDbh);


            //the amount changes based on what the correct value is
            transferfunds_IDH.sendKeys("13445");
            transferfunds_IDBH.click();
        }// code here fails no matter what need to know how to make it in parts '_'


        {
            Thread.sleep(2000);
            By transferfunds_Dateh = By.xpath("//input[@id='transactionDate']");
            By transferfunds_Datebh = By.xpath("//button[@id='findByDate']");

            WebElement transferfunds_DateH = drive.findElement(transferfunds_Dateh);
            WebElement transferfunds_DateBH = drive.findElement(transferfunds_Dateh);

            transferfunds_DateH.sendKeys("11-11-2024");
            transferfunds_DateBH.click();

        }


        {
            Thread.sleep(2000);
            By transferfunds_FromDateh = By.xpath("//input[@id='fromDate']");
            By transferfunds_ToDateh = By.xpath("//input[@id='toDate']") ;
            By transferfunds_ByDateb = By.xpath("//button[@id='findByDateRange']");

            WebElement transferfunds_FromDateH = drive.findElement(transferfunds_FromDateh);
            WebElement transferfunds_TodateH = drive.findElement(transferfunds_ToDateh);
            WebElement transferfunds_ByDateB = drive.findElement(transferfunds_ByDateb);

            transferfunds_FromDateH.sendKeys("11-11-2024");
            transferfunds_TodateH.sendKeys("11-11-2025");
            transferfunds_ByDateB.click();
        }
        */

        {
            Thread.sleep(2000);
            By transferfunds_Amounth = By.xpath("//input[@id='amount']");
            By transferfunds_Amountb = By.xpath("//button[@id='findByAmount']");

            WebElement transferfunds_AmountH = drive.findElement(transferfunds_Amounth);
            WebElement transferfunds_AmountB = drive.findElement(transferfunds_Amountb);

            transferfunds_AmountH.sendKeys("100");
            transferfunds_AmountB.click();
        }








        Thread.sleep(4000);
        drive.close();




    }
}
