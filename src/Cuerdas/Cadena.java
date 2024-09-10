package Cuerdas;

import Animales.Liberable;
public class Cadena extends Cuerda{

    public Cadena(Liberable liberable){
        super.liberable = liberable;
    }

    public void encadenarCabeza(){
        if(liberable.evaluarLibertad()==false){
            liberable.capturar();
            System.out.println("El animal no puede mover la cabeza, dado que tiene el cuello encadenado");
        }
    }
}
