package Vista.Estructura;
import Vista.Libro.JPLibro;
import Vista.Estudiante.JPEstudiante;
import Vista.Prestamo.JPPrestamo;
import Negocio.Fecha;
import java.awt.BorderLayout;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JFEstructura extends javax.swing.JFrame implements Runnable{
    int x;
    int y;
    Thread h1;
    public JFEstructura() {
        initComponents();
        setLocationRelativeTo(this);
        h1=new Thread(this);
        h1.start();
        JPHome home = new JPHome();
        home.setSize(970, 630);
        home.setLocation(0,0);        
        this.jPanelGeneral.removeAll();
        this.jPanelGeneral.add(home, BorderLayout.CENTER);
        this.jPanelGeneral.revalidate();
        this.jPanelGeneral.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDia = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jButtonCerrarSesion = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanelGeneral = new javax.swing.JPanel();
        jLabelTituloPanel = new javax.swing.JLabel();
        jLabelFondoPanel = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(928, 581));
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDia.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabelDia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDia.setText("Miercoles");
        getContentPane().add(jLabelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, 40));

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setText("22 de Septiembre de 2022");
        getContentPane().add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 250, 70));

        jLabelHora.setFont(new java.awt.Font("Segoe UI Symbol", 1, 22)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setText("00:00:00 AM");
        jLabelHora.setToolTipText("");
        jLabelHora.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelHora.setInheritsPopupMenu(false);
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 140, -1));

        jButtonCerrarSesion.setBackground(new java.awt.Color(91, 165, 152));
        jButtonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/log out24.png"))); // NOI18N
        jButtonCerrarSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(57, 116, 104)));
        jButtonCerrarSesion.setPreferredSize(new java.awt.Dimension(24, 24));
        jButtonCerrarSesion.setRequestFocusEnabled(false);
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 30, 30));

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
        getContentPane().add(jButtonSalirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 30, 30));

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
        getContentPane().add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 30, 30));

        jButton5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton contacto2.0.png"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton contacto2.0 selected.png"))); // NOI18N
        jButton5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton contacto2.0 selected.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 260, 80));

        jButton4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton prestamos2.0.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton prestamos2.0 selected.png"))); // NOI18N
        jButton4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton prestamos2.0 selected.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 260, 80));

        jButton3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton libros2.0.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton libros2.0 selected.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton libros2.0 selected.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 260, 80));

        jButton2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton estudiante2.0.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton estudiante2.0 selected.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton estudiante2.0 selected.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, 80));

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton home2.0.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(58, 160, 141)));
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton home2.0 selected.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton home2.0 selected.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 260, 80));

        jPanelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGeneral.setMaximumSize(new java.awt.Dimension(970, 630));
        jPanelGeneral.setMinimumSize(new java.awt.Dimension(970, 630));
        jPanelGeneral.setPreferredSize(new java.awt.Dimension(970, 630));
        getContentPane().add(jPanelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabelTituloPanel.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTituloPanel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloPanel.setText("HOME");
        getContentPane().add(jLabelTituloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -1, 280, 30));

        jLabelFondoPanel.setBackground(new java.awt.Color(58, 160, 141));
        jLabelFondoPanel.setOpaque(true);
        getContentPane().add(jLabelFondoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 970, 670));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoEstructura.jpg"))); // NOI18N
        jLabelFondo.setMaximumSize(new java.awt.Dimension(260, 670));
        jLabelFondo.setMinimumSize(new java.awt.Dimension(260, 670));
        jLabelFondo.setPreferredSize(new java.awt.Dimension(260, 670));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        this.setVisible(false);
        JFLogin login = new JFLogin();
        login.setVisible(true);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(JFLogin.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JPHome home = new JPHome();
        home.setSize(970, 630);
        home.setLocation(0,0);        
        this.jPanelGeneral.removeAll();
        this.jPanelGeneral.add(home, BorderLayout.CENTER);
        this.jPanelGeneral.revalidate();
        this.jPanelGeneral.repaint();
        this.jLabelTituloPanel.setText("HOME");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JPEstudiante estudiante= new JPEstudiante();
        estudiante.setSize(970, 630);
        estudiante.setLocation(0,0);        
        this.jPanelGeneral.removeAll();
        this.jPanelGeneral.add(estudiante, BorderLayout.CENTER);
        this.jPanelGeneral.revalidate();
        this.jPanelGeneral.repaint();
        this.jLabelTituloPanel.setText("ESTUDIANTE");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JPLibro libro = new JPLibro();
        libro.setSize(970, 630);
        libro.setLocation(0,0);        
        this.jPanelGeneral.removeAll();
        this.jPanelGeneral.add(libro, BorderLayout.CENTER);
        this.jPanelGeneral.revalidate();
        this.jPanelGeneral.repaint();
        this.jLabelTituloPanel.setText("LIBRO");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JPPrestamo prestamo = new JPPrestamo();
        prestamo.setSize(970, 630);
        prestamo.setLocation(0,0);        
        this.jPanelGeneral.removeAll();
        this.jPanelGeneral.add(prestamo, BorderLayout.CENTER);
        this.jPanelGeneral.revalidate();
        this.jPanelGeneral.repaint();
        this.jLabelTituloPanel.setText("PRESTAMOS Y DEVOLUCIONES");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JPContactos contacto = new JPContactos();
        contacto.setSize(970, 630);
        contacto.setLocation(0,0);        
        this.jPanelGeneral.removeAll();
        this.jPanelGeneral.add(contacto, BorderLayout.CENTER);
        this.jPanelGeneral.revalidate();
        this.jPanelGeneral.repaint();
        this.jLabelTituloPanel.setText("CONTACTOS");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX-x,posY-y);
    }//GEN-LAST:event_formMouseDragged

    @Override
    public void run(){
        Thread ct=Thread.currentThread(); //Herencia de una clase libreria de java para hilos
        while(ct==h1){
            Fecha tiempo= new Fecha();
            this.jLabelDia.setText(tiempo.getDia());
            this.jLabelFecha.setText(tiempo.toString());
            this.jLabelHora.setText(tiempo.hora+":"+tiempo.minutos+":"+tiempo.segundos+" "+tiempo.ampm);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
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
            java.util.logging.Logger.getLogger(JFEstructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEstructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEstructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEstructura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEstructura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public static javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondoPanel;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelTituloPanel;
    private javax.swing.JPanel jPanelGeneral;
    // End of variables declaration//GEN-END:variables
}
