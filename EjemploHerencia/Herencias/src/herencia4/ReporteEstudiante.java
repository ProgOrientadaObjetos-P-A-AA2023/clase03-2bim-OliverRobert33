package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(ArrayList<Estudiante> l, String codigo) {
        super(codigo);
        lista = l;
    }

    public void establecerPromedioMatriculas() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i).getMatricula();
        }

        promedioMatriculas = suma / lista.size();
    }

    public void establecerLista(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }
    
        @Override
    public String toString() {
        String cadena = "Reporte Estudiante";

        cadena = String.format(""
                + "%s\n"
                + "CODIGO %s\n",
                cadena,
                codigo);

        for (int i = 0; i < lista.size(); i++) {
            Estudiante d = lista.get(i);
            cadena = String.format(""
                    + "%s\n"
                    + "Nombre: %s\n"
                    + "Matricula: %.2f\n",
                    cadena,
                    d.getNombre(),
                    d.getMatricula()
            );

        }
        cadena = String.format(""
                + "%s\n"
                + "El promedio de sueldos es: %.3f\n",
                cadena, promedioMatriculas);

        return cadena;
    }

}
