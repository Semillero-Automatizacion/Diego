package tcs.semillero.diego.ejemploArquitecturaMaven.step;



import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Step;
import tcs.semillero.diego.ejemploArquitecturaMaven.PageObjects.LoginPageObjects;

public class LoginSteps {
	LoginPageObjects objLoginPageObjects;

	@Step
	public void ingresar_al_sitio_web() throws Exception {
		objLoginPageObjects.open();
	}
	
	@Step
	public void ingreso_usuario(String usuario) throws Exception {
		objLoginPageObjects.ingreso_usuario(usuario);
	}
	
	@Step
	public void ingreso_clave(String clave) throws Exception {
		objLoginPageObjects.ingreso_clave(clave);
		objLoginPageObjects.pulsarBoton();
	}
}