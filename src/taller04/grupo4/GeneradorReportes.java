public class GeneradorReportes {
    private static GeneradorReportes instancia = new GeneradorReportes();

    private GeneradorReportes(){
        //Constructor privado para evitar instanciación directa
    }

    public static GeneradorReportes getInstance(){
        return instancia;
    }


}
