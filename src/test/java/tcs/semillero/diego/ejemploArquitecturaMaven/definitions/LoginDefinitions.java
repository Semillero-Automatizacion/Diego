package tcs.semillero.diego.ejemploArquitecturaMaven.definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import tcs.semillero.diego.ejemploArquitecturaMaven.step.LoginSteps;

public class LoginDefinitions {

	@Steps
	LoginSteps objLoginSteps;

	@Given("^Ingresar al sitio web$")
	public void ingresar_al_sitio_web() throws Exception {
		objLoginSteps.ingresar_al_sitio_web();
	}

	@When("^ingreso usuario \"([^\"]*)\"$")
	public void ingreso_usuario(String usuario) throws Exception {
		objLoginSteps.ingreso_usuario(usuario);
	}
	
	@And("^ingreso clave \"([^\"]*)\"$")
	public void ingreso_clave(String clave) throws Exception {
		objLoginSteps.ingreso_clave(clave);
		
	}

	@Then("^Verifico que se inicio sesion$")
	public void verifico_que_se_inicio_sesion() throws Exception {

	}

}
