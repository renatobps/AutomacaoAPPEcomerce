package com.shopping.advantage.pages;

import com.shopping.advantage.appium.core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public void acessarLogin(){
       clicar(By.id("com.Advantage.aShopping:id/imageViewMenu"));
        clicar(By.id("com.Advantage.aShopping:id/textViewMenuUser"));
    }

    public void acessarTelaCadastro(){
        clicar(By.id("com.Advantage.aShopping:id/imageViewMenu"));
        clicar(By.id("com.Advantage.aShopping:id/textViewMenuUser"));
        clicar(By.id("com.Advantage.aShopping:id/textViewSingUpToday"));
    }
    public void acessarBuscarProduto(){
        clicar(By.id("com.Advantage.aShopping:id/editTextSearch"));
    }

}


