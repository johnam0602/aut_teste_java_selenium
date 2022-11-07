package com.aliexpress.steps;

import com.aliexpress.pages.SmartwatchPage;

public class SmartwatchSteps extends BaseSteps{


    SmartwatchPage smartwatchPage = new SmartwatchPage();

    public void clickVerMais(){
        smartwatchPage.setClickVerMais();}

    public void clickMarca(){
        smartwatchPage.setClickMarca();}

    public void clickFrete(){
        smartwatchPage.setClickFreteGratis();}

    public void clickModelo(){
        smartwatchPage.setEscolherModelo();}




}
