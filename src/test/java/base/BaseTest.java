package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setup(){
        driver=new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
