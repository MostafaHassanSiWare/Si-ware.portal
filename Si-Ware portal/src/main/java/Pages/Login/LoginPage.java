package Pages.Login;

import BasePackage.BasePage;
import Utilities.ObjectRepositoryJsonParser;
import Utilities.TimeUtils;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class LoginPage extends BasePage {

    SoftAssert softAssert = new SoftAssert();

    public void validLogin() {
        WebElement usernameTxt = ObjectRepositoryJsonParser.getObjectLocator("$.LoginPage.usernameTxt");
        elementSendKeys(usernameTxt, "superadmin@si-ware.com");
        //usernameTxt.sendKeys("superadmin@si-ware.com");

        WebElement passwordTxt = ObjectRepositoryJsonParser.getObjectLocator("$.LoginPage.passwordTxt");
        elementSendKeys(passwordTxt, "QWEqwe!123");

        WebElement signInBtn = ObjectRepositoryJsonParser.getObjectLocator("$.LoginPage.submitBtn");
        elementClick(signInBtn);
        //SigninBtn.click();
    }

    public void assertLogin() {
        WebElement homeTxt = ObjectRepositoryJsonParser.getObjectLocator("$.HomePage.homeTxt");
        homeTxt.getText();
        elementGetText(homeTxt);
        softAssert.assertEquals("Home".equals(homeTxt), "You are not in the home page");

        TimeUtils.mediumWait();
//        WebElement userTxt = ObjectRepositoryJsonParser.getObjectLocator("$.UserPage.UserTxt");
//        userTxt.getText();
//        elementGetText(userTxt);
//        softAssert.assertEquals("user".equals(userTxt),"You are not in the user page");
        softAssert.assertAll();
    }


}
