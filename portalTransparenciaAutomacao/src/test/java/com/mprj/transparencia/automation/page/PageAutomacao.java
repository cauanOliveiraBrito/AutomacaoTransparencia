package com.mprj.transparencia.automation.page;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class PageAutomacao {

	private ElementsCollection menuTransparencia = $$(".navegacao-topo");

	private SelenideElement home = $(".logo-transparencia"),
			TituloExecucaoOrcamentariaFinanceiraPage = $("#portlet_56_INSTANCE_1oTDsjuQUNxH > div > div > div > div.journal-content-article "
					+ "> ul:nth-child(1) > li:nth-child(1) > a > img"),
					LicitacoesContratosConveniosPage = $("#navegacao-topo > ul > li:nth-child(2) > a > div.nav-name"),
					GestaoPessoas = $("#navegacao-topo > ul > li:nth-child(3) > a > div.nav-name");

	public ElementsCollection getMenuTransparencia() {
		return menuTransparencia;
	}

	public void setMenuTransparencia(ElementsCollection menuTransparencia) {
		this.menuTransparencia = menuTransparencia;
	}

	public SelenideElement getHome() {
		return home;
	}

	public void setHome(SelenideElement home) {
		this.home = home;
	}

	public SelenideElement getTituloExecucaoOrcamentariaFinanceiraPage() {
		return TituloExecucaoOrcamentariaFinanceiraPage;
	}

	public SelenideElement getLicitacoesContratosConveniosPage() {
		return LicitacoesContratosConveniosPage;
	}

	public SelenideElement getGestaoPessoas() {
		return GestaoPessoas;
	}

	public void setGestaoPessoas(SelenideElement gestaoPessoas) {
		GestaoPessoas = gestaoPessoas;
	}



	
}
