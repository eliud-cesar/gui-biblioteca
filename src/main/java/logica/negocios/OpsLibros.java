package logica.negocios;

import datos.Libro;
import java.awt.Color;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import presentacion.Utilidades;

public class OpsLibros {
    static Libro book;
    public static Map<String, Libro> HashMapLibros = new HashMap<>();
    
    // METODO PARA CREAR EL LIBRO
    public static void crearLibro(JTextField isbn, JTextField titulo, JTextField autor, JTextField editorial, JTextField fechaPubli, JComboBox categoria, JTextField cantDispo, JLabel msj) {
        Timer timer = new Timer();
        book = new Libro();
        int disponibleConver = 0;
        LocalDate fechaPublicConvert;
        
        // Validar que los campos no esten vacios
        if(isbn.getText().equals("") || titulo.getText().equals("") || autor.getText().equals("") || editorial.getText().equals("") || fechaPubli.getText().equals("") || categoria.getSelectedItem().toString().equals("Seleccionar") || cantDispo.getText().equals("")) {
            msjFeedback(msj, "Rellena todos los campos", Color.red);
            return;
        }
        
        // Intenar convertir la cantidad de string a int
        try {
            disponibleConver = Integer.parseInt(cantDispo.getText());
        } catch (Exception e) {
            msjFeedback(msj, "La cantidad disponible debe ser un numero", Color.red);
            return;
        }
        
        // Validar que la catnidad sea minimo de una
        if(disponibleConver < 1) {
            msjFeedback(msj, "La cantidad disponible debe haber minimo 1 en existencia", Color.red);
            return;
        }
        
        // Intenta convertir la fecha bien con el formato
        try {
            fechaPublicConvert = LocalDate.parse(fechaPubli.getText());
        } catch (Exception e) {
            msjFeedback(msj, "La fecha debe tener el formato: AAAA-MM-DD", Color.red);
            return;
        }
        
        // Validar que la fecha de publicacion no sea mayor a la fecha actual
        LocalDate hoy = LocalDate.now();
        if (fechaPublicConvert.isAfter(hoy)) {
            msjFeedback(msj, "A menos que tengas una maquina del tiempo, el libro no se puede publicar en un futuro", Color.red);
            return;
        }
        
        // Validar que no haya registros con el mismo ISBN
        if(HashMapLibros.containsKey(isbn.getText())) {
            msjFeedback(msj, "Ya existe un registro con el mismo ISBN", Color.red);
            return;
        }
        
        // Mostrar el panel de libros
        TimerTask panelHome = new TimerTask() {
            public void run() {
                Utilidades.MostarPanelesMain("Libros");
            }
        };
        
        // Agregar el libro al hashmap
        try {
            book.setISBN(isbn.getText());
            book.setAutor(autor.getText());
            book.setFechaPublicacion(fechaPublicConvert);
            book.setCantidadDisponible(disponibleConver);
            book.setCategoria(categoria.getSelectedItem().toString());
            book.setEditorial(editorial.getText());
            book.setTitulo(titulo.getText());
            
            HashMapLibros.put(isbn.getText(), book);
            
            isbn.setText("");
            titulo.setText("");
            cantDispo.setText("");
            fechaPubli.setText("");
            autor.setText("");
            categoria.setSelectedItem("Seleccionar");
            editorial.setText("");
            
            msjFeedback(msj, "Libro agregado exitosamente", Color.blue);
            timer.schedule(panelHome, 800);
        } catch (Exception e) {
            msjFeedback(msj, "Error 500 - Crear libro", Color.red);
        }
        
        
    }
    
    // METODO PARA ELIMINAR EL LIBRO
    public static void eliminarLibro(String llaveRegistro, JLabel msj, JPanel panel) {
        Timer timer = new Timer();
        int respuesta;
        
        // Mostrar el panel de libros
        TimerTask panelHomeS = new TimerTask() {
            public void run() {
                Utilidades.MostarPanelesMain("Libros");
            }
        }; 
        
        try { // yes -> 0
            respuesta = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar el libro seleccionado?");
            if(respuesta == 0) {
                HashMapLibros.remove(llaveRegistro);
                msjFeedback(msj, "El libro lo has eliminado correctamente", Color.black);
                panel.setBackground(new Color(109,216,97));
                timer.schedule(panelHomeS, 600);
                return;
            }
            
            msjFeedback(msj, "Eliminacion cancelada", Color.white);
            panel.setBackground(Color.blue);
            timer.schedule(panelHomeS, 600);
        } catch (Exception e) {
            msjFeedback(msj, "Error 500 Eliminar", Color.white);
            panel.setBackground(Color.red);
            System.out.println(e.toString());
        }
    }
    
    public static void renderActualizarLibro(String IDSelect, JTextField titulo, JTextField autor, JTextField editorial, JTextField fechaPubli, JComboBox categoria, JTextField cantDispo) {
        // ELIMINO EN CASO DE QUE HAYA TEXTO
        titulo.setText("");
        autor.setText("");
        cantDispo.setText("");
        editorial.setText("");
        fechaPubli.setText("");
        categoria.setSelectedIndex(0);
        
        // ENVIANDO LOS DATOS A CADA CAMPO PARA LA VISUALIZACION
        titulo.setText(HashMapLibros.get(IDSelect).getTitulo());
        autor.setText(HashMapLibros.get(IDSelect).getAutor());
        cantDispo.setText(String.valueOf(HashMapLibros.get(IDSelect).getCantidadDisponible()));
        editorial.setText(HashMapLibros.get(IDSelect).getEditorial());
        fechaPubli.setText(String.valueOf(HashMapLibros.get(IDSelect).getFechaPublicacion()));
        categoria.setSelectedItem(HashMapLibros.get(IDSelect).getCategoria());
    }
    
    // METODO PARA ACTUALIZAR EL LIBRO
    public static void BtnActualizarLibro(String IDSelect, JTextField titulo, JTextField autor, JTextField editorial, JTextField fechaPubli, JComboBox categoria, JTextField cantDispo, JLabel msj) {
        Timer timer = new Timer();
        int disponibleConvertido = 0;
        LocalDate fechaPublicacionConvertida;

        // Validar que los campos no esten vacios
        if(titulo.getText().equals("") || autor.getText().equals("") || editorial.getText().equals("") || fechaPubli.getText().equals("") || categoria.getSelectedItem().toString().equals("Seleccionar") || cantDispo.getText().equals("")) {
            msjFeedback(msj, "Rellena todos los campos", Color.red);
            return;
        }
        
        // Intenar convertir la cantidad de string a int
        try {
            disponibleConvertido = Integer.parseInt(cantDispo.getText());
        } catch (Exception e) {
            msjFeedback(msj, "La cantidad disponible debe ser un numero", Color.red);
            return;
        }
        
        // Validar que la catnidad sea minimo de una
        if(disponibleConvertido < 1) {
            msjFeedback(msj, "La cantidad disponible debe haber minimo 1 en existencia", Color.red);
            return;
        }
        
        // Intenta convertir la fecha bien con el formato
        try {
            fechaPublicacionConvertida = LocalDate.parse(fechaPubli.getText());
        } catch (Exception e) {
            msjFeedback(msj, "La fecha debe tener el formato: AAAA-MM-DD", Color.red);
            return;
        }
        
        // Validar que la fecha de publicacion no sea mayor a la fecha actual
        LocalDate hoy = LocalDate.now();
        if (fechaPublicacionConvertida.isAfter(hoy)) {
            msjFeedback(msj, "A menos que tengas una maquina del tiempo, el libro no se puede publicar en un futuro", Color.red);
            return;
        }
        
        // Mostrar el panel de libros
        TimerTask panelHome = new TimerTask() {
            public void run() {
                Utilidades.MostarPanelesMain("Libros");
            }
        };
        
        // INTENTANDO ACTUALIZAR EL LIBRO
        try {
            HashMapLibros.get(IDSelect).setTitulo(titulo.getText());
            HashMapLibros.get(IDSelect).setAutor(autor.getText());
            HashMapLibros.get(IDSelect).setCantidadDisponible(Integer.parseInt(cantDispo.getText()));
            HashMapLibros.get(IDSelect).setEditorial(editorial.getText());
            HashMapLibros.get(IDSelect).setFechaPublicacion(fechaPublicacionConvertida);
            HashMapLibros.get(IDSelect).setCategoria(String.valueOf(categoria.getSelectedItem()));
            
            msjFeedback(msj, "El libro se ha actualizado correctamente", Color.blue);
            timer.schedule(panelHome, 500);
            
        } catch (Exception e) {
            msjFeedback(msj, "Error 500 - Crear libro", Color.red);
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
