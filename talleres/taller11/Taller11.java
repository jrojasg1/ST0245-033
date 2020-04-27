/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

/**
 *
 * @author julianrojasgallego
 */
public class Taller11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo_MA g = new Grafo_MA(3);
        Grafo_MA g2 = new Grafo_MA(3);
        
        g.addArc(1, 0, 1);
        g.addArc(1, 2, 1);
        g.addArc(0, 2, 2);
        g2.addArc(1, 2, 1);
        g2.addArc(0, 1, 1);
        g2.addArc(0, 2, 2);
        System.out.println(g.getWeight(0, 2));;
        System.out.println("peso en listas");
        System.out.println(g2.getWeight(0, 2));;
    }
    
}
