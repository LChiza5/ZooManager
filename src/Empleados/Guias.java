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
public class Guias extends Empleado{
   private String[] idiomas = new String[10];
    private int totalIdiomas = 0;
    private String[] recorridos = new String[100];
    private int totalRecorridos = 0;
    
    public void agregarIdioma(String idioma) {
        for (int i = 0; i < totalIdiomas; i++)
            if (idiomas[i].equalsIgnoreCase(idioma)) return;
        if (totalIdiomas < 10) idiomas[totalIdiomas++] = idioma;
    }

    public void realizarRecorrido(String lugar, String animalesObservados) {
        String descripcion = "Recorrido en " + lugar + " - Información brindada sobre: " + animalesObservados;
        registrarRecorrido(descripcion);
    }

    private void registrarRecorrido(String recorrido) {
        if (totalRecorridos < 100) recorridos[totalRecorridos++] = recorrido;
    }

    public String[] getIdiomas() {
        String[] copia = new String[totalIdiomas];
        for (int i = 0; i < totalIdiomas; i++) copia[i] = idiomas[i];
        return copia;
    }

    public String[] getRecorridos() {
        String[] copia = new String[totalRecorridos];
        for (int i = 0; i < totalRecorridos; i++) copia[i] = recorridos[i];
        return copia;
    }
    
    public Guias(int id, String name, LocalDate fechaNacimiento, String telefono, double salario, String[] idiomasIniciales) {
        super(id, name, fechaNacimiento, telefono, salario);
        
        if (idiomasIniciales != null) {
            for (int i = 0; i < idiomasIniciales.length && i < 10; i++) {
                idiomas[totalIdiomas++] = idiomasIniciales[i];
            }
        }
    }
}
