/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;
import java.io.*;
import java.util.*;

public class Punto1{

  public int size;
    public ArrayList<Rutas<Node , Node, Double>> adjGraph = new ArrayList<>();
    
    public Punto1(HashMap<Long, Node> nodes, ArrayList<Rutas<Long , Long, Double>> edges){
        this.size = size();
        for(Rutas<Long , Long, Double> t : edges) {
            Rutas <Node, Node, Double> tr = new Rutas( t.x, t.y, t.z );
            adjGraph.add(tr);
        }
    }

    /**
     * Metodo para obtener una lista de hijos desde un nodo, es decir todos los nodos
     * asociados al nodo pasado como argumento
     * @param vertex nodo al cual se le busca los asociados o hijos
     * @return todos los asociados o hijos del nodo vertex, listados en una ArrayList
     * Para más información de las clases:
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
     */
    public  ArrayList<Long> getSuccessors(Long vertexID){
        ArrayList<Long> sucesores = new ArrayList<>();
        for(int i=0; i < adjGraph.size(); i++){
            Rutas<Node, Node, Double> n = adjGraph.get(i);
            Rutas<Long, Long, Double> n2 = new Rutas(n.x,n.y,n.z);
            if(vertexID.equals(n.x)){
                sucesores.add(n2.y);
            }
        }
        return sucesores;
    }

    /**
     * Metodo para obtener el peso o longitud entre dos nodos
     * 
     * @param source desde donde inicia el arco
     * @param destination  donde termina el arco
     * @return un entero con dicho peso
     */ 
    public Double getWeight(Long sourceID, Long destinationID){
        for(int i=0; i < adjGraph.size(); i++){
            if((sourceID.equals(adjGraph.get(i).x)) && (destinationID.equals(adjGraph.get(i).y))){
                return adjGraph.get(i).z;
            }
        }
        return -1.0;
    }

    /**
     * Metodo que tiene la intencion de retornar el tamaño del grafo
     * @return tamaño del grafo
     */
    public int size() {
        return this.size;
    }
}