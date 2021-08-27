package com.shopping.advantage.pages;

import com.shopping.advantage.appium.core.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public void escreverDadosDoLogin(String usuario, String senha){
        escrever(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText"), usuario);
        escrever(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText"), senha);

    }
    public String obterUsuarioLogado(){
        clicar(By.id("com.Advantage.aShopping:id/imageViewMenu") );
        return obterTexto(By.id("com.Advantage.aShopping:id/textViewMenuUser"));
    }

    public void clicarLogar(){
        clicar(By.id("com.Advantage.aShopping:id/buttonLogin"));
    }

    public String verificarMensagemErroLogin(){
        return obterTexto(By.id("com.Advantage.aShopping:id/textViewFailed"));

    }

    public boolean verificarStatusBotao(){
        return botaoHabilitado(By.id("com.Advantage.aShopping:id/buttonLogin"));
    }
}
