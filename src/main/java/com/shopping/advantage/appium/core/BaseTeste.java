package com.shopping.advantage.appium.core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class BaseTeste {
    @Rule
    public TestName testName = new TestName();

    @AfterClass
    public static void finalizarClasse() {
       DriveFactory.EncerrarDriver();
    }

    @After
    public void tearDown() {
        gerarScreenShot();
       DriveFactory.getDriver().resetApp();
    }

    public void gerarScreenShot(){

        try {
            File imagem = ((TakesScreenshot) DriveFactory.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(imagem, new File("target/screenshots/"+testName.getMethodName()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
