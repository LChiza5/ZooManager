/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroAnimales;

import java.time.LocalDate;
import Utiles.FechaUtil;

/**
 *
 * @author Luisk
 */
public class Animal {
    private String id;
    private String nombre;
    private String especie;
    private LocalDate fechaNacimiento;
    private String zona;

    public Animal(String id, String nombre, String especie, LocalDate fechaNacimiento, String zona) {
        FechaUtil.validarFechaNoFutura(fechaNacimiento);

        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.zona = zona;
    }

    public String getId() {
        return id;
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

    public String getZona() {
        return zona;
    }

    public void setZona(String nuevaZona) {
        this.zona = nuevaZona;
    }

    public int getEdad() {
        return FechaUtil.calcularEdad(fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Animal{" + "id='" + id + '\'' +", nombre='" + nombre + '\'' +", especie='" + especie + '\'' +", fechaNacimiento=" + fechaNacimiento +", zona='" + zona + '\'' +", edad=" + getEdad() + " años" +'}';
    }
    
}
