/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package RegistroAnimales;

/**
 *
 * @author Luisk
 */
public enum Zona {
    GRANJA("Granja"),
    Petting("Petting"),
    Alimentacion("Alimentación"),
    Conservacion_Rescate("Conservación y Rescate"),
    Tunel_Nocturno("Túnel Nocturno"),
    Biodiversidad_Local("Biodiversidad Local");

    private final String descripcion;

    Zona(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
