/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

public class EstudianteDistancia extends Estudiante {

    /*1.  Declarar
        numeroAsignaturas: Entero 
        costoAsginatura: Real 
     */

    int numeroAsignaturas;
    double costoAsignatura;

    public EstudianteDistancia(String n, String a, String i, int e, int nA, double c ) {
        super(n, a, i, e);
        numeroAsignaturas = nA;
        costoAsignatura = c;
    }

    

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero) {
        numeroAsignaturas = numero;
    }

    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor) {
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    @Override
    public void calcularMatricula() {
        matricula = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas() {
        return numeroAsignaturas;
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura() {
        return costoAsignatura;
    }

    @Override
    public String toString() {
        String cadena = "";

        cadena = String.format("%s%sNúmero de asignaturas: %d\n"
                + "Costo Asignatura: %.2f\n"
                + "Valor Matrícula: %.2f", cadena, super.toString(),
                obtenerNumeroAsignaturas(), obtenerCostoAsignatura(), matricula);
        return cadena;
    }
}
