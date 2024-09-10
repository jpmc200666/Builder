package Cuerdas;

import Animales.Liberable;
public class Cuerda implements Amarrable{

    protected Liberable liberable;

    public Cuerda(){
    }

    public Cuerda(Liberable liberable){
        this.liberable=liberable;
    }

    @Override
    public void amarrar() {
        if(liberable.evaluarLibertad()!=false){
            liberable.capturar();
            System.out.println("Amarrado, el animal no se puede mover a una distancia mayor a 2m");
        }
    } 
}
