import org.testng.Assert;
import org.testng.annotations.*;

public class SignInTests extends BaseTests{

    private ProductsPage productsPage;

    @DataProvider
    public Object[][] validCredentials(){
        return new Object[][]{
                {"standard_user", "secret_sauce"}
        };
    }
    @Test(dataProvider = "validCredentials")
    public void testValidCredentials(String username, String password) throws InterruptedException {
        loginPage.setUserNameField(username);
        loginPage.setPasswordField(password);
        productsPage = loginPage.clickLoginButton();
        Assert.assertTrue(productsPage.isProductDivDisplayed(), "Login Failed");
    }

    @DataProvider
    public Object[][] invalidCredentials(){
        return new Object[][]{
                {"kerolos22", "1234"}
        };
    }
    @Test(dataProvider = "invalidCredentials")
    public void testInvalidCredentials(String username, String password) throws InterruptedException {
        loginPage.setUserNameField(username);
        loginPage.setPasswordField(password);
        productsPage = loginPage.clickLoginButton();
        String message = loginPage.getErrorMessage();
        Assert.assertEquals(message, "Epic sadface: Username and password do not match any user in this service", "There is an error");
    }

    @DataProvider
    public Object[][] emptyPassword(){
        return new Object[][]{
                {"kerolos22", ""}
        };
    }
    @Test(dataProvider = "emptyPassword")
    public void emptyPasswordTest(String username, String password) throws InterruptedException {
        loginPage.setUserNameField(username);
        loginPage.setPasswordField(password);
        productsPage = loginPage.clickLoginButton();
        String message = loginPage.getErrorMessage();
        Assert.assertEquals(message, "Epic sadface: Password is required", "There is an error");
    }

    @DataProvider
    public Object[][] emptyUsername(){
        return new Object[][]{
                {"", "1234"}
        };
    }
    @Test(dataProvider = "emptyUsername")
    public void emptyUsernameTest(String username, String password) throws InterruptedException {
        loginPage.setUserNameField(username);
        loginPage.setPasswordField(password);
        productsPage = loginPage.clickLoginButton();
        String message = loginPage.getErrorMessage();
        Assert.assertEquals(message, "Epic sadface: Username is required", "There is an error");
    }

}
