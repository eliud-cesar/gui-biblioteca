package logica.negocios;

import datos.Prestamo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class RenderListPrestamos implements TableModel {
    private Map<Integer, Prestamo> prestamos;
    
    public RenderListPrestamos(Map<Integer, Prestamo> hash) {
        prestamos = hash;
    }

    @Override
    public int getRowCount() {
        return prestamos.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        
        switch (columnIndex) {
            case 0:
                titulo = "ID";
                break;
            case 1:
                titulo = "Alumno";
                break;
            case 2:
                titulo = "ISBN";
                break;
            case 3:
                titulo = "Fecha del prestamo";
                break;
            case 4:
                titulo = "Fecha devolucion";
                break;
            case 5: 
                titulo = "¿Devuelo?";
                break;
        }
        
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0, 1: return int.class;
            case 2: return String.class;
            case 3, 4: return LocalDate.class;
            case 5: return String.class;
            default: return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ArrayList<Prestamo> listaPrestamos =  new ArrayList<>(prestamos.values());
        Prestamo p = listaPrestamos.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return p.getIdPrestamo();
            case 1: return p.getIdAlumno();
            case 2: return p.getISBN();
            case 3: return p.getFechaPrestamo();
            case 4: return p.getFechaDevolucion();
            case 5: return p.isDevuelto() ? "Devuelto" : "No devuelto";
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