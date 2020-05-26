/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.LinkedList;
import javafx.util.Pair;

/**
 *
 * @author julianrojasgallego
 */
public class Arbol {
    
    public float laImpurezaDeLosDatosDeUnaMatriz(LinkedList<Estudiante> m){
        int losQueTienenExito = 0;
        int cont = 0;
        for (int fila = 1; fila < m.size() ; fila++){
            if (m.get(fila).getVaribles().get(m.get(fila).getVaribles().size()-1).equalsIgnoreCase("1")){
                losQueTienenExito++;  
            }       
        }
        int losQueNoTienenExito = m.size()-losQueTienenExito;
        float proporcionDeLosQueTienenExito =(float) losQueTienenExito/(m.size()-1);
        float proporcionDeLosQueNoTieneExito = (float) losQueNoTienenExito/(m.size()-1);
        System.out.println("no exito "+proporcionDeLosQueNoTieneExito);
        float imp = (proporcionDeLosQueTienenExito*proporcionDeLosQueTienenExito)-(proporcionDeLosQueNoTieneExito*proporcionDeLosQueNoTieneExito);
        System.out.println("proporcion "+imp);
        float impureza = 1 - imp;
        return impureza;       
    }
    
    
    
    public  Pair<LinkedList<Estudiante>,LinkedList<Estudiante>> dividirUnaMatrizEnDosMatrices(LinkedList<Estudiante> m, int posVariable, String valor){
    LinkedList<Estudiante> matrizLaVariableEsIgualAlValor = new LinkedList<>();
    LinkedList<Estudiante> matrizLaVariableNOEsIgualAlValor = new LinkedList<>();
    // Copiar los datos a las matrices
    int fila = 1;
    int filaN1 = 1;
    int filaN2=1;
    while(fila < m.size()){
        if(m.get(fila).getVaribles().get(posVariable).equalsIgnoreCase(valor)){
            matrizLaVariableEsIgualAlValor.add(m.get(filaN1));
            fila++;
            filaN1++;
        }else
        {
            matrizLaVariableNOEsIgualAlValor.add(m.get(filaN2));
            fila++;
            filaN2++;
        }
    }
    
//        System.out.println("EstudiantesLaVariableEsIgualAlValor "+matrizLaVariableEsIgualAlValor.size() ) ;
        Pair<LinkedList<Estudiante>,LinkedList<Estudiante>> parejaDeMatrices = new Pair<LinkedList<Estudiante>,LinkedList<Estudiante>>(matrizLaVariableEsIgualAlValor,matrizLaVariableNOEsIgualAlValor);
        return parejaDeMatrices;
    }
}
