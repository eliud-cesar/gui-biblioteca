package datos;


public class Alumno {
    private int idAlumno;
    private String nombre;
    private String apellidos;
    private String email;
    private boolean esIncrito;
    private boolean esSancionado;

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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the esIncrito
     */
    public boolean isEsIncrito() {
        return esIncrito;
    }

    /**
     * @param esIncrito the esIncrito to set
     */
    public void setEsIncrito(boolean esIncrito) {
        this.esIncrito = esIncrito;
    }

    /**
     * @return the esSancionado
     */
    public boolean isEsSancionado() {
        return esSancionado;
    }

    /**
     * @param esSancionado the esSancionado to set
     */
    public void setEsSancionado(boolean esSancionado) {
        this.esSancionado = esSancionado;
    }
}
