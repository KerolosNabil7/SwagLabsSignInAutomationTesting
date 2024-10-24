import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private WebDriver driver;

    private By productsDiv = By.className("product_label");

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isProductDivDisplayed(){
        return driver.findElement(productsDiv).isDisplayed();
    }
}
