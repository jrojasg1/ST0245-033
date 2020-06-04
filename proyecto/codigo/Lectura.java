/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
/**
 * @version 2.0.0
 * @author julianrojasgallego
 * clase para leer datos y luego almacenarlos
 */

public class Lectura {

    // variable para la url
    private String urlP;

    // ArrayList con estudiantes
    private ArrayList<Estudiante> estudiantes = new ArrayList<>(135000);

    // constructor
    public Lectura(String url) {
        this.urlP = url;
    }
/**
 * metodo para leer los datos
 */
    
    public void leeDatos() throws IOException{

        // se leer la URL
        URL url = new URL(urlP);

        // para asegurar conexion
        URLConnection con = url.openConnection();

        // puente de secuencia bytes a secuencia de caracteres
        InputStreamReader csv = new InputStreamReader(con.getInputStream());

        // Lee texto
        BufferedReader lee = new BufferedReader(csv);

        // Para separar el texto
        String linea;
        String pSpl = ";";

        // guardar información
        while ((linea = lee.readLine()) != null){

            // guardar en un array para luego asignar los valores por separado
            String[] val = linea.split(pSpl);

            // se crea nuevo estudiante
            Estudiante nuevo = new Estudiante(val[0], val[1], val[2], val[3], val[4], val[5], val[6], val[7], val[8], val[9], val[10], val[11], val[12], val[13], val[14], val[15], val[16], val[17], val[18], val[19], val[20], val[21], val[22], val[23], val[24], val[25], val[26], val[27], val[28], val[29], val[30], val[31], val[32], val[33], val[34], val[35], val[36], val[37], val[38], val[39], val[40], val[41], val[42], val[43], val[44], val[45], val[46], val[47], val[48], val[49], val[50], val[51], val[52], val[53], val[54], val[55], val[56], val[57], val[58], val[59], val[60], val[61], val[62], val[63], val[64], val[65], val[66], val[67], val[68], val[69], val[70], val[71], val[72], val[73], val[74], val[75], val[76], val[77]);

            // se guarda nuevo estudiante
            estudiantes.add(nuevo);
        }
    }
/**
 * @version 2.0.0
 * @author julianrojasgallego
 * @return ArrayList deestudiantes 
 * metodo para Obtener los datos de los estudiantes
 */
    
    // Para Obtener los datos de los estudiantes
    public ArrayList<Estudiante> getEstudiantes() { return estudiantes; }

}
