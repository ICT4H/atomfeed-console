package org.ict4h.controller;

import org.ict4h.AtomfeedConsoleApplication;
import org.ict4h.controllers.AppController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AtomfeedConsoleApplication.class)
public class AppStatusControllerTest {

    @Autowired
    private AppController appController;

    @Test
    public void shouldRetrieveConfig() {
        List<String> appDetails = appController.getAppDetails();
        assertThat(appDetails.size(), is((equalTo(1))));
        String appConfig = appDetails.get(0);
        assertThat(appConfig, is(equalTo("testApp")));
    }
}