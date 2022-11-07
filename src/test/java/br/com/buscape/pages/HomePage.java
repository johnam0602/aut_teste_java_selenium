package br.com.buscape.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    private static final By cookiesAceitar
            = new By.ByCssSelector("[data-testid=\"action:understood-button\"]");
    private static final By campoDePesquisa
            = new By.ByCssSelector("[class=\"nav-search-input\"]");

    private static final By campoDePesquisa2
            = new By.ByCssSelector("[class=\"nav-search-input\"]");

    private static final By limparTexto
            = new By.ByCssSelector("[class=\"nav-search-input\"]");

    private static final By lupaDePesquisa
            = new By.ByCssSelector("[class=\"nav-search-btn\"]");

    private static final By validarPage
            = new By.ByCssSelector("[class=\"ui-search-breadcrumb__title shops-custom-primary-font\"]");


    public void setCookiesAceitar(){
        click(cookiesAceitar);}
    public void setCampoDePesquisa2(String geladeira){
        sendKeys(campoDePesquisa2, "geladeira");}

    public void setLimparTexto(){
        limparCampo(limparTexto);}

    public void setEscreverNoCampoDePesquisa(String smartphone){
        sendKeys(campoDePesquisa, "Smartphone");}

    public void setLupaDePesquisa(){
        click(lupaDePesquisa);}

    public String getValidarPage(){
        return lerText(validarPage);}





}
