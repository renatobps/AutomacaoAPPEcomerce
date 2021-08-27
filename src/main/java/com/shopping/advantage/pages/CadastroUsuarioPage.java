package com.shopping.advantage.pages;

import com.shopping.advantage.appium.core.BasePage;
import com.shopping.advantage.appium.core.DriveFactory;
import org.openqa.selenium.By;

public class CadastroUsuarioPage extends BasePage {

    public void escreverDadosDoLogin(String nomeUsuario, String emailUsuario, String senhaUsuario, String confirmaSenhaUsuario) {
        escrever(By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"), nomeUsuario);
        escrever(By.xpath("//android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"), emailUsuario);
        escrever(By.xpath("//android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"), senhaUsuario);
        escrever(By.xpath("//android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"), confirmaSenhaUsuario);
        swipe(496, 1379, 500, 878);

    }

    public void escreverDadosDoUsuario(String primeiroNome, String sobrenome) {
        escrever(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText"), primeiroNome);
        escrever(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText"), sobrenome);
        // escrever(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"), telefone);
        swipe(496, 1616, 474, 878);

    }

    public void escreverEnderecoDoUsuario(String estado, String endereco, String cidade, String cep) {
        // clicar(By.id("com.Advantage.aShopping:id/textViewCountries"));
        //clicar(By.id("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[9]"));
        escrever(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"), estado);
        escrever(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"), endereco);
        escrever(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText"), cidade);
        escrever(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText"), cep);

        swipe(492, 1616, 474, 878);

    }

    public void clicarCampoDadosDeCadastro() {
        clicar(By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"));
        DriveFactory.getDriver().hideKeyboard();
        clicar(By.xpath("//android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
        DriveFactory.getDriver().hideKeyboard();
        clicar(By.xpath("//android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));
        DriveFactory.getDriver().hideKeyboard();
        clicar(By.xpath("//android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
        DriveFactory.getDriver().hideKeyboard();

    }

    public void escreverComCaracterFaltando(String nomeUsuario, String emailUsuario, String senhaUsuario, String confirmaSenha) {
        escrever(By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"), nomeUsuario);
        clicar(By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"));
        DriveFactory.getDriver().hideKeyboard();
        escrever(By.xpath("//android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"), emailUsuario);
        clicar(By.xpath("//android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
        DriveFactory.getDriver().hideKeyboard();
        escrever(By.xpath("//android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"), senhaUsuario);
        clicar(By.xpath("//android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));
        DriveFactory.getDriver().hideKeyboard();

        escrever(By.xpath("//android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"), confirmaSenha);
        clicar(By.xpath("//android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
        DriveFactory.getDriver().hideKeyboard();

        clicar(By.xpath("//android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));
        DriveFactory.getDriver().hideKeyboard();

    }

    public void clicarRegistrar() {
        clicar(By.id("com.Advantage.aShopping:id/buttonRegister"));
    }

    public boolean aceitarTermoMarcado() {
        return checkEstaMarcado(By.id("com.Advantage.aShopping:id/checkBoxAgreeConditions"));
    }

    public boolean receberOfertaMarcado() {
        return checkEstaMarcado(By.id("com.Advantage.aShopping:id/checkBoxRecieveOffers"));
    }

    public void rejeitarTermo() {
        clicar(By.id("com.Advantage.aShopping:id/checkBoxAgreeConditions"));
    }

    public boolean botaoRegistrarDesabilitado() {
        return botaoHabilitado(By.id("com.Advantage.aShopping:id/buttonRegister"));
    }

    public String obterTextoMessagemAlertaNomeUsuarioFaltando() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='User name required']"));
    }

    public String obterTextoMessagemAlertaEmailUsuarioFaltando() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Email required']"));
    }

    public String obterTextoMessagemAlertaSenhaUsuarioFaltando() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Password required']"));
    }

    public String obterTextoMessagemAlertaCOnfirmaSenhaUsuario() {
        return obterTexto(By.xpath("//android.widget.TextView[@text='Confirm password required']"));
    }


    public String obterTextoMessagemAlertaQtdCaracterNomeUsuario() {
        return obterTexto(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView"));
    }

    public String obterTextoMessagemAlertaFormatoEmailUsuario() {
        return obterTexto(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView"));
    }

    public String obterTextoMessagemAlertaQtdCaracterSenhaUsuario() {
        return obterTexto(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView"));
    }

    public String obterTextoMessagemAlertaConfirmaSenhaUsuario() {
        return obterTexto(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView"));
    }

}
