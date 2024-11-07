package FactoryMethod;

import Decorator.Informe;

public class CreadorWord  extends Factory {


   @Override
    public Informe creaInforme(){
        return new word();

    }


    
}