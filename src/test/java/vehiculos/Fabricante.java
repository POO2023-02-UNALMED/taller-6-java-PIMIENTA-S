package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
    String nombre;
    Pais pais;
    static List<Fabricante> listadoF = new ArrayList<Fabricante>();

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        Fabricante.listadoF.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante masVentasF = null;
        int mayorVentas = 0;
        for (Fabricante fab: listadoF){
            int nRepetido = 0;
            for (Fabricante fVentas: Vehiculo.getFabricanteVentas()){
                if (fab == fVentas){
                    nRepetido++;
                }
            }
            if (nRepetido > mayorVentas){
                mayorVentas = nRepetido;
                masVentasF = fab;
            }
        }
        return masVentasF;
    }
}
