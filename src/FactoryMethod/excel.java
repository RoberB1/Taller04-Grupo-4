package FactoryMethod;

import Decorator.Informe;

public class excel implements Informe {

    @Override
    public void createInforme(){
        System.out.println("Se esta creando un excel ...");
    }
}
