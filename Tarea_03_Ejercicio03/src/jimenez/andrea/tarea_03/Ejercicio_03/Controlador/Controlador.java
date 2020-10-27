package jimenez.andrea.tarea_03.Ejercicio_03.Controlador;

import jimenez.andrea.tarea_03.Ejercicio_03.Gestor.Gestor;
import jimenez.andrea.tarea_03.Ejercicio_03.UI.UI;
import jimenez.andrea.tarea_03.Ejercicio_03.entidades.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Controlador {
    private UI interfaz = new UI();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            interfaz.mostrarMenu();
            opcion = interfaz.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 2);
    }

    private void procesarOpcion (int opcion) {
        switch (opcion) {
            case 1:
                registrarFactura();
                break;
            case 2:
                interfaz.imprimir("¡Adiós!");
            default:
                interfaz.imprimir("La opción no es válida");
                break;
        }
    }

    private void registrarFactura() {

        interfaz.imprimir("Ingrese el número de factura");
        String numero = interfaz.leerTexto();

        interfaz.imprimir("Ingrese el número de cédula del cliente");
        String cedula = interfaz.leerTexto();
        interfaz.imprimir("Ingrese el nombre completo del cliente");
        String nombre = interfaz.leerTexto();
        interfaz.imprimir("Ingrese el género del cliente");
        String genero = interfaz.leerTexto();

        interfaz.imprimir("Ingrese el año de nacimiento del cliente");
        int fecha_nac_anio = interfaz.leerOpcion();
        interfaz.imprimir("Ingrese el mes de nacimiento del cliente");
        int fecha_nac_month = interfaz.leerOpcion();
        interfaz.imprimir("Ingrese el día de nacimiento del cliente");
        int fecha_nac_dia = interfaz.leerOpcion();

        Fecha fecha_nac = gestor.crearFecha( fecha_nac_dia, fecha_nac_month, fecha_nac_anio);
        LocalDate l = LocalDate.of(fecha_nac_anio, fecha_nac_month, fecha_nac_dia); //specify year, month, date directly

        LocalDate now = LocalDate.now(); //gets localDate
        Period diff = Period.between(l, now); //difference between the dates is calculated
        int edad = diff.getYears();

        Cliente cliente  = gestor.crearCliente(nombre, cedula, genero, fecha_nac, edad);

        Fecha fecha = new Fecha(now.getDayOfMonth(), now.getMonthValue(), now.getYear());

        ArrayList<Linea> lineas = new ArrayList<>();
        Producto producto = new Producto("6548", "Bolsa de papas saladas", 300);
        Producto producto2 = new Producto("6948", "Bolsa de plátanos saladas", 300);
        Linea linea1 = new Linea(2, producto);
        Linea linea2 = new Linea(3, producto2);

        lineas.add(linea1);
        lineas.add(linea2);

        Linea linea = new Linea(3, producto);
        Factura factura = gestor.crearFactura(numero, cliente, fecha, lineas);
        interfaz.imprimir(factura.toString());

    }

}
