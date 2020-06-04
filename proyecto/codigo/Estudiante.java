/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.ArrayList;

/**
 * @version 2.0.0
 * @author julianrojasgallego
 * clse para guardar datos asociados al studiante, donde por cada estudiante 
 * se crea un Arraylist para guardar sus atributos
 */
public class Estudiante {
 
    private ArrayList<String> varibles ;
    // constructor
    public Estudiante(String estu_consecutivo, String estu_exterior, String periodo, String estu_tieneetnia, String estu_tomo_cursopreparacion, String estu_cursodocentesies, String estu_cursoiesapoyoexterno, String estu_cursoiesexterna, String estu_simulacrotipoicfes, String estu_actividadrefuerzoareas, String estu_actividadrefuerzogeneric, String fami_trabajolaborpadre, String fami_trabajolabormadre, String fami_numlibros, String estu_inst_cod_departamento, String estu_tipodocumento, String estu_nacionalidad, String estu_generoestu, String fechanacimiento, String periodo1, String estu_estudiante, String estu_pais_reside, String estu_depto_reside, String estu_cod_reside_depto, String estu_mcpio_reside, String estu_cod_reside_mcpio, String estu_areareside, String estu_valorpensioncolegio, String fami_educacionpadre, String fami_educacionmadre, String fami_ocupacionpadre, String fami_ocupacionmadre, String fami_estratovivienda, String fami_nivelsisben, String fami_pisoshogar, String fami_tieneinternet, String fami_tienecomputador, String fami_tienemicroondas, String fami_tienehorno, String fami_tieneautomovil, String fami_tienedvd, String fami_tiene_nevera, String fami_tiene_celular, String fami_telefono, String fami_ingresofmiliarmensual, String estu_trabajaactualmente, String estu_antecedentes, String estu_expectativas, String cole_codigo_icfes, String cole_cod_dane_establecimiento, String cole_nombre_establecimiento, String cole_genero, String cole_naturaleza, String cole_calendario, String cole_bilingue, String cole_caracter, String cole_cod_dane_sede, String cole_nombre_sede, String cole_sede_principal, String cole_area_ubicacion, String cole_jornada, String cole_cod_mcpio_ubicacion, String cole_mcpio_ubicacion, String cole_cod_depto_ubicacion, String cole_depto_ubicacion, String punt_lenguaje, String punt_matematicas, String punt_biologia, String punt_quimica, String punt_fisica, String punt_ciencias_sociales, String punt_filosofia, String punt_ingles, String desemp_ingles, String profundiza, String puntaje_prof, String desemp_prof, String exito) {
         
        varibles = new ArrayList<String>(78);
        varibles.add(estu_consecutivo);
        varibles.add(estu_exterior);
        varibles.add(periodo);
        varibles.add(estu_tieneetnia);
        varibles.add(estu_tomo_cursopreparacion);
        varibles.add(estu_cursodocentesies);
        varibles.add(estu_cursoiesapoyoexterno);
        varibles.add(estu_cursoiesexterna);
        varibles.add(estu_simulacrotipoicfes);
        varibles.add(estu_actividadrefuerzoareas);
        varibles.add(estu_actividadrefuerzogeneric);
        varibles.add(fami_trabajolaborpadre);
        varibles.add(fami_trabajolabormadre);
        varibles.add(fami_numlibros);
        varibles.add(estu_inst_cod_departamento);
        varibles.add(estu_tipodocumento);
        varibles.add(estu_nacionalidad);
        varibles.add(estu_generoestu);
        varibles.add(fechanacimiento);
        varibles.add(periodo1);
        varibles.add(estu_estudiante);
        varibles.add(estu_pais_reside);
        varibles.add(estu_depto_reside);
        varibles.add(estu_cod_reside_depto);
        varibles.add(estu_mcpio_reside);
        varibles.add(estu_cod_reside_mcpio);
        varibles.add(estu_areareside);
        varibles.add(estu_valorpensioncolegio);
        varibles.add(fami_educacionpadre);
        varibles.add(fami_educacionmadre);
        varibles.add(fami_ocupacionpadre);
        varibles.add(fami_ocupacionmadre);
        varibles.add(fami_estratovivienda);
        varibles.add(fami_nivelsisben);
        varibles.add(fami_pisoshogar);
        varibles.add(fami_tieneinternet);
        varibles.add(fami_tienecomputador);
        varibles.add(fami_tienemicroondas);
        varibles.add(fami_tienehorno);
        varibles.add(fami_tieneautomovil);
        varibles.add(fami_tienedvd);
        varibles.add(fami_tiene_nevera);
        varibles.add(fami_tiene_celular);
        varibles.add(fami_telefono);
        varibles.add(fami_ingresofmiliarmensual);
        varibles.add(estu_trabajaactualmente);
        varibles.add(estu_antecedentes);
        varibles.add(estu_expectativas);
        varibles.add(cole_codigo_icfes);
        varibles.add(cole_cod_dane_establecimiento);
        varibles.add(cole_nombre_establecimiento);
        varibles.add(cole_genero);
        varibles.add(cole_naturaleza);
        varibles.add(cole_calendario);
        varibles.add(cole_bilingue);
        varibles.add(cole_caracter);
        varibles.add(cole_cod_dane_sede);
        varibles.add(cole_nombre_sede);
        varibles.add(cole_sede_principal);
        varibles.add(cole_area_ubicacion);
        varibles.add(cole_jornada);
        varibles.add(cole_cod_mcpio_ubicacion);
        varibles.add(cole_mcpio_ubicacion);
        varibles.add(cole_cod_depto_ubicacion);
        varibles.add(cole_depto_ubicacion);
        varibles.add(punt_lenguaje);
        varibles.add(punt_matematicas);
        varibles.add(punt_biologia);
        varibles.add(punt_quimica);
        varibles.add(punt_fisica);
        varibles.add(punt_ciencias_sociales);
        varibles.add(punt_filosofia);
        varibles.add(punt_ingles);
        varibles.add(desemp_ingles);
        varibles.add(profundiza);
        varibles.add(puntaje_prof);
        varibles.add(desemp_prof);
        varibles.add(exito);
        
        
    }

    /**
    * @return Varibles
    */
    public ArrayList<String> getVaribles() {
        return varibles;
    }
}
