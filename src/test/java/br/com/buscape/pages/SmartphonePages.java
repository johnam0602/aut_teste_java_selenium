package br.com.buscape.pages;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.openqa.selenium.By;

public class SmartphonePages extends BasePage{

    private static final By clickFecharAnuncio
            = new By.ByCssSelector("[class=\"andes-tooltip-button-close\"]");


    private static final By ativarFreteGratis
            = new By.ByCssSelector("[id=\"shipping_cost_highlighted\"]");

    private static final By escolherCelular
            = new By.ByCssSelector("#root-app > div > div.ui-search-main.ui-search-main--exhibitor.ui-search-main--" +
            "with-topkeywords.shops__search-main > section > ol > li:nth-child(1) > div > div > " +
            "div.ui-search-result__image.shops__picturesStyles > a > div > div > div > div > div > img");


    public void setClickFecharAnuncio(){
        click(clickFecharAnuncio);}


    public void setAtivarFreteGratis(){
        click(ativarFreteGratis);}

    public void setEscolherCelular(){
        click(escolherCelular);}



}
