/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

import java.util.ArrayList;
import java.util.LinkedList;
import javafx.util.Pair;

/**
 *
 * @author julianrojasgallego
 */
public class Grafo_LA extends Digrafo{
    
    ArrayList<LinkedList<Pair<Integer,Integer>>> listaDeListas;
    /**
    * Constructor para el grafo dirigido
    * @param vertices el numero de vertices que tendra el grafo dirigido
    *
    */
    public Grafo_LA(int size) {
        super(size);
	listaDeListas = new ArrayList<>();
        for (int i = 0; i < size + 1; i++) {
            listaDeListas.add(new LinkedList<>());   
        }
        
    }

 

    /**
    * Metodo para añadir un arco nuevo, donde se representa cada nodo con un entero
    * y se le asigna un peso a la longitud entre un nodo fuente y uno destino    
    * @param source desde donde se hara el arco
    * @param destination hacia donde va el arco
    * @param weight el peso de la longitud entre source y destination
    */
    public void addArc(int source, int destination, int weight) {
         listaDeListas.get(source).add(new Pair<>(destination,weight));
//        LinkedList<Pair<Integer,Integer>> destinos = listaDeListas.get(source);
//        Pair<Integer,Integer> nuevoDestinoYsuPeso = new Pair(destination, weight);
//        destinos.add(nuevoDestinoYsuPeso);
    }

 

    /**
    * Metodo para obtener una lista de hijos desde un nodo, es decir todos los nodos
    * asociados al nodo pasado como argumento
    * @param vertex nodo al cual se le busca los asociados o hijos
    * @return todos los asociados o hijos del nodo vertex, listados en una ArrayList
    * Para más información de las clases:
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
    */
    
    public ArrayList<Integer> getSuccessors(int vertex) {
        ArrayList<Integer> sucesores = new ArrayList<Integer>();        
        listaDeListas.get(vertex).forEach(i -> sucesores.add(i.getKey())); 
        return sucesores;
        
    }

 

    /**
    * Metodo para obtener el peso o longitud entre dos nodos
    * 
    * @param source desde donde inicia el arco
    * @param destination  donde termina el arco
    * @return un entero con dicho peso
    */    
    public int getWeight(int source, int destination) {
        int cont = 0;
        for (Pair<Integer, Integer> integerIntegerPair : listaDeListas.get(source)) {
            if (integerIntegerPair.getKey() == destination ) cont = integerIntegerPair.getValue();
        }
        return cont;
    }

    
}
