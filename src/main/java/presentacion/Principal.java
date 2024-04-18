package presentacion;

// MacOS
//import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;


/**
 *
 * @author César Eliud Rodriguez Añorve
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        
        initComponents();
        
        // Iniciando con el panel presentacion
        Utilidades.MostarPanelesMain("Presentacion");
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnInicio3 = new javax.swing.JButton();
        jPFondo = new javax.swing.JPanel();
        jPMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnInicio = new javax.swing.JButton();
        BtnInicio1 = new javax.swing.JButton();
        BtnInicio2 = new javax.swing.JButton();
        BtnInicio5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPEncabezado = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        BtnInicio3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        BtnInicio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devolucion.png"))); // NOI18N
        BtnInicio3.setText("Devolucion");
        BtnInicio3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInicio3.setFocusPainted(false);
        BtnInicio3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnInicio3.setIconTextGap(8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1040, 620));

        jPFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPFondo.setPreferredSize(new java.awt.Dimension(1040, 640));

        jPMenu.setBackground(new java.awt.Color(247, 248, 248));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de control");
        jLabel1.setAutoscrolls(true);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setFocusCycleRoot(true);

        BtnInicio.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        BtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N
        BtnInicio.setText("Inicio");
        BtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInicio.setFocusPainted(false);
        BtnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnInicio.setIconTextGap(8);
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });

        BtnInicio1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        BtnInicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumno.png"))); // NOI18N
        BtnInicio1.setText("Alumnos");
        BtnInicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInicio1.setFocusPainted(false);
        BtnInicio1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnInicio1.setIconTextGap(8);
        BtnInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicio1ActionPerformed(evt);
            }
        });

        BtnInicio2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        BtnInicio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prestamo.png"))); // NOI18N
        BtnInicio2.setText("Prestamos");
        BtnInicio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInicio2.setFocusPainted(false);
        BtnInicio2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnInicio2.setIconTextGap(8);
        BtnInicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicio2ActionPerformed(evt);
            }
        });

        BtnInicio5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        BtnInicio5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libro.png"))); // NOI18N
        BtnInicio5.setText("Libros");
        BtnInicio5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInicio5.setFocusPainted(false);
        BtnInicio5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnInicio5.setIconTextGap(8);
        BtnInicio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicio5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Biblioteca");
        jLabel2.setAutoscrolls(true);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setFocusCycleRoot(true);

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPMenuLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPMenuLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnInicio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnInicio2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(BtnInicio5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(BtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnInicio5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
        );

        jPEncabezado.setBackground(new java.awt.Color(240, 242, 245));

        javax.swing.GroupLayout jPEncabezadoLayout = new javax.swing.GroupLayout(jPEncabezado);
        jPEncabezado.setLayout(jPEncabezadoLayout);
        jPEncabezadoLayout.setHorizontalGroup(
            jPEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPEncabezadoLayout.setVerticalGroup(
            jPEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setRequestFocusEnabled(false);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPFondoLayout = new javax.swing.GroupLayout(jPFondo);
        jPFondo.setLayout(jPFondoLayout);
        jPFondoLayout.setHorizontalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPFondoLayout.setVerticalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addComponent(jPEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // PANEL PRESTAMOS
    private void BtnInicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicio2ActionPerformed
        Utilidades.MostarPanelesMain("Prestamos");
    }//GEN-LAST:event_BtnInicio2ActionPerformed

    // PANEL PRESENTACION
    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        Utilidades.MostarPanelesMain("Presentacion");
    }//GEN-LAST:event_BtnInicioActionPerformed

    // PANEL LIBROS
    private void BtnInicio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicio5ActionPerformed
        Utilidades.MostarPanelesMain("Libros");
    }//GEN-LAST:event_BtnInicio5ActionPerformed

    // PANEL BUSCAR ALUMNOS
    private void BtnInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicio1ActionPerformed
        Utilidades.MostarPanelesMain("AlumnoBuscar");
    }//GEN-LAST:event_BtnInicio1ActionPerformed

    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        UIManager.put( "Component.hideMnemonics", false );


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton BtnInicio1;
    private javax.swing.JButton BtnInicio2;
    private javax.swing.JButton BtnInicio3;
    private javax.swing.JButton BtnInicio5;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPEncabezado;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPMenu;
    // End of variables declaration//GEN-END:variables
}