package com.mprj.transparencia.automation.page;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class ConteudoPageAutomacao {

	private ElementsCollection itemDownload = $$(".item-download"), botaoConsulta = $$(".item-lightbox"),
			item = $$(".item");

	private SelenideElement itemPortlet = $(".item"), itemDownloadPortlet = $(".item-download");

	public ElementsCollection getItemDownload() {
		return itemDownload;
	}

	public ElementsCollection getBotaoConsulta() {
		return botaoConsulta;
	}

	public ElementsCollection getItem() {
		return item;
	}

	public SelenideElement getItemPortlet() {
		return itemPortlet;
	}

	public SelenideElement getItemDownloadPortlet() {
		return itemDownloadPortlet;
	}

	public void comandoPortletItensDownload() {
		for (int i = 0; i < getItemDownload().size(); i++) {
			getItemDownload().get(i).click();
			sleep(2000);
			System.out.println("ITEM = " + i);
		}
		System.out.println("saiu do for - ITEM DOWNLOAD");
	}

	public void comandoPortletItens() {
		if (itemPortlet.isDisplayed()) {
			for (int i = 0; i < getItem().size(); i++) {
				getItem().get(i).click();
				sleep(2000);
				comandoPortletItensDownload();
				Selenide.back();
				System.out.println("ITEM = " + i);
			}
		}
		System.out.println("saiu do for- ITENS");
	}

}
