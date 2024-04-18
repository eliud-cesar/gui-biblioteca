package presentacion;

import java.awt.BorderLayout;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import static presentacion.Principal.content;

public class Utilidades {
    Timer timer;
    
    // CODIGO PARA PODER AGREGAR UN CHECKBOX A UNA COLUMNA DE UNA TABLA
    public static void addCheckBox(int column, JTable table) {
        TableColumn tc = table.getColumnModel().getColumn(column);
        tc.setCellEditor(table.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(table.getDefaultRenderer(Boolean.class));
    }
    
    // CODIGO PARA EL FEEDBACK DE LOS PANELES EN LAS ACCIONES DE ELIMINAR O AGREGAR
    public static void changeFeedback(JLabel text, String msj, String rutaImg) {
        text.removeAll();
        text.setText("");
        text.setText(msj);
        ImageIcon icono = new ImageIcon("src/main/resources/" + rutaImg);
        text.setIcon(icono);
    }
    
    // ASIGNAR IMAGENES A UN LABEL
    public static void AsignarDimensionesImg(JLabel nombreEtiqueta, String nombreArchivo) {
        ImageIcon imagen = new ImageIcon("src/main/resources/" + nombreArchivo);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(nombreEtiqueta.getWidth(), nombreEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        nombreEtiqueta.setIcon(icono);
    }
    
    // CODIGO PARA IMPORTAR UN PANEL EN LA PRINCIPAL
    private static void ShowPanel(JPanel p, JPanel content) {
        p.setSize(780, 540);
        p.setLocation(0, 0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    // CODIGO PARA MOSTAR UN PANEL DESDE OTRO PANEL AUTOMATICO
    public static void MostarPanelesMain (String panel) {
        switch (panel) {
            case "Presentacion":
                JPanelPresentacion pp = new JPanelPresentacion();
                ShowPanel(pp, content);
                pp.Imgs();
                break;

            case "Libros":
                JPanelLibros pl = new JPanelLibros();
                ShowPanel(pl, content);
                break;

            case "Prestamos":
                JPanelPrestamos ppr = new JPanelPrestamos();
                ShowPanel(ppr, content);
                break;

            case "AlumnoBuscar":
                JPanelAlumnosBuscar pab = new JPanelAlumnosBuscar();
                ShowPanel(pab, content);
                pab.Imgs();
                break;

            case "AlumnoDetalles":
                JPanelAlumnoDetalles pad = new JPanelAlumnoDetalles();
                ShowPanel(pad, content);
                pad.Imagenes();
                break;

            case "AlumnoCrear":
                JPanelCrearAlumno pca = new JPanelCrearAlumno();
                ShowPanel(pca, content);
                break;
            default:
        }
    }
}
