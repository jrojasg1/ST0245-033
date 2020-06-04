/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.io.IOException;
import java.util.LinkedList;
import javafx.util.Pair;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author julianrojasgallego
 */
public class Prueba {

    public static void main(String[] args) throws IOException {

       long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
 
     
        // Leer archivo y guardar datos
        // 5000   estudiantes   https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/datasets/0_test_balanced_5000.csv   con if 6
        // 15000  estudiantes_0 https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/datasets/0_train_balanced_15000.csv  con if 22
        // 15000  estudiantes_1 https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/datasets/1_test_balanced_15000.csv   con if 23
        // 25000  estudiantes   https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/datasets/2_test_balanced_25000.csv   con if 40
        // 35000  estudiantes   https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/datasets/3_test_balanced_35000.csv   con if 60
        // 45000  estudiantes_1 https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/datasets/1_train_balanced_45000.csv  con if 74
        // 45000  estudiantes_4 https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/datasets/4_test_balanced_45000.csv   con if 90
        // 75000  estudiantes   https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/datasets/2_train_balanced_75000.csv  con if 147
        // 105000 estudiantes   https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/datasets/3_train_balanced_105000.csv con if 211
        // 135000 estudiantes   https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/datasets/4_train_balanced_135000.csv con if 327
        Lectura pru = new Lectura("https://raw.githubusercontent.com/mauriciotoro/ST0245-Eafit/master/proyecto/datasets/4_test_balanced_45000.csv");
        pru.leeDatos(); // Guarda los estudiantes y sus datos
        ArrayList<Estudiante> ld3 = pru.getEstudiantes(); // Pasar toods los datos

        Arbol a = new Arbol(); // Crea el arbol
//
//        // Pregunar al usuario de cuanto desea que sea el tamño de la cantidad de variables
//        System.out.println("¿Cuál es el tamaño maxímo que desea para la cantidad valores de una variable?");
//        System.out.println("Es recomenable tener un valor entre 2 y 100, entre mayor sea él tamaño más precisión y más tiempo de ejecución");
//
//        Scanner esc = new Scanner(System.in);
//        int tamaño = esc.nextInt();
        Nodo raiz = a.crearNodo(ld3,45000); // Armar el arbol
        a.recArbol(raiz); // Recorrer el arbol
        ArrayList<String> resultado = Arbol.getExito(); // Almacenar codigo de los estudiantes con exito
//
        System.out.println(ld3.get(0).getVaribles().get(72)); // Cuantos estudiantes con exito
  
       
        TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("Tiempo de ejecución en segundos: " + tiempo/1000);
        int dataSize = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria máxima: " + runtime.maxMemory() / dataSize + "MB");
        System.out.println("Memoria total: " + runtime.totalMemory() / dataSize + "MB");
        System.out.println("Memoria libre: " + runtime.freeMemory() / dataSize + "MB");
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / dataSize + "MB");
    }
}
