package com.mprj.transparencia.automation.action;

import static com.codeborne.selenide.Selenide.sleep;

import com.codeborne.selenide.Selenide;
import com.mprj.transparencia.automation.page.ConteudoPageAutomacao;
import com.mprj.transparencia.automation.page.ExecucaoOrcamentariaFinanceiraPage;
import com.mprj.transparencia.automation.page.LicitacoesContratosConveniosPage;
import com.mprj.transparencia.automation.page.PageAutomacao;

public class ActionAutomacao {

	private PageAutomacao PageAutomacao;
	private ConteudoPageAutomacao ConteudoPageAutomacao;
	private ExecucaoOrcamentariaFinanceiraPage ExecucaoOrcamentariaFinanceiraPage;
	private LicitacoesContratosConveniosPage LicitacoesContratosConveniosPage;

	public ActionAutomacao() {
		this.PageAutomacao = new PageAutomacao();
		this.ConteudoPageAutomacao = new ConteudoPageAutomacao();
		this.ExecucaoOrcamentariaFinanceiraPage = new ExecucaoOrcamentariaFinanceiraPage();
		this.LicitacoesContratosConveniosPage = new LicitacoesContratosConveniosPage();
	}

	public void vasculhaExecucaoOrcamentariaFinanceira() {
		PageAutomacao.getTituloExecucaoOrcamentariaFinanceiraPage().click();
		sleep(3000);
			//ExecucaoOrcamentariaFinanceiraPage.lerExecucaoOcamentariaFinaceira();
			PageAutomacao.getLicitacoesContratosConveniosPage().click();
			LicitacoesContratosConveniosPage.lerLicitacoesContratosConveniosPage();
		
	}

//	public void comandoPortletItens() {
//		for (int i = 0; i < ConteudoPageAutomacao.getItem().size(); i++) {
//			ConteudoPageAutomacao.getItem().get(i).click();
//			sleep(3000);
//			Selenide.back();
//			sleep(3000);
//			if (i == ConteudoPageAutomacao.getItem().size()) {
//				break;
//			}
//		}
//	}

}
