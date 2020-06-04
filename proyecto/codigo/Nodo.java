/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;
import java.util.ArrayList;
import javaapplication17.Estudiante;
/**
 * @version 2.0.0
 * @author juanpablocortes
 * Clase para crear un nodo el cual almacena un ArrayLsit de tipo Estudiante.
 */

public class Nodo {

    private Nodo derecha;
    private Nodo izquierda;
    private ArrayList<Estudiante> datos;
/**
 * 
 *  Metodo Para  Busca la mejor variable
 * 
 */
    // Constructor
    public Nodo(Nodo derecha, Nodo izquierda, ArrayList<Estudiante> datos) {
        this.derecha = derecha;
        this.izquierda = izquierda;
        this.datos = datos;
    }
    
/**
 * 
 *  Metodo Para obtener el hijo derecho de un nodo
 * @return posicion en memoria del nodo hijo
 */
    // Getter y Setters
    public Nodo getDerecha() {
        return derecha;
    }

      
/**
 *  Metodo Para obtener el hijo izquierdo de un nodo
 * @return posicion en memoria del nodo hijo
 */ 
    public Nodo getIzquierda() {
        return izquierda;
    }
/**
 *  Metodo Para matriz de datos que almacena el nodo
 * @return matriz
 */ 
    public ArrayList<Estudiante> getDatos() {
        return datos;
    }
    
}