/**
 * @author Andrea Jiménez
 * @version 1.0
 */
package jimenez.andrea.tarea_03.Ejercicio_03.entidades;

import java.util.ArrayList;

public class Factura {
    private String numero;
    private Cliente cliente;
    private Fecha fecha;
    private ArrayList<Linea> lineas;

    /**
     *
     * @return número de la factura
     */
    public String getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */

    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     *
     * @return cliente de la factura
     */

    public Cliente getCliente() {
        return cliente;
    }

    /**
     *
     * @param cliente
     */

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     *
     * @return fecha de la factura
     */

    public Fecha getFecha() {
        return fecha;
    }

    /**
     *
     * @param fecha
     */

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @return array de lineas de factura
     */

    public ArrayList<Linea> getLineas() {
        return lineas;
    }

    /**
     *
     * @param lineas
     */

    public void setLineas(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }

    /**
     * constructor vacío de Factura
     */

    public Factura() {
    }

    /* Subtotal de la factura, i.e. el total sin impuesto */

    private float calcularSubtotal( ){
        Linea lineaDetalle;
        float subtotal;
        subtotal = 0;
        for(int i = 0; i< lineas.size(); i++){
            lineaDetalle = (Linea) lineas.get(i);
            subtotal = subtotal + lineaDetalle.calcularCosto();
        }
        return subtotal;
    }
    /* Impuesto de la factura (13% del subtotal) */

    private float calcularImpuesto( ){
        float impuesto;
        impuesto = calcularSubtotal()* 13/100;
        return impuesto;
    }

    /* Total de la factura (subtotal mas impuesto) */
    public float calcularTotal( ){
        float total;
        total = calcularSubtotal() + calcularImpuesto();
        return total;
    }

    /**
     *
     * @param numero
     * @param cliente
     * @param fecha
     * @param lineas
     * constructor de factura
     */

    public Factura(String numero, Cliente cliente, Fecha fecha, ArrayList<Linea> lineas) {
        this.numero = numero;
        this.cliente = cliente;
        this.fecha = fecha;
        this.lineas = lineas;
    }

    @Override
    public String toString() {
        String msg;
        Linea lineaD;
        msg = "================================"+ "\n";
        msg = msg + "\t\t" + "No. " + numero + "\n";
        msg = msg + "cliente: " + cliente + " ";
        msg = msg + "\t" + fecha.toString() + "\n";
        msg = msg + "------------------------------------------" + "\n";
        for(int i = 0; i< lineas.size(); i++){
            lineaD = (Linea) lineas.get(i);
            msg = msg + lineaD.toString() + "\n";
        }
        msg = msg + "\t\t\t\t" + "----------" + "\n";
        msg = msg + "\t\t\t" + "subtotal:"+this.calcularSubtotal()+"\n";
        msg = msg + "\t\t\t" + "impuesto:"+this.calcularImpuesto()+"\n";
        msg = msg + "\t\t\t" + "total :"+this.calcularTotal()+"\n";
        msg = msg + "========================" + "\n";
        return msg;
    }
}
