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
public class Cuidadores extends Empleado{
    private String especialidad;
    private String[] actividades = new String[10];
    private int cantidadActividades = 0;

    public Cuidadores(String cedula, String nombre, LocalDate fechaNacimiento, String telefono, double salario, String especialidad) {
        super(cedula, nombre, fechaNacimiento, telefono, salario);
        this.especialidad = especialidad;
    }

    public void registrarActividad(String actividad) {
        if (cantidadActividades < actividades.length) {
            actividades[cantidadActividades++] = actividad;
        }
    }

    public void alimentarAnimales() {
        registrarActividad("Alimentó a los animales");
    }

    public void verificarSaludAnimales() {
        registrarActividad("Verificó el estado de salud de los animales");
    }

    public String[] getActividades() {
        String[] copia = new String[cantidadActividades];
        for (int i = 0; i < cantidadActividades; i++) copia[i] = actividades[i];
        return copia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

}
