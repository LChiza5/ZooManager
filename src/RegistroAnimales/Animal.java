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
    private String idAnimal;
    private String nombre;
    private String especie;
    private LocalDate fechaNacimiento;
    private String zonaActual;
    
     public static final String ZonaInicial = "Conservación y Rescate";
     public static final String[] ZONAS = {
        "Granja", "Contacto", "Alimentación", ZonaInicial,
        "Túnel Nocturno", "Biodiversidad Local" 
    };

    public String getIdAnimal() {
        return idAnimal;
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

    public String getZonaActual() {
        return zonaActual;
    }

    public Animal(String idAnimal, String nombre, String especie, LocalDate fechaNacimiento, String zonaActual) {
        if (idAnimal != null && idAnimal.matches("^[A-Z]-\\d{4}$")) {
            this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.zonaActual = zonaActual;
        }
    }
    
    public void moverZona(String nuevaZona) {
    boolean zonaValida = false;
    for (String z : ZONAS) {
        if (z.equalsIgnoreCase(nuevaZona) && !z.equalsIgnoreCase(this.zonaActual)) {
            zonaValida = true;
            break;
        }
    }
    if (zonaValida) {
        this.zonaActual = nuevaZona;
        }
    }
}
