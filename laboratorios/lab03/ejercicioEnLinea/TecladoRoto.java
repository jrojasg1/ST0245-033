/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author julianrojasgallego
 */
public class TecladoRoto {

    public void limpiar(LinkedList<String> texto) {

        if (texto.contains("[")) {
            ListIterator list_Iter2 = texto.listIterator(texto.indexOf("["));
            while (list_Iter2.hasNext() && "[".equals(list_Iter2.next())) {
                list_Iter2.remove();
            };
            texto.remove("[");
        } else if (texto.contains("]")) {
            ListIterator list_Iter2 = texto.listIterator(texto.indexOf("["));
            while (list_Iter2.hasNext() && "[".equals(list_Iter2.next())) {
                list_Iter2.remove();
            };

            texto.remove("]");
        }
    }

    ;
    public  void teclado(LinkedList<String> texto) {       
        String cadena = "";
        ListIterator list_Iter = texto.listIterator(0);
        while (list_Iter.hasNext()) {
            if ("[".equals(list_Iter.next())) {
                while (list_Iter.hasNext() && !"]".equals(list_Iter.next())) {
                    if ("[".equals(list_Iter.next())) {
                        while (list_Iter.hasNext() && !"]".equals(list_Iter.next())) {
                            cadena += texto.get(list_Iter.nextIndex() - 1);
                            list_Iter.remove();
                        };
                    } else {
                        cadena += texto.get(list_Iter.nextIndex() - 1);
                        list_Iter.remove();
                    }
                };

            }
        };
        limpiar(texto);
        texto.addFirst(cadena);
        ListIterator list_Iter2 = texto.listIterator(0);
        while (list_Iter2.hasNext()) {
            System.out.print(list_Iter2.next() + "");
        };

    }
    
    public static void main(String[] args) {
        TecladoRoto t = new TecladoRoto();
        LinkedList<String> texto = new LinkedList<String>();
        texto.add("asd");
        texto.add("[");
        texto.add("fgh");
        texto.add("[");
        texto.add("jkl");
        t.teclado(texto);
    }

}
