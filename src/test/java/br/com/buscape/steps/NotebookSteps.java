package br.com.buscape.steps;

import br.com.buscape.pages.NotebookPages;

public class NotebookSteps extends BaseSteps{

    NotebookPages notebookPages = new NotebookPages();

    public void escreverCampo(){
        notebookPages.setEscreverCampo("notebook");}

    public void clickPesquisa(){
        notebookPages.setClickPesquisa();}

    public void getValidarPage(){
        notebookPages.getValidarPage();}

    public void clickFreteGratis(){
        notebookPages.setClickFreteGratis();}

    public void clickMarca(){
        notebookPages.setClickMarca();}

    public void escolherNotebook(){
        notebookPages.setEscolherNotebook();}

    public void adicionarAoCarrinho(){
        notebookPages.setAdicionarAoCarrinho();}



}
