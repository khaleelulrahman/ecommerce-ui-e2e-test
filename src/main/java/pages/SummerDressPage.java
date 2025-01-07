package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SummerDressPage {
    private WebDriver driver;
    private By product=By.xpath("//div[@class='right-block']//child::h5//child::a");

    public SummerDressPage(WebDriver driver) {
        this.driver=driver;
    }
    public void selectProduct(String prd) {
        List<WebElement> products = driver.findElements(product);
        for (WebElement sltProduct : products) {
            if (sltProduct.getText().equals(prd)) {
                sltProduct.click();
            }
        }
    }
        public void selectProductMoreButton(String prd){
        List<WebElement> products = driver.findElements(product);
        for(WebElement sltProduct:products){
            if (sltProduct.getText().equals(prd)){
                Actions actions= new Actions(driver);
                actions.moveToElement(sltProduct).build().perform();
            }
        }

    }
}
