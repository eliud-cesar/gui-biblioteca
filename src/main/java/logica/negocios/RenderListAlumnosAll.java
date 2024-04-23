package logica.negocios;

import datos.Alumno;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class RenderListAlumnosAll implements TableModel {
    private Map<Integer, Alumno> Alumnos;
    
    public RenderListAlumnosAll(Map<Integer, Alumno> hash) {
        Alumnos = hash;
    }

    @Override
    public int getRowCount() {
        return Alumnos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        
        switch (columnIndex) {
            case 0:
                titulo = "Matricula";
                break;
            case 1:
                titulo = "Nombre";
                break;
            case 2:
                titulo = "Apellidos";
                break;
            case 3:
                titulo = "Email";
                break;
        }
        
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return int.class;
            case 1, 2, 3:
                return String.class;
            default: return String  .class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ArrayList<Alumno> listaAlumnos =  new ArrayList<>(Alumnos.values());
        Alumno a = listaAlumnos.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return a.getMatricula();
            case 1:
                return a.getNombre();
            case 2:
                return a.getApellidos();
            case 3:
                return a.getEmail();
            default:
                return 0;
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