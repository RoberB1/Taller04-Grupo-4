package FactoryMethod;

import Decorator.Informe;

public class CreadorExcel extends Factory {
    
    @Override
    public Informe creaInforme(){
        return new excel();

    }


}
