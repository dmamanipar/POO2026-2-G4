package pe.edu.upeu.herencia.modelo;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public  class Vehicle{
    protected  String marca="Ford";

    public void sonido(){
        System.out.println("Tuut, tuut!");
    }
}
