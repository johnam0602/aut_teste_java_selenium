package com.aliexpress.pages;

import org.openqa.selenium.By;

public class SmartwatchPage extends BasePage{

    public static final By clickVerMais
            = new By.ByCssSelector("[ae_object_value=\"Ver mais\"]:nth-child(2)");

    public static final By clickMarca
            = new By.ByCssSelector("[src=\"//ae01.alicdn.com/kf/H70233541d6d6498a828025c9dca7808bi.jpg_q90." +
            "jpg_.webp\"]");

    public static final By clickFreteGratis
            = new By.ByCssSelector("#root > div > div > div.main-content > div.right-menu > div > div.top-container " +
            "> div.top-refine > div.first > span.feature-wrap > span:nth-child(2) > label > span.next-checkbox > " +
            "input");


    public static final By escolherModelo
            = new By.ByCssSelector("[src=\"//ae01.alicdn.com/kf/S98388da74a4946e9b0b143e765c7ec93j/" +
            "Xiaomi-X8-Smart-Watch-For-Men-Women-Waterproof-Fitness-Sports-HD-Touchscreen-Tracker-" +
            "Sleep-Bluetooth-Call.jpg_220x220xz.jpg_.webp\"]");







    public void setClickVerMais(){
        click(clickVerMais);}


    public void setClickMarca(){
        click(clickMarca);}

    public void setClickFreteGratis(){
        click(clickFreteGratis);}

    public void setEscolherModelo(){
        click(escolherModelo);}





}
