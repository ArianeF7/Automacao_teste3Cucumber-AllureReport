package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.Report;

import static org.junit.Assert.assertEquals;

public class CriarMovimentacao {

    @FindBy(id="tipo")
    private WebElement selectTipo;
    @FindBy(id="data_transacao")
    private WebElement txtData;
    @FindBy(id="data_pagamento")
    private WebElement txtDataPgto;
    @FindBy(id="descricao")
    private WebElement txtDescricao;
    @FindBy(id="interessado")
    private WebElement txtInteressado;
    @FindBy(id="valor")
    private WebElement txtValor;
    @FindBy(id="conta")
    private WebElement selectConta;
    @FindBy(id="status_pago")
    private WebElement radioSituacao;
    @FindBy(className = "btn-primary")
    private WebElement btnSalvar;

    @FindBy(className = "alert-success")
    private WebElement alertConfirmacao;



    public void CriarMovimentacao(){

        selectTipo.sendKeys("Despesa");
        txtData.sendKeys("10/04/2020");
        txtDataPgto.sendKeys("10/05/2020");
        txtDescricao.sendKeys("Aluguel do Apto 01");
        txtInteressado.sendKeys("Seu Barriga");
        txtValor.sendKeys("5000.00");
        selectConta.sendKeys("Ariane Banco 2");
        radioSituacao.click();
        Report.takeScreenshot();
        btnSalvar.click();
    }

    public void ConfirmaMovimentacao(){
        Report.takeScreenshot();
        String validaMovimentacao = alertConfirmacao.getText();
        assertEquals("Movimentação adicionada com sucesso!",validaMovimentacao);
    }
}
