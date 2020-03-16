/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author julianrojasgallego
 */
public class Estudiante {
    private String nombre_;
    private int codigo;
    private String codMateria;
    private String semestre;
    private int grupo;  
    private String evaluacion;
    private double porcentaje;
    private String descripcion;
    private String materia;
    private int nota;
    private int definitiva;

    public Estudiante(String nombre_, int codigo, String codMateria, String semestre, int grupo, String evaluacion, double porcentaje, String descripcion, String materia, int nota, int definitiva) {

        this.nombre_ = nombre_;
        this.codigo = codigo;
        this.codMateria = codMateria;
        this.semestre = semestre;
        this.grupo = grupo;
        this.evaluacion = evaluacion;
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
        this.materia = materia;
        this.nota = nota;
        this.definitiva = definitiva;
    }

    public String getNombre_() {
        return nombre_;
    }

    public void setNombre_(String nombre_) {
        this.nombre_ = nombre_;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(String codMateria) {
        this.codMateria = codMateria;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(int definitiva) {
        this.definitiva = definitiva;
    }
}
