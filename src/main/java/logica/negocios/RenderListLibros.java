package logica.negocios;

import datos.Alumno;
import datos.Libro;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class RenderListLibros implements TableModel{
    private Map<String, Libro> Libros;
    
    public RenderListLibros(Map<String, Libro> hash) {
        Libros = hash;
    }

    @Override
    public int getRowCount() {
        return Libros.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        
        switch (columnIndex) {
            case 0:
                titulo = "ISBN";
                break;
            case 1:
                titulo = "Titulo";
                break;
            case 2:
                titulo = "Cantidad";
                break;
            case 3:
                titulo = "Categoria";
                break;
            case 4:
                titulo = "Autor";
                break;
            case 5:
                titulo = "Editorial";
                break;
            case 6:
                titulo = "Fecha de publicado";
                break;
        }
        
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0, 1, 3, 4, 5:
                return String.class;
            case 2: return int.class;
            case 6: return LocalDate.class;
            default: return String  .class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ArrayList<Libro> listaLibros =  new ArrayList<>(Libros.values());
        Libro l = listaLibros.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return l.getISBN();
            case 1: return l.getTitulo();
            case 2: return l.getCantidadDisponible();
            case 3: return l.getCategoria();
            case 4: return l.getAutor();
            case 5: return l.getEditorial();
            case 6: return l.getFechaPublicacion();
            default: return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
}
