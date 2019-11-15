package tcs.semillero.diego.ejemploArquitecturaMaven.definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import tcs.semillero.diego.ejemploArquitecturaMaven.step.ValidacionFormularioSteps;

public class ValidacionFormularioDefinitions {
	@Steps
	ValidacionFormularioSteps objValidacionFormularioSteps;

	@Given("^Iniciar sesion \"([^\"]*)\" \"([^\"]*)\"$")
	public void iniciar_sesion(String usuario, String clave) throws Exception {
		objValidacionFormularioSteps.iniciar_sesion(usuario, clave);
	}

	@When("^diligenciar \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void diligenciar(String requerido, String selectorDeporte, String selectorMultiple, String url, String clave, String confirmaClave, String minimoCampo, String maximoCampo, String numero, String direccionIP, String fecha, String cita) throws Exception {
		objValidacionFormularioSteps.diligenciar(requerido, selectorDeporte, selectorMultiple, url, clave,
				confirmaClave, minimoCampo, maximoCampo, numero, direccionIP, fecha, cita);
	}

	@And("^enviar formulario$")
	public void enviar_formulario() throws Exception {
		objValidacionFormularioSteps.enviar_formulario();
	}

	@Then("^verficar campos llenos$")
	public void verficar_campos_llenos() throws Exception {
		objValidacionFormularioSteps.verificar_campos_llenos();
	}
}
