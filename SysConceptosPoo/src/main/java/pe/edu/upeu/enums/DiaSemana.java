package pe.edu.upeu.enums;

import lombok.Getter;

@Getter
public enum DiaSemana {
    DOMINGO("Domingo"),
    LUNES("Lunes"),
    MARTES("Martes"),
    MIERCOLES("Miercoles"),
    JUEVES("Jueves"),
    VIERNES("Viernes"),
    SABADO("Sábado");

    String nombreDia;

    DiaSemana(String nombreDia) {
        this.nombreDia = nombreDia;
    }
}
