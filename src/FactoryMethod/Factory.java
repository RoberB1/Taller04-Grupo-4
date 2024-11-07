package FactoryMethod;

import Decorator.Informe;


public abstract class Factory {

    public abstract Informe creaInforme();

    public void usarInforme(){

        Informe informe = creaInforme();
        informe.createInforme();

    }
}