package presentacion;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import logica.negocios.OpsAlumnos;
import logica.negocios.OpsPrestamos;
import logica.negocios.RenderListPrestamos;

public class JPanelAlumnoDetalles extends javax.swing.JPanel {
    
    private RenderListPrestamos renderizado;
    private TableRowSorter TRSFiltro;
    
    int matri;
    public JPanelAlumnoDetalles(int matricula) {
        initComponents();
        matri = matricula;
        OpsAlumnos.detallesAlumno(matri, AlumnoNombre, AlumnoMatricula, AlumnoEmail, AlumnoInscrito, AlumnoPrestamo, AlumnoPrestamoDescripcion, PanelActivo, PanelPrestamo, BtnBaja);
        
        // RENDERIZANDO EN LA TABLA
        renderizado = new RenderListPrestamos(OpsPrestamos.HashMapPrestamos);
        TablaHistorial.setModel(renderizado);
        
        // APLICANDOLE EL FILTRO
        if(OpsPrestamos.HashMapPrestamos.size() > 0) {
            TRSFiltro = new TableRowSorter(TablaHistorial.getModel());
            TRSFiltro.setRowFilter(RowFilter.regexFilter(String.valueOf(matri), 1));
            TablaHistorial.setRowSorter(TRSFiltro);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AlumnoNombre = new javax.swing.JLabel();
        AlumnoMatricula = new javax.swing.JLabel();
        AlumnoEmail = new javax.swing.JLabel();
        BtnVolver = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BtnBaja = new javax.swing.JButton();
        ImgAvatar = new javax.swing.JLabel();
        PanelActivo = new javax.swing.JPanel();
        ImgEsInscrito = new javax.swing.JLabel();
        AlumnoInscrito = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PanelPrestamo = new javax.swing.JPanel();
        ImgPrestamo = new javax.swing.JLabel();
        AlumnoPrestamo = new javax.swing.JLabel();
        AlumnoPrestamoDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHistorial = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(780, 540));
        setPreferredSize(new java.awt.Dimension(780, 540));
        setRequestFocusEnabled(false);

        AlumnoNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AlumnoNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        AlumnoNombre.setIconTextGap(8);

        AlumnoMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matricula.png"))); // NOI18N
        AlumnoMatricula.setIconTextGap(8);

        AlumnoEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gmail.png"))); // NOI18N
        AlumnoEmail.setIconTextGap(8);

        BtnVolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(33, 150, 243));
        BtnVolver.setText("Volver");
        BtnVolver.setPreferredSize(new java.awt.Dimension(72, 35));
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(232, 73, 73));
        jButton2.setText("Eliminar alumno");
        jButton2.setPreferredSize(new java.awt.Dimension(72, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BtnBaja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnBaja.setForeground(new java.awt.Color(185, 151, 23));
        BtnBaja.setToolTipText("");
        BtnBaja.setPreferredSize(new java.awt.Dimension(72, 30));
        BtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaActionPerformed(evt);
            }
        });

        PanelActivo.setBackground(new java.awt.Color(255, 255, 255));
        PanelActivo.setPreferredSize(new java.awt.Dimension(359, 100));

        AlumnoInscrito.setFont(new java.awt.Font("Microsoft YaHei", 0, 32)); // NOI18N

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Campus TecNM Costa Chica");

        javax.swing.GroupLayout PanelActivoLayout = new javax.swing.GroupLayout(PanelActivo);
        PanelActivo.setLayout(PanelActivoLayout);
        PanelActivoLayout.setHorizontalGroup(
            PanelActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelActivoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ImgEsInscrito, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelActivoLayout.createSequentialGroup()
                        .addComponent(AlumnoInscrito, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelActivoLayout.setVerticalGroup(
            PanelActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelActivoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(AlumnoInscrito, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(PanelActivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImgEsInscrito, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrestamo.setPreferredSize(new java.awt.Dimension(359, 100));

        AlumnoPrestamo.setFont(new java.awt.Font("Microsoft YaHei", 0, 32)); // NOI18N
        AlumnoPrestamo.setForeground(new java.awt.Color(255, 57, 57));

        AlumnoPrestamoDescripcion.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout PanelPrestamoLayout = new javax.swing.GroupLayout(PanelPrestamo);
        PanelPrestamo.setLayout(PanelPrestamoLayout);
        PanelPrestamoLayout.setHorizontalGroup(
            PanelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrestamoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ImgPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AlumnoPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(AlumnoPrestamoDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPrestamoLayout.setVerticalGroup(
            PanelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelPrestamoLayout.createSequentialGroup()
                        .addComponent(AlumnoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AlumnoPrestamoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ImgPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Fecha de prestamo", "Fecha de devolucion", "Estado"
            }
        ));
        jScrollPane1.setViewportView(TablaHistorial);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(50, 140, 33));
        jButton4.setText("Devolver libro");
        jButton4.setPreferredSize(new java.awt.Dimension(72, 35));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Historial de prestamos del alumno");
        jLabel9.setPreferredSize(new java.awt.Dimension(37, 20));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(247, 36, 237));
        jButton1.setText("Editar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ImgAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(AlumnoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AlumnoMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AlumnoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PanelActivo, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(PanelPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImgAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AlumnoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlumnoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlumnoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(PanelActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // BOTON DE VOLVER A BUSCAR UN NUEVO ALUMNO
    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        Utilidades.MostarPanelesMain("AlumnoBuscar");
    }//GEN-LAST:event_BtnVolverActionPerformed

    // BOTON DE ELIMINAR EL ALUMNO
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        OpsAlumnos.eliminarAlumno(matri);
    }//GEN-LAST:event_jButton2ActionPerformed

    // BOTON DE DAR DE BAJA AL ALUMNO
    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        OpsAlumnos.darBajaAlumno(matri, PanelActivo, AlumnoInscrito, BtnBaja);
    }//GEN-LAST:event_BtnBajaActionPerformed

    // BOTON DE ACTUALIZAR LOS DATOS
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JPanelActualizarAlumno paa = new JPanelActualizarAlumno(matri);
        Utilidades.ShowPanel(paa, Principal.content);
    }//GEN-LAST:event_jButton1ActionPerformed

    // DEVOLVER EL LIBRO
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(OpsAlumnos.HashMapAlumnos.get(matri).isEsActivoPrestamo()) {
            int res = JOptionPane.showConfirmDialog(null, "¿Seguro de devolver el libro?");
            if(res == 0) {
                OpsPrestamos.devolverLibro(matri, PanelPrestamo, AlumnoPrestamo, AlumnoPrestamoDescripcion);
                TablaHistorial.repaint();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void Imagenes() {
        ImgEsInscrito.setSize(70, 70);
        ImgPrestamo.setSize(70, 70);
        ImgAvatar.setSize(150, 150);
        Utilidades u = new Utilidades();
        u.AsignarDimensionesImg(ImgAvatar, "avatar.png");
        u.AsignarDimensionesImg(ImgEsInscrito, "inscrito.png");
        u.AsignarDimensionesImg(ImgPrestamo, "libros.png");
    }
    
//    public void Filtro() {
//        int columnaTabla = 1;
//        
//    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlumnoEmail;
    private javax.swing.JLabel AlumnoInscrito;
    private javax.swing.JLabel AlumnoMatricula;
    private javax.swing.JLabel AlumnoNombre;
    private javax.swing.JLabel AlumnoPrestamo;
    private javax.swing.JLabel AlumnoPrestamoDescripcion;
    private javax.swing.JButton BtnBaja;
    private javax.swing.JButton BtnVolver;
    public static javax.swing.JLabel ImgAvatar;
    public static javax.swing.JLabel ImgEsInscrito;
    public static javax.swing.JLabel ImgPrestamo;
    private javax.swing.JPanel PanelActivo;
    private javax.swing.JPanel PanelPrestamo;
    private javax.swing.JTable TablaHistorial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
