package com.ejercicios.automatizacion.questions;

import com.ejercicios.automatizacion.interfaces.PaginaBusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RespuestaBusqueda implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        char[] texto = Text.of(PaginaBusqueda.CAMPO_TEXTO).viewedBy(actor).value().toCharArray();
        texto[1] = 'i';
        return new String(texto);
    }

    public static RespuestaBusqueda deLaPagina() {
        return new RespuestaBusqueda();

    }
}
