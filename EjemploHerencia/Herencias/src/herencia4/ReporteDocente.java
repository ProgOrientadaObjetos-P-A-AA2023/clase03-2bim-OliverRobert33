/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(ArrayList<Docente> l, String codigo) {
        super(codigo);
        lista = l;
    }

    public void establecerPromedioSueldos() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i).getSueldo();
        }

        promedioSueldos = suma / lista.size();
    }

    public void establecerLista(ArrayList<Docente> l) {
        lista = l;
    }

    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }

    public ArrayList<Docente> obbtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = "Reporte Docente";

        cadena = String.format(""
                + "%s\n"
                + "CODIGO %s\n",
                cadena,
                codigo);

        for (int i = 0; i < lista.size(); i++) {
            Docente d = lista.get(i);
            cadena = String.format(""
                    + "%s\n"
                    + "Nombre: %s\n"
                    + "Sueldo: %.2f\n",
                    cadena,
                    d.getNombre(),
                    d.getSueldo()
            );

        }
        cadena = String.format(""
                + "%s\n"
                + "El promedio de sueldos es: %.3f\n",
                cadena, obtenerPromedioSueldos());

        return cadena;
    }

}
