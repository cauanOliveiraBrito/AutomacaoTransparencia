package com.mprj.transparencia.automation.page;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import java.util.ArrayList;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;


public class ExecucaoOrcamentariaFinanceiraPage {

	private ConteudoPageAutomacao ConteudoPageAutomacao;
	
	private SelenideElement CreditoOrcamentarioReceitasProprias = $(By.xpath("//*[@id=\"navegador\"]/ul/li[1]/div/a")),
			Fundos = $("#navegador > ul > li:nth-child(2) > div > a"),
			DetalhamentoDespesas = $("#navegador > ul > li:nth-child(3) > div > a"),
			DespesasAcaoOrcamentaria = $("#navegador > ul > li:nth-child(4) > div > a"),
			OrdemCronologicaPagamentos = $("#navegador > ul > li:nth-child(5) > div > a"),
			EmpenhosPagamentosFavorecido = $("#navegador > ul > li:nth-child(6) > div > a"),
			DespesasCartãoCorporativoSuprimentoDeFundos = $("#navegador > ul > li:nth-child(7) > div > a"),
			DiariasPassagens = $("#navegador > ul > li:nth-child(8) > div > a"),
			OutrosBeneficios = $("#navegador > ul > li:nth-child(9) > div > a"),
			RepassesPrevidenciarios = $("#navegador > ul > li:nth-child(10) > div > a"),
			RestosPagar = $("#navegador > ul > li:nth-child(11) > div > a"),
			LimiteGastosPessoal = $("#navegador > ul > li:nth-child(12) > div > a"),
			PrestacaoContasAnual = $("#navegador > ul > li.layouts.level-1.ultimo > div > a");

	public ExecucaoOrcamentariaFinanceiraPage() {
		this.ConteudoPageAutomacao = new ConteudoPageAutomacao();
	}
	public void lerExecucaoOcamentariaFinaceira() {
		ArrayList<SelenideElement> portlet = new ArrayList<SelenideElement>();
			portlet.add(CreditoOrcamentarioReceitasProprias);
			portlet.add(Fundos);
			portlet.add(DetalhamentoDespesas);
			portlet.add(DespesasAcaoOrcamentaria);
			portlet.add(OrdemCronologicaPagamentos);
			portlet.add(EmpenhosPagamentosFavorecido);
			portlet.add(DespesasCartãoCorporativoSuprimentoDeFundos);
			portlet.add(DiariasPassagens);
			portlet.add(OutrosBeneficios);
			portlet.add(RepassesPrevidenciarios);
			portlet.add(RestosPagar);
			portlet.add(LimiteGastosPessoal);
			portlet.add(PrestacaoContasAnual);
			
			for (int i = 0; i < portlet.size(); i++) {
				portlet.get(i).click();
				ConteudoPageAutomacao.comandoPortletItensDownload();
				ConteudoPageAutomacao.comandoPortletItens();
			}
	}

	public SelenideElement getCreditoOrcamentarioReceitasProprias() {
		return CreditoOrcamentarioReceitasProprias;
	}

	public SelenideElement getFundos() {
		return Fundos;
	}

	public SelenideElement getDetalhamentoDespesas() {
		return DetalhamentoDespesas;
	}

	public SelenideElement getDespesasAcaoOrcamentaria() {
		return DespesasAcaoOrcamentaria;
	}

	public SelenideElement getOrdemCronologicaPagamentos() {
		return OrdemCronologicaPagamentos;
	}

	public SelenideElement getEmpenhosPagamentosFavorecido() {
		return EmpenhosPagamentosFavorecido;
	}

	public SelenideElement getDespesasCartãoCorporativoSuprimentoDeFundos() {
		return DespesasCartãoCorporativoSuprimentoDeFundos;
	}

	public SelenideElement getDiariasPassagens() {
		return DiariasPassagens;
	}

	public SelenideElement getOutrosBeneficios() {
		return OutrosBeneficios;
	}

	public SelenideElement getRepassesPrevidenciarios() {
		return RepassesPrevidenciarios;
	}

	public SelenideElement getRestosPagar() {
		return RestosPagar;
	}

	public SelenideElement getLimiteGastosPessoal() {
		return LimiteGastosPessoal;
	}

	public SelenideElement getPrestacaoContasAnual() {
		return PrestacaoContasAnual;
	}

}
