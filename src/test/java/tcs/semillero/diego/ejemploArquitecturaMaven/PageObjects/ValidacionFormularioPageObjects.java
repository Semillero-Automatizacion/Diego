package tcs.semillero.diego.ejemploArquitecturaMaven.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidacionFormularioPageObjects extends PageObject {
	LoginPageObjects objLoginPageObjects;
	String txtfRequerido = "//input[@id=\"req\"]";
	String slctrDeporte = "//select[@id=\"sport\"]";
	String slctrMultipleDeporte = "//select[@id=\"sport2\"]";
	String txtfUrl = "//input[@id=\"url1\"]";
	String txtfEmail = "//input[@id=\"email1\"]";
	String txtfClave = "//input[@id=\"pass1\"]";
	String txtfConfirmaClave = "//input[@id=\"pass2\"]";
	String txtfMinimoSize = "//input[@id=\"minsize1\"]";
	String txtfMaximoSize = "//input[@id=\"maxsize1\"]";
	String txtfNumero = "//input[@id=\"number2\"]";
	String txtfDireccionIP = "//input[@id=\"ip\"]";
	String txtfFecha = "//input[@id=\"date3\"]";
	String txtfCita = "//input[@id=\"past\"]";
	String btnValidar = "//form[@id=\"popup-validation\"]/div[@class=\"form-actions no-margin-bottom\"]/input[@class=\"btn btn-primary\"]";
	
	@FindBy(xpath = "//div[@class=\"formErrorContent\"]")
	WebElementFacade objWebElementFacadeError;
	
	public void iniciarSesion(String usuario, String clave) {
		objLoginPageObjects.ingreso_clave(clave);
		objLoginPageObjects.ingreso_usuario(usuario);
		objLoginPageObjects.pulsarBoton();
	}
	public void llenarRequerido(String requerido) {
		find(By.xpath(txtfRequerido)).sendKeys(requerido);
	}
	public void llenarSelectorDeporte(String selectorDeporte) {
		find(By.xpath(slctrDeporte)).selectByVisibleText(selectorDeporte);
	}
	public void llenarSelectorMultiple(String selectorMultiple) {
		find(By.xpath(slctrMultipleDeporte)).selectByVisibleText(selectorMultiple);
	}
	public void llenarUrl(String url) {
		find(By.xpath(txtfUrl)).clear();
		find(By.xpath(txtfUrl)).sendKeys(url);
	}
	public void llenarCorreo() {
		find(By.xpath(txtfEmail)).sendKeys(this.crearCorreoAletatorio());
	}
	public void llenarClave(String clave, String confirmaClave) {
		find(By.xpath(txtfClave)).sendKeys(clave);
		find(By.xpath(txtfConfirmaClave)).sendKeys(confirmaClave);
	}
	public void llenarMinimoCampo(String minimoCampo) {
		find(By.xpath(txtfMinimoSize)).sendKeys(minimoCampo);
	}
	public void llenarMaximoCampo(String maximoCampo) {
		find(By.xpath(txtfMaximoSize)).clear();
		find(By.xpath(txtfMaximoSize)).sendKeys(maximoCampo);
	}
	public void llenarNumero(String numero) {
		find(By.xpath(txtfNumero)).clear();
		find(By.xpath(txtfNumero)).sendKeys(numero);
	}
	public void llenarDireccionIp(String direccionIP) {
		find(By.xpath(txtfDireccionIP)).clear();
		find(By.xpath(txtfDireccionIP)).sendKeys(direccionIP);
	}
	public void llenarFecha(String fecha) {
		find(By.xpath(txtfFecha)).clear();
		find(By.xpath(txtfFecha)).sendKeys(fecha);
	}
	public void llenarCita(String cita) {
		find(By.xpath(txtfCita)).clear();
		find(By.xpath(txtfCita)).sendKeys(cita);
	}
	public void enviar() throws Exception{
		Thread.sleep(3000);
		find(By.xpath(btnValidar)).click();
	}
	public void verificarLlenadoCampos() {
		Assert.assertEquals(true, objWebElementFacadeError.isVisible());
	}
	public String crearCorreoAletatorio() {
		String primeraParte="diego";
		String terceraParte="@Pruebas.com";
		String segundaParte="";
		for(int contador=0; contador<5; contador++)
			segundaParte+=(String.valueOf((int)(Math.random()*100)));
		return primeraParte.concat(segundaParte).concat(terceraParte);
	}
}
