package test.registerUserTest;

import base.BaseTest;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.MyAccountPage;
import pages.RegisterUserPage;

public class RegisterUserTest extends BaseTest {

    @Test
    public void registrationSuccessful() throws InterruptedException {
        Faker faker=new Faker();
        AuthenticationPage authenticationPage=homePage.goToAuthenticationPage();
        RegisterUserPage registerUserPage=authenticationPage.createAccount(faker.internet().emailAddress());
        Thread.sleep(5000);
        MyAccountPage myAccountPage=registerUserPage.personalInformation(faker.name().firstName(),faker.name().lastName(),faker.internet().password());
        Thread.sleep(5000);
        myAccountPage.validateRegisterSuccessMsg("Your account has been created.");
    }
}
