package Pages.Login;

import BasePackage.BasePage;
import Utilities.ObjectRepositoryJsonParser;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public void validLogin(){
        WebElement usernameTxt = ObjectRepositoryJsonParser.getObjectLocator("$.LoginPage.usernameTxt");
        elementSendKeys(usernameTxt,"superadmin@si-ware.com");
        //usernameTxt.sendKeys("superadmin@si-ware.com");

        WebElement passwordTxt = ObjectRepositoryJsonParser.getObjectLocator("$.LoginPage.passwordTxt");
        elementSendKeys(passwordTxt,"QWEqwe!123");

        WebElement signInBtn = ObjectRepositoryJsonParser.getObjectLocator("$.LoginPage.submitBtn");
        elementClick(signInBtn);
        //SigninBtn.click();
    }


}
