package com.mprj.transparencia.automation.test;

import org.junit.Before;
import org.junit.Test;

import com.codeborne.selenide.Selenide;
import com.mprj.transparencia.automation.action.ActionAutomacao;

public class TestAutomacao {

	private ActionAutomacao ActionAutomacao;

	@Before
	public void setup() {
		ActionAutomacao = new ActionAutomacao();
		Selenide.open("http://transparencia.mprj.mp.br/");
	}
	
	@Test
	public void VerificaTest() {
		ActionAutomacao.vasculhaExecucaoOrcamentariaFinanceira();
	}
	
}