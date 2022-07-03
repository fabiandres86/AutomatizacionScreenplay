package stepsdefinitions;

import com.ejercicios.automatizacion.interfaces.WikipediaHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

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
    public void ingresaLaPalabra(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Entonces("El sistema le muestra los resultados en pantalla")
    public void elSistemaLeMuestraLosResultadosEnPantalla() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
