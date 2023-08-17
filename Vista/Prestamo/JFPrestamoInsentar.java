package Vista.Prestamo;
import Vista.Estudiante.JFHomonimos;
import Negocio.Fecha;
import Negocio.Interaccion;
import Negocio.Comprobaciones;
import Negocio.Imagenes;
import Vista.Estructura.JFLogin;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JFPrestamoInsentar extends javax.swing.JFrame {
    private int x;
    private int y;
    private String fecha1;
    private String fecha2;
    private int tiempo = 0;
    String selectTabla="Prestamo";
    private String SQL;
    Imagenes imagen = new Imagenes();
    ImageIcon ICONERROR = imagen.getICONERROR();
    ImageIcon ICONCORRECTO = imagen.getICONCORRECTO();
    ImageIcon ICONREVISION = imagen.getICONREVISION();
    ImageIcon ICONCANCELAR = imagen.getICONCANCELAR();
    ImageIcon ICONACEPTAR = imagen.getICONACEPTAR();
    Fecha fecha = new Fecha();
    Interaccion atributos = new Interaccion();
    Comprobaciones name = new Comprobaciones();
    JFSanciones datosSancion;
    JFSanciones prub = new JFSanciones();
    public JFPrestamoInsentar() {
        initComponents();
        setLocationRelativeTo(this);
        this.jTFCod_NomLibro.requestFocus();
        jCBCodoNomEst.setBackground(Color.WHITE);
        jCBCodoNomLib.setBackground(Color.WHITE);
        jCBPeriodo.setBackground(Color.WHITE);
        this.fecha1 = fecha.fechaRegistro();
        this.jTextFieldCodFP.setText(this.fecha1);
        this.SQL= "Select codigo_prestamo from Prestamo order By codigo_prestamo DESC limit 1;";
        int nuevoCod = atributos.busquedaCod("Prestamo", SQL, "codigo_prestamo") + 1;
        this.jTextFieldCodPres.setText(nuevoCod + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jTextFieldCodFP = new javax.swing.JTextField();
        jLabelFD = new javax.swing.JLabel();
        jTextFieldFD = new javax.swing.JTextField();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jBResgistrar_estudiante = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jPanelRegistroPrestamo = new javax.swing.JPanel();
        jCBCodoNomLib = new javax.swing.JComboBox<>();
        jTFCod_NomLibro = new javax.swing.JTextField();
        jCBPeriodo = new javax.swing.JComboBox<>();
        jLabelPeriodo = new javax.swing.JLabel();
        jCBCodoNomEst = new javax.swing.JComboBox<>();
        jTFCod_NomEst = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insertar Estudiante");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(290, 475));
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

        jPanelDatosPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Prestamo"));
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

        jTextFieldCodFP.setEditable(false);
        jTextFieldCodFP.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosPrestamo.add(jTextFieldCodFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 130, -1));

        jLabelFD.setText("Fecha Devolucion:");
        jPanelDatosPrestamo.add(jLabelFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, -1));

        jTextFieldFD.setEditable(false);
        jTextFieldFD.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosPrestamo.add(jTextFieldFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 130, -1));

        getContentPane().add(jPanelDatosPrestamo);
        jPanelDatosPrestamo.setBounds(10, 160, 270, 230);

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
        jLabelTitulo.setText("Nuevo Prestamo");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 140, 30);

        jBResgistrar_estudiante.setBackground(new java.awt.Color(255, 255, 255));
        jBResgistrar_estudiante.setForeground(new java.awt.Color(58, 160, 141));
        jBResgistrar_estudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar 32.png"))); // NOI18N
        jBResgistrar_estudiante.setText("registrar");
        jBResgistrar_estudiante.setBorder(null);
        jBResgistrar_estudiante.setBorderPainted(false);
        jBResgistrar_estudiante.setHideActionText(true);
        jBResgistrar_estudiante.setMaximumSize(new java.awt.Dimension(89, 32));
        jBResgistrar_estudiante.setMinimumSize(new java.awt.Dimension(89, 32));
        jBResgistrar_estudiante.setPreferredSize(new java.awt.Dimension(89, 32));
        jBResgistrar_estudiante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar 32.png"))); // NOI18N
        jBResgistrar_estudiante.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar 32.png"))); // NOI18N
        jBResgistrar_estudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBResgistrar_estudianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBResgistrar_estudianteMouseExited(evt);
            }
        });
        jBResgistrar_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResgistrar_estudianteActionPerformed(evt);
            }
        });
        getContentPane().add(jBResgistrar_estudiante);
        jBResgistrar_estudiante.setBounds(20, 420, 110, 40);

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
        jBCancelar.setBounds(150, 420, 110, 40);

        jPanelRegistroPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistroPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro del Prestamo"));

        jCBCodoNomLib.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo Libro", "Nombre del Libro" }));
        jCBCodoNomLib.setBorder(null);
        jCBCodoNomLib.setFocusable(false);
        jCBCodoNomLib.setOpaque(false);
        jCBCodoNomLib.setRequestFocusEnabled(false);

        jTFCod_NomLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCod_NomLibroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCod_NomLibroKeyTyped(evt);
            }
        });

        jCBPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 dia", "7 dias", "14 dias", "30 dias" }));
        jCBPeriodo.setBorder(null);
        jCBPeriodo.setFocusable(false);
        jCBPeriodo.setOpaque(false);
        jCBPeriodo.setRequestFocusEnabled(false);
        jCBPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPeriodoActionPerformed(evt);
            }
        });

        jLabelPeriodo.setText("Periodo del Prestamo:");

        jCBCodoNomEst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo Estudiante", "Nombre Estudiante" }));
        jCBCodoNomEst.setBorder(null);
        jCBCodoNomEst.setFocusable(false);
        jCBCodoNomEst.setOpaque(false);
        jCBCodoNomEst.setRequestFocusEnabled(false);

        jTFCod_NomEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCod_NomEstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCod_NomEstKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistroPrestamoLayout = new javax.swing.GroupLayout(jPanelRegistroPrestamo);
        jPanelRegistroPrestamo.setLayout(jPanelRegistroPrestamoLayout);
        jPanelRegistroPrestamoLayout.setHorizontalGroup(
            jPanelRegistroPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroPrestamoLayout.createSequentialGroup()
                .addGroup(jPanelRegistroPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroPrestamoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelPeriodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBPeriodo, 0, 131, Short.MAX_VALUE))
                    .addGroup(jPanelRegistroPrestamoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelRegistroPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBCodoNomLib, 0, 107, Short.MAX_VALUE)
                            .addComponent(jCBCodoNomEst, 0, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegistroPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCod_NomEst)
                            .addComponent(jTFCod_NomLibro))))
                .addContainerGap())
        );
        jPanelRegistroPrestamoLayout.setVerticalGroup(
            jPanelRegistroPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroPrestamoLayout.createSequentialGroup()
                .addGroup(jPanelRegistroPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCodoNomLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCod_NomLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanelRegistroPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBCodoNomEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCod_NomEst, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeriodo)
                    .addComponent(jCBPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanelRegistroPrestamo);
        jPanelRegistroPrestamo.setBounds(10, 40, 270, 110);

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInsertarPrestamo.png"))); // NOI18N
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 290, 475);

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

    private void jBResgistrar_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResgistrar_estudianteActionPerformed
        this.selectTabla="Prestamo";
        if(this.jTFCod_NomLibro.getText().isEmpty() || jTFCod_NomEst.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Advertencia", HEIGHT, ICONREVISION);
        }else{
            String codigoPrestamo = this.jTextFieldCodPres.getText();
            int codLib = Integer.parseInt(this.jTextFieldCodLib.getText());
            int codEst = Integer.parseInt(this.jTextFieldCodEst.getText());
            this.fecha1 = this.jTextFieldCodFP.getText();
            this.fecha2 = this.jTextFieldFD.getText();
            //datosBasura
            int celular = 0;
            int stock =0;
            int disponibilidad =0;
            this.SQL = "Select count(*) from Prestamo where codigo_estudiante like "+codEst+" and "
                    +"codigo_libro like "+codLib;
            if(atributos.busquedaCod(selectTabla, SQL, "count(*)")==1){
                JOptionPane.showMessageDialog(null, "El estudiante ya se encuentra posesión del libro", "RESULTADO", HEIGHT, ICONERROR);
            }else{
                this.SQL = "Select disponibilidad from Libro where codigo_libro like " +codLib;
                if (atributos.busquedaCod("Libro", SQL, "disponibilidad") <= 0) {
                    JOptionPane.showMessageDialog(null, "Lo sentimos el libro que estas intentando solicitar no se encuentra disponible en stock", "RESULTADO", HEIGHT, ICONERROR);
                }else{
                    this.SQL = "Select codigo_prestamo from Prestamo where codigo_estudiante like " +codEst;
                    int codPres=atributos.busquedaCod("Prestamo", SQL, "codigo_prestamo");
                    this.SQL = "Select fecha_devolucion from Prestamo where codigo_prestamo like " +codPres;
                    int diasrestantes=atributos.busquedaCod("Prestamo", SQL, "fecha");
                    if(diasrestantes<0){
                        long dias=-(diasrestantes);
                        double sancion=name.sanciones((int) dias);
                        String salida=  "El estudiante "+this.jTextFieldNomEst.getText()+" tiene un retraso de \n"+dias+ " dias en la devolucion de un libro. \nSe le aplico una sancion en dolares de "+sancion+"\n¿Desea pagar la sancion en este momento?";
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
                        this.SQL="INSERT INTO Prestamo VALUES(?,?,?,?,?)";
                        if(atributos.insertarTabla(SQL,selectTabla, codEst, null, null, celular, null, null, null, 
                            codLib, null, fecha1, null, null, stock, disponibilidad,fecha2,codigoPrestamo)){
                            JOptionPane.showMessageDialog(null, "Datos Guardados correctamente", "RESULTADO", HEIGHT, ICONCORRECTO);
                            this.SQL="UPDATE Libro SET disponibilidad = disponibilidad-1 WHERE codigo_libro = " + codLib + ";";
                            atributos.actualizarEliminarTablas(SQL);
                            this.setVisible(false);
                        }else{
                            JOptionPane.showMessageDialog(null, "Ocurrio un error al ingresar los datos", "RESULTADO", HEIGHT, ICONERROR);
                        }  
                    }
                }
            }
        }
    }//GEN-LAST:event_jBResgistrar_estudianteActionPerformed

    private void jBResgistrar_estudianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResgistrar_estudianteMouseEntered
        this.jBResgistrar_estudiante.setText("REGISTRAR");
    }//GEN-LAST:event_jBResgistrar_estudianteMouseEntered

    private void jBResgistrar_estudianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBResgistrar_estudianteMouseExited
        this.jBResgistrar_estudiante.setText("registrar");
    }//GEN-LAST:event_jBResgistrar_estudianteMouseExited

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        if (this.jBCancelar.getText().equalsIgnoreCase("cancelar")) {
            this.jBCancelar.setText("CANCELAR");
        } else {
            this.jBCancelar.setText("ACEPTAR");
        }
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        if (this.jBCancelar.getText().equalsIgnoreCase("cancelar")) {
            this.jBCancelar.setText("cancelar");
        } else {
            this.jBCancelar.setText("aceptar");
        }
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        if (this.jBCancelar.getText().equalsIgnoreCase("cancelar")) {
            int seleccion = JOptionPane.showConfirmDialog(null,"¿Desea cancelar el prestamo?"
                + "\n     -Los datos ingresados no seran guardados","Canceclar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,ICONCANCELAR);
            if (seleccion == 0) {
                this.setVisible(false);
                //limpiarCampos();
            }
        } else {
            if (this.jBCancelar.getText().equalsIgnoreCase("aceptar")) {
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFCod_NomLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCod_NomLibroKeyTyped
        int select = this.jCBCodoNomLib.getSelectedIndex();
        if (select == 0) {
            char variable = evt.getKeyChar();
            if (Character.isLetter(variable)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null,"Ingrese unicamente numeros","ADVERTENCIA",HEIGHT,ICONCANCELAR);
            }
        }
    }//GEN-LAST:event_jTFCod_NomLibroKeyTyped

    private void jTFCod_NomEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCod_NomEstKeyTyped
        int select = this.jCBCodoNomEst.getSelectedIndex();
        if (select == 0) {
            char variable = evt.getKeyChar();
            if (Character.isLetter(variable)) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null,"Ingrese unicamente numeros","ADVERTENCIA",HEIGHT,ICONCANCELAR);
            }
        }
    }//GEN-LAST:event_jTFCod_NomEstKeyTyped

    private void jTFCod_NomLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCod_NomLibroKeyReleased
        this.selectTabla="Libro";
        String datoBusqueda = this.jTFCod_NomLibro.getText();
        int select = jCBCodoNomLib.getSelectedIndex();
        switch (select) {
            case 0: {
                this.SQL = "Select count(*) from Libro where codigo_libro like '%" + datoBusqueda + "%'";
                if (atributos.busquedaCod("Libro", SQL, "count(*)") < 1) {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null,"El libro al que hace referencia no existe","ADVERTENCIA",HEIGHT,ICONCANCELAR);
                } else {
                    String SQL = "SELECT * FROM " + selectTabla + " WHERE codigo_libro like '%" + datoBusqueda + "%';";
                    atributos.despliegueFields(SQL, selectTabla, jTextFieldCodLib, jTextFieldLibro, null, null, null, null, null, null, null);
                }break;
            }
            case 1: {
                this.SQL = "Select count(*) from Libro where nombre_libro like '%" + datoBusqueda + "%'";
                if (atributos.busquedaCod(selectTabla, SQL, "count(*)") < 1) {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null,"El libro al que hace referencia no existe","ADVERTENCIA",HEIGHT,ICONCANCELAR);
                } else {
                    this.SQL = "SELECT * FROM " + selectTabla + " WHERE nombre_libro like '%" + datoBusqueda + "%';";
                    atributos.despliegueFields(SQL, selectTabla, jTextFieldCodLib, jTextFieldLibro, null, null, null, null, null, null, null);
                }break;
            }
        }
    }//GEN-LAST:event_jTFCod_NomLibroKeyReleased

    private void jTFCod_NomEstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCod_NomEstKeyReleased
        String datoBusqueda = this.jTFCod_NomEst.getText();
        this.selectTabla="Estudiante";
        int select = jCBCodoNomEst.getSelectedIndex();
        switch (select) {
            case 0: {
                this.SQL = "Select count(*) from Estudiante where codigo_estudiante like '%" + datoBusqueda + "%'";
                if (atributos.busquedaCod(selectTabla, SQL, "count(*)") < 1) {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null,"El estudiante al que hace referencia no existe","ADVERTENCIA",HEIGHT,ICONCANCELAR);
                } else {
                    String SQL = "SELECT * FROM " + selectTabla + " WHERE codigo_estudiante like '%" + datoBusqueda + "%';";
                    atributos.despliegueFields(SQL, selectTabla, jTextFieldCodEst, jTextFieldNomEst, null, null, null, null, null, null, "prestar");
                }
                break;
            }
            case 1: {
                if (name.comprobarExpresionRegular(datoBusqueda, "nombre") == true) {
                    name = new Comprobaciones(this.jTFCod_NomEst.getText());
                    String atributo1 = name.getNombre();
                    String atributo2 = name.getApellido();
                    this.SQL = "Select count(*) from Estudiante "
                            + "where nombre_estudiante like '%" + atributo1 + "%' and "
                            + "apellido_estudiante like '%" + atributo2 + "%';";
                    if (atributos.busquedaCod(selectTabla, SQL, "count(*)") < 1) {
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null,"El estudiante al que hace referencia no existe","ADVERTENCIA",HEIGHT,ICONCANCELAR);
                    }
                    if (atributos.busquedaCod(selectTabla, SQL, "count(*)") > 1) {
                        String codBusquedaLib = this.jTFCod_NomLibro.getText();
                        String codBusquedaEst = this.jTFCod_NomEst.getText();
                        String codPrestamo = this.jTextFieldCodPres.getText();
                        String codLib = this.jTextFieldCodLib.getText();
                        String tituloLib = this.jTextFieldLibro.getText();
                        String codEst = this.jTextFieldCodEst.getText();
                        String nomEst = this.jTextFieldNomEst.getText();
                        String fechPrestamo = this.jTextFieldCodFP.getText();
                        String fechDevolucion = this.jTextFieldFD.getText();
                        this.SQL="Select * from Estudiante "
                        + "where nombre_estudiante like '%" +atributo1+ "%' and "+
                        "apellido_estudiante like '%"+atributo2+"%';";
                        JFHomonimos igual = new JFHomonimos(SQL,codBusquedaLib, codBusquedaEst, codPrestamo,
                                codLib, tituloLib, codEst, nomEst, fechPrestamo, fechDevolucion,3);
                        getToolkit().beep();
                        igual.setVisible(true);
                        this.setVisible(false);
                    } else {
                        this.SQL = "SELECT codigo_estudiante FROM Estudiante "
                                + "where nombre_estudiante like " + "'%" + atributo1 + "%' "
                                + "and apellido_estudiante like '%" + atributo2 + "%';";
                        int codEst = atributos.busquedaCod(selectTabla, SQL, "codigo_estudiante");
                        datoBusqueda = "'%" + codEst + "%'";
                        this.SQL = "SELECT * FROM Estudiante WHERE codigo_estudiante like " + datoBusqueda;
                        atributos.despliegueFields(SQL, selectTabla, jTextFieldCodEst, jTextFieldNomEst,null, null, null, null, null, null, "prestar");
                    }
                }
                break;
            }
        }
    }//GEN-LAST:event_jTFCod_NomEstKeyReleased

    private void jCBPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPeriodoActionPerformed
        int plazo = this.jCBPeriodo.getSelectedIndex();
        switch (plazo){
            case 0: {tiempo = 1;this.fecha2 = fecha.fechaDevolucion(tiempo,"nueva");break;}
            case 1: {tiempo = 7;this.fecha2 = fecha.fechaDevolucion(tiempo,"nueva");break;}
            case 2: {tiempo = 14;this.fecha2 = fecha.fechaDevolucion(tiempo,"nueva");break;}
            case 3: {tiempo = 30;this.fecha2 = fecha.fechaDevolucion(tiempo,"nueva");break;}
        }
        this.jTextFieldFD.setText(this.fecha2);
    }//GEN-LAST:event_jCBPeriodoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBResgistrar_estudiante;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    public javax.swing.JComboBox<String> jCBCodoNomEst;
    private javax.swing.JComboBox<String> jCBCodoNomLib;
    private javax.swing.JComboBox<String> jCBPeriodo;
    private javax.swing.JLabel jLabelCodEst;
    private javax.swing.JLabel jLabelCodLib;
    private javax.swing.JLabel jLabelCodPres;
    private javax.swing.JLabel jLabelFD;
    private javax.swing.JLabel jLabelFP;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLib;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelDatosPrestamo;
    private javax.swing.JPanel jPanelRegistroPrestamo;
    public static javax.swing.JTextField jTFCod_NomEst;
    public static javax.swing.JTextField jTFCod_NomLibro;
    public static javax.swing.JTextField jTextFieldCodEst;
    public static javax.swing.JTextField jTextFieldCodFP;
    public static javax.swing.JTextField jTextFieldCodLib;
    public static javax.swing.JTextField jTextFieldCodPres;
    public static javax.swing.JTextField jTextFieldFD;
    public static javax.swing.JTextField jTextFieldLibro;
    public static javax.swing.JTextField jTextFieldNomEst;
    // End of variables declaration//GEN-END:variables
}