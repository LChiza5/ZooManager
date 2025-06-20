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
    private String[] actividades = new String[100];
    private int cantidadActividades = 0;;

    public void registrarActividad(String actividad) {
        if (cantidadActividades < actividades.length) {
            actividades[cantidadActividades] = actividad;
            cantidadActividades++;
        } else {
            System.out.println("No se pueden registrar más actividades.");
        }
    }

    public String[] getActividades() {
        String[] copia = new String[cantidadActividades];
        for (int i = 0; i < cantidadActividades; i++) {
            copia[i] = actividades[i];
        }
        return copia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Cuidadores(String especialidad, int id, String name, LocalDate fechaNacimiento, String Telefono, double salario) {
        super(id, name, fechaNacimiento, Telefono, salario);
        this.especialidad = especialidad;
        this.actividades = new String[100];
        this.cantidadActividades = 0;
    }

}
