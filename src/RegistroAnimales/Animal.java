/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroAnimales;

import java.time.LocalDate;

/**
 *
 * @author Luisk
 */
public class Animal {
    private String Id;
    private String nombre;
    private String especie;
    private LocalDate fechaNacimiento;
    private Zona zonaActual;

    public String getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Zona getZonaActual() {
        return zonaActual;
    }

    public void setZonaActual(Zona zonaActual) {
        this.zonaActual = zonaActual;
    }

    public Animal(String idAnimal, String nombre, String especie, LocalDate fechaNacimiento) {
       if (Id.matches("^[\\w]-[0-9]{4}$")) {
            this.Id = Id;
        this.nombre = nombre;
        this.especie = especie;
        if (!fechaNacimiento.isAfter(LocalDate.now()))
            this.fechaNacimiento = fechaNacimiento;
        this.zonaActual = Zona.Conservacion_Rescate;
       }
    }
    
    public void moverZona(Zona nuevaZona) {
        if (nuevaZona == null) {
            throw new IllegalArgumentException("La nueva zona no puede ser nula");
        }
        this.zonaActual = nuevaZona;
    }

    @Override
    public String toString() {
        return "Animal{" + "Id=" + Id + ", nombre=" + nombre + ", especie=" + especie + ", fechaNacimiento=" + fechaNacimiento + ", zonaActual=" + zonaActual + '}';
    }
    
}
