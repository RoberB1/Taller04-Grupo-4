package FactoryMethod;

import Decorator.Informe;

public class PDF implements Informe {
    
    @Override
    public void createInforme(){
        System.out.println("Se esta creando un PDF ...");
    }
}
