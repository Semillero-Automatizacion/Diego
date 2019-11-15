package tcs.semillero.diego.ejemploArquitecturaMaven.step;

import net.thucydides.core.annotations.Step;
import tcs.semillero.diego.ejemploArquitecturaMaven.PageObjects.PrincipalPageObject;
import tcs.semillero.diego.ejemploArquitecturaMaven.PageObjects.ValidacionFormularioPageObjects;

public class ValidacionFormularioSteps {

	ValidacionFormularioPageObjects objValidacionFormularioPageObjects;
	PrincipalPageObject objPrincipalPageObject;

	@Step
	public void iniciar_sesion(String usuario, String clave) throws Exception {
		objValidacionFormularioPageObjects.iniciarSesion(usuario, clave);
		objPrincipalPageObject.pulsarLista();
		objPrincipalPageObject.elegirElementoLista();
	}

	@Step
	public void diligenciar(String requerido, String selectorDeporte, String selectorMultiple, String url,
			String clave, String confirmaClave, String minimoCampo, String maximoCampo, String numero,
			String direccionIP, String fecha, String cita) throws Exception {
		Thread.sleep(1000);
		objValidacionFormularioPageObjects.llenarSelectorDeporte(selectorDeporte);
		objValidacionFormularioPageObjects.llenarSelectorMultiple(selectorMultiple);
		objValidacionFormularioPageObjects.llenarRequerido(requerido);
		objValidacionFormularioPageObjects.llenarUrl(url);
		objValidacionFormularioPageObjects.llenarCorreo();
		objValidacionFormularioPageObjects.llenarClave(clave, confirmaClave);
		objValidacionFormularioPageObjects.llenarMinimoCampo(minimoCampo);
		objValidacionFormularioPageObjects.llenarMaximoCampo(maximoCampo);
		objValidacionFormularioPageObjects.llenarNumero(numero);
		objValidacionFormularioPageObjects.llenarDireccionIp(direccionIP);
		objValidacionFormularioPageObjects.llenarFecha(fecha);
		objValidacionFormularioPageObjects.llenarFecha(cita);
	}
	
	@Step
	public void enviar_formulario() throws Exception {
		objValidacionFormularioPageObjects.enviar();
		Thread.sleep(5000);
	}
	
	@Step
	public void verificar_campos_llenos() throws Exception {
		objValidacionFormularioPageObjects.verificarLlenadoCampos();
	}
}
