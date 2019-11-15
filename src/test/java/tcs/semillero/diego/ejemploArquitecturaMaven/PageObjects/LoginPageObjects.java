package tcs.semillero.diego.ejemploArquitecturaMaven.PageObjects;



import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class LoginPageObjects extends PageObject {
	String txtfUsuario="//input[@class=\"form-control top\"]";
	String txtfClave="//div[@id=\"login\"]/form/input[@class=\"form-control bottom\"]";
	String btnBoton="//button[@class=\"btn btn-lg btn-primary btn-block\"]";
	
	public void ingreso_usuario(String usuario) {
		find(By.xpath(txtfUsuario)).sendKeys(usuario);
	}
	public void ingreso_clave(String clave) {
		find(By.xpath(txtfClave)).sendKeys(clave);
	}
	public void pulsarBoton() {
		find(By.xpath(btnBoton)).click();
	}
}
