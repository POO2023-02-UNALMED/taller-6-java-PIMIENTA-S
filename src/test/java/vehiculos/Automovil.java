package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Automovil extends Vehiculo{
    int puestos;
    static List<Automovil> listado = new ArrayList<Automovil>();

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        Automovil.listado.add(this);

    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public static int cantAutomovil(){
        return Automovil.listado.size();
    }
}
