package presentacion;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import logica.negocios.OpsLibros;
import logica.negocios.RenderListLibros;

public class JPanelLibros extends javax.swing.JPanel {
    // METODO PARA FILTRAR LOS DATOS
    private TableRowSorter TRSFiltro;
    // CLASE PARA RENDERIZAR LOS DATOS EN LA TABLA
    private RenderListLibros renderizado;
    // VARIABLE PARA SABER SI HAY UNA FILA O REGISTRO SELECCIONADO
    private static boolean isSelectRow;
    // VARIABLE DEL ISBN DEL REGISTRO SELECCIONADO
    private String isbnSeleccionado;
    
    public JPanelLibros() {
        initComponents();
        // Inicializar el render para mostar los libros
        renderizado = new RenderListLibros(OpsLibros.HashMapLibros);
        TablaContenidoLibros.setModel(renderizado);
        isSelectRow = false;
        isbnSeleccionado = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAviso = new javax.swing.JPanel();
        FeedbackLibros = new javax.swing.JLabel();
        BtnInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaContenidoLibros = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnEliminar = new javax.swing.JButton();
        TxtFiltro = new javax.swing.JTextField();
        BtnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(780, 540));
        setPreferredSize(new java.awt.Dimension(780, 540));

        PanelAviso.setBackground(new java.awt.Color(255, 255, 255));

        FeedbackLibros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FeedbackLibros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelAvisoLayout = new javax.swing.GroupLayout(PanelAviso);
        PanelAviso.setLayout(PanelAvisoLayout);
        PanelAvisoLayout.setHorizontalGroup(
            PanelAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FeedbackLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAvisoLayout.setVerticalGroup(
            PanelAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FeedbackLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        BtnInicio.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BtnInicio.setForeground(new java.awt.Color(33, 150, 243));
        BtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregar.png"))); // NOI18N
        BtnInicio.setText("Agregar libro nuevo");
        BtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInicio.setFocusPainted(false);
        BtnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnInicio.setIconTextGap(8);
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });

        TablaContenidoLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Titulo", "Disponible", "Categoria", "Autor", "Editorial", "Publicado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaContenidoLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaContenidoLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaContenidoLibros);
        if (TablaContenidoLibros.getColumnModel().getColumnCount() > 0) {
            TablaContenidoLibros.getColumnModel().getColumn(0).setMaxWidth(60);
            TablaContenidoLibros.getColumnModel().getColumn(2).setMaxWidth(90);
            TablaContenidoLibros.getColumnModel().getColumn(6).setMaxWidth(90);
        }

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Buscar por ISBN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Listado de libros");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BtnEliminar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 51, 51));
        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar.png"))); // NOI18N
        BtnEliminar.setText("Eliminar libro");
        BtnEliminar.setToolTipText("");
        BtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEliminar.setFocusPainted(false);
        BtnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnEliminar.setIconTextGap(8);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        TxtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtFiltroKeyTyped(evt);
            }
        });

        BtnActualizar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BtnActualizar.setForeground(new java.awt.Color(46, 164, 62));
        BtnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actualizar-verde.png"))); // NOI18N
        BtnActualizar.setText("Actualizar libro");
        BtnActualizar.setToolTipText("");
        BtnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnActualizar.setFocusPainted(false);
        BtnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnActualizar.setIconTextGap(8);
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                    .addComponent(PanelAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnInicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnActualizar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnEliminar)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // BOTON PARA AGREGAR UN NUEVO LIBRO
    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
    JPanelLibrosCrear jlc = new JPanelLibrosCrear();
    Utilidades.ShowPanel(jlc, Principal.content);
    }//GEN-LAST:event_BtnInicioActionPerformed

    // METODO PARA EL FILTRO
    private void TxtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFiltroKeyTyped
        TxtFiltro.addKeyListener(new KeyAdapter() {
            public void keyReleased (final KeyEvent e) {
                String cadena = (TxtFiltro.getText());
                TxtFiltro.setText(cadena);
                Filtro();
            }
        });
        TRSFiltro = new TableRowSorter(TablaContenidoLibros.getModel());
        TablaContenidoLibros.setRowSorter(TRSFiltro);
    }//GEN-LAST:event_TxtFiltroKeyTyped

    // METODO/BOTON DE ELIMINAR
    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        if(isSelectRow == false) {
            FeedbackLibros.setText("Selecciona un registro para eliminarlo.");
            FeedbackLibros.setForeground(Color.white);
            PanelAviso.setBackground(Color.red);
            return;
        }
        
        OpsLibros.eliminarLibro(isbnSeleccionado, FeedbackLibros, PanelAviso);
    }//GEN-LAST:event_BtnEliminarActionPerformed

    // CODIGO PARA SABER QUE REGISTRO ESTA SELECCIONADO (ISBN)
    private void TablaContenidoLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaContenidoLibrosMouseClicked
        int seleccionar = TablaContenidoLibros.rowAtPoint(evt.getPoint());
        isSelectRow = true;
        isbnSeleccionado = String.valueOf(TablaContenidoLibros.getValueAt(seleccionar, 0));
//        JOptionPane.showMessageDialog(null, "TOCKET " + isSelectRow);
    }//GEN-LAST:event_TablaContenidoLibrosMouseClicked

    // BOTON DE ACTUALIZAR
    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        if(isSelectRow == false) {
            FeedbackLibros.setText("Selecciona un registro para actualizarlo.");
            FeedbackLibros.setForeground(Color.white);
            PanelAviso.setBackground(Color.red);
            return;
        }
        
        JPanelLibrosActualizar pla = new JPanelLibrosActualizar(isbnSeleccionado);
        Utilidades.ShowPanel(pla, Principal.content);
    }//GEN-LAST:event_BtnActualizarActionPerformed

    public void Filtro() {
        int columnaTabla = 0;
        TRSFiltro.setRowFilter(RowFilter.regexFilter(TxtFiltro.getText(), columnaTabla));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnInicio;
    private javax.swing.JLabel FeedbackLibros;
    private javax.swing.JPanel PanelAviso;
    private javax.swing.JTable TablaContenidoLibros;
    private javax.swing.JTextField TxtFiltro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
