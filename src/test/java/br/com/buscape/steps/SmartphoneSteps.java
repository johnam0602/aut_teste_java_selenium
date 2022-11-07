package br.com.buscape.steps;

import br.com.buscape.pages.SmartphonePages;
import org.junit.Test;

public class SmartphoneSteps extends BaseSteps{

    //Instâncias

    SmartphonePages smartphonePages = new SmartphonePages();

    public void clickFecharAnuncio(){
        smartphonePages.setClickFecharAnuncio();}


    public void ativarFiltroGratis(){
        smartphonePages.setAtivarFreteGratis();}

    public void escolherCelular(){
        smartphonePages.setEscolherCelular();}





}
