package datos;


public class Alumno {
    private int matricula;
    private String nombre;
    private String apellidos;
    private String email;
    private boolean esIncrito;
//    private boolean esSancionado;
    private boolean esActivoPrestamo;
//    private int 

    /**
     * @return the esActivoPrestamo
     */
    public boolean isEsActivoPrestamo() {
        return esActivoPrestamo;
    }

    /**
     * @param esActivoPrestamo the esActivoPrestamo to set
     */
    public void setEsActivoPrestamo(boolean esActivoPrestamo) {
        this.esActivoPrestamo = esActivoPrestamo;
    }

    /**
     * @return the idAlumno
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param idAlumno the idAlumno to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

}
