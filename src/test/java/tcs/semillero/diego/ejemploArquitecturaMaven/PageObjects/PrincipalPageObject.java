package tcs.semillero.diego.ejemploArquitecturaMaven.PageObjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class PrincipalPageObject extends PageObject  {
	String listFormElements="//li[@class=\"dropdown \"]";
	String listElementValidation="//ul[@class=\"dropdown-menu\"]/li[2]";
	public void pulsarLista() {
		find(By.xpath(listFormElements)).click();
	}
	public void elegirElementoLista() {
		find(By.xpath(listElementValidation)).click();
	}
}
