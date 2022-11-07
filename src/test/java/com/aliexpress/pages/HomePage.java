package com.aliexpress.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static final By notifyFechar
            = new By.ByCssSelector("[class=\"_24EHh\"]");

    private static final By escreverCampo1
            = new By.ByCssSelector("[name=\"SearchText\"]");

    private static final By limparTexto
            = new By.ByCssSelector("[name=\"SearchText\"]");

    private static final By escreverCampo
            = new By.ByCssSelector("[name=\"SearchText\"]");

    private static final By clickPesquisa
            = new By.ByCssSelector("[class=\"search-button\"]");

    private static final By validarPage
            = new By.ByCssSelector("[class=\"next-breadcrumb-text activated\"]");



    public void setNotifyFechar(){
        click(notifyFechar);}

    public void setEscreverCampo1(){
        sendKeys(escreverCampo1, "ventiladorrrrrr");}

    public void setLimparTexto(){
        limparCampo(limparTexto);}

    public void setEscreverCampo(){
        sendKeys(escreverCampo, "smartwatch");}

    public void setClickPesquisa(){
        click(clickPesquisa);}

    public String getValidarPage(){
        return lerText(validarPage);}






}
