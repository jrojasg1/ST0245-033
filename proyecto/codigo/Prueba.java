/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.io.IOException;
import java.util.LinkedList;
import javafx.util.Pair;

/**
 *
 * @author julianrojasgallego
 */
public class Prueba {

    public static void main(String[] args) throws IOException {

        Lectura pru = new Lectura("https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/datasets/0_train_balanced_15000.csv");
        Arbol a = new Arbol();
        pru.leeDatos();
        LinkedList<Estudiante> ld3 = pru.getEstudiantes();
        int cont = 0;
       
//        Pair<LinkedList<Estudiante>,LinkedList<Estudiante>>  parejaDeMatrices = a.dividirUnaMatrizEnDosMatrices(ld3, 32, "Estrato 6");      
//        System.out.println("impureza "+a.laImpurezaDeLosDatosDeUnaMatriz(parejaDeMatrices.getValue()));
        Pair<Integer,String>  parejaDeMatrices = a.encontrarEnQuePosEstaLaMejorVariableYQueValorDeboCompararEnLaCondicion(ld3);
        System.out.println(" gini ponderado "+ parejaDeMatrices.getValue() + parejaDeMatrices.getKey()); 
        int dataSize = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria máxima: " + runtime.maxMemory() / dataSize + "MB");
        System.out.println("Memoria total: " + runtime.totalMemory() / dataSize + "MB");
        System.out.println("Memoria libre: " + runtime.freeMemory() / dataSize + "MB");
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / dataSize + "MB");
    }
}
