/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

/**
 *
 * @author julianrojasgallego
 */
public class ArbolesBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolesBB a = new ArbolesBB();
        a.insertar(3);
        a.insertar(5);
        a.insertar(2);
        a.insertar(1);
        a.insertar(6);
        a.insertar(8);
        a.insertar(7);
        System.out.println("la raiz es: "+ a.raiz.getDato());
        a.rec_posorden(a.raiz);
        a.ContarRaices();
        a.Nodogrado1();
    }
    
}
