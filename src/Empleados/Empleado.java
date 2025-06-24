/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import Personas.Persona;
import java.time.LocalDate;

/**
 *
 * @author Luisk
 */
public abstract class Empleado extends Persona {
    private double salario;

    public Empleado(String cedula, String nombreCompleto, LocalDate fechaNacimiento, String telefono, double salario) {
        super(cedula, nombreCompleto, fechaNacimiento, telefono);
        if (salario < 300_000) {
            throw new IllegalArgumentException("El salario no puede ser menor a ₡300,000");
        }
        if (fechaNacimiento.isAfter(LocalDate.now().minusYears(18))) {
            throw new IllegalArgumentException("El empleado debe tener al menos 18 años");
        }
        this.salario = salario;
    }

    public double getSalario() { return salario; }

    public void setSalario(double salario) {
        if (salario < 300_000) {
            throw new IllegalArgumentException("El salario no puede ser menor a ₡300,000");
        }
        this.salario = salario;
    }
    
}
