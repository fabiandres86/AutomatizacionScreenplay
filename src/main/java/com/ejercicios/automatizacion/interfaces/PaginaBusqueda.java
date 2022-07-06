package com.ejercicios.automatizacion.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaBusqueda {
    public final static Target CAMPO_TEXTO = Target.the("Etiqueta de texto").locatedBy("/html/body/div[3]/h1");
}
