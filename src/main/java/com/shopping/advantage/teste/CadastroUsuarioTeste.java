package com.shopping.advantage.teste;

import com.shopping.advantage.appium.core.BaseTeste;
import com.shopping.advantage.pages.CadastroUsuarioPage;
import com.shopping.advantage.pages.HomePage;
import com.shopping.advantage.pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class CadastroUsuarioTeste extends BaseTeste {

    private HomePage telaHome = new HomePage();
    private LoginPage telaLogin = new LoginPage();
    private CadastroUsuarioPage telaCadastro = new CadastroUsuarioPage();


    @Before
    public void inicializarAppium() throws MalformedURLException {
        telaHome.acessarTelaCadastro();
    }

    @Test
    public void cadastroDeUsuarioComSucesso() {
        telaCadastro.escreverDadosDoLogin("pedrosq", "olivermb1555@email.com", "A1234a", "A1234a");
        telaCadastro.rolarParaCima();
        telaCadastro.receberOfertaMarcado();
        telaCadastro.aceitarTermoMarcado();
        telaCadastro.clicarRegistrar();

        Assert.assertEquals("pedrosq", telaLogin.obterUsuarioLogado());
    }

    @Test
    public void cadastroDadosUsuarioComSucesso() {
        telaCadastro.escreverDadosDoLogin("pedrosq", "olivermb456@email.com", "A1234a", "A1234a");
        telaCadastro.escreverDadosDoUsuario("Hellena", "Bento");
        telaCadastro.escreverEnderecoDoUsuario("BA", "qr 400", "buenos Aires", "72500-000");
        telaCadastro.clicarRegistrar();

        Assert.assertEquals("pedrosq", telaLogin.obterUsuarioLogado());
    }

    @Test
    public void cadastrarDeUsuarioSemAceiteTermo() {
        telaCadastro.escreverDadosDoLogin("pedrosq1", "hellenalismb9882@email.com", "A1234a", "A1234a");
        telaCadastro.rolarParaCima();
        telaCadastro.rejeitarTermo();

        Assert.assertTrue(telaCadastro.botaoRegistrarDesabilitado());
    }

    @Test
    public void cadastroUsuarioCampoUsuarioObrigatorio() {
        telaCadastro.clicarCampoDadosDeCadastro();

        Assert.assertEquals("User name required", telaCadastro.obterTextoMessagemAlertaNomeUsuarioFaltando());
        Assert.assertEquals("Email required", telaCadastro.obterTextoMessagemAlertaEmailUsuarioFaltando());
        Assert.assertEquals("Password required", telaCadastro.obterTextoMessagemAlertaSenhaUsuarioFaltando());
        Assert.assertEquals("Confirm password required", telaCadastro.obterTextoMessagemAlertaCOnfirmaSenhaUsuario());
    }

    @Test
    public void mensagemAlertaDosCampos() {
        telaCadastro.escreverComCaracterFaltando("ren", "ren@", "123", "123");

        Assert.assertEquals("Use 5 characters or longer", telaCadastro.obterTextoMessagemAlertaQtdCaracterNomeUsuario());
        Assert.assertEquals("Your email isn’t formatted correctly", telaCadastro.obterTextoMessagemAlertaFormatoEmailUsuario());
        Assert.assertEquals("Use 4 characters or longer", telaCadastro.obterTextoMessagemAlertaQtdCaracterSenhaUsuario());

        telaCadastro.rolarParaCima();
        Assert.assertTrue(telaCadastro.botaoRegistrarDesabilitado());
    }

    @Test
    public void mensagemAlertaSenhaNumeroFaltando(){
        telaCadastro.escreverComCaracterFaltando("marcos", "marcos@email.com", "Abcd", "Abcd" );
        Assert.assertEquals("1 number required", telaCadastro.obterTextoMessagemAlertaQtdCaracterSenhaUsuario());

    }
    @Test
    public void mensagemAlertaSenhaLetraMaiusculaFaltando(){
        telaCadastro.escreverComCaracterFaltando("marcos", "marcos@email.com", "abcd1", "abcd1" );
        Assert.assertEquals("1 upper letter required", telaCadastro.obterTextoMessagemAlertaQtdCaracterSenhaUsuario());

    }
    @Test
    public void mensagemAlertaSenhaLetraMinusculaFaltando(){
        telaCadastro.escreverComCaracterFaltando("marcos", "marcos@email.com", "ABCD1", "ABCD1" );

        Assert.assertEquals("1 lower letter required", telaCadastro.obterTextoMessagemAlertaQtdCaracterSenhaUsuario());
    }

    @Test
    public void mensagemAlertaSenhasNaoConferem(){
        telaCadastro.escreverComCaracterFaltando("marcos", "marcos@email.com", "A1234a", "A1234b" );
        Assert.assertEquals("Passwords do not match", telaCadastro.obterTextoMessagemAlertaConfirmaSenhaUsuario());

    }

}
