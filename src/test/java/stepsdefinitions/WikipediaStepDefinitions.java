package stepsdefinitions;

import com.ejercicios.automatizacion.interfaces.PaginaBusqueda;
import com.ejercicios.automatizacion.interfaces.WikipediaHomePage;
import com.ejercicios.automatizacion.questions.RespuestaBusqueda;
import com.ejercicios.automatizacion.taks.IngresarTexto;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.core.Is;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WikipediaStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que carolina esta en la pagina wikipedia")
    public void queCarolinaEstaEnLaPaginaWikipedia() {
        theActorCalled("Carolina").attemptsTo(Open.browserOn().the(WikipediaHomePage.class));
    }

    @Cuando("ingresa la palabra {string}")
    public void ingresaLaPalabra(String palabraIngresada) {
        theActorInTheSpotlight().attemptsTo(IngresarTexto.enElCampo(palabraIngresada));
    }

    @Entonces("El sistema le muestra los resultados en pantalla")
    public void elSistemaLeMuestraLosResultadosEnPantalla() {
        WaitUntil.the(PaginaBusqueda.CAMPO_TEXTO.getCssOrXPathSelector(), isVisible());
        theActorInTheSpotlight().should(seeThat(RespuestaBusqueda.deLaPagina(), Is.is("Fisica")));
    }
}
