package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.Header;
import pages.HomePage;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    protected Header header;
    @BeforeClass
    public void setup(){
        driver=new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        homePage = new HomePage(driver);
        header=new Header(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
