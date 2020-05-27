/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.LinkedList;
import java.util.TreeSet;
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
        float imp = (proporcionDeLosQueTienenExito*proporcionDeLosQueTienenExito)+(proporcionDeLosQueNoTieneExito*proporcionDeLosQueNoTieneExito);       
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
    
    public  TreeSet<String> posiblesValoresSinRepetirDeUnaVariable(LinkedList<Estudiante> m, int variable){
        TreeSet<String> respuesta = new TreeSet();
        for (int fila = 1; fila < m.size(); fila++)
        respuesta.add(m.get(fila).getVaribles().get(variable));
        return respuesta;
    }
    
    public float calcularElGiniPonderado(LinkedList<Estudiante> m,int variable, String valor){
        Pair<LinkedList<Estudiante>,LinkedList<Estudiante>> parejaDeMatrices = dividirUnaMatrizEnDosMatrices(m,variable,valor);
        float elGiniDeLaMatrizDeLaIzquierda = laImpurezaDeLosDatosDeUnaMatriz(parejaDeMatrices.getKey());
        float elGiniDeLaMatrizDeLaDerecha = laImpurezaDeLosDatosDeUnaMatriz(parejaDeMatrices.getValue());
        float elGiniPonderado = ((elGiniDeLaMatrizDeLaIzquierda*parejaDeMatrices.getKey().size()) + (elGiniDeLaMatrizDeLaDerecha*parejaDeMatrices.getValue().size())) /  (parejaDeMatrices.getKey().size() + parejaDeMatrices.getValue().size());
        
        return elGiniPonderado;
    }
    
    
    public Pair<Integer,String> encontrarEnQuePosEstaLaMejorVariableYQueValorDeboCompararEnLaCondicion(LinkedList<Estudiante> m){
    float laImpurezaMenorDentreTodoElmundo = 1;
    String elMejorValorDentreTodoElMundo = "";
    int laPosDeLaVariableDondeEstaElMejorValor = -1;
    for (int columna = 1; columna < m.size() - 1; columna++){
        TreeSet<String> valores = posiblesValoresSinRepetirDeUnaVariable(m, columna);
        for (String unValor : valores){
            float impurezaPonderadaDeEstaColumnaConEsteValor = calcularElGiniPonderado(m, columna, unValor);
            if (impurezaPonderadaDeEstaColumnaConEsteValor < laImpurezaMenorDentreTodoElmundo){
                laImpurezaMenorDentreTodoElmundo = impurezaPonderadaDeEstaColumnaConEsteValor;
                elMejorValorDentreTodoElMundo = unValor;
                laPosDeLaVariableDondeEstaElMejorValor = columna;
            }
        }
    }
    Pair<Integer,String> respuesta = new Pair(laPosDeLaVariableDondeEstaElMejorValor, elMejorValorDentreTodoElMundo);
    return respuesta;
}
    
}
