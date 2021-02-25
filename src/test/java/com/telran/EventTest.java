package com.telran;

import com.telran.config.BaseTest;
import com.telran.model.Credentials;
import com.telran.model.Event;
import com.telran.pageobject.SplashScreen;
import org.testng.annotations.Test;

public class EventTest extends BaseTest {

    @Test
    public void eventCreationTest()  {
        new SplashScreen(driver).checkVersion("0.0.3")
                .fillEmail("yilkj@mail.com").fillPassword("1234545Bd").clickLogin()
                .skipWizard().cheekFab()
        .initCreationNew().fillCreationForm(Event.builder().title("new")
                .type("newCreation").breaks(2).ammount(50).build()).confirmCreation().cheekFab();


    }
}
