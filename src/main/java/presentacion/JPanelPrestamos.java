package presentacion;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import logica.negocios.OpsPrestamos;
import logica.negocios.RenderListPrestamos;

public class JPanelPrestamos extends javax.swing.JPanel {
    
    // PARA RENDERIZAR LOS DATOS EN LA TABLA
    private RenderListPrestamos renderizado;
    
    // METODO PARA FILTRAR LOS DATOS
    private TableRowSorter TRSFiltro;
    
    // ACIONES ACTUALIZAR Y ELIMINAR
    // VARIABLE PARA SABER SI HAY UNA FILA O REGISTRO SELECCIONADO
    private static boolean isSelectRow;
    // VARIABLE DEL ISBN DEL REGISTRO SELECCIONADO
    private int IdPrestamoSelect;

    public JPanelPrestamos() {
        initComponents();
        renderizado = new RenderListPrestamos(OpsPrestamos.HashMapPrestamos);
        TablaContenidoPrestamos.setModel(renderizado);
        
        isSelectRow = false;
        IdPrestamoSelect = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAviso = new javax.swing.JPanel();
        Feedback = new javax.swing.JLabel();
        BtnNuevoPrestamo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaContenidoPrestamos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnEliminarPrestamo = new javax.swing.JButton();
        TxtFiltro = new javax.swing.JTextField();
        BtnActualizarPrestamo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(780, 540));
        setPreferredSize(new java.awt.Dimension(780, 540));

        PanelAviso.setBackground(new java.awt.Color(255, 255, 255));

        Feedback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Feedback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelAvisoLayout = new javax.swing.GroupLayout(PanelAviso);
        PanelAviso.setLayout(PanelAvisoLayout);
        PanelAvisoLayout.setHorizontalGroup(
            PanelAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAvisoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(Feedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80))
        );
        PanelAvisoLayout.setVerticalGroup(
            PanelAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        BtnNuevoPrestamo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BtnNuevoPrestamo.setForeground(new java.awt.Color(33, 150, 243));
        BtnNuevoPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregar.png"))); // NOI18N
        BtnNuevoPrestamo.setText("Nuevo prestamo");
        BtnNuevoPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnNuevoPrestamo.setFocusPainted(false);
        BtnNuevoPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnNuevoPrestamo.setIconTextGap(8);
        BtnNuevoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoPrestamoActionPerformed(evt);
            }
        });

        TablaContenidoPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Alumno", "ISBN", "Fecha del prestamo", "Fecha de devolucion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaContenidoPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaContenidoPrestamosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaContenidoPrestamos);
        if (TablaContenidoPrestamos.getColumnModel().getColumnCount() > 0) {
            TablaContenidoPrestamos.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Buscar por ID del alumno");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Listado de los prestamos");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BtnEliminarPrestamo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BtnEliminarPrestamo.setForeground(new java.awt.Color(255, 51, 51));
        BtnEliminarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar.png"))); // NOI18N
        BtnEliminarPrestamo.setText("Eliminar prestamo");
        BtnEliminarPrestamo.setToolTipText("");
        BtnEliminarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEliminarPrestamo.setFocusPainted(false);
        BtnEliminarPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnEliminarPrestamo.setIconTextGap(8);
        BtnEliminarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarPrestamoActionPerformed(evt);
            }
        });

        TxtFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtFiltroKeyTyped(evt);
            }
        });

        BtnActualizarPrestamo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BtnActualizarPrestamo.setForeground(new java.awt.Color(46, 164, 62));
        BtnActualizarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actualizar-verde.png"))); // NOI18N
        BtnActualizarPrestamo.setText("Actualizar prestamo");
        BtnActualizarPrestamo.setToolTipText("");
        BtnActualizarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnActualizarPrestamo.setFocusPainted(false);
        BtnActualizarPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnActualizarPrestamo.setIconTextGap(8);
        BtnActualizarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(PanelAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnNuevoPrestamo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnActualizarPrestamo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnEliminarPrestamo)
                                .addGap(0, 55, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActualizarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // BOTON PARA AGREGAR UN NUEVO REGISTRO
    private void BtnNuevoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoPrestamoActionPerformed
        JPanelPrestamosCrear ppc = new JPanelPrestamosCrear();
        Utilidades.ShowPanel(ppc, Principal.content);
    }//GEN-LAST:event_BtnNuevoPrestamoActionPerformed

    // BOTON PARA ACTUALIZAR EL PRESTAMO
    private void BtnActualizarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarPrestamoActionPerformed
        if(isSelectRow == false) {
            Feedback.setText("Selecciona un registro para actualizarlo. (da un click a la fila que quieres actualizar)");
            Feedback.setForeground(Color.white);
            PanelAviso.setBackground(Color.red);
            return;
        }
        
        if(OpsPrestamos.HashMapPrestamos.get(IdPrestamoSelect).isDevuelto()) {
            Feedback.setText("El prestamo seleccionado ya esta devueldo, no puedes modificarlo");
            Feedback.setForeground(Color.white);
            PanelAviso.setBackground(Color.red);
            return;
        }
        
        JPanelPrestamosActualizar ppa = new JPanelPrestamosActualizar(IdPrestamoSelect);
        Utilidades.ShowPanel(ppa, Principal.content);
    }//GEN-LAST:event_BtnActualizarPrestamoActionPerformed

    // BOTON PARA ELIMINAR PRESTAMO
    private void BtnEliminarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarPrestamoActionPerformed
        if(isSelectRow == false) {
            Feedback.setText("Selecciona un registro para eliminarlo. (Da click a la fila en la tabla)");
            Feedback.setForeground(Color.white);
            PanelAviso.setBackground(Color.red);
            return;
        }
        
        if(OpsPrestamos.HashMapPrestamos.get(IdPrestamoSelect).isDevuelto()) {
            Feedback.setText("El prestamo seleccionado ya esta devueldo, no puedes eliminarlo");
            Feedback.setForeground(Color.white);
            PanelAviso.setBackground(Color.red);
            return;
        }
        
        OpsPrestamos.eliminarPrestamo(IdPrestamoSelect, Feedback, PanelAviso);
    }//GEN-LAST:event_BtnEliminarPrestamoActionPerformed

    // METODO CUANDO SE QUIERE FILTRAR UN PRESTAMO
    private void TxtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFiltroKeyTyped
        TxtFiltro.addKeyListener(new KeyAdapter() {
            public void keyReleased (final KeyEvent e) {
                String cadena = (TxtFiltro.getText());
                TxtFiltro.setText(cadena);
                Filtro();
            }
        });
        TRSFiltro = new TableRowSorter(TablaContenidoPrestamos.getModel());
        TablaContenidoPrestamos.setRowSorter(TRSFiltro);
    }//GEN-LAST:event_TxtFiltroKeyTyped

    private void TablaContenidoPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaContenidoPrestamosMouseClicked
        int seleccionar = TablaContenidoPrestamos.rowAtPoint(evt.getPoint());
        isSelectRow = true;
        IdPrestamoSelect = Integer.parseInt(String.valueOf(TablaContenidoPrestamos.getValueAt(seleccionar, 0)));
    }//GEN-LAST:event_TablaContenidoPrestamosMouseClicked

    public void Filtro() {
        int columnaTabla = 0;
        TRSFiltro.setRowFilter(RowFilter.regexFilter(TxtFiltro.getText(), columnaTabla));
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarPrestamo;
    private javax.swing.JButton BtnEliminarPrestamo;
    private javax.swing.JButton BtnNuevoPrestamo;
    private javax.swing.JLabel Feedback;
    private javax.swing.JPanel PanelAviso;
    private javax.swing.JTable TablaContenidoPrestamos;
    private javax.swing.JTextField TxtFiltro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
