package com.shopping.advantage.teste;

import com.shopping.advantage.appium.core.BaseTeste;
import com.shopping.advantage.pages.CadastroUsuarioPage;
import com.shopping.advantage.pages.HomePage;
import com.shopping.advantage.pages.LoginPage;
import com.shopping.advantage.pages.ProdutoPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class ProdutoTeste extends BaseTeste {
    private HomePage telaHome = new HomePage();
    private ProdutoPage telaCadastro = new ProdutoPage();

    @Before
    public void inicializarAppium()throws MalformedURLException {
        telaHome.acessarBuscarProduto();

    }

    @Test
    public void buscarProduto(){
        telaCadastro.escreverProduto("LAPTOP");
        telaCadastro.clicarBuscar();
        Assert.assertTrue(telaCadastro.obterRetornoPesquisa("LAPTOP"));
    }

    @Test
    public void produtoNaoEncontrado(){

        telaCadastro.escreverProduto("rapadura");
        telaCadastro.clicarBuscar();
        Assert.assertTrue(telaCadastro.obterRetornoPesquisaVazia("- No results for "));
    }


}
