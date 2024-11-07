package FactoryMethod;

import Decorator.Informe;

public class CreadorPDF  extends Factory {
    
    @Override
    public Informe creaInforme(){
        return new PDF();

    }


}
    


