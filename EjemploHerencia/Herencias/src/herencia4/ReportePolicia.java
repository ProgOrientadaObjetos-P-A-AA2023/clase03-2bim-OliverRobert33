
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(ArrayList<Policia> lista, String codigo) {
        super(codigo);
        this.lista = lista;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = promedioEdades
                    + lista.get(i).getEdad();
        }

        promedioEdades = suma / lista.size();
    }

    public void establecerLista(ArrayList<Policia> lista) {
        this.lista = lista;
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }
    
        
        @Override
    public String toString() {
        String cadena = "Reporte Policias";

        cadena = String.format(""
                + "%s\n"
                + "CODIGO %s\n",
                cadena,
                codigo);

        for (int i = 0; i < lista.size(); i++) {
            Policia d = lista.get(i);
            cadena = String.format(""
                    + "%s\n"
                    + "Nombre: %s\n"
                    + "Edad: %d\n",
                    cadena,
                    d.getNombre(),
                    d.getEdad()
            );

        }
        cadena = String.format(""
                + "%s\n"
                + "El promedio de Edades es: %.0f\n",
                cadena, promedioEdades);

        return cadena;
    }

}
