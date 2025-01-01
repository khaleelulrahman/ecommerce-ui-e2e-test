package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By signInButton= By.linkText("Sign in");

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    public AuthenticationPage goToAuthenticationPage()
    {
        driver.findElement(signInButton).click();
        return new AuthenticationPage(driver);
    }
}
