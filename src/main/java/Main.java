/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Main {
    public static void main(String args[]) {
        double[] calificaciones = {96, 100, 100, 100, 100};
        Estudiante estudiante1 = new Estudiante("Julio", calificaciones);
        double promedio = 0;
        char calificacionFinal = '0';
        String nombre = estudiante1.getNombre();
        
        promedio = estudiante1.calcularPromedio(calificaciones);
        calificacionFinal = estudiante1.calificacionFinal(promedio);
        estudiante1.imprimirResultados(nombre, promedio, calificacionFinal);
    }
}
