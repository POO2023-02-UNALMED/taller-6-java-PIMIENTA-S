package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    String nombre;
    static List<Pais> paisesCreados = new ArrayList<Pais>();

    public Pais(String nombre){
        this.nombre = nombre;
        Pais.paisesCreados.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor(){
        Pais masVentasPais = null;
        int mayorVentas = 0;

        for (Pais pais: paisesCreados){
            int nRepetido = 0;
            for (Pais paisVentas: Vehiculo.PaisVentas){
                if (pais == paisVentas){
                    nRepetido++;
                }
            }
            if (nRepetido > mayorVentas){
                mayorVentas = nRepetido;
                masVentasPais = pais;
            }
        }
        return masVentasPais;
    }
}
