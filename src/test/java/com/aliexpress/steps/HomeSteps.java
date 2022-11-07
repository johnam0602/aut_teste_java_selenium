package com.aliexpress.steps;

import br.com.buscape.pages.NotebookPages;
import br.com.buscape.pages.SmartphonePages;
import com.aliexpress.pages.HomePage;
import com.aliexpress.pages.SmartwatchPage;
import org.junit.Assert;
import org.junit.Test;

public class HomeSteps extends BaseSteps {

    //instâncias
    HomePage homePage = new HomePage();
    SmartwatchPage smartwatchPage = new SmartwatchPage();


    @Test
    public void cenariosDoSite(){
        homePage.setNotifyFechar();
        homePage.setEscreverCampo1();
        homePage.setLimparTexto();
        homePage.setEscreverCampo();
        homePage.setClickPesquisa();
        homePage.getValidarPage();
        smartwatchPage.setClickVerMais();
        smartwatchPage.setClickMarca();
        smartwatchPage.setClickFreteGratis();
        smartwatchPage.setEscolherModelo();


    }



}
