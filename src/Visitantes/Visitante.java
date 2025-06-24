/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitantes;

import Personas.Persona;
import java.time.LocalDate;

/**
 *
 * @author Luisk
 */
public class Visitante extends Persona {
    public Visitante(String cedula, String nombreCompleto, LocalDate fechaNacimiento, String telefono) {
        super(cedula, nombreCompleto, fechaNacimiento, telefono);
    }

    @Override
    public String toString() {
        return "Visitante{" +"cedula='" + cedula + '\'' + ", nombre='" + nombreCompleto + '\'' + ", nacimiento=" + fechaNacimiento +", telefono='" + (telefono != null ? telefono : "Sin registrar") + '\'' + '}';
    }
    
}
