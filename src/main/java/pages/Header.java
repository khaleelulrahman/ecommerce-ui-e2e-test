package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class Header {
    private WebDriver driver;
    private By Women=By.xpath("//a[@title='Women']");
    private By summerDressess=By.xpath("(//a[text()='Summer Dresses'])[1]");

    public Header(WebDriver driver)
    {
        this.driver=driver;
    }
    public SummerDressPage goToSummerDressesesSection() throws InterruptedException {
        Thread.sleep(5000);
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(Women)).build().perform();
        Thread.sleep(5000);
        driver.findElement(summerDressess).click();
        return new SummerDressPage(driver);
    }
}
