package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {
    private WebDriver driver;
    private By emailTextBox= By.id("email_create");
    private By createActBtn= By.id("SubmitCreate");
    public AuthenticationPage(WebDriver driver)
    {
        this.driver=driver;
    }
public  RegisterUserPage createAccount(String emailId){
    driver.findElement(emailTextBox).sendKeys(emailId);
    driver.findElement(createActBtn).click();
    return new RegisterUserPage(driver);
}
}

