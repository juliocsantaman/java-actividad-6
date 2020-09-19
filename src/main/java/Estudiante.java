/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class Estudiante {
    // Atributos.
    String nombre;
    double[] calificaciones = new double[5];
    
    // Métodos
    
    // Método constructor.
    public Estudiante(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }
    
    /*
        Este método va a calcular el promemdio
        de las calificaciones que nos pasen en 
        el array como parámetro.
    */
    public double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        double promedio = 0;
        
        // Iteramos el array.
        for(int i = 0; i < calificaciones.length; i++) {
            // Sumamos las calificaciones.
            suma += calificaciones[i];
        }
        // Realizamos el cálculo del promedio.
        promedio = suma / calificaciones.length;
        return promedio;
    }
    
    
    /*
        Este método va a calcular la calificación final,
        es decir, dependiendo del promedio, el estudiante
        obtendrá una nota representado con un carácter.
    */
    public char calificacionFinal(double promedio) {
        char calificacionFinal = '0';
        if(promedio <= 50) {
            calificacionFinal = 'F';
        } else if(promedio >= 51 && promedio <=60) {
            calificacionFinal = 'E';
        } else if(promedio >= 61 && promedio <=70) {
            calificacionFinal = 'D';
        } else if(promedio >= 71 && promedio <=80) {
            calificacionFinal = 'C';
        } else if(promedio >= 81 && promedio <=90) {
            calificacionFinal = 'B';
        } else if(promedio >= 91 && promedio <=100) {
            calificacionFinal = 'A';
        }
        return calificacionFinal;
    }
    
    /*
        Este método va a imprimir los datos
        del estudiante, nombre, calificaciones, promedio
        y calificación final.
    */
    public void imprimirResultados(String nombre, double promedio, char calificacionFinal) {
        System.out.println("Nombre del estudiante: " + nombre);
        for(int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i+1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }
}
