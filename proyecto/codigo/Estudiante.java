/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.ArrayList;

/**
 *
 * @author julianrojasgallego
 */
public class Estudiante {
    
    
    // Variables
    private String estu_consecutivo, estu_exterior, periodo, estu_tieneetnia, estu_tomo_cursopreparacion;
    private String estu_cursodocentesies, estu_cursoiesapoyoexterno, estu_cursoiesexterna, estu_simulacrotipoicfes;
    private String estu_actividadrefuerzoareas, estu_actividadrefuerzogeneric, fami_trabajolaborpadre, fami_trabajolabormadre;
    private String fami_numlibros, estu_inst_cod_departamento, estu_tipodocumento, estu_nacionalidad, estu_generoestu, fechanacimiento;
    private String periodo1, estu_estudiante, estu_pais_reside, estu_depto_reside, estu_cod_reside_depto, estu_mcpio_reside;
    private String estu_cod_reside_mcpio, estu_areareside, estu_valorpensioncolegio, fami_educacionpadre, fami_educacionmadre;
    private String fami_ocupacionpadre, fami_ocupacionmadre, fami_estratovivienda, fami_nivelsisben, fami_pisoshogar;
    private String fami_tieneinternet, fami_tienecomputador, fami_tienemicroondas, fami_tienehorno, fami_tieneautomovil;
    private String fami_tienedvd, fami_tiene_nevera, fami_tiene_celular, fami_telefono, fami_ingresofmiliarmensual, estu_trabajaactualmente;
    private String estu_antecedentes, estu_expectativas, cole_codigo_icfes, cole_cod_dane_establecimiento, cole_nombre_establecimiento;
    private String cole_genero, cole_naturaleza, cole_calendario, cole_bilingue, cole_caracter, cole_cod_dane_sede, cole_nombre_sede;
    private String cole_sede_principal, cole_area_ubicacion, cole_jornada, cole_cod_mcpio_ubicacion, cole_mcpio_ubicacion, cole_cod_depto_ubicacion;
    private String cole_depto_ubicacion, punt_lenguaje, punt_matematicas, punt_biologia, punt_quimica, punt_fisica, punt_ciencias_sociales;
    private String punt_filosofia, punt_ingles, desemp_ingles, profundiza, puntaje_prof, desemp_prof, exito;
    private ArrayList<String> varibles = new ArrayList<String>(70);
    // constructor
    public Estudiante(String estu_consecutivo, String estu_exterior, String periodo, String estu_tieneetnia, String estu_tomo_cursopreparacion, String estu_cursodocentesies, String estu_cursoiesapoyoexterno, String estu_cursoiesexterna, String estu_simulacrotipoicfes, String estu_actividadrefuerzoareas, String estu_actividadrefuerzogeneric, String fami_trabajolaborpadre, String fami_trabajolabormadre, String fami_numlibros, String estu_inst_cod_departamento, String estu_tipodocumento, String estu_nacionalidad, String estu_generoestu, String fechanacimiento, String periodo1, String estu_estudiante, String estu_pais_reside, String estu_depto_reside, String estu_cod_reside_depto, String estu_mcpio_reside, String estu_cod_reside_mcpio, String estu_areareside, String estu_valorpensioncolegio, String fami_educacionpadre, String fami_educacionmadre, String fami_ocupacionpadre, String fami_ocupacionmadre, String fami_estratovivienda, String fami_nivelsisben, String fami_pisoshogar, String fami_tieneinternet, String fami_tienecomputador, String fami_tienemicroondas, String fami_tienehorno, String fami_tieneautomovil, String fami_tienedvd, String fami_tiene_nevera, String fami_tiene_celular, String fami_telefono, String fami_ingresofmiliarmensual, String estu_trabajaactualmente, String estu_antecedentes, String estu_expectativas, String cole_codigo_icfes, String cole_cod_dane_establecimiento, String cole_nombre_establecimiento, String cole_genero, String cole_naturaleza, String cole_calendario, String cole_bilingue, String cole_caracter, String cole_cod_dane_sede, String cole_nombre_sede, String cole_sede_principal, String cole_area_ubicacion, String cole_jornada, String cole_cod_mcpio_ubicacion, String cole_mcpio_ubicacion, String cole_cod_depto_ubicacion, String cole_depto_ubicacion, String punt_lenguaje, String punt_matematicas, String punt_biologia, String punt_quimica, String punt_fisica, String punt_ciencias_sociales, String punt_filosofia, String punt_ingles, String desemp_ingles, String profundiza, String puntaje_prof, String desemp_prof, String exito) {
        
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
    
    
    
    public String getEstu_consecutivo() {
        return estu_consecutivo;
    }

    public void setEstu_consecutivo(String estu_consecutivo) {
        this.estu_consecutivo = estu_consecutivo;
    }

    public String getEstu_exterior() {
        return estu_exterior;
    }

    public void setEstu_exterior(String estu_exterior) {
        this.estu_exterior = estu_exterior;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getEstu_tieneetnia() {
        return estu_tieneetnia;
    }

    public void setEstu_tieneetnia(String estu_tieneetnia) {
        this.estu_tieneetnia = estu_tieneetnia;
    }

    public String getEstu_tomo_cursopreparacion() {
        return estu_tomo_cursopreparacion;
    }

    public void setEstu_tomo_cursopreparacion(String estu_tomo_cursopreparacion) {
        this.estu_tomo_cursopreparacion = estu_tomo_cursopreparacion;
    }

    public String getEstu_cursodocentesies() {
        return estu_cursodocentesies;
    }

    public void setEstu_cursodocentesies(String estu_cursodocentesies) {
        this.estu_cursodocentesies = estu_cursodocentesies;
    }

    public String getEstu_cursoiesapoyoexterno() {
        return estu_cursoiesapoyoexterno;
    }

    public void setEstu_cursoiesapoyoexterno(String estu_cursoiesapoyoexterno) {
        this.estu_cursoiesapoyoexterno = estu_cursoiesapoyoexterno;
    }

    public String getEstu_cursoiesexterna() {
        return estu_cursoiesexterna;
    }

    public void setEstu_cursoiesexterna(String estu_cursoiesexterna) {
        this.estu_cursoiesexterna = estu_cursoiesexterna;
    }

    public String getEstu_simulacrotipoicfes() {
        return estu_simulacrotipoicfes;
    }

    public void setEstu_simulacrotipoicfes(String estu_simulacrotipoicfes) {
        this.estu_simulacrotipoicfes = estu_simulacrotipoicfes;
    }

    public String getEstu_actividadrefuerzoareas() {
        return estu_actividadrefuerzoareas;
    }

    public void setEstu_actividadrefuerzoareas(String estu_actividadrefuerzoareas) {
        this.estu_actividadrefuerzoareas = estu_actividadrefuerzoareas;
    }

    public String getEstu_actividadrefuerzogeneric() {
        return estu_actividadrefuerzogeneric;
    }

    public void setEstu_actividadrefuerzogeneric(String estu_actividadrefuerzogeneric) {
        this.estu_actividadrefuerzogeneric = estu_actividadrefuerzogeneric;
    }

    public String getFami_trabajolaborpadre() {
        return fami_trabajolaborpadre;
    }

    public void setFami_trabajolaborpadre(String fami_trabajolaborpadre) {
        this.fami_trabajolaborpadre = fami_trabajolaborpadre;
    }

    public String getFami_trabajolabormadre() {
        return fami_trabajolabormadre;
    }

    public void setFami_trabajolabormadre(String fami_trabajolabormadre) {
        this.fami_trabajolabormadre = fami_trabajolabormadre;
    }

    public String getFami_numlibros() {
        return fami_numlibros;
    }

    public void setFami_numlibros(String fami_numlibros) {
        this.fami_numlibros = fami_numlibros;
    }

    public String getEstu_inst_cod_departamento() {
        return estu_inst_cod_departamento;
    }

    public void setEstu_inst_cod_departamento(String estu_inst_cod_departamento) {
        this.estu_inst_cod_departamento = estu_inst_cod_departamento;
    }

    public String getEstu_tipodocumento() {
        return estu_tipodocumento;
    }

    public void setEstu_tipodocumento(String estu_tipodocumento) {
        this.estu_tipodocumento = estu_tipodocumento;
    }

    public String getEstu_nacionalidad() {
        return estu_nacionalidad;
    }

    public void setEstu_nacionalidad(String estu_nacionalidad) {
        this.estu_nacionalidad = estu_nacionalidad;
    }

    public String getEstu_generoestu() {
        return estu_generoestu;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setEstu_generoestu(String estu_generoestu) {
        this.estu_generoestu = estu_generoestu;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getPeriodo1() {
        return periodo1;
    }

    public void setPeriodo1(String periodo1) {
        this.periodo1 = periodo1;
    }

    public String getEstu_estudiante() {
        return estu_estudiante;
    }

    public void setEstu_estudiante(String estu_estudiante) {
        this.estu_estudiante = estu_estudiante;
    }

    public String getEstu_pais_reside() {
        return estu_pais_reside;
    }

    public void setEstu_pais_reside(String estu_pais_reside) {
        this.estu_pais_reside = estu_pais_reside;
    }

    public String getEstu_depto_reside() {
        return estu_depto_reside;
    }

    public void setEstu_depto_reside(String estu_depto_reside) {
        this.estu_depto_reside = estu_depto_reside;
    }

    public String getEstu_cod_reside_depto() {
        return estu_cod_reside_depto;
    }

    public void setEstu_cod_reside_depto(String estu_cod_reside_depto) {
        this.estu_cod_reside_depto = estu_cod_reside_depto;
    }

    public String getEstu_mcpio_reside() {
        return estu_mcpio_reside;
    }

    public void setEstu_mcpio_reside(String estu_mcpio_reside) {
        this.estu_mcpio_reside = estu_mcpio_reside;
    }

    public String getEstu_cod_reside_mcpio() {
        return estu_cod_reside_mcpio;
    }

    public void setEstu_cod_reside_mcpio(String estu_cod_reside_mcpio) {
        this.estu_cod_reside_mcpio = estu_cod_reside_mcpio;
    }

    public String getEstu_areareside() {
        return estu_areareside;
    }

    public void setEstu_areareside(String estu_areareside) {
        this.estu_areareside = estu_areareside;
    }

    public String getEstu_valorpensioncolegio() {
        return estu_valorpensioncolegio;
    }

    public void setEstu_valorpensioncolegio(String estu_valorpensioncolegio) {
        this.estu_valorpensioncolegio = estu_valorpensioncolegio;
    }

    public String getFami_educacionpadre() {
        return fami_educacionpadre;
    }

    public void setFami_educacionpadre(String fami_educacionpadre) {
        this.fami_educacionpadre = fami_educacionpadre;
    }

    public String getFami_educacionmadre() {
        return fami_educacionmadre;
    }

    public void setFami_educacionmadre(String fami_educacionmadre) {
        this.fami_educacionmadre = fami_educacionmadre;
    }

    public String getFami_ocupacionpadre() {
        return fami_ocupacionpadre;
    }

    public void setFami_ocupacionpadre(String fami_ocupacionpadre) {
        this.fami_ocupacionpadre = fami_ocupacionpadre;
    }

    public String getFami_ocupacionmadre() {
        return fami_ocupacionmadre;
    }

    public void setFami_ocupacionmadre(String fami_ocupacionmadre) {
        this.fami_ocupacionmadre = fami_ocupacionmadre;
    }

    public String getFami_estratovivienda() {
        return fami_estratovivienda;
    }

    public void setFami_estratovivienda(String fami_estratovivienda) {
        this.fami_estratovivienda = fami_estratovivienda;
    }

    public String getFami_nivelsisben() {
        return fami_nivelsisben;
    }

    public void setFami_nivelsisben(String fami_nivelsisben) {
        this.fami_nivelsisben = fami_nivelsisben;
    }

    public String getFami_pisoshogar() {
        return fami_pisoshogar;
    }

    public void setFami_pisoshogar(String fami_pisoshogar) {
        this.fami_pisoshogar = fami_pisoshogar;
    }

    public String getFami_tieneinternet() {
        return fami_tieneinternet;
    }

    public void setFami_tieneinternet(String fami_tieneinternet) {
        this.fami_tieneinternet = fami_tieneinternet;
    }

    public String getFami_tienecomputador() {
        return fami_tienecomputador;
    }

    public void setFami_tienecomputador(String fami_tienecomputador) {
        this.fami_tienecomputador = fami_tienecomputador;
    }

    public String getFami_tienemicroondas() {
        return fami_tienemicroondas;
    }

    public void setFami_tienemicroondas(String fami_tienemicroondas) {
        this.fami_tienemicroondas = fami_tienemicroondas;
    }

    public String getFami_tienehorno() {
        return fami_tienehorno;
    }

    public void setFami_tienehorno(String fami_tienehorno) {
        this.fami_tienehorno = fami_tienehorno;
    }

    public String getFami_tieneautomovil() {
        return fami_tieneautomovil;
    }

    public void setFami_tieneautomovil(String fami_tieneautomovil) {
        this.fami_tieneautomovil = fami_tieneautomovil;
    }

    public String getFami_tienedvd() {
        return fami_tienedvd;
    }

    public void setFami_tienedvd(String fami_tienedvd) {
        this.fami_tienedvd = fami_tienedvd;
    }

    public String getFami_tiene_nevera() {
        return fami_tiene_nevera;
    }

    public void setFami_tiene_nevera(String fami_tiene_nevera) {
        this.fami_tiene_nevera = fami_tiene_nevera;
    }

    public String getFami_tiene_celular() {
        return fami_tiene_celular;
    }

    public void setFami_tiene_celular(String fami_tiene_celular) {
        this.fami_tiene_celular = fami_tiene_celular;
    }

    public String getFami_telefono() {
        return fami_telefono;
    }

    public void setFami_telefono(String fami_telefono) {
        this.fami_telefono = fami_telefono;
    }

    public String getFami_ingresofmiliarmensual() {
        return fami_ingresofmiliarmensual;
    }

    public void setFami_ingresofmiliarmensual(String fami_ingresofmiliarmensual) {
        this.fami_ingresofmiliarmensual = fami_ingresofmiliarmensual;
    }

    public String getEstu_trabajaactualmente() {
        return estu_trabajaactualmente;
    }

    public void setEstu_trabajaactualmente(String estu_trabajaactualmente) {
        this.estu_trabajaactualmente = estu_trabajaactualmente;
    }

    public String getEstu_antecedentes() {
        return estu_antecedentes;
    }

    public void setEstu_antecedentes(String estu_antecedentes) {
        this.estu_antecedentes = estu_antecedentes;
    }

    public String getEstu_expectativas() {
        return estu_expectativas;
    }

    public void setEstu_expectativas(String estu_expectativas) {
        this.estu_expectativas = estu_expectativas;
    }

    public String getCole_codigo_icfes() {
        return cole_codigo_icfes;
    }

    public void setCole_codigo_icfes(String cole_codigo_icfes) {
        this.cole_codigo_icfes = cole_codigo_icfes;
    }

    public String getCole_cod_dane_establecimiento() {
        return cole_cod_dane_establecimiento;
    }

    public void setCole_cod_dane_establecimiento(String cole_cod_dane_establecimiento) {
        this.cole_cod_dane_establecimiento = cole_cod_dane_establecimiento;
    }

    public String getCole_nombre_establecimiento() {
        return cole_nombre_establecimiento;
    }

    public void setCole_nombre_establecimiento(String cole_nombre_establecimiento) {
        this.cole_nombre_establecimiento = cole_nombre_establecimiento;
    }

    public String getCole_genero() {
        return cole_genero;
    }

    public void setCole_genero(String cole_genero) {
        this.cole_genero = cole_genero;
    }

    public String getCole_naturaleza() {
        return cole_naturaleza;
    }

    public void setCole_naturaleza(String cole_naturaleza) {
        this.cole_naturaleza = cole_naturaleza;
    }

    public String getCole_calendario() {
        return cole_calendario;
    }

    public void setCole_calendario(String cole_calendario) {
        this.cole_calendario = cole_calendario;
    }

    public String getCole_bilingue() {
        return cole_bilingue;
    }

    public void setCole_bilingue(String cole_bilingue) {
        this.cole_bilingue = cole_bilingue;
    }

    public String getCole_caracter() {
        return cole_caracter;
    }

    public void setCole_caracter(String cole_caracter) {
        this.cole_caracter = cole_caracter;
    }

    public String getCole_cod_dane_sede() {
        return cole_cod_dane_sede;
    }

    public void setCole_cod_dane_sede(String cole_cod_dane_sede) {
        this.cole_cod_dane_sede = cole_cod_dane_sede;
    }

    public String getCole_nombre_sede() {
        return cole_nombre_sede;
    }

    public void setCole_nombre_sede(String cole_nombre_sede) {
        this.cole_nombre_sede = cole_nombre_sede;
    }

    public String getCole_sede_principal() {
        return cole_sede_principal;
    }

    public void setCole_sede_principal(String cole_sede_principal) {
        this.cole_sede_principal = cole_sede_principal;
    }

    public String getCole_area_ubicacion() {
        return cole_area_ubicacion;
    }

    public void setCole_area_ubicacion(String cole_area_ubicacion) {
        this.cole_area_ubicacion = cole_area_ubicacion;
    }

    public String getCole_jornada() {
        return cole_jornada;
    }

    public void setCole_jornada(String cole_jornada) {
        this.cole_jornada = cole_jornada;
    }

    public String getCole_cod_mcpio_ubicacion() {
        return cole_cod_mcpio_ubicacion;
    }

    public void setCole_cod_mcpio_ubicacion(String cole_cod_mcpio_ubicacion) {
        this.cole_cod_mcpio_ubicacion = cole_cod_mcpio_ubicacion;
    }

    public String getCole_mcpio_ubicacion() {
        return cole_mcpio_ubicacion;
    }

    public void setCole_mcpio_ubicacion(String cole_mcpio_ubicacion) {
        this.cole_mcpio_ubicacion = cole_mcpio_ubicacion;
    }

    public String getCole_cod_depto_ubicacion() {
        return cole_cod_depto_ubicacion;
    }

    public void setCole_cod_depto_ubicacion(String cole_cod_depto_ubicacion) {
        this.cole_cod_depto_ubicacion = cole_cod_depto_ubicacion;
    }

    public String getCole_depto_ubicacion() {
        return cole_depto_ubicacion;
    }

    public void setCole_depto_ubicacion(String cole_depto_ubicacion) {
        this.cole_depto_ubicacion = cole_depto_ubicacion;
    }

    public String getPunt_lenguaje() {
        return punt_lenguaje;
    }

    public void setPunt_lenguaje(String punt_lenguaje) {
        this.punt_lenguaje = punt_lenguaje;
    }

    public String getPunt_matematicas() {
        return punt_matematicas;
    }

    public void setPunt_matematicas(String punt_matematicas) {
        this.punt_matematicas = punt_matematicas;
    }

    public String getPunt_biologia() {
        return punt_biologia;
    }

    public void setPunt_biologia(String punt_biologia) {
        this.punt_biologia = punt_biologia;
    }

    public String getPunt_quimica() {
        return punt_quimica;
    }

    public void setPunt_quimica(String punt_quimica) {
        this.punt_quimica = punt_quimica;
    }

    public String getPunt_fisica() {
        return punt_fisica;
    }

    public void setPunt_fisica(String punt_fisica) {
        this.punt_fisica = punt_fisica;
    }

    public String getPunt_ciencias_sociales() {
        return punt_ciencias_sociales;
    }

    public void setPunt_ciencias_sociales(String punt_ciencias_sociales) {
        this.punt_ciencias_sociales = punt_ciencias_sociales;
    }

    public String getPunt_filosofia() {
        return punt_filosofia;
    }

    public void setPunt_filosofia(String punt_filosofia) {
        this.punt_filosofia = punt_filosofia;
    }

    public String getPunt_ingles() {
        return punt_ingles;
    }

    public void setPunt_ingles(String punt_ingles) {
        this.punt_ingles = punt_ingles;
    }

    public String getDesemp_ingles() {
        return desemp_ingles;
    }

    public void setDesemp_ingles(String desemp_ingles) {
        this.desemp_ingles = desemp_ingles;
    }

    public String getProfundiza() {
        return profundiza;
    }

    public void setProfundiza(String profundiza) {
        this.profundiza = profundiza;
    }

    public String getPuntaje_prof() {
        return puntaje_prof;
    }

    public void setPuntaje_prof(String puntaje_prof) {
        this.puntaje_prof = puntaje_prof;
    }

    public String getDesemp_prof() {
        return desemp_prof;
    }

    public void setDesemp_prof(String desemp_prof) {
        this.desemp_prof = desemp_prof;
    }

    public String getExito() {
        return exito;
    }

    public void setExito(String exito) {
        this.exito = exito;
    }
    

    public ArrayList<String> getVaribles() {
        return varibles;
    }

    public void setVaribles(ArrayList<String> varibles) {
        this.varibles = varibles;
    }
}
