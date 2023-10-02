package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Camioneta extends Vehiculo{

    boolean volco;
    static List<Camioneta> listado = new ArrayList<Camioneta>();

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        Camioneta.listado.add(this);
    }

    public boolean isVolco() {
        return this.volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static int cantCamioneta(){
        return Camioneta.listado.size();
    }
}
