package Animales;

public class Loro implements Liberable{

    private boolean libre = true;

    public Loro(){

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
