package com.telran;

import com.sun.deploy.association.utility.AppAssociationWriter;
import com.telran.config.BaseTest;
import com.telran.model.Credentials;
import com.telran.pageobject.SplashScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test
    public void loginTest() {
        boolean isFabPresent = new SplashScreen(driver).checkVersion("0.0.3")
                .fillEmail("yilkj@mail.com").fillPassword("1234545Bd").clickLogin()
                .skipWizard().isFabButton();

        Assert.assertTrue(isFabPresent);


    }

    @Test
    public void loginComplexTest() {

    }
}
