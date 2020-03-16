/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author julianrojasgallego
 */
public class MarcoDeDatos {

    /**
     * LinkedList donde se almacenan los datos leidos *
     */
    LinkedList<Estudiante> al = new LinkedList<>();

    /**
     * Este método recibe el nombre del archivo que se va a leer. Se trata de
     * abrir el archivo, si se puede abrir, se leen y se muestran impresos los
     * datos y se retornan en un LinkedList que almacena referencias a objetos
     * tipo Dato.
     */
    public LinkedList<Estudiante> c1(String namefile) {

        try {
            File leer = new File(namefile);
            FileReader leer2 = new FileReader(leer);
            Scanner archivo = new Scanner(leer2);
            while (archivo.hasNextLine()) {
                String linea = archivo.nextLine();
                if (linea.length() > 1) {
                    Scanner registro = new Scanner(linea.replaceAll(",,,", ",").replaceAll("\"2,", "\"2.").replaceAll("\"0,", "\"0.").replaceAll("\"1,", "\"0.").replaceAll(",,", ",")
                            .replaceAll("\"", "").replaceAll("NULL", ""));
                    registro.useDelimiter(",");

                    String nombre_ = registro.next();
                    String codigo1 = registro.next();
                    String codMateria = registro.next();
                    String semestre = registro.next();
                    String grupo1 = registro.next();
                    String evaluacion = registro.next();
                    String porcentaje1 = registro.next();
                    String descripcion = registro.next();
                    String materia = registro.next();
                    String nota1 = registro.next();
                    String definitiva1 = registro.next();

                    int codigo;
                    int grupo;
                    double porcentaje;
                    int nota;
                    int definitiva;

                    if (codigo1.isEmpty()) {
                        codigo1 = "  X";
                    }

                    if (grupo1.isEmpty()) {
                        grupo1 = "  X";
                    }

                    if (porcentaje1.isEmpty()) {
                        porcentaje1 = "  X";
                    }

                    if (nota1.isEmpty()) {
                        nota1 = "  X";
                    }

                    if (definitiva1.isEmpty()) {
                        definitiva1 = "  X";
                    }

                    if (codigo1.equals("  X")) {
                        codigo = -1000;
                    } else {
                        codigo = Integer.parseInt(codigo1);
                    }

                    if (grupo1.equals("  X")) {
                        grupo = -10000;
                    } else {
                        grupo = Integer.parseInt(grupo1);
                    }

                    if (porcentaje1.equals("  X")) {
                        porcentaje = -10000;
                    } else {
                        porcentaje = Double.parseDouble(porcentaje1);
                    }

                    if (nota1.equals("  X")) {
                        nota = -10000;
                    } else {
                        nota = Integer.parseInt(nota1);
                    }

                    if (definitiva1.equals("  X")) {
                        definitiva = -10000;
                    } else {
                        definitiva = Integer.parseInt(definitiva1);
                    }

                    Estudiante dato = new Estudiante(nombre_, codigo, codMateria, semestre, grupo, evaluacion, porcentaje, descripcion, materia, nota, definitiva);
                    al.add(dato);

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No pude abrir el archivo");
        }
        return al;
    }

    public LinkedList<Estudiante> c2(String namefile, String student, String semester) {
        try {
            File leer = new File(namefile);
            FileReader leer2 = new FileReader(leer);
            Scanner archivo = new Scanner(leer2);
            while (archivo.hasNextLine()) {
                String linea = archivo.nextLine();
                if (linea.length() > 1) {
                    Scanner registro = new Scanner(linea.replaceAll(",,,", ",").replaceAll("\"2,", "\"2.").replaceAll("\"0,", "\"0.").replaceAll("\"1,", "\"0.").replaceAll(",,", ",")
                            .replaceAll("\"", "").replaceAll("NULL", ""));
                    registro.useDelimiter(",");

                    String nombre_ = registro.next();
                    String codigo1 = registro.next();
                    String codMateria = registro.next();
                    String semestre = registro.next();
                    String grupo1 = registro.next();
                    String evaluacion = registro.next();
                    String porcentaje1 = registro.next();
                    String descripcion = registro.next();
                    String materia = registro.next();
                    String nota1 = registro.next();
                    String definitiva1 = registro.next();

                    int codigo;
                    int grupo;
                    double porcentaje;
                    int nota;
                    int definitiva;

                    if (codigo1.isEmpty()) {
                        codigo1 = "  X";
                    }

                    if (grupo1.isEmpty()) {
                        grupo1 = "  X";
                    }

                    if (porcentaje1.isEmpty()) {
                        porcentaje1 = "  X";
                    }

                    if (nota1.isEmpty()) {
                        nota1 = "  X";
                    }

                    if (definitiva1.isEmpty()) {
                        definitiva1 = "  X";
                    }

                    if (codigo1.equals("  X")) {
                        codigo = -1000;
                    } else {
                        codigo = Integer.parseInt(codigo1);
                    }

                    if (grupo1.equals("  X")) {
                        grupo = -10000;
                    } else {
                        grupo = Integer.parseInt(grupo1);
                    }

                    if (porcentaje1.equals("  X")) {
                        porcentaje = -10000;
                    } else {
                        porcentaje = Double.parseDouble(porcentaje1);
                    }

                    if (nota1.equals("  X")) {
                        nota = -10000;
                    } else {
                        nota = Integer.parseInt(nota1);
                    }

                    if (definitiva1.equals("  X")) {
                        definitiva = -10000;
                    } else {
                        definitiva = Integer.parseInt(definitiva1);
                    }

                    Estudiante dato = new Estudiante(nombre_, codigo, codMateria, semestre, grupo, evaluacion, porcentaje, descripcion, materia, nota, definitiva);
                    al.add(dato);

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No pude abrir el archivo");
        }
        return al;
    }

    public static void main(String[] args) {
        MarcoDeDatos l = new MarcoDeDatos();
        System.out.println("- Si desea ver las notas de todos los estudiantes, digite 1\n "
                + "Si desea ver solo un estudiante con sus materias matriculadas y su semestre, ingrese 2");
        Scanner sc = new Scanner(System.in);
        int consulta = sc.nextInt();

        switch (consulta) {
            case 1:
                LinkedList<Estudiante> ld3 = l.c1("Libro1.csv");
                for (Estudiante i : ld3) {
                    System.out.println(i.getNombre_() + " - " + i.getDefinitiva() + " - " + i.getMateria() + " - " + i.getSemestre());
                }
                System.out.println("Gracias por participar,Colanta sabe más ;),el exceso de guaro es perjudicial para la salud");
                break;
            case 2:
                System.out.println("Ingrese el nombre del estudiante");
                Scanner sc2 = new Scanner(System.in);
                String nombre = sc2.nextLine();
                System.out.println("Ingrese el semestre del estudiante( ej:20201 )");
                String semestre = sc2.nextLine();
                LinkedList<Estudiante> ld2 = l.c2("Libro1.csv", nombre, semestre);
                for (Estudiante i : ld2) {
                    if (i.getNombre_().equalsIgnoreCase(nombre) && i.getSemestre().equals(semestre)) {
                        System.out.println(i.getNombre_() + " - " + i.getDefinitiva() + " - " + i.getMateria());
                    }

                }
                System.out.println("Gracias por participar,Colanta sabe más ;),el exceso de guaro es perjudicial para la salud");
                break;
            default:
                System.out.println("Haga lo que se le indica por favor");
        }

    }
}
