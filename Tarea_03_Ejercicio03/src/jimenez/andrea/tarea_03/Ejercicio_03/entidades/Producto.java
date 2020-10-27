/**
 * @author Andrea Jiménez
 * @version 1.0
 *
 */

package jimenez.andrea.tarea_03.Ejercicio_03.entidades;

import java.util.Objects;

public class Producto {
    private String codigo;
    private String descripcion;
    private double precio;

    /**
     *
     * @return código del producto
     */

    public String getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     */

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return descripción del producto
     */

    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion
     */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return precio del producto
     */

    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio
     */

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * constructor vacío de producto
     */

    public Producto() {
    }

    /**
     *
     * @param codigo
     * @param descripcion
     * @param precio
     * constructor con parámetros de producto
     */

    public Producto(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return codigo + "\t" + descripcion + "\t" + precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.precio, precio) == 0 &&
                Objects.equals(codigo, producto.codigo) &&
                Objects.equals(descripcion, producto.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descripcion, precio);
    }
}
