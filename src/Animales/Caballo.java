package Animales;

public class Caballo implements Liberable{

    private boolean libre = true;
    
    public Caballo(){

    }

    @Override
    public boolean evaluarLibertad() {
        return libre;
    }

    @Override
    public void librar() {
        libre = true;
    }

    @Override
    public void capturar() {
        libre = false;
    }


}
