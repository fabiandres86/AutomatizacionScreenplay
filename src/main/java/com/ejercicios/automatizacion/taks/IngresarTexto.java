package com.ejercicios.automatizacion.taks;

import com.ejercicios.automatizacion.interfaces.WikipediaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class IngresarTexto implements Task {

    private String palabra;

    public IngresarTexto(String palabra) {
        this.palabra = palabra.trim();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(palabra).into(WikipediaHomePage.CAMPO_TEXTO));
        actor.attemptsTo(Click.on(WikipediaHomePage.BOTON_INGRESAR));
    }

    public static IngresarTexto enElCampo(String palabra) {
        return Tasks.instrumented(IngresarTexto.class, palabra);

    }
}
