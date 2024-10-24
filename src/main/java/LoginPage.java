import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By userNameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("#login_button_container > div > form > h3");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserNameField(String username){
        driver.findElement(userNameField).sendKeys(username);
    }

    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public ProductsPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new ProductsPage(driver);
    }

    public String getErrorMessage(){
        System.out.println(driver.findElement(errorMessage).getText());
        return driver.findElement(errorMessage).getText();
    }
}
