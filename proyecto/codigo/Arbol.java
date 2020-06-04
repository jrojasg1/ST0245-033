/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;
import java.util.ArrayList;
import java.util.TreeSet;
import javaapplication17.Estudiante;
import javafx.util.Pair;
/**
 * @version 2.0.0
 * @author junpablocortes
 * clase para crear el arbol de decision
 */

public class Arbol {

 
    private static ArrayList<String> exito = new ArrayList<>(); // Guarda todos los estudiantes con exito
    private static int con = 0;
    private static int conNodos = 0;
    /**
 * 
 * metodo para crear nodos del arbol 
 * @return nuevo nodo
 * @param m
 * @param tamaño del dataset
 * 
 */
    public Nodo crearNodo(ArrayList<Estudiante> m, int tamaño){
        return crearNodo(m, tamaño, 0);
    }

    // Crea los nodos de ser necesario
    public Nodo crearNodo(ArrayList<Estudiante> m, int tamaño, int cont){
        // int ayuda = cont; // Para dibujar arbol
        if (m.size() == 0) return null; // Si no hay estudiantes no hay nodo
        // if(cont == 3) return null; // para Dibujar arbol de la exposicion
        cont++;
        //conNodos ++; // Para comparar con el dibujo de los arboles
        if(todo(m, "si")){
            return new Nodo(null, null, m); // Si todos los estudiantes tienen exito crea un nodo con ellos
        }
        if(todo(m, "no")){
            return new Nodo(null, null, m); // Si todos los estudiantes no tienen exito crea un nodo con ellos
        }
        Pair<Integer,String> mejorVariable = mejorVariable(m, tamaño); // Saca la mejor variable y valor del arrayList
        Pair<ArrayList<Estudiante>,ArrayList<Estudiante>> dividos = dividirEnDos(m, mejorVariable.getKey(), mejorVariable.getValue()); // Divide en dos el arrayList con la mejor variable y su valor
        // con++;
        
        // System.out.println(m.size() + "->" + dividos.getValue().size());
        Nodo nodoDerecho = crearNodo(dividos.getKey(), tamaño, cont); // Crea nodo derecho
        // con++;
        // System.out.println(m.size() + "->" + dividos.getKey().size());
        Nodo nodoizquierdo = crearNodo(dividos.getValue(), tamaño, cont); // Crea el nodo izquierdo
        System.out.println("\""+m.get(0).getVaribles().get(mejorVariable.getKey()) + "\""+" -> " + "\""+nodoDerecho.getDatos().get(0).getVaribles().get(72)+ "\"");
        System.out.println("\""+m.get(0).getVaribles().get(mejorVariable.getKey()) + "\""+" -> " + "\""+nodoizquierdo.getDatos().get(0).getVaribles().get(mejorVariable.getKey())+ "\"");
        return new Nodo(nodoDerecho, nodoizquierdo, m); // Devuelve el Nodo
    }

    public static int getConNodos() {
        return conNodos;
    }

    // Todos los valores son exito o no exito
    public boolean todo(ArrayList<Estudiante> m, String v){
        if (v.equals("si")) {
            for (Estudiante estudiante : m) { if (estudiante.getVaribles().get(77).equals("0")) return false; }
            return true;
        }if(v.equals("no")) {
            for (Estudiante estudiante : m) { if (estudiante.getVaribles().get(77).equals("1")) return false; }
            return true;
        }
        return false;
    }
/**
 * 
 * metodo Devuelve los estudiantes con exito
 * @return Array de Strings con el consecutivo del estudiante
 */
    // 
    public static ArrayList<String> getExito() {
        return exito;
    }

    // Recorrer el arbol y almacena los estudiantes con exito
    public void recArbol(Nodo cual){
        boolean seguir = true;
        if (cual.getDerecha() == null && cual.getIzquierda() == null){ // Almacena los estudiantes de los ultimos nodos de cada rama
            for(int i = 0; i < cual.getDatos().size(); i++){
                if (cual.getDatos().get(i).getVaribles().get(77).equals("0")) {
                    seguir = false;
                    break;
                }
            }
            // Guarda los estudiantes con exito
            if (seguir) { for (int i = 0; i < cual.getDatos().size(); i++) { if (cual.getDatos().get(i).getVaribles().get(77).equals("1")) { exito.add(cual.getDatos().get(i).getVaribles().get(0)); } } }
        }
        if (cual.getIzquierda() != null) recArbol(cual.getIzquierda()); // Recorre el arbol por izquierda
        if (cual.getDerecha() != null) recArbol(cual.getDerecha()); // Recorre el arbol por derecha

        
    }

    private boolean esNumero(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
/**
 * 
 * metodo Devuelve los valores de una variable
 * @return TreeSet con los valores 
 * @param m
 * @param dato 
 */
    // Metodo Para obtener los valores de una variable
    public TreeSet<String> valoresVariable(ArrayList<Estudiante> m, int dato){
        TreeSet<String> valores = new TreeSet<>();
        for (Estudiante estudiante : m){
            // if (esNumero(estudiante.getVaribles().get(dato))){ valores.add(estudiante.getVaribles().get(dato)); }
            // return null;
             valores.add(estudiante.getVaribles().get(dato));
        }
        return valores;
    }
/**
 * 
 * Metodo para saber cuantos estudiantes tienen un valor en una variable
 * @return numero de estudiantes con el valor especificado
 * @param m
 * @param dato
 * @param val
 */
    // 
    public int numValores(ArrayList<Estudiante> m, int dato, String val) {
        int numVeces = 0;
        for (Estudiante estudiante : m) { if (estudiante.getVaribles().get(dato).equals(val)) { numVeces++; }}
        return numVeces;
    }
/**
 * 
 *  Metodo Para dividir un ArrayList en dos ArrayList
 * @return pareja de Arrays
 * @param m
 * @param dato
 * @param val
 */
    
    public Pair<ArrayList<Estudiante>, ArrayList<Estudiante>> dividirEnDos (ArrayList<Estudiante> m, int dato, String val) {
        int numValores = numValores(m, dato, val);
        ArrayList<Estudiante> igual = new ArrayList<>(numValores);
        ArrayList<Estudiante> diferentes = new ArrayList<>(m.size() - numValores);
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getVaribles().get(dato).equals(val)) { igual.add(m.get(i)); }
            else { diferentes.add(m.get(i)); }
        }
        return new Pair<>(igual, diferentes);
    }
/**
 * 
 *  Metodo Para  Calcular gini de una matriz
 * @return numero decimal con el valor del gini
 * @param m
 */
    
    public double giniArray (ArrayList<Estudiante> m) {
        double losQueSi = numValores(m, 77, "1");
        if (m.size() != 0) { return 1 - Math.pow((m.size() - losQueSi) / m.size(), 2) - Math.pow(losQueSi / m.size(), 2); }
        return 1;
    }
/**
 * 
 *  Metodo Para  Calcular gini de un valor de una variable
 * @return numero decimal con el valor del gini
 * @param m
 * @param dato
 * @param val
 */
    
    
    public double giniValor (ArrayList<Estudiante> m, int dato,  String val){
        Pair<ArrayList<Estudiante>, ArrayList<Estudiante>> dividido = dividirEnDos(m, dato, val);
        return (( giniArray(dividido.getKey()) * dividido.getKey().size()) + (giniArray(dividido.getValue()) * dividido.getValue().size())) / m.size();
    }
/**
 * 
 *  Metodo Para  Busca la mejor variable
 * @return posicion de la variable y el valor de la misma
 * @param m 
 * @param tamaño 
 */
    // 
    public Pair<Integer,String> mejorVariable(ArrayList<Estudiante> m, int tamaño){
        double minGini = 100;
        String val = "";
        int dato = -1;

        for (int i = 1; i < m.get(0).getVaribles().size()-1; i++) {
            TreeSet<String> valores = valoresVariable(m, i);
            if (valores.size() < 10 || m.size() < 20) {
                for (String altTemp : valores) {
                    double giniTemp = giniValor(m, i, altTemp);
                    if (giniTemp <= minGini) {
                        val = altTemp;
                        minGini = giniTemp;
                        dato = i;
                    }
                }
            }
        }
        return new Pair<>(dato, val);
    }
}