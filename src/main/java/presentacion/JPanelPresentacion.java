package presentacion;

public class JPanelPresentacion extends javax.swing.JPanel {

    public JPanelPresentacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripccionInicio = new javax.swing.JTextArea();
        ImgInicio = new javax.swing.JLabel();
        ImgAviso = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripccionInicio1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(780, 540));
        setPreferredSize(new java.awt.Dimension(780, 540));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 150, 243));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Biblioteca TecNM");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        descripccionInicio.setEditable(false);
        descripccionInicio.setBackground(new java.awt.Color(255, 255, 255));
        descripccionInicio.setColumns(20);
        descripccionInicio.setLineWrap(true);
        descripccionInicio.setRows(5);
        descripccionInicio.setText("Centro bibliotecario del campus TecNM de Ometepec, Gro.\n\nAcceso a mas de 100,000 libros de todos los ambitos, categorias y generos.\n\nSuscripccion gratis a cualquier alumno inscrito al campus TecNM\n\nEl sistema bibliotecario del campus TecNM es una plataforma integral diseñada para gestionar eficientemente los recursos bibliográficos y facilitar el acceso a la información para la comunidad académica. ");
        descripccionInicio.setWrapStyleWord(true);
        descripccionInicio.setBorder(null);
        descripccionInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(descripccionInicio);

        ImgInicio.setBackground(new java.awt.Color(153, 204, 0));
        ImgInicio.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        ImgInicio.setRequestFocusEnabled(false);
        ImgInicio.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                ImgInicioComponentMoved(evt);
            }
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ImgInicioComponentResized(evt);
            }
        });
        ImgInicio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ImgInicioPropertyChange(evt);
            }
        });

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        descripccionInicio1.setEditable(false);
        descripccionInicio1.setBackground(new java.awt.Color(255, 255, 255));
        descripccionInicio1.setColumns(20);
        descripccionInicio1.setLineWrap(true);
        descripccionInicio1.setRows(5);
        descripccionInicio1.setText("• A partir del 2 de junio se deben devolver todos los libros y no se podran mas rentar cualquier libro.\n\n• Cierre del semestre Enero - Agosto: 10 de julio del 2024");
        descripccionInicio1.setWrapStyleWord(true);
        descripccionInicio1.setBorder(null);
        descripccionInicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(descripccionInicio1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(ImgAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(ImgInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ImgAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void Imgs() {
        ImgAviso.setSize(176, 89);
        ImgInicio.setSize(295, 498);
        Utilidades u = new Utilidades();
        u.AsignarDimensionesImg(ImgInicio, "imagenInicio.jpg");
        u.AsignarDimensionesImg(ImgAviso, "aviso.jpg");
    }
    
    private void ImgInicioComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ImgInicioComponentMoved

    }//GEN-LAST:event_ImgInicioComponentMoved

    private void ImgInicioComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ImgInicioComponentResized

    }//GEN-LAST:event_ImgInicioComponentResized

    private void ImgInicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ImgInicioPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_ImgInicioPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel ImgAviso;
    public static javax.swing.JLabel ImgInicio;
    private javax.swing.JTextArea descripccionInicio;
    private javax.swing.JTextArea descripccionInicio1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
