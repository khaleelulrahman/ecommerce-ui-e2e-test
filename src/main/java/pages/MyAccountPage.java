package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountPage {
    private WebDriver driver;
    private By alertMsg=By.cssSelector("p.alert-success");

    public MyAccountPage(WebDriver driver) {
        this.driver=driver;

    }
    public void validateRegisterSuccessMsg(String alertContent)
    {
        Assert.assertEquals(driver.findElement(alertMsg).getText(),alertContent);
        String title= driver.getTitle();
        Assert.assertEquals(title,"My account - My Shop");
       //homework Assert.assertEquals(driver.getTitle()
    }
}
