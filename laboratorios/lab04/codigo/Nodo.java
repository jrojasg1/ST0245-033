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
public class Nodo {
    private String folder;
    private String user;
    private String file;
    private float size;
    private ArrayList hijos;

    public Nodo(String folder,String user, String file, float size) {
        this.folder = folder;
        this.user = user;
        this.file = file;
        this.size = size;
        this.hijos = new ArrayList<Nodo>();
        
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    
    
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public ArrayList<Nodo> getHijos() {
        return hijos;
    }


    

    
    
    
}
