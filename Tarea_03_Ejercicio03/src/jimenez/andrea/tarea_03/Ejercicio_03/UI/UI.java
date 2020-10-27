package jimenez.andrea.tarea_03.Ejercicio_03.UI;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {
    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);

    public void mostrarMenu () {
        output.println("*** Escoja una opción ***");
        output.println("1. Registrar Factura");
        output.println("2. Salir");
    }

    public void imprimir (String msj) {
        output.println(msj);
    }

    public int leerOpcion () {
        int opcion = Integer.parseInt(input.next());
        return opcion;
    }

    public String leerTexto () {
        String texto = input.next();
        return texto;
    }
}
