package datos;

public class Devolucion {
    private int idDevolucion;
    private int idPrestamo;
    private boolean estadoDevolucion;

    /**
     * @return the idDevolucion
     */
    public int getIdDevolucion() {
        return idDevolucion;
    }

    /**
     * @param idDevolucion the idDevolucion to set
     */
    public void setIdDevolucion(int idDevolucion) {
        this.idDevolucion = idDevolucion;
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
}
