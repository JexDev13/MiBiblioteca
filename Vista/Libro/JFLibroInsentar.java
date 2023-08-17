package Vista.Libro;
import Negocio.Comprobaciones;
import Negocio.Interaccion;
import Negocio.Imagenes;
import Vista.Estructura.JFLogin;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JFLibroInsentar extends javax.swing.JFrame {
    private int x;
    private int y;
    Imagenes imagen = new Imagenes();
    ImageIcon ICONERROR = imagen.getICONERROR();
    ImageIcon ICONCORRECTO = imagen.getICONCORRECTO();
    ImageIcon ICONREVISION = imagen.getICONREVISION();
    ImageIcon ICONCANCELAR = imagen.getICONCANCELAR();
    ImageIcon ICONACEPTAR = imagen.getICONACEPTAR();
    private String SQL;
    private String tablaInsertar="Libro";
    Comprobaciones name= new Comprobaciones();
    Interaccion atributos=new Interaccion();
    public JFLibroInsentar() {
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
        jLabelTituloL = new javax.swing.JLabel();
        jTFTituloLibro = new javax.swing.JTextField();
        jLabelFechaPubli = new javax.swing.JLabel();
        jTFFechaPublicacion = new javax.swing.JTextField();
        jLabelEdicion = new javax.swing.JLabel();
        jTFEdicion = new javax.swing.JTextField();
        jLabelNombreA = new javax.swing.JLabel();
        jTFNombreAutor = new javax.swing.JTextField();
        jLabelApellidoA = new javax.swing.JLabel();
        jTFApellidoAutor = new javax.swing.JTextField();
        jLabelCate = new javax.swing.JLabel();
        jTFCategoria = new javax.swing.JTextField();
        jLabelStock = new javax.swing.JLabel();
        jTFStock = new javax.swing.JTextField();
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
        jLabelTitulo.setText("Insertar Libro");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 140, 30);

        jLabelCodEstudiante.setText("Código:");
        getContentPane().add(jLabelCodEstudiante);
        jLabelCodEstudiante.setBounds(20, 50, 60, 14);

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
        jTFCodigo.setBounds(100, 50, 160, 20);

        jLabelTituloL.setText("Titulo Libro:");
        getContentPane().add(jLabelTituloL);
        jLabelTituloL.setBounds(20, 80, 70, 14);

        jTFTituloLibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFTituloLibroFocusLost(evt);
            }
        });
        getContentPane().add(jTFTituloLibro);
        jTFTituloLibro.setBounds(100, 80, 160, 20);

        jLabelFechaPubli.setText("Fecha Publicacion:");
        getContentPane().add(jLabelFechaPubli);
        jLabelFechaPubli.setBounds(20, 110, 120, 14);

        jTFFechaPublicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFFechaPublicacionKeyReleased(evt);
            }
        });
        getContentPane().add(jTFFechaPublicacion);
        jTFFechaPublicacion.setBounds(130, 110, 130, 20);

        jLabelEdicion.setText("Edicion:");
        getContentPane().add(jLabelEdicion);
        jLabelEdicion.setBounds(20, 140, 60, 14);
        getContentPane().add(jTFEdicion);
        jTFEdicion.setBounds(110, 140, 150, 20);

        jLabelNombreA.setText("Nombre Autor:");
        getContentPane().add(jLabelNombreA);
        jLabelNombreA.setBounds(20, 170, 90, 14);
        getContentPane().add(jTFNombreAutor);
        jTFNombreAutor.setBounds(110, 170, 150, 20);

        jLabelApellidoA.setText("Apellido Autor:");
        getContentPane().add(jLabelApellidoA);
        jLabelApellidoA.setBounds(20, 200, 90, 14);
        getContentPane().add(jTFApellidoAutor);
        jTFApellidoAutor.setBounds(110, 200, 150, 20);

        jLabelCate.setText("Categoria:");
        getContentPane().add(jLabelCate);
        jLabelCate.setBounds(20, 230, 80, 14);
        getContentPane().add(jTFCategoria);
        jTFCategoria.setBounds(110, 230, 150, 20);

        jLabelStock.setText("Stock:");
        getContentPane().add(jLabelStock);
        jLabelStock.setBounds(20, 260, 60, 14);

        jTFStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFStockKeyTyped(evt);
            }
        });
        getContentPane().add(jTFStock);
        jTFStock.setBounds(110, 260, 150, 20);

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
        //registrar libro
        String titulo = jTFTituloLibro.getText();
        String fecha1 = jTFFechaPublicacion.getText();
        String nombre = jTFNombreAutor.getText();
        String apellido = jTFApellidoAutor.getText();
        String categoria = jTFCategoria.getText();
        String edicion = this.jTFEdicion.getText();
        if(this.jTFCodigo.getText().isEmpty() || titulo.isEmpty() || fecha1.isEmpty()|| edicion.isEmpty() || nombre.isEmpty() 
                || apellido.isEmpty() || categoria.isEmpty()|| this.jTFStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Advertencia", HEIGHT, ICONREVISION);
        }else{
            int codigoLibro = Integer.parseInt(jTFCodigo.getText());
            int stock = Integer.parseInt(this.jTFStock.getText());
            int disponibilidad = stock;
            //datosBasura
            int codigoEst=0;
            int celular = 0;
            this.SQL="INSERT INTO Libro VALUES(?,?,?,?,?,?,?,?,?)";
            if(atributos.insertarTabla(SQL,tablaInsertar, codigoEst, nombre, apellido, celular, null, null, null, 
                codigoLibro, titulo, fecha1, edicion, categoria, stock, disponibilidad,null,null)){
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
        int seleccion = JOptionPane.showConfirmDialog(null,"¿Desea cancelar el ingreso?"+ "\n     -Los datos ingresados no seran guardados",
                "Canceclar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,ICONCANCELAR);
        if (seleccion == 0) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodigoKeyPressed
        char variable = evt.getKeyChar();
        if (Character.isLetter(variable)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Ingrese unicamente numeros","ADVERTENCIA",HEIGHT,ICONCANCELAR);
            this.jTFCodigo.setText("");
            this.jTFCodigo.requestFocus();
        }
    }//GEN-LAST:event_jTFCodigoKeyPressed

    private void jTFStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFStockKeyTyped
        char variable = evt.getKeyChar();
        if (Character.isLetter(variable)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Ingrese unicamente numeros","ADVERTENCIA",HEIGHT,ICONCANCELAR);
        }
    }//GEN-LAST:event_jTFStockKeyTyped

    private void jTFFechaPublicacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFechaPublicacionKeyReleased
        String fecha=this.jTFFechaPublicacion.getText();
        if(name.comprobarExpresionRegular(fecha, "formatoFecha")==true){
            if(name.comprobarExpresionRegular(fecha, "fecha")==false){
                getToolkit().beep();
                JOptionPane.showMessageDialog(null,"Formato de fecha erroneo. "+ "\n     -Ingrese el formato adecuado (dd/mm/aaaa)","ERROR",HEIGHT,ICONCANCELAR);
                this.jTFFechaPublicacion.setText("");
                this.jTFFechaPublicacion.requestFocus();
            }
        }
    }//GEN-LAST:event_jTFFechaPublicacionKeyReleased

    private void jTFCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoFocusLost
        String codLib=this.jTFCodigo.getText();
        if(codLib.isEmpty()){}else{
            this.SQL="Select count(*) from Libro where codigo_libro like '%"+codLib+"%';";
            if(atributos.busquedaCod(tablaInsertar,SQL,"count(*)")==1){
                JOptionPane.showMessageDialog(null, "El codigo ingresado ya fue ocupado", "RESULTADO", HEIGHT, ICONERROR);
                this.jTFCodigo.requestFocus();
            }
        }
    }//GEN-LAST:event_jTFCodigoFocusLost

    private void jTFTituloLibroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFTituloLibroFocusLost
        String titulo=this.jTFTituloLibro.getText();
        if(titulo.isEmpty()){}else{
            this.SQL="Select count(*) from Libro where nombre_libro like '%"+titulo+"%';";
            if(atributos.busquedaCod(tablaInsertar,SQL,"count(*)")==1){
                    this.SQL="Select codigo_libro from Libro where nombre_libro like '%"+titulo+"%';";
                    int codLib=atributos.busquedaCod(tablaInsertar, SQL, "codigo_libro");
                    JOptionPane.showMessageDialog(null, "El libro "+titulo+" ya fue ingresado con el codigo "+codLib, "RESULTADO", HEIGHT, ICONERROR);
            }
        }
    }//GEN-LAST:event_jTFTituloLibroFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBResgistrar_estudiante;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLabelApellidoA;
    private javax.swing.JLabel jLabelCate;
    private javax.swing.JLabel jLabelCodEstudiante;
    private javax.swing.JLabel jLabelEdicion;
    private javax.swing.JLabel jLabelFechaPubli;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombreA;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloL;
    private javax.swing.JTextField jTFApellidoAutor;
    private javax.swing.JTextField jTFCategoria;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFEdicion;
    private javax.swing.JTextField jTFFechaPublicacion;
    private javax.swing.JTextField jTFNombreAutor;
    private javax.swing.JTextField jTFStock;
    private javax.swing.JTextField jTFTituloLibro;
    // End of variables declaration//GEN-END:variables
}
