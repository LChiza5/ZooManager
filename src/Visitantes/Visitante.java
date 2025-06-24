/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitantes;

import java.time.LocalDate;

/**
 *
 * @author Luisk
 */
public class Visitante {
    private String id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String telefono;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.matches("\\d{2}-\\d{2}-\\d{2}-\\d{2}")) {
           throw new IllegalArgumentException("El formato del teléfono es inválido. Ej: 83-33-55-87"); 
        }
        this.telefono = telefono;
    }

    public Visitante(String id, String nombre, LocalDate fechaNacimiento, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        if (telefono != null && !telefono.matches("\\d{2}-\\d{2}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("El formato del teléfono es inválido. Ej: 83-33-55-87");
        }
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Visitante{" + "id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + '}';
    }
    
    
}
