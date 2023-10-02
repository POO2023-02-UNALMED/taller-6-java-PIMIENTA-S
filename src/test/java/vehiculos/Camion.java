package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo{

    int eyes;
    static List<Camion> listado = new ArrayList<Camion>();

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int eyes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.eyes = eyes;
        Camion.listado.add(this);
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public static int cantCamion(){
        return Camion.listado.size();
    }
}
