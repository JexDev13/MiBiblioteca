package Vista.Libro;
import Negocio.Interaccion;
import Negocio.Imagenes;
import Vista.Estructura.JFLogin;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JFLibroEliminar extends javax.swing.JFrame {
    private int x;
    private int y;
    Imagenes imagen=new Imagenes();
    ImageIcon ICONERROR = imagen.getICONERROR();
    ImageIcon ICONCORRECTO = imagen.getICONCORRECTO();
    ImageIcon ICONREVISION = imagen.getICONREVISION();
    ImageIcon ICONCANCELAR=imagen.getICONCANCELAR();
    ImageIcon ICONACEPTAR=imagen.getICONACEPTAR();
    private String SQL;
    private String tablaEliminar="Libro";
    Interaccion atributos=new Interaccion();
    public JFLibroEliminar() {
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
        jBEliminarLibro = new javax.swing.JButton();
        jPDatosEstudianteActualizar = new javax.swing.JPanel();
        jTFFechaPublicacionLib = new javax.swing.JTextField();
        jTFCategoriaLib = new javax.swing.JTextField();
        jTFEdicionLib = new javax.swing.JTextField();
        jTFCodigo_EliminarLib = new javax.swing.JTextField();
        jTFApellidoALib = new javax.swing.JTextField();
        jTFTitulo_EliminarLib = new javax.swing.JTextField();
        jTFNombreALib = new javax.swing.JTextField();
        jLabelCod = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelApe = new javax.swing.JLabel();
        jLabelSector = new javax.swing.JLabel();
        jLabelCelu = new javax.swing.JLabel();
        jLabelCorre = new javax.swing.JLabel();
        jLabelFacu = new javax.swing.JLabel();
        jLabelStock = new javax.swing.JLabel();
        jTFStockLib = new javax.swing.JTextField();
        jPanelDatoEstudiante = new javax.swing.JPanel();
        jTFBuscar_ActualizarLib = new javax.swing.JTextField();
        jComboBoxFiltrarLib = new javax.swing.JComboBox<>();
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
        jLabelTitulo.setText("Eliminar Libro");
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

        jBEliminarLibro.setBackground(new java.awt.Color(255, 255, 255));
        jBEliminarLibro.setForeground(new java.awt.Color(58, 160, 141));
        jBEliminarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon eliminar selected 32.png"))); // NOI18N
        jBEliminarLibro.setText("eliminar");
        jBEliminarLibro.setBorder(null);
        jBEliminarLibro.setBorderPainted(false);
        jBEliminarLibro.setHideActionText(true);
        jBEliminarLibro.setMaximumSize(new java.awt.Dimension(89, 32));
        jBEliminarLibro.setMinimumSize(new java.awt.Dimension(89, 32));
        jBEliminarLibro.setPreferredSize(new java.awt.Dimension(89, 32));
        jBEliminarLibro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar 32 selected.png"))); // NOI18N
        jBEliminarLibro.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar 32 selected.png"))); // NOI18N
        jBEliminarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEliminarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEliminarLibroMouseExited(evt);
            }
        });
        jBEliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarLibroActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminarLibro);
        jBEliminarLibro.setBounds(70, 420, 110, 40);

        jPDatosEstudianteActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosEstudianteActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar"));

        jTFFechaPublicacionLib.setEditable(false);
        jTFFechaPublicacionLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFFechaPublicacionLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCategoriaLib.setEditable(false);
        jTFCategoriaLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFCategoriaLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFEdicionLib.setEditable(false);
        jTFEdicionLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFEdicionLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFCodigo_EliminarLib.setEditable(false);
        jTFCodigo_EliminarLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFCodigo_EliminarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFApellidoALib.setEditable(false);
        jTFApellidoALib.setBackground(new java.awt.Color(255, 255, 255));
        jTFApellidoALib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFTitulo_EliminarLib.setEditable(false);
        jTFTitulo_EliminarLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFTitulo_EliminarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTFNombreALib.setEditable(false);
        jTFNombreALib.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombreALib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCod.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCod.setText("Codigo");

        jLabelNom.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNom.setText("Titulo");

        jLabelApe.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelApe.setText("Fecha Publicacion");

        jLabelSector.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelSector.setText("Nombre Autor");

        jLabelCelu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCelu.setText("Edicion");

        jLabelCorre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCorre.setText("Categoria");

        jLabelFacu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelFacu.setText("Apellido Autor");

        jLabelStock.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelStock.setText("Stock");

        jTFStockLib.setEditable(false);
        jTFStockLib.setBackground(new java.awt.Color(255, 255, 255));
        jTFStockLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPDatosEstudianteActualizarLayout = new javax.swing.GroupLayout(jPDatosEstudianteActualizar);
        jPDatosEstudianteActualizar.setLayout(jPDatosEstudianteActualizarLayout);
        jPDatosEstudianteActualizarLayout.setHorizontalGroup(
            jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCod, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNom))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFCodigo_EliminarLib, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(jTFTitulo_EliminarLib)))
                            .addComponent(jLabelCelu))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosEstudianteActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                                .addComponent(jLabelApe)
                                .addGap(18, 18, 18)
                                .addComponent(jTFFechaPublicacionLib, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSector)
                                    .addComponent(jLabelFacu)
                                    .addComponent(jLabelCorre)
                                    .addComponent(jLabelStock))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFStockLib, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(jTFCategoriaLib)
                                    .addComponent(jTFApellidoALib)
                                    .addComponent(jTFNombreALib)
                                    .addComponent(jTFEdicionLib))))
                        .addGap(19, 19, 19))))
        );
        jPDatosEstudianteActualizarLayout.setVerticalGroup(
            jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEstudianteActualizarLayout.createSequentialGroup()
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_EliminarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTitulo_EliminarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFechaPublicacionLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApe))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEdicionLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelu))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombreALib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSector))
                .addGap(6, 6, 6)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidoALib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFacu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCategoriaLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCorre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatosEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFStockLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStock))
                .addContainerGap())
        );

        getContentPane().add(jPDatosEstudianteActualizar);
        jPDatosEstudianteActualizar.setBounds(10, 120, 360, 270);

        jPanelDatoEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Libro"));

        jTFBuscar_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFBuscar_ActualizarLib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarLibKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscar_ActualizarLibKeyTyped(evt);
            }
        });

        jComboBoxFiltrarLib.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código del libro", "Titulo" }));
        jComboBoxFiltrarLib.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));

        javax.swing.GroupLayout jPanelDatoEstudianteLayout = new javax.swing.GroupLayout(jPanelDatoEstudiante);
        jPanelDatoEstudiante.setLayout(jPanelDatoEstudianteLayout);
        jPanelDatoEstudianteLayout.setHorizontalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxFiltrarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTFBuscar_ActualizarLib, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDatoEstudianteLayout.setVerticalGroup(
            jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFiltrarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        int seleccion=JOptionPane.showConfirmDialog(null,"¿Desea cancelar el borrado?"+
            "\n     -Los datos ingresados no seran guardados","Canceclar",JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,ICONCANCELAR);
        if(seleccion==0){
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBEliminarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarLibroMouseEntered
        this.jBEliminarLibro.setText("ELIMINAR");
    }//GEN-LAST:event_jBEliminarLibroMouseEntered

    private void jBEliminarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarLibroMouseExited
        this.jBEliminarLibro.setText("eliminar");
    }//GEN-LAST:event_jBEliminarLibroMouseExited

    private void jBEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarLibroActionPerformed
        if(this.jTFBuscar_ActualizarLib.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Advertencia", HEIGHT, ICONREVISION);
        }else{
            int codLibro=Integer.parseInt(jTFCodigo_EliminarLib.getText());
            this.SQL = "Select stock from Libro where codigo_libro like " +codLibro;
            int stock=atributos.busquedaCod("Libro", SQL, "stock");
            this.SQL = "Select disponibilidad from Libro where codigo_libro like " +codLibro;
            int disponibilidad=atributos.busquedaCod("Libro", SQL, "disponibilidad");
            if(disponibilidad==stock){
                int seleccion=JOptionPane.showConfirmDialog(null,"¿Desea eliminar el elemento?"+
                    "\n     -Esta accion sera permanente e irreversible","Borrar Libro",JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,ICONCANCELAR);
                if(seleccion==0){
                    this.SQL="DELETE from Libro Where codigo_libro= "+this.jTFCodigo_EliminarLib.getText();
                    if(atributos.actualizarEliminarTablas(SQL)==true)
                    {
                        JOptionPane.showMessageDialog(null, "Elemento borrado exitosamente", "RESULTADO", HEIGHT, ICONCORRECTO);
                        this.setVisible(false);
                    }   
                }
            }else{
                int diferencia=stock-disponibilidad;
                String salida=  "No se puede borrar este libro debido a que no se encuentran todos los elementos en bodega."+
                                "\nFaltan "+diferencia+" libros en bodega."+
                                "\nActualice stock o registre todos los prestamos e intente de nuevo.";
                JOptionPane.showMessageDialog(null, salida, "ERROR", HEIGHT, ICONREVISION);
            }
        }
    }//GEN-LAST:event_jBEliminarLibroActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX-x,posY-y);// TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jTFBuscar_ActualizarLibKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarLibKeyTyped
        char variable=evt.getKeyChar();
        int select=this.jComboBoxFiltrarLib.getSelectedIndex();
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
    }//GEN-LAST:event_jTFBuscar_ActualizarLibKeyTyped

    private void jTFBuscar_ActualizarLibKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarLibKeyReleased
        String datoBusqueda=this.jTFBuscar_ActualizarLib.getText();
        int select=jComboBoxFiltrarLib.getSelectedIndex();
        switch(select){
            case 0:{
                this.SQL="Select count(*) from Libro where codigo_libro like '%"+datoBusqueda+"%'";
                if(atributos.busquedaCod(tablaEliminar, SQL,"count(*)")<1){
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "El libro al que hace referencia no existe", "ADVERTENCIA", HEIGHT, ICONCANCELAR);
                }else{
                    this.SQL="SELECT * FROM " + tablaEliminar + " WHERE codigo_libro like '%"+datoBusqueda+"%';";
                    atributos.despliegueFields(SQL,tablaEliminar,jTFCodigo_EliminarLib,jTFTitulo_EliminarLib,jTFFechaPublicacionLib,
                        jTFEdicionLib,jTFNombreALib,jTFApellidoALib,jTFCategoriaLib,jTFStockLib,"actualizar");
                }
                break;
            }
            case 1:{
                this.SQL="Select count(*) from Libro where nombre_libro like '%"+datoBusqueda+"%';";
                if(atributos.busquedaCod(tablaEliminar,SQL,"count(*)")<1){
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null,"El libro al que hace referencia no existe", "ADVERTENCIA", HEIGHT, ICONCANCELAR);
                }else{
                    this.SQL="SELECT codigo_libro FROM Libro where nombre_libro like " + "'%"+datoBusqueda+"%';";
                    int codLib=atributos.busquedaCod(tablaEliminar, SQL,"codigo_libro");
                    datoBusqueda="'%" + codLib + "%'";
                    this.SQL="SELECT * FROM Libro WHERE codigo_libro like "+datoBusqueda;
                    atributos.despliegueFields(SQL,tablaEliminar,jTFCodigo_EliminarLib,jTFTitulo_EliminarLib,jTFFechaPublicacionLib,
                    jTFEdicionLib,jTFNombreALib,jTFApellidoALib,jTFCategoriaLib,jTFStockLib,"actualizar");
                }
                break;
            }
        }
    }//GEN-LAST:event_jTFBuscar_ActualizarLibKeyReleased

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEliminarLibro;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JComboBox<String> jComboBoxFiltrarLib;
    private javax.swing.JLabel jLabelApe;
    private javax.swing.JLabel jLabelCelu;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelCorre;
    private javax.swing.JLabel jLabelFacu;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelSector;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosEstudianteActualizar;
    private javax.swing.JPanel jPanelDatoEstudiante;
    public static javax.swing.JTextField jTFApellidoALib;
    public static javax.swing.JTextField jTFBuscar_ActualizarLib;
    public static javax.swing.JTextField jTFCategoriaLib;
    public static javax.swing.JTextField jTFCodigo_EliminarLib;
    public static javax.swing.JTextField jTFEdicionLib;
    public static javax.swing.JTextField jTFFechaPublicacionLib;
    public static javax.swing.JTextField jTFNombreALib;
    public static javax.swing.JTextField jTFStockLib;
    public static javax.swing.JTextField jTFTitulo_EliminarLib;
    // End of variables declaration//GEN-END:variables
}
