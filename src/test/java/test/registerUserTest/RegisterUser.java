package test.registerUserTest;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AuthenticationPage;

public class RegisterUser extends BaseTest {

    @Test
    public void registrationSuccessful() throws InterruptedException {
        AuthenticationPage authenticationPage=homePage.goToAuthenticationPage();
        authenticationPage.createAccount("khaleel@gmail.com");
        Thread.sleep(5000);
    }
}
