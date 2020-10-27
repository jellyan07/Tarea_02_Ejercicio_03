package jimenez.andrea.tarea_03.Ejercicio_03.Gestor;

import jimenez.andrea.tarea_03.Ejercicio_03.entidades.Cliente;
import jimenez.andrea.tarea_03.Ejercicio_03.entidades.Factura;
import jimenez.andrea.tarea_03.Ejercicio_03.entidades.Fecha;
import jimenez.andrea.tarea_03.Ejercicio_03.entidades.Linea;

import java.util.ArrayList;

public class Gestor {

    public Factura crearFactura (String numero, Cliente cliente, Fecha fecha,ArrayList<Linea> lineas) {
        Factura factura = new Factura(numero, cliente, fecha, lineas);
        return factura;
    }

    public Cliente crearCliente (String nombre, String id, String genero, Fecha fecha_nac, int edad) {
        Cliente cliente = new Cliente(nombre, id, genero, fecha_nac, edad);
        return cliente;
    }

    public Fecha crearFecha (int dia, int mes, int anio) {
        Fecha fecha = new Fecha(dia, mes, anio);
        return fecha;
    }
}
