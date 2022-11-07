package br.com.buscape.pages;

import org.openqa.selenium.By;

public class NotebookPages extends BasePage{

    //Instâncias
    private static final By escreverCampo
            = new By.ByCssSelector("[placeholder=\"Buscar produtos, marcas e muito mais…\"]");

    private static final By clickPesquisa
            = new By.ByCssSelector("[aria-label=\"Buscar\"]");

    private static final By validarPage
            = new By.ByCssSelector("[class=\"ui-search-breadcrumb__title shops-custom-primary-font\"]");

    private static final By clickFreteGratis
            = new By.ByCssSelector("[id=\"shipping_cost_highlighted\"]");

    private static final By clickMarca
            = new By.ByCssSelector("#root-app > div > div.ui-search-main.ui-search-main--exhibitor.ui-search-main--" +
            "with-topkeywords.shops__search-main > aside > section > div:nth-child(6) > ul > li:nth-child(1) > a");

    private static final By escolherNotebook
            = new By.ByCssSelector("#root-app > div > div.ui-search-main.ui-search-main--exhibitor.ui-search-main--" +
            "only-products.ui-search-main--with-topkeywords.shops__search-main > section > ol:nth-child(8) > " +
            "li:nth-child(2) > div > div > a > div > div.ui-search-item__group.ui-search-item__group--" +
            "title.shops__items-group > h2");

    private static final By adicionarAoCarrinho
            =new By.ByCssSelector("[class=\"andes-button andes-spinner__icon-base andes-button--quiet\"]");


    public void setEscreverCampo(String notebook){
        sendKeys(escreverCampo, "notebook");}

    public void setClickPesquisa(){
        click(clickPesquisa);}

    public String getValidarPage(){
        return lerText(validarPage);}

    public void setClickFreteGratis(){
        click(clickFreteGratis);}

    public void setClickMarca(){
        click(clickMarca);}

    public void setEscolherNotebook(){
        click(escolherNotebook);}

    public void setAdicionarAoCarrinho(){
        click(adicionarAoCarrinho);}


}
