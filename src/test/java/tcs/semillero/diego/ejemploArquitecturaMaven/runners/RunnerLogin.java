package tcs.semillero.diego.ejemploArquitecturaMaven.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/validacionDeFormulario.feature", glue= {"tcs.semillero.diego.ejemploArquitecturaMaven.definitions"})
public class RunnerLogin {

}
