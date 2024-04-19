package presentacion;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPanelLibros extends javax.swing.JPanel {

    DefaultTableModel modelo;
    Utilidades u = new Utilidades();
    
    public JPanelLibros() {
        initComponents();        
        modelo = (DefaultTableModel) TablaContenidoLibros.getModel();
        Utilidades.addCheckBox(0, TablaContenidoLibros);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAviso = new javax.swing.JPanel();
        Feedback = new javax.swing.JLabel();
        BtnInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaContenidoLibros = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnInicio1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(780, 540));
        setPreferredSize(new java.awt.Dimension(780, 540));

        PanelAviso.setBackground(new java.awt.Color(255, 255, 255));

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
                "", "ISBN", "Titulo", "Disponible", "Categoria", "Autor", "Editorial", "Publicado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaContenidoLibros);
        if (TablaContenidoLibros.getColumnModel().getColumnCount() > 0) {
            TablaContenidoLibros.getColumnModel().getColumn(0).setMaxWidth(30);
            TablaContenidoLibros.getColumnModel().getColumn(1).setMaxWidth(60);
            TablaContenidoLibros.getColumnModel().getColumn(3).setMaxWidth(90);
            TablaContenidoLibros.getColumnModel().getColumn(7).setMaxWidth(90);
        }

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Buscar por ISBN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Listado de libros");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BtnInicio1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BtnInicio1.setForeground(new java.awt.Color(255, 51, 51));
        BtnInicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar.png"))); // NOI18N
        BtnInicio1.setText("Eliminar libro");
        BtnInicio1.setToolTipText("");
        BtnInicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInicio1.setFocusPainted(false);
        BtnInicio1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnInicio1.setIconTextGap(8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                    .addComponent(PanelAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnInicio1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnInicio)))
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
                    .addComponent(BtnInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // BOTON PARA AGREGAR UNA NUEVA FILA
    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        try {
            int newRow = modelo.getRowCount();
            modelo.addRow(new Object[modelo.getColumnCount()]);        
            TablaContenidoLibros.changeSelection(newRow, 0, false, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 500");
            PanelAviso.setBackground(Color.red);
        }
        u.changeFeedback(Feedback, "Registro agregado", "check.png");
        PanelAviso.setBackground(new Color(109,216,97));
    }//GEN-LAST:event_BtnInicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton BtnInicio1;
    private javax.swing.JLabel Feedback;
    private javax.swing.JPanel PanelAviso;
    private javax.swing.JTable TablaContenidoLibros;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
