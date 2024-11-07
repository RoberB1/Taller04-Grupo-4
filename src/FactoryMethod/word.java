package FactoryMethod;

import Decorator.Informe;

public class word implements Informe {

    @Override
    public void createInforme(){
        System.out.println("Se esta creando un Word ...");
    }
}