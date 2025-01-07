package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUserPage {
    private WebDriver driver;
    private By title= By.id("id_gender1");
    private By firstName= By.id("customer_firstname");
    private By lastName=By.id("customer_lastname");
    private By passWord=By.id("passwd");
    private By date=By.id("days");
    private By months=By.id("months");
    private By years=By.id("years");
    private By newsLetterCheckBox=By.id("newsletter");
    private By submitButton=By.id("submitAccount");


    public RegisterUserPage(WebDriver driver) {
        this.driver=driver;
    }

    public MyAccountPage personalInformation(String firstname,String Lastname, String Password)
    {
        driver.findElement(title).click();
        driver.findElement(firstName).sendKeys(firstname);
        driver.findElement(lastName).sendKeys(Lastname);
        driver.findElement(passWord).sendKeys(Password);
        Select dates=new Select(driver.findElement(date));
        dates.selectByValue("14");
        Select Month=new Select(driver.findElement(months));
        Month.selectByVisibleText("January ");
        Select Year=new Select(driver.findElement(years));
        Year.selectByValue("1973");
        driver.findElement(newsLetterCheckBox).click();
        driver.findElement(submitButton).click();
        return new MyAccountPage(driver);
    }
}
