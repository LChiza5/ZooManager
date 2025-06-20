/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.time.LocalDate;

/**
 *
 * @author Luisk
 */
public abstract class Empleado {
    private int id;
    private String name;
    private LocalDate fechaNacimiento;
    private String telefono;
    private double salario;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getSalario() {
        return salario;
    }
    
     public void setTelefono(String nuevoTelefono) {
        if (!nuevoTelefono.matches("\\d{2}-\\d{2}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Formato de teléfono inválido.");
        }
        this.telefono = nuevoTelefono;
    }

    public void setSalario(double nuevoSalario) {
        if (nuevoSalario < 300_000) {
            throw new IllegalArgumentException("El salario no puede ser menor a ₡300,000");
        }
        this.salario = nuevoSalario;
    }

    public Empleado(int id, String name, LocalDate fechaNacimiento, String Telefono, double salario) {
        if (!Telefono.matches("\\d{2}-\\d{2}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Formato de teléfono inválido. Ejemplo válido: 83-33-55-87");
        }
        if (salario < 300_000) {
            throw new IllegalArgumentException("El salario no puede ser menor a ₡300,000");
        }
        if (fechaNacimiento.isAfter(LocalDate.now().minusYears(18))) {
            throw new IllegalArgumentException("El empleado debe tener al menos 18 años");
        }
        this.id = id;
        this.name = name;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = Telefono;
        this.salario = salario;
    }
    
    
}
