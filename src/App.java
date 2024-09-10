import Animales.Caballo;
import Animales.Liberable;
import Animales.Loro;
import Cuerdas.Cadena;
import Cuerdas.Cuerda;

public class App {
    public static void main(String[] args) throws Exception {
        pruebaCuerdas(new Caballo());
        pruebaCuerdas(new Loro());     
    }

    public static void pruebaCuerdas(Liberable  liberable){
        System.out.println("Probando cuerda normal");
        Cuerda cuerda = new Cuerda(liberable);
        cuerda.amarrar();

        System.out.println("Probando cadena");
        Cadena cadena = new Cadena(liberable);
        cadena.encadenarCabeza();
    }
}
