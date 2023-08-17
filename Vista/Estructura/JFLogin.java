package Vista.Estructura;
import Negocio.Imagenes;
import Negocio.Conexion;
import Negocio.Fecha;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JFLogin extends javax.swing.JFrame implements Runnable {
    Imagenes imagen = new Imagenes();
    ImageIcon ICONERROR = imagen.getICONERROR();
    ImageIcon ICONCORRECTO = imagen.getICONCORRECTO();
    ImageIcon ICONREVISION = imagen.getICONREVISION();
    ImageIcon ICONCANCELAR = imagen.getICONCANCELAR();
    ImageIcon ICONACEPTAR = imagen.getICONACEPTAR();
    int x;
    int y;
    Thread h1;
    String usuario;
    String contrasena;
    public JFLogin() {
        initComponents();
        setLocationRelativeTo(this);
        h1 = new Thread(this);
        h1.start();
        this.jPasswordField.setText("Contraseña");
        this.jPasswordField.setEchoChar((char) 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMinimizar = new javax.swing.JButton();
        jButtonIngreso = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelContraseña = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonSalirIcon = new javax.swing.JButton();
        jButtonVerContrasena = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelDia = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelDescripcion2 = new javax.swing.JLabel();
        jLabelCreditos = new javax.swing.JLabel();
        jLabelCreador = new javax.swing.JLabel();
        jLabelNombreBiblioteca = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(950, 549));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(950, 549));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 30, 30));

        jButtonIngreso.setBackground(new java.awt.Color(58, 160, 141));
        jButtonIngreso.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login 32 opaco.png"))); // NOI18N
        jButtonIngreso.setText("ingreso");
        jButtonIngreso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonIngreso.setBorderPainted(false);
        jButtonIngreso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login 32.png"))); // NOI18N
        jButtonIngreso.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login 32.png"))); // NOI18N
        jButtonIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonIngresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonIngresoMouseExited(evt);
            }
        });
        jButtonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 110, 40));

        jButtonSalir.setBackground(new java.awt.Color(58, 160, 141));
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir opaco 32.png"))); // NOI18N
        jButtonSalir.setText("salir");
        jButtonSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir 32.png"))); // NOI18N
        jButtonSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir 32.png"))); // NOI18N
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseExited(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 110, 40));

        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyTyped(evt);
            }
        });
        getContentPane().add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 200, 25));

        jLabelContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contraseña 32.png"))); // NOI18N
        getContentPane().add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 40, 40));

        jTextFieldUsuario.setText("Usuario");
        jTextFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusLost(evt);
            }
        });
        jTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 200, 25));

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
        getContentPane().add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 30, 30));

        jButtonVerContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver cerrado 24.png"))); // NOI18N
        jButtonVerContrasena.setBorderPainted(false);
        jButtonVerContrasena.setContentAreaFilled(false);
        jButtonVerContrasena.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonVerContrasena.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver abierto 24.png"))); // NOI18N
        jButtonVerContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonVerContrasenaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonVerContrasenaMouseReleased(evt);
            }
        });
        getContentPane().add(jButtonVerContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, 24, 24));

        jLabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario 32.png"))); // NOI18N
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 40, 40));

        jLabelLogin.setFont(new java.awt.Font("Bookman Old Style", 0, 13)); // NOI18N
        jLabelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 0, 0)), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 13))); // NOI18N
        getContentPane().add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 340, 300));

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setText("22 de Septiembre de 2022");
        getContentPane().add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 370, 70));

        jLabelDia.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelDia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDia.setText("Miercoles");
        getContentPane().add(jLabelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 170, 40));

        jLabelHora.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setText("00:00:00 AM");
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 150, 20));

        jLabelDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setText("y control de bibliotecas.");
        getContentPane().add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, 30));

        jLabelDescripcion2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDescripcion2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion2.setText("Sistema integrado para administración");
        getContentPane().add(jLabelDescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, 30));

        jLabelCreditos.setFont(new java.awt.Font("Bookman Old Style", 1, 21)); // NOI18N
        jLabelCreditos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCreditos.setText("SuperPoderoso Proga");
        getContentPane().add(jLabelCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 250, 30));

        jLabelCreador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCreador.setText("Created by:");
        getContentPane().add(jLabelCreador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jLabelNombreBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Gif Login.gif"))); // NOI18N
        getContentPane().add(jLabelNombreBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 520, 440));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLogin2.png"))); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(950, 590));
        Fondo.setMinimumSize(new java.awt.Dimension(950, 590));
        Fondo.setPreferredSize(new java.awt.Dimension(950, 590));
        Fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FondoMouseDragged(evt);
            }
        });
        Fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FondoMousePressed(evt);
            }
        });
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        this.jButtonSalir.setText("SALIR");
    }//GEN-LAST:event_jButtonSalirMouseEntered

    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
        this.jButtonSalir.setText("salir");
    }//GEN-LAST:event_jButtonSalirMouseExited

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresoMouseEntered
        this.jButtonIngreso.setText("INGRESO");
    }//GEN-LAST:event_jButtonIngresoMouseEntered

    private void jButtonIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresoMouseExited
        this.jButtonIngreso.setText("ingreso");
    }//GEN-LAST:event_jButtonIngresoMouseExited

    private void jButtonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresoActionPerformed
        String user = this.jTextFieldUsuario.getText();
        String password = this.jPasswordField.getText();
        this.usuario = this.jTextFieldUsuario.getText();
        this.contrasena = this.jPasswordField.getText();
        if (user.equalsIgnoreCase("usuario") || password.equalsIgnoreCase("Contraseña")) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "ERROR", HEIGHT, ICONREVISION);
        } else {
            Conexion conect = new Conexion();
            Connection cn = conect.conect(user, password);
            if (cn != null) {
                System.out.println("Hora de ingreso: " + jLabelHora.getText());
                h1.stop();
                this.setVisible(false);
                JFEstructura estructura = new JFEstructura();
                estructura.setVisible(true);
                JOptionPane.showMessageDialog(null, "Conexion Lograda Satisfactoriamente", "CONEXION ESTABLECIDA", HEIGHT, ICONCORRECTO);
            } else {
                String titulo = "ERROR AL INICIAR SESION";
                String mensaje = "ACCESO DENEGADO"
                        + "\n -Usuario o contraseña incorrectos, intentalo nuevamente";
                JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT, ICONERROR);
                this.jTextFieldUsuario.setText("");
                this.jPasswordField.setText("");
                this.jTextFieldUsuario.requestFocus();
            }
        }
    }//GEN-LAST:event_jButtonIngresoActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void jButtonVerContrasenaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVerContrasenaMouseReleased
        this.jPasswordField.setEchoChar('•');
    }//GEN-LAST:event_jButtonVerContrasenaMouseReleased

    private void jButtonVerContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVerContrasenaMousePressed
        this.jPasswordField.setEchoChar((char) 0);
    }//GEN-LAST:event_jButtonVerContrasenaMousePressed

    private void jTextFieldUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyTyped
        char variable = evt.getKeyChar();
        if (variable == KeyEvent.VK_ENTER) {
            this.jPasswordField.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldUsuarioKeyTyped

    private void jPasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyTyped
        char variable = evt.getKeyChar();
        if (variable == KeyEvent.VK_ENTER) {
            this.jButtonIngreso.doClick();
        }
    }//GEN-LAST:event_jPasswordFieldKeyTyped

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(JFLogin.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void FondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_FondoMouseDragged

    private void FondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_FondoMousePressed

    private void jTextFieldUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusLost
        if (jTextFieldUsuario.getText().equals("") || jTextFieldUsuario.getText().equals(" ")) {
            this.jTextFieldUsuario.setText("Usuario");
        }
    }//GEN-LAST:event_jTextFieldUsuarioFocusLost

    private void jTextFieldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusGained
        if (jTextFieldUsuario.getText().equalsIgnoreCase("Usuario")) {
            jTextFieldUsuario.setText("");
        }
    }//GEN-LAST:event_jTextFieldUsuarioFocusGained

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        if (jPasswordField.getText().equalsIgnoreCase("Contraseña")) {
            jPasswordField.setText("");
            this.jPasswordField.setEchoChar('•');
        }
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        if (jPasswordField.getText().equals("") || jPasswordField.getText().equals(" ")) {
            this.jPasswordField.setEchoChar((char) 0);
            this.jPasswordField.setText("Contraseña");
        }
    }//GEN-LAST:event_jPasswordFieldFocusLost

    @Override
    public void run() {
        Thread ct = Thread.currentThread(); //Herencia de una clase libreria de java para hilos
        while (ct == h1) {
            Fecha tiempo = new Fecha();
            this.jLabelDia.setText(tiempo.getDia());
            this.jLabelFecha.setText(tiempo.toString());
            this.jLabelHora.setText(tiempo.hora + ":" + tiempo.minutos + ":" + tiempo.segundos + " " + tiempo.ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButtonIngreso;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JButton jButtonVerContrasena;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelCreador;
    private javax.swing.JLabel jLabelCreditos;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelDescripcion2;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNombreBiblioteca;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

}
