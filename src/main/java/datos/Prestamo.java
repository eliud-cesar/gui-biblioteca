package datos;

import java.time.LocalDate;

public class Prestamo {
    private int idPrestamo;
    private String ISBN;
    private int idAlumno;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean estadoDevolucion;

    /**
     * @return the estadoDevolucion
     */
    public boolean isEstadoDevolucion() {
        return estadoDevolucion;
    }

    /**
     * @param estadoDevolucion the estadoDevolucion to set
     */
    public void setEstadoDevolucion(boolean estadoDevolucion) {
        this.estadoDevolucion = estadoDevolucion;
    }

    /**
     * @return the idPrestamo
     */
    public int getIdPrestamo() {
        return idPrestamo;
    }

    /**
     * @param idPrestamo the idPrestamo to set
     */
    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the idAlumno
     */
    public int getIdAlumno() {
        return idAlumno;
    }

    /**
     * @param idAlumno the idAlumno to set
     */
    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    /**
     * @return the fechaPrestamo
     */
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * @param fechaPrestamo the fechaPrestamo to set
     */
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * @return the fechaDevolucion
     */
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * @param fechaDevolucion the fechaDevolucion to set
     */
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
