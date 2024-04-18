package presentacion;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

public class JPanelAlumnosBuscar extends javax.swing.JPanel {
    // TIMER
    Timer timer = new Timer();

    public JPanelAlumnosBuscar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelLogo = new javax.swing.JPanel();
        ImgGorroEstudiante = new javax.swing.JLabel();
        PanelBuscar = new javax.swing.JPanel();
        TextoBuscarAlumno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        LabelMsjBuscar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(780, 540));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(780, 540));

        PanelLogo.setBackground(new java.awt.Color(255, 255, 255));
        PanelLogo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        ImgGorroEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        ImgGorroEstudiante.setMaximumSize(new java.awt.Dimension(150, 150));
        ImgGorroEstudiante.setMinimumSize(new java.awt.Dimension(40, 40));
        ImgGorroEstudiante.setPreferredSize(new java.awt.Dimension(150, 150));
        PanelLogo.add(ImgGorroEstudiante);

        PanelBuscar.setBackground(new java.awt.Color(255, 255, 255));
        PanelBuscar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 12, 0));

        TextoBuscarAlumno.setPreferredSize(new java.awt.Dimension(250, 30));
        TextoBuscarAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextoBuscarAlumnoKeyPressed(evt);
            }
        });
        PanelBuscar.add(TextoBuscarAlumno);

        jButton1.setBackground(new java.awt.Color(33, 150, 243));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busqueda.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelBuscar.add(jButton1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jButton2.setForeground(new java.awt.Color(33, 150, 243));
        jButton2.setText("Crear nuevo alumno");
        jButton2.setPreferredSize(new java.awt.Dimension(150, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        LabelMsjBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Busca ID del alumno ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelMsjBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelMsjBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // BOTON DE BUSCAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ValidarAlumnoBuscar();
    }//GEN-LAST:event_jButton1ActionPerformed

    // BOTON DE CREAR UN ALUMNO
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Utilidades.MostarPanelesMain("AlumnoCrear");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TextoBuscarAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoBuscarAlumnoKeyPressed
        if(evt.getKeyChar() == 10) {
            ValidarAlumnoBuscar();
        }
    }//GEN-LAST:event_TextoBuscarAlumnoKeyPressed
    
    // METODO QUE VALIDA SI EL ALUMNO ES CORRECTO (POR EL MOMENTO ES SOLO VALIDAR SI ES IGUAL A UNO QUE SE PUSO POR CODIGO)
    private void ValidarAlumnoBuscar() {
        if(TextoBuscarAlumno.getText().equals("22060023")){
            MensajeBuscar(Color.blue, "Cargando alumno");
            timer.schedule(task, 2000);
        } else {
            MensajeBuscar(Color.red, "El usuario no existe");
        }
    }
    
    // METODO PARA ENVIAR EL MSJ DE FEEDBACK AL BUSCAR ALUMNO
    private void MensajeBuscar(Color colorFont, String msj) {
        LabelMsjBuscar.removeAll();
        LabelMsjBuscar.setText("");
        LabelMsjBuscar.setForeground(colorFont);
        LabelMsjBuscar.setText(msj);
    }
    
    // METODO PARA ENVIAR EL PANEL DEL ALUMNO CON DETALLES DESPUES DE UNOS MILISEGUNDOS
    TimerTask task = new TimerTask() {
        public void run() {
            Utilidades.MostarPanelesMain("AlumnoDetalles");
        }
    };

    public void Imgs() {
        ImgGorroEstudiante.setSize(150, 150);
        Utilidades.AsignarDimensionesImg(ImgGorroEstudiante, "gorroEstudiante.png");
        TextoBuscarAlumno.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel ImgGorroEstudiante;
    private javax.swing.JLabel LabelMsjBuscar;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JTextField TextoBuscarAlumno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
