package Vista.Estudiante;
import Negocio.Interaccion;
import Negocio.Comprobaciones;
import Negocio.Imagenes;
import Vista.Estructura.JFLogin;
import Vista.Prestamo.JFSanciones;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JFEstudianteEliminar extends javax.swing.JFrame {
    private int x;
    private int y;
    Imagenes imagen=new Imagenes();
    ImageIcon ICONERROR = imagen.getICONERROR();
    ImageIcon ICONCORRECTO = imagen.getICONCORRECTO();
    ImageIcon ICONREVISION = imagen.getICONREVISION();
    ImageIcon ICONCANCELAR=imagen.getICONCANCELAR();
    ImageIcon ICONACEPTAR=imagen.getICONACEPTAR();
    private String SQL;
    private String tablaEliminar="Estudiante";
    Interaccion atributos=new Interaccion();
    Comprobaciones name= new Comprobaciones();
    JFSanciones datosSancion;
    public JFEstudianteEliminar() {
        initComponents();
        setLocationRelativeTo(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalirIcon = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jBEliminar_estudiante = new javax.swing.JButton();
        jPDatosEstudianteEliminar = new javax.swing.JPanel();
        jLabelCod = new javax.swing.JLabel();
        jTFCodigo_EliminarEst = new javax.swing.JTextField();
        jLabelNom = new javax.swing.JLabel();
        jTFNombres_EliminarEst = new javax.swing.JTextField();
        jLabelApe = new javax.swing.JLabel();
        jTFApellidos_EliminarEst = new javax.swing.JTextField();
        jLabelSector = new javax.swing.JLabel();
        jTFCelu_EliminarEst = new javax.swing.JTextField();
        jLabelCelu = new javax.swing.JLabel();
        jTFFacultad_EliminarEst = new javax.swing.JTextField();
        jLabelCorre = new javax.swing.JLabel();
        jTFCorreo_EliminarEst = new javax.swing.JTextField();
        jLabelFacu = new javax.swing.JLabel();
        jTFSectorEst_EliminarEst = new javax.swing.JTextField();
        jPanelDatoEstudiante = new javax.swing.JPanel();
        jTFBuscar_EliminarEst = new javax.swing.JTextField();
        jComboBoxFiltrarEstudiante = new javax.swing.JComboBox<>();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 475));
        setUndecorated(true);
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
        jButtonSalirIcon.setBounds(350, 0, 30, 30);

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
        jButtonMinimizar.setBounds(320, 0, 30, 30);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Eliminar Estudiante");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 210, 30);

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
        jBCancelar.setBounds(210, 420, 110, 40);

        jBEliminar_estudiante.setBackground(new java.awt.Color(255, 255, 255));
        jBEliminar_estudiante.setForeground(new java.awt.Color(58, 160, 141));
        jBEliminar_estudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon eliminar selected 32.png"))); // NOI18N
        jBEliminar_estudiante.setText("eliminar");
        jBEliminar_estudiante.setBorder(null);
        jBEliminar_estudiante.setBorderPainted(false);
        jBEliminar_estudiante.setHideActionText(true);
        jBEliminar_estudiante.setMaximumSize(new java.awt.Dimension(89, 32));
        jBEliminar_estudiante.setMinimumSize(new java.awt.Dimension(89, 32));
        jBEliminar_estudiante.setPreferredSize(new java.awt.Dimension(89, 32));
        jBEliminar_estudiante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar 32 selected.png"))); // NOI18N
        jBEliminar_estudiante.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar 32 selected.png"))); // NOI18N
        jBEliminar_estudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEliminar_estudianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEliminar_estudianteMouseExited(evt);
            }
        });
        jBEliminar_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminar_estudianteActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminar_estudiante);
        jBEliminar_estudiante.setBounds(70, 420, 110, 40);

        jPDatosEstudianteEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosEstudianteEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar"));

        jLabelCod.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCod.setText("Codigo");

        jTFCodigo_EliminarEst.setEditable(false);
        jTFCodigo_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelNom.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNom.setText("Nombre Est.");

        jTFNombres_EliminarEst.setEditable(false);
        jTFNombres_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombres_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelApe.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelApe.setText("Apellido Est.");

        jTFApellidos_EliminarEst.setEditable(false);
        jTFApellidos_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFApellidos_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelSector.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelSector.setText("Sector");

        jTFCelu_EliminarEst.setEditable(false);
        jTFCelu_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCelu_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCelu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCelu.setText("Celular");

        jTFFacultad_EliminarEst.setEditable(false);
        jTFFacultad_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFFacultad_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCorre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCorre.setText("Correo");

        jTFCorreo_EliminarEst.setEditable(false);
        jTFCorreo_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFCorreo_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelFacu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelFacu.setText("Facultad");

        jTFSectorEst_EliminarEst.setEditable(false);
        jTFSectorEst_EliminarEst.setBackground(new java.awt.Color(255, 255, 255));
        jTFSectorEst_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPDatosEstudianteEliminarLayout = new javax.swing.GroupLayout(jPDatosEstudianteEliminar);
        jPDatosEstudianteEliminar.setLayout(jPDatosEstudianteEliminarLayout);
        jPDatosEstudianteEliminarLayout.setHorizontalGroup(
            jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApe)
                            .addComponent(jLabelCelu)
                            .addComponent(jLabelSector)
                            .addComponent(jLabelFacu)
                            .addComponent(jLabelCorre))
                        .addGap(18, 18, 18)
                        .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFFacultad_EliminarEst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jTFSectorEst_EliminarEst, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFCelu_EliminarEst, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFApellidos_EliminarEst)
                            .addComponent(jTFCorreo_EliminarEst))
                        .addGap(19, 19, 19))
                    .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCod, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNom))
                        .addGap(12, 12, 12)
                        .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNombres_EliminarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jTFCodigo_EliminarEst))
                        .addContainerGap())))
        );
        jPDatosEstudianteEliminarLayout.setVerticalGroup(
            jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombres_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidos_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApe))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCelu_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelu))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFSectorEst_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSector))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFacultad_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFacu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCorreo_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCorre))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPDatosEstudianteEliminar);
        jPDatosEstudianteEliminar.setBounds(10, 120, 360, 270);

        jPanelDatoEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Estudiante"));

        jTFBuscar_EliminarEst.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_EliminarEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarEstKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_EliminarEstKeyTyped(evt);
            }
        });

        jComboBoxFiltrarEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código del estudiante", "Nombre del estudiante" }));
        jComboBoxFiltrarEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));

        javax.swing.GroupLayout jPanelDatoEstudianteLayout = new javax.swing.GroupLayout(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setLayout(jPanelDatoEstudianteLayout);
        jPanelDatoEstudianteLayout.setHorizontalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxFiltrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFBuscar_EliminarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoEstudianteLayout.setVerticalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFiltrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBuscar_EliminarEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setBounds(10, 40, 360, 70);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoActualizar.png"))); // NOI18N
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 380, 475);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(JFLogin.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        this.jBCancelar.setText("CANCELAR");
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        this.jBCancelar.setText("cancelar");
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        int seleccion=JOptionPane.showConfirmDialog(null,"¿Desea cancelar el ingreso?"+
            "\n     -Los datos ingresados no seran guardados","Canceclar",JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,ICONCANCELAR);
        if(seleccion==0){
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBEliminar_estudianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminar_estudianteMouseEntered
        this.jBEliminar_estudiante.setText("ELIMINAR");
    }//GEN-LAST:event_jBEliminar_estudianteMouseEntered

    private void jBEliminar_estudianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminar_estudianteMouseExited
        this.jBEliminar_estudiante.setText("eliminar");
    }//GEN-LAST:event_jBEliminar_estudianteMouseExited

    private void jBEliminar_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminar_estudianteActionPerformed
        if(this.jTFBuscar_EliminarEst.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Advertencia", HEIGHT, ICONREVISION);
        }else{
            int codEst=Integer.parseInt(this.jTFCodigo_EliminarEst.getText());
            this.SQL = "Select codigo_prestamo from Prestamo where codigo_estudiante like " +codEst;
            int codPres=atributos.busquedaCod("Prestamo", SQL, "codigo_prestamo");
            this.SQL = "Select fecha_devolucion from Prestamo where codigo_prestamo like " +codPres;
            int diasrestantes=atributos.busquedaCod("Prestamo", SQL, "fecha");
            if(diasrestantes<0){
                long dias=-(diasrestantes);
                double sancion=name.sanciones((int) dias);
                String salida=  "El estudiante "+this.jTFNombres_EliminarEst.getText()+" tiene un retraso de \n"+dias+ " dias en la devolucion de un libro. \nSe le aplico una sancion en dolares de "+sancion+"\n¿Desea pagar la sancion en este momento?";
                int seleccion=JOptionPane.showConfirmDialog(null,salida,"Sancion encontrada",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,ICONREVISION);
                if(seleccion==0){
                    datosSancion= new JFSanciones();
                    this.SQL="SELECT * FROM Estudiante"+
                        " inner join Prestamo ON (Estudiante.codigo_estudiante = Prestamo.codigo_estudiante)"+
                        " inner join Libro ON (Libro.codigo_libro = Prestamo.codigo_libro) where codigo_prestamo like "+codPres;
                    atributos.despliegueFields(SQL,"Prestamo",datosSancion.jTFCodPrestamoDato,datosSancion.jTFCodLibro, datosSancion.jTFNombreLibro,datosSancion.jTFCodEstudiante,datosSancion.jTFNomEst,datosSancion.jTFFPrestamo,datosSancion.jTFFDevolucion,null,"prestar");
                    datosSancion.jTFBusquedaCodPrestamo.setText(codPres+"");
                    datosSancion.jTFDiasRetraso.setText(dias+"");
                    datosSancion.jTFSancion.setText(sancion+"");
                    datosSancion.setVisible(true);
                    this.setVisible(false);
                }
            }else{
                int seleccion=JOptionPane.showConfirmDialog(null,"¿Desea eliminar el elemento?"+"\n     -Esta accion sera permanente e irreversible","Borrar Estudiante",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,ICONCANCELAR);
                if(seleccion==0){
                    this.SQL="DELETE from Estudiante Where codigo_estudiante= "+this.jTFCodigo_EliminarEst.getText();
                    if(atributos.actualizarEliminarTablas(SQL)==true){
                        JOptionPane.showMessageDialog(null, "Elemento borrado exitosamente", "RESULTADO", HEIGHT, ICONCORRECTO);
                        this.setVisible(false);
                    }   
                }
            }
        }
    }//GEN-LAST:event_jBEliminar_estudianteActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX-x,posY-y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFBuscar_EliminarEstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarEstKeyTyped
        char variable=evt.getKeyChar();
        int select=this.jComboBoxFiltrarEstudiante.getSelectedIndex();
        switch(select){
            case 0:{
                if(Character.isLetter(variable)){
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null,"Ingrese unicamente numeros","ADVERTENCIA",HEIGHT,ICONCANCELAR);
                }
                break;
            }
        }
    }//GEN-LAST:event_jTFBuscar_EliminarEstKeyTyped

    private void jTFBuscar_EliminarEstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_EliminarEstKeyReleased
        int select=jComboBoxFiltrarEstudiante.getSelectedIndex();
        String parametroBusqueda=this.jTFBuscar_EliminarEst.getText();
        switch(select){
            case 0:{
                this.SQL="Select count(*) from Estudiante where codigo_estudiante like '%"+parametroBusqueda+"%'";
                if(atributos.busquedaCod(tablaEliminar, SQL,"count(*)")<1){
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null,"El estudiante al que hace referencia no existe", "ADVERTENCIA", HEIGHT, ICONCANCELAR);
                }else{
                    this.SQL="SELECT * FROM " + tablaEliminar + " WHERE codigo_estudiante like '%"+parametroBusqueda+"%';";
                    atributos.despliegueFields(SQL,tablaEliminar,jTFCodigo_EliminarEst,jTFNombres_EliminarEst,
                            jTFApellidos_EliminarEst,jTFCelu_EliminarEst,jTFSectorEst_EliminarEst,
                            jTFFacultad_EliminarEst,jTFCorreo_EliminarEst,null,"actualizar");
                }
                break;
            }
            case 1:{
                if(name.comprobarExpresionRegular(parametroBusqueda,"nombre")==true){
                    name = new Comprobaciones(parametroBusqueda);
                    String nombre=name.getNombre();
                    String apellido=name.getApellido();
                    this.SQL="Select count(*) from Estudiante "+ 
                            "where nombre_estudiante like '%"+nombre+"%' and "+
                            "apellido_estudiante like '%"+apellido+"%';";
                    if(atributos.busquedaCod(tablaEliminar,SQL,"count(*)")<1){
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null,"El estudiante al que hace referencia no existe","ADVERTENCIA",HEIGHT,ICONCANCELAR);
                    }
                    if(atributos.busquedaCod(tablaEliminar,SQL,"count(*)")>1){
                        this.SQL="Select * from Estudiante "
                        + "where nombre_estudiante like '%" +nombre+ "%' and "+
                        "apellido_estudiante like '%"+apellido+"%';";
                        JFHomonimos  igual = new JFHomonimos(SQL,parametroBusqueda, null,null, null,null,null,null,null,null,2);
                        getToolkit().beep();
                        igual.setVisible(true);
                        this.setVisible(false);
                    }else{
                        this.SQL="SELECT codigo_estudiante FROM Estudiante "+ 
                            "where nombre_estudiante like " + "'%"+nombre+"%' "+ 
                            "and apellido_estudiante like '%"+apellido+"%';";
                        int codEst=atributos.busquedaCod(tablaEliminar, SQL,"codigo_estudiante");
                        parametroBusqueda="'%" + codEst + "%'";
                        this.SQL="SELECT * FROM Estudiante WHERE codigo_estudiante like "+parametroBusqueda;
                        atributos.despliegueFields(SQL,tablaEliminar,jTFCodigo_EliminarEst,jTFNombres_EliminarEst,
                            jTFApellidos_EliminarEst,jTFCelu_EliminarEst,jTFSectorEst_EliminarEst,
                            jTFFacultad_EliminarEst,jTFCorreo_EliminarEst,null,"actualizar");
                    }
                }
                break;
            }
        }
    }//GEN-LAST:event_jTFBuscar_EliminarEstKeyReleased

//    public void limpiarCampos(){
//        this.jTFCodigo_EliminarEst.setText("");
//        this.jTFNombres_EliminarEst.setText("");
//        this.jTFApellidos_EliminarEst.setText("");
//        this.jTFCelu_EliminarEst.setText("");
//        this.jTFSectorEst_EliminarEst.setText("");
//        this.jTFFacultad_EliminarEst.setText("");
//        this.jTFCorreo_EliminarEst.setText("");
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEliminar_estudiante;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JComboBox<String> jComboBoxFiltrarEstudiante;
    private javax.swing.JLabel jLabelApe;
    private javax.swing.JLabel jLabelCelu;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelCorre;
    private javax.swing.JLabel jLabelFacu;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelSector;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosEstudianteEliminar;
    private javax.swing.JPanel jPanelDatoEstudiante;
    public static javax.swing.JTextField jTFApellidos_EliminarEst;
    public static javax.swing.JTextField jTFBuscar_EliminarEst;
    public static javax.swing.JTextField jTFCelu_EliminarEst;
    public static javax.swing.JTextField jTFCodigo_EliminarEst;
    public static javax.swing.JTextField jTFCorreo_EliminarEst;
    public static javax.swing.JTextField jTFFacultad_EliminarEst;
    public static javax.swing.JTextField jTFNombres_EliminarEst;
    public static javax.swing.JTextField jTFSectorEst_EliminarEst;
    // End of variables declaration//GEN-END:variables
}