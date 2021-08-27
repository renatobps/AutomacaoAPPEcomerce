package com.shopping.advantage.teste;

import com.shopping.advantage.appium.core.BaseTeste;
import com.shopping.advantage.pages.HomePage;
import com.shopping.advantage.pages.LoginPage;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.net.MalformedURLException;


public class LoginTeste extends BaseTeste {


    private HomePage telaHome = new HomePage();
    private LoginPage telaLogin = new LoginPage();

    @Before
    public void inicializarAppium()throws MalformedURLException{
    telaHome.acessarLogin();
    }



    @Test
    public void realizarLogin()throws MalformedURLException{

        telaLogin.escreverDadosDoLogin("renato", "A1234a");
        telaLogin.clicarLogar();

        assertEquals("renato", telaLogin.obterUsuarioLogado());
    }

    @Test
    public void loginUsuarioESenhaIncorretos(){
        telaLogin.escreverDadosDoLogin("andreas", "Qwasss");
        telaLogin.clicarLogar();
        assertEquals("Incorrect user name or password.", telaLogin.verificarMensagemErroLogin());
    }

    @Test
    public void loginFaltandoCampo(){
        telaLogin.escreverDadosDoLogin("", "Qwasss");
        telaLogin.clicarLogar();

        Assert.assertTrue(telaLogin.verificarStatusBotao());
    }


}
