package com.ejercicios.automatizacion.interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.wikipedia.org")
public class WikipediaHomePage extends PageObject {
     public final static Target CAMPO_TEXTO = Target.the("Caja de texto").locatedBy("/html/body/div[3]/form/fieldset/div/input");
     public final static Target BOTON_INGRESAR = Target.the("Boton de ingresar").locatedBy("/html/body/div[3]/form/fieldset/button");

     private WikipediaHomePage() {
     }
}
