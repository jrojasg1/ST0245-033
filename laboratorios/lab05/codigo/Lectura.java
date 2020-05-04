/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author julianrojasgallego
 */
public class Lectura {

    public HashMap<Long, Node> leeDatosNodos() {
        HashMap<Long, Node> nodes = new HashMap<>();
        try{
            FileReader f  = new FileReader("Vertices.txt");
            BufferedReader b = new BufferedReader(f);
            String line;
            int lineCount = 0;
            while((line = b.readLine()) != null) {
                if(lineCount != 0) {
                    String[] data = line.split(" ");
                    Long id = Long.parseLong(data[0]);
                    Double x = Double.parseDouble(data[1]);
                    Double y = Double.parseDouble(data[2]);
                    Node v = new Node(id);
                    nodes.put(v.id, v);  
                }
                lineCount++;
            }
            b.close();
            return nodes;
        }catch (IOException e) {
            System.out.println("Asegurece de tener el documento ''Vertices''");
        }
        return nodes;
    }
    
    public ArrayList<Rutas<Long, Long, Double>> leeDatosAristas() {
        ArrayList<Rutas<Long, Long, Double>> edges = new ArrayList<>();
        try{
            FileReader f  = new FileReader("Arcos.txt");
            BufferedReader b = new BufferedReader(f);
            String line;
            int lineCount = 0;
            while((line = b.readLine()) != null) {
                if(lineCount != 0) {
                    String[] data = line.split(" ");
                    Long source= Long.parseLong(data[0]);
                    Long destination = Long.parseLong(data[1]);
                    Double distance = Double.parseDouble(data[2]);
                    Rutas<Long, Long, Double> a = new Rutas(source, destination, distance);
                    edges.add(a);
                }
                lineCount++;
            }
            b.close();
        }catch (IOException e) {
            System.out.println("Asegurece de tener el documento ''Arcos''");
        }
        return edges;
    }
    
}
