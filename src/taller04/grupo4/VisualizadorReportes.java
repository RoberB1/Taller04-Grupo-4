package taller04.grupo4;

public class VisualizadorReportes {
    private static VisualizadorReportes  instancia = new VisualizadorReportes();

    private  VisualizadorReportes() {} // Constructor privado para evitar instanciación directa

    public static  VisualizadorReportes getInstancia() {
        return instancia;
    }

}
