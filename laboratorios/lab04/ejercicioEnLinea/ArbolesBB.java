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
public class ArbolesBB {
    Nodo raiz;
    
    ArbolesBB(){
        raiz = null;
    }
    public boolean esVacio(){
        return (raiz == null);
    }
    
    public void rec_inorden(Nodo r){
        if(r != null){
        rec_inorden(r.getLi());
        System.out.print( r.getDato());
        rec_inorden(r.getLd());
        }
    };
    
    public void rec_posorden(Nodo r){
        if(r != null){
        rec_posorden(r.getLi());
        rec_posorden(r.getLd());
        System.out.print( r.getDato());
        
        }
    };
    
    public void rec_preorden(Nodo r){
        if(r != null){
        System.out.print(r.getDato());
        rec_preorden(r.getLi());
        rec_preorden(r.getLd());
        }
    };
    
    public void insertar (int dato){
        
        Nodo p = raiz, ant = null;
        boolean sw = false;
        
        while (p!=null && sw == false) {            
           ant = p;
           
            if (dato > p.getDato()) {
                p = p.getLd();
            } else {
                
                if (dato < p.getDato()) {
                   p = p.getLi();
                } else {
                    sw = true;
                }
            }
        }
        
        if (sw==true) {
            System.out.println("el dato ya existe");
        } else {
            p = new Nodo (dato);
            if (raiz == null ) {
                raiz = p;
            } else {
                if (dato < ant.getDato()) {
                   ant.setLi(p);
                } else {
                    ant.setLd(p);
                }
            }
        }
    
    }
    
    public void ContarRaices(){
        Nodo p = raiz , ant =raiz;
        int cont = 0, cont2=0;

        while (p.getLi() != null ) {      
            cont++;
            p = p.getLi();
            
        }
        while (ant.getLd() != null) {  
           
             ant = ant.getLd();
             cont2++;
        }
        
        System.out.println("el numero de raices es: "+(cont+cont2));
    }
    
    public void Nodogrado1(){
        Nodo p = raiz , ant =raiz;
        int cont = 0, cont2=0;

        while (p.getLi() != null  ) {    
            if (p.getLd() == null) {
                cont++;
            }
            if(p.getLi() != null ){
            p = p.getLi();
            
            }else{
                p = p.getLi();
            }
            
        }
        while (ant.getLd() != null ) {  
           
             
             if (ant.getLi() != null || ant.getLd() !=null) {
                cont2++;
            }
             ant = ant.getLd();
             
        }
        
        System.out.println("el numero de nodos grado 1  es: "+(cont+cont2));
    }
    
    
}
