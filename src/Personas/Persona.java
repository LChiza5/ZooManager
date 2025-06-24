/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDate;

/**
 *
 * @author Luisk
 */
public class Persona {
    protected String cedula;
    protected String nombreCompleto;
    protected LocalDate fechaNacimiento;
    protected String telefono; 

    public Persona(String cedula, String nombreCompleto, LocalDate fechaNacimiento, String telefono) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;

        if (telefono != null && !telefono.matches("\\d{2}-\\d{2}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("El formato del teléfono es inválido. Ej: 83-33-55-87");
        }
        this.telefono = telefono;
    }

    public String getCedula() { return cedula; }
    public String getNombreCompleto() { return nombreCompleto; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public String getTelefono() { return telefono; }

    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.matches("\\d{2}-\\d{2}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Formato de teléfono inválido.");
        }
        this.telefono = telefono;
    }
}
