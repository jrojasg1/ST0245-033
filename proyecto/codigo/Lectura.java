/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author julianrojasgallego
 */
public class Lectura {

    // variable para la url
    private String urlP;

    // ArrayList con estudiantes
    private LinkedList<Estudiante> estudiantes;

    // constructor
    public Lectura(String url) {
        this.urlP = url;
        this.estudiantes = new LinkedList<>();
    }

    // metodo para leer los datos
    public void leeDatos() throws IOException {
        try {
            // se leer la URL
            URL url = new URL(urlP);

            // para asegurar conexion
            URLConnection con = url.openConnection();

            // puente de secuencia bytes a secuencia de caracteres
            Scanner archivo = new Scanner(con.getInputStream());
            // Para separar el texto
            String linea;
            String pSpl = ";";

            // guardar información
            while (archivo.hasNextLine()) {
                linea = archivo.nextLine();
                Scanner registro = new Scanner(linea);
                registro.useDelimiter(";");
                // se crea nuevo estudiante
                Estudiante nuevo = new Estudiante(registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next(), registro.next());
                // se guarda nuevo estudiante
                estudiantes.add(nuevo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("no se puede abrir");
        }
    }

    // tamaño del ArrayList estudiante
    public int getTamEst() {
        return estudiantes.size();
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
