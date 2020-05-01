/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller12;

/**
 *
 * @author julianrojasgallego
 */
public class Taller12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo_LA g2 = new Grafo_LA(6);
        
        g2.addArc(2, 6, 1);
        g2.addArc(2, 3, 1);
        g2.addArc(0, 1, 1);
        g2.addArc(0, 2, 2);
        g2.addArc(0, 3, 1);
        g2.addArc(3, 6, 1);
        g2.addArc(3, 4, 1);
        g2.addArc(1, 0, 1);
        g2.recorridoDFS(2, 1);
        System.out.println("sucersor "+g2.getWeight(2, 3));
    }
    
}
