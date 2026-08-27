package pe.edu.upeu.herencia;

import pe.edu.upeu.herencia.modelo.Car;

public class MainHerencia {
    public static void main(String[] args) {
        Car cObj=new Car();
        cObj.setMarca("Toyota");
        System.out.println(cObj.getMarca());
        cObj.sonido();
    }

}
