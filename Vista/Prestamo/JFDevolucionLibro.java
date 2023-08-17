package Vista.Prestamo;
import Negocio.Fecha;
import Negocio.Interaccion;
import Negocio.Comprobaciones;
import Negocio.Imagenes;
import Vista.Estructura.JFLogin;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JFDevolucionLibro extends javax.swing.JFrame {
    private int x;
    private int y;
    String selectTabla="Prestamo";
    private String SQL;
    Imagenes imagen = new Imagenes();
    ImageIcon ICONERROR = imagen.getICONERROR();
    ImageIcon ICONCORRECTO = imagen.getICONCORRECTO();
    ImageIcon ICONREVISION = imagen.getICONREVISION();
    ImageIcon ICONCANCELAR = imagen.getICONCANCELAR();
    ImageIcon ICONACEPTAR = imagen.getICONACEPTAR();
    Comprobaciones name = new Comprobaciones();
    Fecha fecha = new Fecha();
    Interaccion atributos = new Interaccion();
    Comprobaciones comprobar = new Comprobaciones();
    JFSanciones datosSancion;
    public JFDevolucionLibro() {
        initComponents();
        setLocationRelativeTo(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRegistroPrestamo = new javax.swing.JPanel();
        jTFCodPrestamo = new javax.swing.JTextField();
        jLabelCodLibro = new javax.swing.JLabel();
        jPanelDatosPrestamo = new javax.swing.JPanel();
        jLabelCodPres = new javax.swing.JLabel();
        jTextFieldCodPres = new javax.swing.JTextField();
        jLabelCodLib = new javax.swing.JLabel();
        jTextFieldCodLib = new javax.swing.JTextField();
        jLabelLib = new javax.swing.JLabel();
        jTextFieldLibro = new javax.swing.JTextField();
        jLabelCodEst = new javax.swing.JLabel();
        jTextFieldCodEst = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNomEst = new javax.swing.JTextField();
        jLabelFP = new javax.swing.JLabel();
        jTextFieldFP = new javax.swing.JTextField();
        jLabelFD = new javax.swing.JLabel();
        jTextFieldFD = new javax.swing.JTextField();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jBDevolverLibro = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insertar Estudiante");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(290, 400));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanelRegistroPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistroPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Prestamo"));

        jTFCodPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCodPrestamoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCodPrestamoKeyTyped(evt);
            }
        });

        jLabelCodLibro.setText("Codigo prestamo:");

        javax.swing.GroupLayout jPanelRegistroPrestamoLayout = new javax.swing.GroupLayout(jPanelRegistroPrestamo);
        jPanelRegistroPrestamo.setLayout(jPanelRegistroPrestamoLayout);
        jPanelRegistroPrestamoLayout.setHorizontalGroup(
            jPanelRegistroPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroPrestamoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabelCodLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCodPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRegistroPrestamoLayout.setVerticalGroup(
            jPanelRegistroPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroPrestamoLayout.createSequentialGroup()
                .addGroup(jPanelRegistroPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodLibro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelRegistroPrestamo);
        jPanelRegistroPrestamo.setBounds(10, 40, 270, 50);

        jPanelDatosPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la devolucion"));
        jPanelDatosPrestamo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCodPres.setText("Codigo Prestamo:");
        jPanelDatosPrestamo.add(jLabelCodPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));

        jTextFieldCodPres.setEditable(false);
        jTextFieldCodPres.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosPrestamo.add(jTextFieldCodPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 130, -1));

        jLabelCodLib.setText("Codigo Libro:");
        jPanelDatosPrestamo.add(jLabelCodLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, -1));

        jTextFieldCodLib.setEditable(false);
        jTextFieldCodLib.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosPrestamo.add(jTextFieldCodLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 130, -1));

        jLabelLib.setText("Titulo Libro:");
        jPanelDatosPrestamo.add(jLabelLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        jTextFieldLibro.setEditable(false);
        jTextFieldLibro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosPrestamo.add(jTextFieldLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, -1));

        jLabelCodEst.setText("Codigo Estudiante:");
        jPanelDatosPrestamo.add(jLabelCodEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, -1));

        jTextFieldCodEst.setEditable(false);
        jTextFieldCodEst.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosPrestamo.add(jTextFieldCodEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 130, -1));

        jLabelNombre.setText("Nombre Estudiante:");
        jPanelDatosPrestamo.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, -1));

        jTextFieldNomEst.setEditable(false);
        jTextFieldNomEst.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosPrestamo.add(jTextFieldNomEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 120, -1));

        jLabelFP.setText("Fecha Prestamo:");
        jPanelDatosPrestamo.add(jLabelFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, -1));

        jTextFieldFP.setEditable(false);
        jTextFieldFP.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosPrestamo.add(jTextFieldFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 130, -1));

        jLabelFD.setText("Fecha Devolucion:");
        jPanelDatosPrestamo.add(jLabelFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, -1));

        jTextFieldFD.setEditable(false);
        jTextFieldFD.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosPrestamo.add(jTextFieldFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 130, -1));

        getContentPane().add(jPanelDatosPrestamo);
        jPanelDatosPrestamo.setBounds(10, 90, 270, 230);

        jButtonMinimizar.setBackground(new java.awt.Color(91, 165, 152));
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar 24.png"))); // NOI18N
        jButtonMinimizar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(57, 116, 104)));
        jButtonMinimizar.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonMinimizar.setRequestFocusEnabled(false);
        jButtonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMinimizar);
        jButtonMinimizar.setBounds(230, 0, 30, 30);

        jButtonSalirIcon.setBackground(new java.awt.Color(91, 165, 152));
        jButtonSalirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButtonSalirIcon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(48, 108, 97)));
        jButtonSalirIcon.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonSalirIcon.setRequestFocusEnabled(false);
        jButtonSalirIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirIconActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalirIcon);
        jButtonSalirIcon.setBounds(260, 0, 30, 30);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Devolver libro");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 140, 30);

        jBDevolverLibro.setBackground(new java.awt.Color(255, 255, 255));
        jBDevolverLibro.setForeground(new java.awt.Color(58, 160, 141));
        jBDevolverLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar 32.png"))); // NOI18N
        jBDevolverLibro.setText("devolver");
        jBDevolverLibro.setBorder(null);
        jBDevolverLibro.setBorderPainted(false);
        jBDevolverLibro.setHideActionText(true);
        jBDevolverLibro.setMaximumSize(new java.awt.Dimension(89, 32));
        jBDevolverLibro.setMinimumSize(new java.awt.Dimension(89, 32));
        jBDevolverLibro.setPreferredSize(new java.awt.Dimension(89, 32));
        jBDevolverLibro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar 32.png"))); // NOI18N
        jBDevolverLibro.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar 32.png"))); // NOI18N
        jBDevolverLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDevolverLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDevolverLibroMouseExited(evt);
            }
        });
        jBDevolverLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDevolverLibroActionPerformed(evt);
            }
        });
        getContentPane().add(jBDevolverLibro);
        jBDevolverLibro.setBounds(20, 350, 110, 40);

        jBCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jBCancelar.setForeground(new java.awt.Color(58, 160, 141));
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar 32.png"))); // NOI18N
        jBCancelar.setText("cancelar");
        jBCancelar.setBorder(null);
        jBCancelar.setBorderPainted(false);
        jBCancelar.setHideActionText(true);
        jBCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBCancelar.setMaximumSize(new java.awt.Dimension(89, 32));
        jBCancelar.setMinimumSize(new java.awt.Dimension(89, 32));
        jBCancelar.setPreferredSize(new java.awt.Dimension(89, 32));
        jBCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar selected 32 .png"))); // NOI18N
        jBCancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar selected 32 .png"))); // NOI18N
        jBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCancelarMouseExited(evt);
            }
        });
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBCancelar);
        jBCancelar.setBounds(150, 350, 110, 40);

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoDevolverPrestamo.png"))); // NOI18N
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 290, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(JFLogin.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void jBDevolverLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDevolverLibroActionPerformed
        this.selectTabla="Prestamo";
        if(this.jTFCodPrestamo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Advertencia", HEIGHT, ICONREVISION);
        }else{
            int codEst=Integer.parseInt(this.jTextFieldCodEst.getText());
            this.SQL = "Select fecha_devolucion from Prestamo where codigo_estudiante like " +codEst;
            int diasrestantes=atributos.busquedaCod("Prestamo", SQL, "fecha");
            if(diasrestantes<0){
                int codPres=Integer.parseInt(this.jTextFieldCodPres.getText());
                long dias=-(diasrestantes);
                double sancion=comprobar.sanciones((int) dias);
                String salida=  "El estudiante "+this.jTextFieldNomEst.getText()+" tiene un retraso de \n"+dias+ " dias en la devolucion del libro "+this.jTextFieldLibro.getText()+"\nSe le aplico una sancion en dolares de "+sancion+"\n¿Desea pagar la sancion en este momento?";
                int seleccion=JOptionPane.showConfirmDialog(null,salida,"Sancion encontrada",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,ICONREVISION);
                if(seleccion==0){
                    datosSancion= new JFSanciones();
                    this.SQL="SELECT * FROM Estudiante"+
                        " inner join Prestamo ON (Estudiante.codigo_estudiante = Prestamo.codigo_estudiante)"+
                        " inner join Libro ON (Libro.codigo_libro = Prestamo.codigo_libro) where codigo_prestamo like "+codPres;
                    atributos.despliegueFields(SQL,selectTabla,datosSancion.jTFCodPrestamoDato,datosSancion.jTFCodLibro, datosSancion.jTFNombreLibro,datosSancion.jTFCodEstudiante,datosSancion.jTFNomEst,datosSancion.jTFFPrestamo,datosSancion.jTFFDevolucion,null,"prestar");
                    datosSancion.jTFBusquedaCodPrestamo.setText(codPres+"");
                    datosSancion.jTFDiasRetraso.setText(dias+"");
                    datosSancion.jTFSancion.setText(sancion+"");
                    datosSancion.setVisible(true);
                    this.setVisible(false);
                }
            }else{
                String datoBusqueda=this.jTextFieldCodPres.getText();
                int seleccion=JOptionPane.showConfirmDialog(null,"¿Desea devolver el libro?"+
                    "\n     -Esta accion sera permanente e irreversible","Devolver libro",JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,ICONREVISION);
                if(seleccion==0){
                    int codLib=Integer.parseInt(this.jTextFieldCodLib.getText());
                    this.SQL="UPDATE Libro SET disponibilidad = disponibilidad+1 WHERE codigo_libro = "+codLib+";";
                    atributos.actualizarEliminarTablas(SQL);
                    this.SQL="DELETE from Prestamo Where codigo_prestamo= "+datoBusqueda;
                    if(atributos.actualizarEliminarTablas(SQL)==true){
                        JOptionPane.showMessageDialog(null, "Gracias por devolver el libro", "RESULTADO", HEIGHT, ICONCORRECTO);
                        this.setVisible(false);
            
                    }
                }   
            }
        }
    }//GEN-LAST:event_jBDevolverLibroActionPerformed

    private void jBDevolverLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDevolverLibroMouseEntered
        this.jBDevolverLibro.setText("DEVOLVER");
    }//GEN-LAST:event_jBDevolverLibroMouseEntered

    private void jBDevolverLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDevolverLibroMouseExited
        this.jBDevolverLibro.setText("devolver");
    }//GEN-LAST:event_jBDevolverLibroMouseExited

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        if (this.jBCancelar.getText().equalsIgnoreCase("cancelar")) {
            this.jBCancelar.setText("CANCELAR");
        } else {
            this.jBCancelar.setText("DEVOLVER");
        }
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        if (this.jBCancelar.getText().equalsIgnoreCase("cancelar")) {
            this.jBCancelar.setText("cancelar");
        } else {
            this.jBCancelar.setText("devolver");
        }
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        if (this.jBCancelar.getText().equalsIgnoreCase("cancelar")) {
            int seleccion = JOptionPane.showConfirmDialog(null,"¿Desea cancelar la devolucion?"
                + "\n     -Los datos ingresados no seran guardados","Canceclar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,ICONCANCELAR);
            if (seleccion == 0) {
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFCodPrestamoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodPrestamoKeyReleased
        String datoBusqueda = this.jTFCodPrestamo.getText();
        this.SQL="SELECT count(*) FROM "+selectTabla+" where codigo_prestamo like "+ datoBusqueda +";";
        if(!datoBusqueda.isEmpty()){
            if (atributos.busquedaCod("Prestamo", SQL, "count(*)") < 1) {
                getToolkit().beep();
                JOptionPane.showMessageDialog(null,"El prestamo al que hace referencia no existe","ADVERTENCIA",HEIGHT,ICONCANCELAR);
            } else {
                this.SQL="SELECT * FROM Estudiante"+
                                " inner join Prestamo ON (Estudiante.codigo_estudiante = Prestamo.codigo_estudiante)"+
                                " inner join Libro ON (Libro.codigo_libro = Prestamo.codigo_libro) where codigo_prestamo like "+datoBusqueda+";";
                atributos.despliegueFields(SQL, selectTabla, jTextFieldCodPres, jTextFieldCodLib, jTextFieldLibro, 
                        jTextFieldCodEst, jTextFieldNomEst, jTextFieldFP, jTextFieldFD, null, "prestar");
            }
        }
    }//GEN-LAST:event_jTFCodPrestamoKeyReleased

    private void jTFCodPrestamoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodPrestamoKeyTyped
        char variable = evt.getKeyChar();
            if (Character.isLetter(variable)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null,"Ingrese unicamente numeros","ADVERTENCIA",HEIGHT,ICONCANCELAR);
            }
    }//GEN-LAST:event_jTFCodPrestamoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBDevolverLibro;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLabelCodEst;
    private javax.swing.JLabel jLabelCodLib;
    private javax.swing.JLabel jLabelCodLibro;
    private javax.swing.JLabel jLabelCodPres;
    private javax.swing.JLabel jLabelFD;
    private javax.swing.JLabel jLabelFP;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLib;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelDatosPrestamo;
    private javax.swing.JPanel jPanelRegistroPrestamo;
    private javax.swing.JTextField jTFCodPrestamo;
    public static javax.swing.JTextField jTextFieldCodEst;
    public static javax.swing.JTextField jTextFieldCodLib;
    public static javax.swing.JTextField jTextFieldCodPres;
    public static javax.swing.JTextField jTextFieldFD;
    public static javax.swing.JTextField jTextFieldFP;
    public static javax.swing.JTextField jTextFieldLibro;
    public static javax.swing.JTextField jTextFieldNomEst;
    // End of variables declaration//GEN-END:variables
}