package com.mprj.transparencia.automation.page;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import java.util.ArrayList;

import com.codeborne.selenide.SelenideElement;


public class LicitacoesContratosConveniosPage {

	private ConteudoPageAutomacao ConteudoPageAutomacao;
	
	private SelenideElement 
	licitacoes = $("#navegador > ul > li:nth-child(1) > div > a"),
	RespostasImpugnacoesPedidosEsclarecimentos  = $("#navegador > ul > li:nth-child(2) > div > a"),
	DispensasInexigibilidades = $("#navegador > ul > li:nth-child(3) > div > a"),
	AvisoInteresseContratacaoPorDispensa = $("#navegador > ul > li:nth-child(4) > div > a"),
	Contratos = $("#navegador > ul > li:nth-child(5) > div > a"),
	ConveniosInstrumentosCongeneres = $("#navegador > ul > li:nth-child(6) > div > a"),
	AtaRegistroPrecos = $("#navegador > ul > li:nth-child(7) > div > a"),
	PrestadoresServicos = $("#navegador > ul > li:nth-child(8) > div > a"),
	ChamamentosPublicos = $("#navegador > ul > li:nth-child(9) > div > a"),
	RolLicitantesBensPreQualificados = $("#navegador > ul > li:nth-child(10) > div > a"),
	ConsultasPublicas = $("#navegador > ul > li:nth-child(11) > div > a"),
	CredenciamentosEditaisChamamentoInteressados = $("#navegador > ul > li:nth-child(12) > div > a"),
	EmpresasSancionadas	= $("#navegador > ul > li:nth-child(13) > div > a"),
	Concorrencias = $("#navegador > ul > li:nth-child(14) > div > a"),
	SancoesAplicadasContratados = $("#navegador > ul > li:nth-child(15) > div > a"),
	ListaEmpresasSuspensasImpedidas = $("#navegador > ul > li.layouts.level-1.ultimo > div > a");

	public LicitacoesContratosConveniosPage() {
		this.ConteudoPageAutomacao = new ConteudoPageAutomacao();
	}
	
	public void lerLicitacoesContratosConveniosPage() {
		ArrayList<SelenideElement> portlet = new ArrayList<SelenideElement>();
			portlet.add(licitacoes);
			portlet.add(RespostasImpugnacoesPedidosEsclarecimentos);
			portlet.add(DispensasInexigibilidades);
			portlet.add(AvisoInteresseContratacaoPorDispensa);
			portlet.add(Contratos);
			portlet.add(ConveniosInstrumentosCongeneres);
			portlet.add(AtaRegistroPrecos);
			portlet.add(PrestadoresServicos);
			portlet.add(ChamamentosPublicos);
			portlet.add(RolLicitantesBensPreQualificados);
			portlet.add(ConsultasPublicas);
			portlet.add(CredenciamentosEditaisChamamentoInteressados);
			portlet.add(EmpresasSancionadas);
			portlet.add(Concorrencias);
			portlet.add(SancoesAplicadasContratados);
			portlet.add(ListaEmpresasSuspensasImpedidas);
			
			
			for (int i = 0; i < portlet.size(); i++) {
				portlet.get(i).click();
				ConteudoPageAutomacao.comandoPortletItensDownload();
				ConteudoPageAutomacao.comandoPortletItens();
			}
	}

	public SelenideElement getLicitacoes() {
		return licitacoes;
	}

	public SelenideElement getRespostasImpugnacoesPedidosEsclarecimentos() {
		return RespostasImpugnacoesPedidosEsclarecimentos;
	}

	public SelenideElement getDispensasInexigibilidades() {
		return DispensasInexigibilidades;
	}

	public SelenideElement getAvisoInteresseContratacaoPorDispensa() {
		return AvisoInteresseContratacaoPorDispensa;
	}

	public SelenideElement getContratos() {
		return Contratos;
	}

	public SelenideElement getConveniosInstrumentosCongeneres() {
		return ConveniosInstrumentosCongeneres;
	}

	public SelenideElement getAtaRegistroPrecos() {
		return AtaRegistroPrecos;
	}

	public SelenideElement getPrestadoresServicos() {
		return PrestadoresServicos;
	}

	public SelenideElement getChamamentosPublicos() {
		return ChamamentosPublicos;
	}

	public SelenideElement getRolLicitantesBensPreQualificados() {
		return RolLicitantesBensPreQualificados;
	}

	public SelenideElement getConsultasPublicas() {
		return ConsultasPublicas;
	}

	public SelenideElement getCredenciamentosEditaisChamamentoInteressados() {
		return CredenciamentosEditaisChamamentoInteressados;
	}

	public SelenideElement getEmpresasSancionadas() {
		return EmpresasSancionadas;
	}

	public SelenideElement getConcorrencias() {
		return Concorrencias;
	}

	public SelenideElement getSancoesAplicadasContratados() {
		return SancoesAplicadasContratados;
	}

	public SelenideElement getListaEmpresasSuspensasImpedidas() {
		return ListaEmpresasSuspensasImpedidas;
	}
	
	
	
	
}
