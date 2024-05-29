package logica.negocios;

import datos.Alumno;
import datos.Libro;
import datos.Prestamo;
import java.awt.Color;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import presentacion.Utilidades;

public class OpsPrestamos {
    static Prestamo prestar;
    
    // HASH MAPS QUE SE USARAN
    public static Map<String, Libro> HashLibros = new HashMap<>();
    public static Map<Integer, Alumno> HashAlumnos = new HashMap<>();
    public static Map<Integer, Prestamo> HashMapPrestamos = new HashMap<>();
    
    // METODO PARA CREAR PRESTAMO
    public static void crearPrestamo(JTextField IdPrestamo, JTextField IdAlumno, JTextField IdLibro, JLabel msj) {
        Timer timer = new Timer();
        
        // comprobando que no sean vacios
        if(IdPrestamo.getText().equals("") || IdAlumno.getText().equals("") || IdLibro.getText().equals("")) {
            msjFeedback(msj, "Tienes que rellenar todos los campos para crear el prestamo del libro.", Color.red);
            return;
        }
        
        // comprobando que el id del prestamo sea entero
        int idPrestamoConvertido;
        try {
            idPrestamoConvertido = Integer.parseInt(IdPrestamo.getText());
        } catch (Exception e) {
            msjFeedback(msj, "El ID del prestamo solo deben ser numeros", Color.red);
            return;
        }
        
        // comprobando que el id del prestamo no exista
        if(HashMapPrestamos.containsKey(idPrestamoConvertido)) {
            msjFeedback(msj, "Ya existe un prestamo con el mismo ID", Color.red);
            return;
        }
        
        // comprobando que el id del alumno sea entero
        int idAlumnoConvertido;
        try {
            idAlumnoConvertido = Integer.parseInt(IdAlumno.getText());
        } catch (Exception e) {
            msjFeedback(msj, "El ID del alumno solo debe tener numeros", Color.red);
            return;
        }
        
        // comprobando que el id del alumno exista en el hash map, si esta registrado
        HashAlumnos = OpsAlumnos.HashMapAlumnos;
        if(!HashAlumnos.containsKey(idAlumnoConvertido)) {
            msjFeedback(msj, "El alumno que ingresaste no se encuentra, o no existe, o su id es diferente.", Color.red);
            return;
        }
                
        // comprobando que no tiene un prestamo activo
        if(HashAlumnos.get(idAlumnoConvertido).isEsActivoPrestamo()) {
            msjFeedback(msj, "El alumno tiene un prestamo activo, solo puede tener un prestamo.", Color.red);
            return;
        }
        
        // comprobando que el id del libro exista en el hash, si esta registrado
        HashLibros = OpsLibros.HashMapLibros;
        if(!HashLibros.containsKey(IdLibro.getText())) {
            msjFeedback(msj, "El libro que ingresaste no se encuentra, corrigelo.", Color.red);
            return;
        }
        
        // comprobando que el libro a prestar tenga mas de una en existencia
        if(HashLibros.get(IdLibro.getText()).getCantidadDisponible() <= 1) {
            msjFeedback(msj, "Solo queda un libro en existencia, no se puede prestar, es de reserva.", Color.red);
            return;
        }
        
        // Mostrar el panel de libros
        TimerTask panelHome = new TimerTask() {
            public void run() {
                Utilidades.MostarPanelesMain("Prestamos");
            }
        };
        
        // intentamos crear el prestamo
        try {
            // COMPROBANDO QUE EL DIA DE LA DEVOLUCION SEA UN DIA HABIL
            LocalDate fechaDevolucionTester = LocalDate.now().plusDays(2);
            DayOfWeek diaSemana = fechaDevolucionTester.getDayOfWeek();
            if(diaSemana == DayOfWeek.SATURDAY) {
                fechaDevolucionTester = fechaDevolucionTester.plusDays(2);
            } else if(diaSemana == DayOfWeek.SUNDAY) {
                fechaDevolucionTester = fechaDevolucionTester.plusDays(1);
            }
            
            prestar = new Prestamo();
            prestar.setIdPrestamo(idPrestamoConvertido);
            prestar.setIdAlumno(idAlumnoConvertido);
            prestar.setISBN(IdLibro.getText());
            prestar.setFechaPrestamo(LocalDate.now());
            prestar.setFechaDevolucion(fechaDevolucionTester);
            prestar.setDevuelto(false);
                
            HashMapPrestamos.put(idPrestamoConvertido, prestar);
            
            // ACTUALIZANDO LA CANTIDAD DISPONIBLE DEL LIBRO A PRESTAR
            int cantiAnterior = OpsLibros.HashMapLibros.get(IdLibro.getText()).getCantidadDisponible();
            int cantiPosterior = cantiAnterior - 1;
            OpsLibros.HashMapLibros.get(IdLibro.getText()).setCantidadDisponible(cantiPosterior);
            
            // ACTUALIZANDO QUE EL ALUMNO TIENE UN PRESTAMO ACTIVO
            OpsAlumnos.HashMapAlumnos.get(idAlumnoConvertido).setEsActivoPrestamo(true);
            
            // feedback
            msjFeedback(msj, "El prestamo fue agregado correctamente.", Color.blue);
            timer.schedule(panelHome, 900);
        } catch (Exception e) {
            msjFeedback(msj, "Error 500 - agregar prestamo.", Color.red);
            System.out.println(e.toString());
        }
        
    }
    
    // METODO PARA VISUALIZAR LOS DATOS A ACTUALIZAR
    public static void vistaActualizarPrestamo(int IdPrestamo, JTextField TxtIdAlumno, JTextField TxtIdLibro) {
        // HACIENDO QUE NO TENGA NINGUN DATO
        TxtIdAlumno.setText("");
        TxtIdLibro.setText("");
        
        // SETEANDO LOS DATOS DEL PRESTAMO A LOS CAMPOS PARA ACTUALIZARLO
        TxtIdAlumno.setText(String.valueOf(HashMapPrestamos.get(IdPrestamo).getIdAlumno()));
        TxtIdLibro.setText(HashMapPrestamos.get(IdPrestamo).getISBN());
    }
    
    // METODO PARA PODER ACTUALIKZA EL PRESTAMO
    public static void actualizarPrestamo(int IdPrestamo, JTextField TxtIdAlumno, JTextField TxtIdLibro, JLabel msj) {
        Timer timer = new Timer();
        
        // COMPROBANDO QUE NO ESTEN VACIOS
        if(TxtIdLibro.getText().equals("") || TxtIdAlumno.getText().equals("")) {
            msjFeedback(msj, "Rellena todos los campos", Color.red);
            return;
        }
        
        // COMPROBANDO QUE EL ID DEL ALUMNO SEA ENTERO
        int IdAlumnoConvertido;
        try {
            IdAlumnoConvertido = Integer.parseInt(TxtIdAlumno.getText());
        } catch (Exception e) {
            msjFeedback(msj, "El id del alumno debe ser enterio", Color.red);
            return;
        }
        
        // COMPROBANDO QUE EL ID DEL ALUMNO EXISTA EN EL HASHMAP
        HashAlumnos = OpsAlumnos.HashMapAlumnos;
        if(!HashAlumnos.containsKey(IdAlumnoConvertido)) {
            msjFeedback(msj, "El alumno que ingresaste no se encuentra, o no existe, o su id es diferente.", Color.red);
            return;
        }
        
        // COMPROBANDO QUE EL ID DEL LIBRO EXISTA EN EL HASHMAP
        HashLibros = OpsLibros.HashMapLibros;
        if(!HashLibros.containsKey(TxtIdLibro.getText())) {
            msjFeedback(msj, "El libro que ingresaste no se encuentra, corrigelo.", Color.red);
            return;
        }
        
        // Mostrar el panel de libros
        TimerTask panelHome = new TimerTask() {
            public void run() {
                Utilidades.MostarPanelesMain("Prestamos");
            }
        };
        
        // INTENTANDO ACTUALIZAR EL PRESTAMO
        try {
            // COMPROBANDO QUE EL ALUMNO INGRESADO ES EL MISMO
            int matriAlumno = HashMapPrestamos.get(IdPrestamo).getIdAlumno();
            // En caso de que sea el mismo no hay necesidad de validar si tiene un prestamo activo, ni de actualizarlo en el prestamo
            
            // COMPROBANDO QUE EL ALUMNO INGRESADO NO ES EL MISMO
            if(matriAlumno != IdAlumnoConvertido) {
                // comprobar que el nuevo alumno no tenga prestamo activo
                if(HashAlumnos.get(IdAlumnoConvertido).isEsActivoPrestamo()) {
                    msjFeedback(msj, "El alumno tiene un prestamo activo, un alumno solo puede tener un prestamo a la vez.", Color.red);
                    return;
                }
                
                // devolviendo al alumno anterior que ya no tiene un prestamo activo
                OpsAlumnos.HashMapAlumnos.get(matriAlumno).setEsActivoPrestamo(false);
                
                // al nuevo alumno seteando que tiene un prestamo activo
                OpsAlumnos.HashMapAlumnos.get(IdAlumnoConvertido).setEsActivoPrestamo(true);
                
                // seteando el nuevo alumno al prestamo
                HashMapPrestamos.get(IdPrestamo).setIdAlumno(IdAlumnoConvertido);
            }
            
            // COMPROBANDO QUE EL LIBRO INGRESADO ES EL MISMO
            String matriLibro = HashMapPrestamos.get(IdPrestamo).getISBN();
            // En caso de que sea el mismo no hay necesidad de validar si tiene mas existencias, ni de actualizarlo en el prestamo
            
            // COMPROBANDO QUE EL LIBRO INGRESADO SEA DIFERENTE
            if(!matriLibro.equals(TxtIdLibro.getText())) {
                // verificando que tenga mas de 1 existencia
                if(HashLibros.get(TxtIdLibro.getText()).getCantidadDisponible() <= 1) {
                    msjFeedback(msj, "El libro ya no tiene mas existencias, solo queda el de reserva.", Color.red);
                    return;
                }
                
                // devolviendo la cantidad al libro anterior
                int cantAnteriorLibroAnterior = OpsLibros.HashMapLibros.get(matriLibro).getCantidadDisponible();
                int cantPosteriorLibroAnterior = cantAnteriorLibroAnterior + 1;
                OpsLibros.HashMapLibros.get(matriLibro).setCantidadDisponible(cantPosteriorLibroAnterior);
                
                // quitandole una cantidad al libro nuevo
                int cantAnteriorLibroNuevo = OpsLibros.HashMapLibros.get(TxtIdLibro.getText()).getCantidadDisponible();
                int cantPosteriorLibroNuevo = cantAnteriorLibroNuevo - 1;
                OpsLibros.HashMapLibros.get(TxtIdLibro.getText()).setCantidadDisponible(cantPosteriorLibroNuevo);
                
                // seteando el nuevo libro al prestamo
                HashMapPrestamos.get(IdPrestamo).setISBN(TxtIdLibro.getText());
            }
            
            msjFeedback(msj, "Prestamo actualizado", Color.blue);
            timer.schedule(panelHome, 900);
        } catch (Exception e) {
            msjFeedback(msj, "Error 500 - Actualizar prestamo", Color.yellow);
            System.out.println(e.toString());
            return;
        }
        
    }
    
    // METODO PARA ELIMINAR EL PRESTAMO
    public static void eliminarPrestamo(int IdPrestamo, JLabel msj, JPanel panelAviso) {
        Timer timer = new Timer();
        
        // Mostrar el panel de libros
        TimerTask panelHome = new TimerTask() {
            public void run() {
                Utilidades.MostarPanelesMain("Prestamos");
            }
        };
        
        try {
            int opc = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres eliminar el prestamo?");
            if(opc == 0) { // YES -> 0
                // volver a falso que el alumno tiene un prestamo activo
                OpsAlumnos.HashMapAlumnos.get(HashMapPrestamos.get(IdPrestamo).getIdAlumno()).setEsActivoPrestamo(false);
                // devolver la cantidad a la disponible al hash map del libro
                int cantiAnterior = OpsLibros.HashMapLibros.get(HashMapPrestamos.get(IdPrestamo).getISBN()).getCantidadDisponible();
                int cantiPosterior = cantiAnterior + 1;
                OpsLibros.HashMapLibros.get(HashMapPrestamos.get(IdPrestamo).getISBN()).setCantidadDisponible(cantiPosterior);
                // eliminando el libro al final
                HashMapPrestamos.remove(IdPrestamo);
                msjFeedback(msj, "Eliminacion exitosa", Color.white);
                panelAviso.setBackground(new Color(109,216,97));
                timer.schedule(panelHome, 900);
                return;
            }
            
            msjFeedback(msj, "Eliminacion cancelada", Color.white);
            panelAviso.setBackground(Color.blue);
            timer.schedule(panelHome, 800);
        } catch (Exception e) {
            msjFeedback(msj, "Error 500 Eliminar Prestamo", Color.white);
            panelAviso.setBackground(Color.red);
            System.out.println(e.toString());
        }
    }
    
    // METODO PARA DEVOLVER EL LIBRO
    public static void devolverLibro(int matriculaAlumno, JPanel panelPrestamo, JLabel tituloPrestamo, JLabel descPrestamo) {
        try {
            ArrayList<Prestamo> listaPrestamo = new ArrayList<>(HashMapPrestamos.values());
            int idPrestamo = 0;

            for(Prestamo p : listaPrestamo) {
                if(matriculaAlumno == p.getIdAlumno()) {
                    idPrestamo = p.getIdPrestamo();
                }
            }

            // Devolviendo estatus de prestamo a false
            HashMapPrestamos.get(idPrestamo).setDevuelto(true);

            // Devolviendo la cantidad del libro
            int cantAnterior = OpsLibros.HashMapLibros.get(HashMapPrestamos.get(idPrestamo).getISBN()).getCantidadDisponible();
            int cantPosterior = cantAnterior + 1;
            OpsLibros.HashMapLibros.get(HashMapPrestamos.get(idPrestamo).getISBN()).setCantidadDisponible(cantPosterior);

            // devolviendo que el alumno no tiene prestamos ahora
            OpsAlumnos.HashMapAlumnos.get(matriculaAlumno).setEsActivoPrestamo(false);

            // llamando al metodo que repinta si tiene o no un prestamo activo
            OpsAlumnos.validPrestamo(matriculaAlumno, panelPrestamo, tituloPrestamo, descPrestamo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error - devolver libro");
            System.out.println("Error: " + e.toString());
        }
    }
    
     // METODO DE DAR FEEDBACK AL USUARIO CUANDO SE APLIQUE UNA ACCION
    private static void msjFeedback(JLabel label, String msj, Color color) {
        label.removeAll();
        label.setText("");
        label.setText(msj);
        label.setForeground(color);
    }
    
    
}