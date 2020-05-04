/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author julianrojasgallego
 */
public class Lab05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Lectura lee = new Lectura();
        HashMap<Long, Node> node = lee.leeDatosNodos();
        ArrayList<Rutas<Long , Long, Double>> rutas = lee.leeDatosAristas();
        Punto1 grafo = new Punto1(node,rutas);
        System.out.println(grafo.adjGraph.size()+"");
        System.out.println(node.get(new Long(287291920)).id);
        
        Long l = new Long(287291920);
        Long l2 = new Long(1397149003);
        
        ArrayList<Long> test1 = grafo.getSuccessors(l);
        System.out.println("Numero de vecinos "+test1.size());
        
        for(Long i : test1) {
            System.out.println(i);
        }
        System.out.println("Distance: " + grafo.getWeight(l, l2));
    }
        
        
    }
    

