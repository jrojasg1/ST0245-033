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
   
    
    public boolean buscar(int algo){
        return buscarAux(raiz, algo);
    }
    private boolean buscarAux(Nodo nodo, int algo){
        if( nodo == null)return false;
        if(nodo.getDato() == algo)return true;
        if (algo < nodo.getDato())
          return buscarAux(nodo.getLi(), algo);
        // else
        return buscarAux(nodo.getLd(), algo);
    }
    
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
    

    

    
    
}
