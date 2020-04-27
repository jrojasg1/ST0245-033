/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.util.ArrayList;

/**
 *
 * @author julianrojasgallego
 */
public class Directorio {
    public static Nodo root;
    
    
    public Directorio(Nodo r){
        Directorio.root = r;
    }
    
    public void addFile( Nodo n){
        Nodo r = root,ant=null;
        addFileAux(r,n);
    }
    private void addFileAux(Nodo r,Nodo n){
        if(n.getFolder().equals(r.getFile())){
            r.getHijos().add(n);
        }else{
            for (int i = 0; i < r.getHijos().size(); i++){
                    if(r.getHijos().get(i).getFile().equals(n.getFolder())){
                        r = r.getHijos().get(i);
                        r.getHijos().add(n);
                   }else{
                    if(r.getHijos().isEmpty()){addFileAux(r,n);}
                    addFileAux(r.getHijos().get(i),n);
                }
            }
        }
        
    }
    
    public void search(String name) throws Exception {
        Nodo p = root;
        if(searchAux(p,name)){System.out.println(name);
        }else{
            throw new Exception("No such File or Directory");
        }
    }
    private boolean searchAux(Nodo r, String name) {
        if(r.getFile().equals(name)){
            return true;
        }else{
            for (int i = 0; i < r.getHijos().size(); i++){
                    if(searchAux(r.getHijos().get(i),name)){
                        return true;
                    }
            }
            
           return false;
           
        }
        
    }
    public ArrayList<String>  searchByAuthor(Nodo r, String autor){
        ArrayList<String> p = new ArrayList<String>();
        
        return searchByAuthorAux(r,autor,p);
    }
    
    private ArrayList<String>  searchByAuthorAux(Nodo r, String autor,ArrayList<String> p){
        
        if(r.getHijos().size()>0){
            for (int i = 0; i < r.getHijos().size(); i++){
                    searchByAuthorAux(r.getHijos().get(i),autor,p);
            }
        }
        if(r.getUser().equals(autor)){
                p.add(r.getFile());
        }
        return p;   
    }
    
    public ArrayList<String> searchBySize(Nodo r, double s){
        ArrayList<String> p = new ArrayList<String>();
        return searchBySizeAux(r,  s, p);
    }
    private ArrayList<String>  searchBySizeAux(Nodo r, double s,ArrayList<String> p){
        
        if(r.getHijos().size()>0){
            for (int i = 0; i < r.getHijos().size(); i++){
                    searchBySizeAux(r.getHijos().get(i),s,p);
            }
        }
        if(r.getSize() == s){
                p.add(r.getFile());
        }
        return p;   
    }
    public void printFiles(Nodo a){
        
    }
}
