/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Iterator;
import java.util.LinkedList;
import javafx.util.Pair;

/**
 *
 * @author julianrojasgallego
 */
public class Arbol {
    public float laImpurezaDeLosDatosDeUnaMatriz(LinkedList<Estudiante> m){
        int losQueTienenExito = 0;
        for (int fila = 0; fila < m.get(0).getVaribles().size(); fila++){
            if (m.get(fila).getVaribles().get(m.get(0).getVaribles().size()-1).equals("1"))losQueTienenExito++;
        }
        int losQueNoTienenExito = m.size() - losQueTienenExito;
        float proporcionDeLosQueTienenExito = losQueTienenExito/m.size();
        float proporcionDeLosQueNoTieneExito = losQueNoTienenExito/m.size();
        System.out.println("proporcionDeLosQueTienenExito "+losQueTienenExito);
        float impureza = 1 - ((proporcionDeLosQueTienenExito*proporcionDeLosQueTienenExito) - (proporcionDeLosQueNoTieneExito*proporcionDeLosQueNoTieneExito));
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
    
        System.out.println("EstudiantesLaVariableEsIgualAlValor "+matrizLaVariableEsIgualAlValor.size() ) ;
        Pair<LinkedList<Estudiante>,LinkedList<Estudiante>> parejaDeMatrices = new Pair<LinkedList<Estudiante>,LinkedList<Estudiante>>(matrizLaVariableEsIgualAlValor,matrizLaVariableNOEsIgualAlValor);
        return parejaDeMatrices;
    }
}
