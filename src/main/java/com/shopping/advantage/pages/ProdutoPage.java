package com.shopping.advantage.pages;

import com.shopping.advantage.appium.core.BasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class ProdutoPage extends BasePage {

     public void escreverProduto(String nomeProduto){
        escrever(By.id("com.Advantage.aShopping:id/editTextSearch"), nomeProduto);
    }
    public void clicarBuscar(){
         clicar(By.id("com.Advantage.aShopping:id/imageViewSearch"));
    }
    public boolean obterRetornoPesquisa(String nomeProduto){
                    return (obterTexto(By.id("com.Advantage.aShopping:id/textViewProductName")).contains(nomeProduto));
    }
    public boolean obterRetornoPesquisaVazia(String mensagen){

         return (obterTexto(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow")).contains(mensagen));
    }

}
