/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author julianrojasgallego
 */
public class Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        Nodo r = new Nodo("root","root","root",0);
        Nodo c = new Nodo("root","julio","trabajos",1);
        Nodo c2 = new Nodo("root","julio","hobbies",2);
        Nodo c3 = new Nodo("trabajos","julio","enero",2);
        Nodo c4 = new Nodo("trabajos","juan","diciembre",1);
        Nodo c5 = new Nodo("hobbies","juan","futbol",1);
        Nodo c6 = new Nodo("diciembre","juan","fiesta",1);
        Nodo c7 = new Nodo("fiesta","juan","olimpiadas",12);
        Directorio d = new Directorio(r);
        
        
        d.addFile(c);
        d.addFile(c2);
        d.addFile(c3);
        d.addFile(c4);
        d.addFile(c5);
        d.addFile(c6);
        d.addFile(c7);
        d.search("fiesta");
        d.search("h");
        System.out.println(d.searchByAuthor(r, "juan"));;
        System.out.println(d.searchBySize(r, 1));;
        
    }
    
}
