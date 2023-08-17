package Vista.Estudiante;
import Negocio.Comprobaciones;
import Negocio.Interaccion;
import Negocio.Imagenes;
import Vista.Estructura.JFLogin;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JFEstudianteInsentar extends javax.swing.JFrame {
    private int x;
    private int y;
    Imagenes imagen=new Imagenes();
    ImageIcon ICONERROR = imagen.getICONERROR();
    ImageIcon ICONCORRECTO = imagen.getICONCORRECTO();
    ImageIcon ICONREVISION = imagen.getICONREVISION();
    ImageIcon ICONCANCELAR=imagen.getICONCANCELAR();
    ImageIcon ICONACEPTAR=imagen.getICONACEPTAR();
    Interaccion atributos=new Interaccion();
    Comprobaciones name= new Comprobaciones();
    private String SQL;
    private String tablaInsertar="Estudiante";
    public JFEstudianteInsentar() {
        initComponents();
        setLocationRelativeTo(this);
        this.jTFCodigo.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCodEstudiante = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTFApellido = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jTFCelular = new javax.swing.JTextField();
        jLabelSector = new javax.swing.JLabel();
        jTFSector = new javax.swing.JTextField();
        jLabelFacultad = new javax.swing.JLabel();
        jTFFacultad = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        jTFCorreo = new javax.swing.JTextField();
        jBResgistrar_estudiante = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insertar Estudiante");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(280, 370));
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
        jButtonMinimizar.setBounds(220, 0, 30, 30);

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
        jButtonSalirIcon.setBounds(250, 0, 30, 30);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Insertar Esudiante");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 140, 30);

        jLabelCodEstudiante.setText("Código:");
        getContentPane().add(jLabelCodEstudiante);
        jLabelCodEstudiante.setBounds(20, 60, 60, 14);

        jTFCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCodigoFocusLost(evt);
            }
        });
        jTFCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFCodigoKeyPressed(evt);
            }
        });
        getContentPane().add(jTFCodigo);
        jTFCodigo.setBounds(90, 60, 170, 20);

        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre);
        jLabelNombre.setBounds(20, 90, 60, 14);
        getContentPane().add(jTFNombre);
        jTFNombre.setBounds(90, 90, 170, 20);

        jLabelApellido.setText("Apellido:");
        getContentPane().add(jLabelApellido);
        jLabelApellido.setBounds(20, 120, 70, 14);
        getContentPane().add(jTFApellido);
        jTFApellido.setBounds(90, 120, 170, 20);

        jLabelCelular.setText("Celular:");
        getContentPane().add(jLabelCelular);
        jLabelCelular.setBounds(20, 150, 70, 14);

        jTFCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCelularKeyTyped(evt);
            }
        });
        getContentPane().add(jTFCelular);
        jTFCelular.setBounds(90, 150, 170, 20);

        jLabelSector.setText("Sector:");
        getContentPane().add(jLabelSector);
        jLabelSector.setBounds(20, 180, 70, 14);
        getContentPane().add(jTFSector);
        jTFSector.setBounds(90, 180, 170, 20);

        jLabelFacultad.setText("Facultad:");
        getContentPane().add(jLabelFacultad);
        jLabelFacultad.setBounds(20, 210, 70, 14);
        getContentPane().add(jTFFacultad);
        jTFFacultad.setBounds(90, 210, 170, 20);

        jLabelCorreo.setText("Correo:");
        getContentPane().add(jLabelCorreo);
        jLabelCorreo.setBounds(20, 240, 70, 14);

        jTFCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCorreoFocusLost(evt);
            }
        });
        getContentPane().add(jTFCorreo);
        jTFCorreo.setBounds(90, 240, 170, 20);

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
        jBResgistrar_estudiante.setBounds(20, 310, 110, 40);

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
        jBCancelar.setBounds(150, 310, 110, 40);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Insertar.png"))); // NOI18N
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 280, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX-x,posY-y);
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
        String nombre= jTFNombre.getText();
        String apellido= jTFApellido.getText();
        String sector= jTFSector.getText();
        String facultad= jTFFacultad.getText();
        String correo= jTFCorreo.getText();
        if(this.jTFCodigo.getText().isEmpty()||nombre.isEmpty()||apellido.isEmpty()||
            this.jTFCelular.getText().isEmpty()||sector.isEmpty()||facultad.isEmpty()||correo.isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Advertencia", HEIGHT, ICONREVISION);
        }else{
            int codigoEst= Integer.parseInt(jTFCodigo.getText());
            int celular= Integer.parseInt(jTFCelular.getText());
            //datosBasura
            int codigoLibro=0;
            int stock=0;
            int disponibilidad=0;
            this.SQL="INSERT INTO Estudiante values(?,?,?,?,?,?,?)";
            if(atributos.insertarTabla(SQL,tablaInsertar, codigoEst, nombre, apellido, celular, sector, facultad, correo, 
                codigoLibro, null, null, null, null, stock, disponibilidad,null,null)){
                JOptionPane.showMessageDialog(null, "Datos Guardados correctamente", "RESULTADO", HEIGHT, ICONCORRECTO);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrio un error al ingresar los datos", "RESULTADO", HEIGHT, ICONERROR);
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
        this.jBCancelar.setText("CANCELAR");
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        this.jBCancelar.setText("cancelar");
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        int seleccion=JOptionPane.showConfirmDialog(null,"¿Desea cancelar el ingreso?"+"\n     -Los datos ingresados no seran guardados", "Canceclar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,ICONCANCELAR);
        if(seleccion==0){
            limpiarCampos();
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodigoKeyPressed
        char variable=evt.getKeyChar();
        if(Character.isLetter(variable)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Ingrese unicamente numeros", "ADVERTENCIA", HEIGHT, ICONCANCELAR);
            this.jTFCodigo.setText("");
            this.jTFCodigo.requestFocus();
        }
    }//GEN-LAST:event_jTFCodigoKeyPressed

    private void jTFCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCelularKeyTyped
        char variable=evt.getKeyChar();
        if(Character.isLetter(variable)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Ingrese unicamente numeros","ADVERTENCIA",HEIGHT, ICONCANCELAR);
        }
    }//GEN-LAST:event_jTFCelularKeyTyped

    private void jTFCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCorreoFocusLost
        String correo=this.jTFCorreo.getText();
        if(name.comprobarExpresionRegular(correo,"correo")==false){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Ingrese un correo valido","ADVERTENCIA",HEIGHT, ICONCANCELAR);
            this.jTFCorreo.setText("");
            this.jTFCorreo.requestFocus();
        }
    }//GEN-LAST:event_jTFCorreoFocusLost

    private void jTFCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoFocusLost
        if(this.jTFCodigo.getText().isEmpty()){}else{
            this.SQL="Select count(*) from Estudiante where codigo_estudiante like '%"+this.jTFCodigo.getText()+"%';";
            if(atributos.busquedaCod(tablaInsertar,SQL,"count(*)")==1){
                    JOptionPane.showMessageDialog(null, "El codigo ingresado ya fue ocupado", "RESULTADO", HEIGHT, ICONERROR);
                    this.jTFCodigo.requestFocus();
            }
        }
    }//GEN-LAST:event_jTFCodigoFocusLost
    
    public void limpiarCampos(){
        this.jTFApellido.setText("");
        this.jTFCelular.setText("");
        this.jTFCodigo.setText("");
        this.jTFCorreo.setText("");
        this.jTFFacultad.setText("");
        this.jTFNombre.setText("");
        this.jTFSector.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBResgistrar_estudiante;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCodEstudiante;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelFacultad;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSector;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFCelular;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFFacultad;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFSector;
    // End of variables declaration//GEN-END:variables
}