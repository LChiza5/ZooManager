/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utiles;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Luisk
 */
public abstract class FechaUtil {
     public static int calcularEdad(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null || fechaNacimiento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Fecha de nacimiento inválida.");
        }
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public static void validarFechaNoFutura(LocalDate fecha) {
        if (fecha != null && fecha.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha no puede estar en el futuro.");
        }
    }

    public static void validarMayorDeEdad(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula.");
        }
        int edad = calcularEdad(fechaNacimiento);
        if (edad < 18) {
            throw new IllegalArgumentException("Debe tener al menos 18 años.");
        }
    }
}
