/**
 * @author Andrea Jiménez
 * @version 1.0
 */

package jimenez.andrea.tarea_03.Ejercicio_03.entidades;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    /**
     *
     * @return día de la fecha
     */
    public int getDia() {
        return dia;
    }

    /**
     *
     * @param dia
     */

    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     *
     * @return mes de la fecha
     */

    public int getMes() {
        return mes;
    }

    /**
     *
     * @param mes
     */

    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     *
     * @return año de la fecha
     */

    public int getAnio() {
        return anio;
    }

    /**
     *
     * @param anio
     */

    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * constructor vacío de fecha
     */

    public Fecha() {
    }

    /**
     *
     * @param dia
     * @param mes
     * @param anio
     * constructor de fecha
     */

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return dia + " / " + mes + " / " + anio;
    }
}
