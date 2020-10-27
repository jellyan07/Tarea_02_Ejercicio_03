/**
 * @author Andrea Jiménez
 * @version 1.0
 */

package jimenez.andrea.tarea_03.Ejercicio_03.entidades;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private String id;
    private String genero;
    private Fecha fecha_nacimiento;
    private int edad;

    /**
     *
     * @return nombre del cliente
     */

    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return cédula del cliente
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return género del cliente
     */
    public String getGenero() {
        return genero;
    }

    /**
     *
     * @param genero
     */

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     *
     * @return fecha de nacimiento del cliente
     */
    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     *
     * @param fecha_nacimiento
     */
    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     *
     * @return edad del cliente
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * constructor vacío del cliente
     */
    public Cliente() {
    }

    /**
     *
     * @param nombre
     * @param id
     * @param genero
     * @param fecha_nacimiento
     * @param edad
     * constructor del cliente
     */

    public Cliente(String nombre, String id, String genero, Fecha fecha_nacimiento, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return edad == cliente.edad &&
                Objects.equals(nombre, cliente.nombre) &&
                Objects.equals(id, cliente.id) &&
                Objects.equals(genero, cliente.genero) &&
                Objects.equals(fecha_nacimiento, cliente.fecha_nacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id, genero, fecha_nacimiento, edad);
    }
}
