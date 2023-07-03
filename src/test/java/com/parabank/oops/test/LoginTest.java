package com.parabank.oops.test;

import com.parabank.oops.pages.HomePage;
import com.parabank.oops.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    
    @Test
    public void loginWithOutUsernameShouldFail() {
        LoginPage loginPage = page.getInstance(LoginPage.class)
                .doLogin();
        Assert.assertTrue(loginPage.hasLoginFailError());

    }

    @Test(enabled = false)
    public void loginWithUsernameShouldFail() {
        LoginPage loginPage = page.getInstance(LoginPage.class)
                .doLogin("asjdsjkadh");
        Assert.assertTrue(loginPage.hasLoginFailError());

    }

    @Test(enabled = false)
    public void loginShouldSucceed() {
        HomePage homePage = page.getInstance(LoginPage.class)
                .doLogin("automationsession", "automationsession");
        Assert.assertTrue(homePage.isLogoutLink());

    }

    @Test(enabled = false)
    public void printAllUrl() {
        page.getInstance(LoginPage.class)
                .printAllUrl();
    }

}
