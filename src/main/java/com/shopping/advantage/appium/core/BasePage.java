package com.shopping.advantage.appium.core;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

import static com.shopping.advantage.appium.core.DriveFactory.getDriver;

public class BasePage {

    public void escrever(By by, String texto){
        getDriver().findElement(by).sendKeys(texto);

    }

    public String obterTexto(By by){
        return getDriver().findElement(by).getText();
    }

    public void selecionarCombo(By by, String valor){
        getDriver().findElement(by).click();
        getDriver().findElement(By.xpath("/android.widget.CheckedTextView[@text='"+valor+"'")).click();
    }
    public void clicar(By by){
        getDriver().findElement(by).click();

    }

    public void clicarPorTexto(String texto){
        clicar(By.xpath("//*[@text='"+texto+"'"));

    }

    public boolean checkEstaMarcado(By by){
        return getDriver().findElement(by).getAttribute("checked").equals("true");

    }
      public void scroll(double inicio, double fim){
        Dimension size = getDriver().manage().window().getSize();
        int x = (int) (size.width / 2.1);

        int start_y = (int) (size.height * inicio);
        int end_y = (int) (size.height * fim);

        new TouchAction(getDriver())
                .press(PointOption.point(x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(x, end_y))
                .release()
                .perform();
    }
public void swipe(int start_x, int start_y, int end_x, int end_y ){

    new TouchAction(getDriver())
            .press(PointOption.point(start_x,start_y))
            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
            .moveTo(PointOption.point(end_x, end_y))
            .release()
            .perform();

}


    public void rolarParaCima(){
        scroll(0.9, 0.1);
    }
    public void rolarParaBaixo(){
        scroll(0.1, 0.9);
    }

    public void tap(int x, int y){
        new TouchAction(getDriver()).tap(PointOption.point(x,y)).perform();
    }

    public boolean botaoHabilitado(By by){
        return getDriver().findElement(by).getAttribute("enabled").equals("false");
    }
}

