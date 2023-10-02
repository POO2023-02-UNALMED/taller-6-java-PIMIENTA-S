package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    String placa;
    int puertas;
    int velocidadMaxima;
    String nombre;
    int precio;
    int peso;
    String traccion;
    Fabricante fabricante;
    static int cantidadVehiculos = 0;

    static List<Fabricante> fabricanteVentas = new ArrayList<Fabricante>();
    static List<Pais> PaisVentas = new ArrayList<Pais>();

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        Vehiculo.cantidadVehiculos ++;
        Vehiculo.fabricanteVentas.add(fabricante);
        Vehiculo.PaisVentas.add(fabricante.getPais());
    }

    public String vehiculosPorTipo(){
        return "Automoviles: " + Automovil.cantAutomovil() + "Camionetas: " + Camioneta.cantCamioneta() + "Camiones: " + Camion.cantCamion();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        Vehiculo.cantidadVehiculos = cantidadVehiculos;
    }

    public static List<Fabricante> getFabricanteVentas() {
        return fabricanteVentas;
    }

    public static void setFabricanteVentas(List<Fabricante> fabricanteVentas) {
        Vehiculo.fabricanteVentas = fabricanteVentas;
    }

    public static List<Pais> getPaisVentas() {
        return PaisVentas;
    }

    public static void setPaisVentas(List<Pais> paisVentas) {
        PaisVentas = paisVentas;
    }
}
