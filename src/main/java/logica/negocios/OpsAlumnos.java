package logica.negocios;

import datos.Alumno;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import presentacion.JPanelAlumnoDetalles;
import presentacion.JPanelAlumnosBuscar;
import javax.swing.JPanel;
import presentacion.JPanelAlumnosGenerales;
import static presentacion.Principal.content;
import presentacion.Utilidades;

public class OpsAlumnos {
    static Alumno estudiante;
    static Map<Integer, Alumno> HashMapAlumnos = new HashMap<>();
    static int matriculaGlobal = 0;
    static JPanelAlumnoDetalles pad;

    // METODO PARA CREAR UN ALUMNO
    public static void crearAlumno(JTextField matricula, JTextField nombre, JTextField apellido, JTextField email, JLabel msj) {
         estudiante = new Alumno();
         int matriConver = 0;
         Timer timer = new Timer();
         
        // Validar que los campos no esten vacios
        if(matricula.getText().equals("") || nombre.getText().equals("") || apellido.getText().equals("") || email.getText().equals("")) {
            msjFeedback(msj, "Rellena todos los campos", Color.red);
            return;
        }
        
        // Intenta convertir la matricula en int, es una forma de validar que el usuario solo escriba numeros en la matricula
        try {
            matriConver = Integer.parseInt(matricula.getText());
        } catch (Exception e) {
            msjFeedback(msj, "La matricula solo deben ser numeros", Color.red);
            return;
        }
        
        if(HashMapAlumnos.containsKey(matriConver)) {
            msjFeedback(msj, "Ya existe un alumno con la misma matricula", Color.red);
            return;
        }
        
        // VALIDAR EL FORMATO DEL EMAIL
        String regexEmail = "^[a-zA-Z-\\.0-9_]+@[a-z]+\\.[a-z]+$";
        boolean isEmailValido = Pattern.matches(regexEmail, email.getText());
        if(!isEmailValido) {
            msjFeedback(msj, "El formato del email no es valido.", Color.red);
            return;
        }
        
        // MOSTRAR PANEL DE BUSCAR CUANDO SE HAYA CREADO EL ALUMNO
        TimerTask panelBuscar = new TimerTask() {
            public void run() {
                Utilidades.MostarPanelesMain("AlumnoBuscar");
            }
        };
        
        // Agregar los datos a la instancia
        try {
            estudiante.setMatricula(matriConver);
            estudiante.setNombre(nombre.getText());
            estudiante.setApellidos(apellido.getText());
            estudiante.setEmail(email.getText());
            estudiante.setEsIncrito(true);
            estudiante.setEsSancionado(false);
            
            HashMapAlumnos.put(matriConver, estudiante);
            
            matricula.setText("");
            nombre.setText("");
            apellido.setText("");
            email.setText("");
            msjFeedback(msj, "😄", Color.green);
            timer.schedule(panelBuscar, 800);
        } catch (Exception e) {
            msjFeedback(msj, "Error 500 - Agregar alumno", Color.red);
            return;
        }
    }
    
    //  METODO PARA BUSCAR AL ALUMNO
    public static void buscarAlumno(JTextField opcion, JLabel msj) {
        int matriBus;
        Timer timer = new Timer();
        
        if(opcion.getText().equals("")) {
            msjFeedback(msj, "El campo esta vacio", Color.red);
            return;
        }
        
        // Intenta convertir la matricula en int, es una forma de validar que el usuario solo escriba numeros en la matricula
        try {
            matriBus = Integer.parseInt(opcion.getText());
        } catch (Exception e) {
            msjFeedback(msj, "La matricula solo deben ser numeros", Color.red);
            return;
        }
        
        // MOSTRAR PANEL DE DETALLES DEL ALUMNO
        TimerTask panelDetalles = new TimerTask() {
            public void run() {
                pad = new JPanelAlumnoDetalles(matriculaGlobal);
                Utilidades.ShowPanel(pad, content);
                pad.Imagenes();
            }
        };
        
        if(HashMapAlumnos.containsKey(matriBus)) {
            matriculaGlobal = matriBus;
            msjFeedback(msj, "Cargando usuario", Color.blue);
            timer.schedule(panelDetalles, 1500);
            return;
        }
        
        msjFeedback(msj, "El usuario no existe", Color.red);
    }
    
    // CONSULTA GENERAL
    public static void consultarTodosAlumnos(JLabel msj) {
        if(HashMapAlumnos.size() == 0) {
            msjFeedback(msj, "No hay alumnos registrados", Color.red);
            return;
        }
        
        JPanelAlumnosGenerales pag = new JPanelAlumnosGenerales(HashMapAlumnos);
        Utilidades.ShowPanel(pag, content);
    }
    
    // METODO PARA VER LOS DETALLES DEL ALUMNO QUE SE BUSCO
    public static void detallesAlumno(int matri, JLabel nombre, JLabel matricula, JLabel email, JLabel inscrito, JLabel sancionado, JLabel descripSancionado, JPanel panelInscrito, JPanel panelSancionado, JButton btnBaja) {
        if(!HashMapAlumnos.containsKey(matri)) {
            JOptionPane.showMessageDialog(null, "Error 500 - Detalles");
            return;
        }
        
        // ENVIO LOS TRES PRIMEROS DATOS DEL ALUMNO (NOMBRE, MATRICULA, EMAIL)
        nombre.setText(HashMapAlumnos.get(matri).getNombre() + " " + HashMapAlumnos.get(matri).getApellidos());
        matricula.setText(String.valueOf(HashMapAlumnos.get(matri).getMatricula()));
        email.setText(HashMapAlumnos.get(matri).getEmail());
        
        // VALIDAR SI ESTA INSCRITO
        validInscrito(matri, panelInscrito, inscrito, btnBaja);
        // VALIDAR SI ESTA SANCIONADO        
        validSancionado(matri, panelSancionado, sancionado, descripSancionado);
    }
    
    // METODO DE ELIMINAR ALUMNO
    public static void eliminarAlumno(int matri) {
        try {
            int confirEliminarA = JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar a este alumno?");
            if(confirEliminarA == 0) {
                Utilidades.MostarPanelesMain("AlumnoBuscar");
                HashMapAlumnos.remove(matri);
                return;
            }
            JOptionPane.showMessageDialog(null, "Eliminación cancelada");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 500 - Eliminar");
        }
    }
    
    // METODOS PARA ACTUALIZAR LOS DATOS
    public static void mostarAlumnoActualizar(int matri, JTextField nombre, JTextField apellido, JTextField email) {
        try {
            nombre.setText(HashMapAlumnos.get(matri).getNombre());
            apellido.setText(HashMapAlumnos.get(matri).getApellidos());
            email.setText(HashMapAlumnos.get(matri).getEmail());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 500 - Actualizar");
        }
    }
    public static void btnActualizarAlumno(int matri, JTextField nombre, JTextField apellido, JTextField email, JLabel msj) {
        Timer timer = new Timer();
        try {
            if(nombre.getText().equals("") || apellido.getText().equals("") || email.getText().equals("")) {
                msjFeedback(msj, "Los campos no pueden estar vacios", Color.red);
                return;
            }
            
            // VALIDAR EL FORMATO DEL EMAIL
            String regexEmail = "^[a-zA-Z-\\.0-9_]+@[a-z]+\\.[a-z]+$";
            boolean isEmailValido = Pattern.matches(regexEmail, email.getText());
            if(!isEmailValido) {
                msjFeedback(msj, "El formato del email no es valido.", Color.red);
                return;
            }
            
            HashMapAlumnos.get(matri).setNombre(nombre.getText());
            HashMapAlumnos.get(matri).setApellidos(apellido.getText());
            HashMapAlumnos.get(matri).setEmail(email.getText());
            
            // MOSTRAR PANEL BUSCAR CUANDO ACTUALICE LOS DATOS
            TimerTask panelBuscar = new TimerTask() {
                public void run() {
                    pad = new JPanelAlumnoDetalles(matri);
                    Utilidades.ShowPanel(pad, content);
                    pad.Imagenes();
                }
            };
            
            msjFeedback(msj, "Alumno actualizado correctamente", Color.blue);
            timer.schedule(panelBuscar, 700);
        } catch (Exception e) {
            msjFeedback(msj, "Error 500 - Boton Actualizar", Color.red);
        }
    }
    
    // DAR DE BAJA
    public static void darBajaAlumno(int matri, JPanel panelIns, JLabel inscrito, JButton btn) {
        if(HashMapAlumnos.get(matri).isEsIncrito()) {
            HashMapAlumnos.get(matri).setEsIncrito(false);
            validInscrito(matri, panelIns, inscrito, btn);
        } else {
            HashMapAlumnos.get(matri).setEsIncrito(true);
            validInscrito(matri, panelIns, inscrito, btn);
        }
    }
    
    // VALID INSCRITO
    private static void validInscrito(int matri, JPanel panelInscrito, JLabel inscrito, JButton btn) {
        // ENVIAR EL DATO DE SI ESTA INSCRITO
        if(HashMapAlumnos.get(matri).isEsIncrito()) {
            panelInscrito.setBackground(new Color(224,231,248));
            inscrito.setForeground(new Color(30,95,255));
            inscrito.removeAll();
            inscrito.setText("Inscrito");
            btn.setText("Dar de baja");
        } else {
            // EN CASO DE QUE NO
            panelInscrito.setBackground(new Color(226,226,226));
            inscrito.setForeground(Color.BLACK);
            inscrito.removeAll();
            inscrito.setText("Dado de baja");
            btn.setText("Dar de alta");
        }
    }

    // VALID SANCIONADO
    private static void validSancionado(int matri, JPanel panelSancionado, JLabel sancionado, JLabel descripSancionado) {
        // ENVIAR EL DATO SI ESTA SANCIONADO
        if(HashMapAlumnos.get(matri).isEsSancionado()) {
            panelSancionado.setBackground(new Color(252,234,228));
            sancionado.removeAll();
            sancionado.setForeground(new Color(255,57,57));
            sancionado.setText("Sancionado");
            descripSancionado.setText("Tiene una devolucion pendiente");
        } else {
            // EN CASO DE QUE NO TENGA SANCION
            panelSancionado.setBackground(new Color(199,248,214));
            sancionado.removeAll();
            sancionado.setForeground(Color.BLACK);
            sancionado.setText("Aprobado");
            descripSancionado.setText("Todo en orden");
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
