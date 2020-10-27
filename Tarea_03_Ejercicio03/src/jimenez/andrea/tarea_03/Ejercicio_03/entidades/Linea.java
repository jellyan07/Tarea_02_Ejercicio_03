/**
 * @author Andrea Jiménez
 * @version 1.0
 */
package jimenez.andrea.tarea_03.Ejercicio_03.entidades;

public class Linea {
    private int cantidad;
    private Producto producto;

    /**
     *
     * @return cantidad del producto
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     *
     * @return el producto comprado
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     *
     * @param producto
     */

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * constructor vacío de línea con la información
     */

    public Linea() {
    }

    /* Costo de una línea (cantidad por el precio) */
    public float calcularCosto( ){
        return (float) (cantidad * producto.getPrecio());
    }

    /**
     *
     * @param cantidad
     * @param producto
     * línea constructor
     */

    public Linea(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    @Override
    public String toString() {
        return cantidad + "\t"+ producto;
    }

    
}
