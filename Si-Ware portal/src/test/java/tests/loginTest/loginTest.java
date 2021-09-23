package tests.loginTest;

import BasePackage.BaseTest;
import Pages.Login.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginTest extends BaseTest {
    private static LoginPage loginPage;

    @BeforeTest
    public void initialization() {
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void validLogin() {
        loginPage.validLogin();
    }

    @Test(priority = 2)
    public void assertLogin() {
        loginPage.assertLogin();
    }
}
