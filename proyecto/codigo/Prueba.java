/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author julianrojasgallego
 */
public class Prueba {

    public static void main(String[] args) throws IOException {

        Lectura pru = new Lectura("https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/datasets/0_train_balanced_15000.csv");
        int cont=0;
        pru.leeDatos();
        LinkedList<Estudiante> ld3 = pru.getEstudiantes();
        for (Estudiante i : ld3) {
            
            System.out.println(i.getExito() );
            cont++;
        }
        System.out.println("contador: "+cont);
        int dataSize = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria máxima: " + runtime.maxMemory() / dataSize + "MB");
        System.out.println("Memoria total: " + runtime.totalMemory() / dataSize + "MB");
        System.out.println("Memoria libre: " + runtime.freeMemory() / dataSize + "MB");
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / dataSize + "MB");
    }
}
