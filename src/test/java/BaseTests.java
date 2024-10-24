import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTests {
    protected WebDriver driver;
    protected LoginPage loginPage;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024,768));
        goToLoginPage();
        loginPage = new LoginPage(driver);
        System.out.println("Chrome SetUp & Amazon open");
    }

    @BeforeMethod
    public void goToLoginPage(){
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
        System.out.println("Chrome close");
    }
}
