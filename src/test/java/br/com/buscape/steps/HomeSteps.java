package br.com.buscape.steps;

import br.com.buscape.pages.HomePage;
import br.com.buscape.pages.NotebookPages;
import br.com.buscape.pages.SmartphonePages;
import org.junit.Assert;
import org.junit.Test;

public class HomeSteps extends BaseSteps{

    //instâncias
    HomePage homePage = new HomePage();
    SmartphonePages smartphonePages = new SmartphonePages();

    NotebookPages notebookPages = new NotebookPages();

    @Test
    public void pesquisarNoCampoDePesquisa(){
        homePage.setCookiesAceitar();
        homePage.setCampoDePesquisa2("geladeira");
        homePage.setLimparTexto();
        homePage.setEscreverNoCampoDePesquisa("Smartphone");
        homePage.setLupaDePesquisa();
        Assert.assertEquals("Smartphone", homePage.getValidarPage());
        smartphonePages.setClickFecharAnuncio();
        smartphonePages.setAtivarFreteGratis();
        smartphonePages.setEscolherCelular();
        notebookPages.setEscreverCampo("notebook");
        notebookPages.setClickPesquisa();
        notebookPages.getValidarPage();
        notebookPages.setClickFreteGratis();
        notebookPages.setClickMarca();
        notebookPages.setEscolherNotebook();
        notebookPages.setAdicionarAoCarrinho();


    }



}
