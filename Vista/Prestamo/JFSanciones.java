package Vista.Prestamo;

import Negocio.Comprobaciones;
import Negocio.Fecha;
import Negocio.Interaccion;
import Negocio.Imagenes;
import Vista.Estructura.JFLogin;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @author JEREMY
 */
public class JFSanciones extends javax.swing.JFrame {

    private int x;
    private int y;
    Imagenes imagen = new Imagenes();
    ImageIcon ICONERROR = imagen.getICONERROR();
    ImageIcon ICONCORRECTO = imagen.getICONCORRECTO();
    ImageIcon ICONREVISION = imagen.getICONREVISION();
    ImageIcon ICONCANCELAR = imagen.getICONCANCELAR();
    ImageIcon ICONACEPTAR = imagen.getICONACEPTAR();
    String selectTabla = "Prestamo";
    long diasrestantes;
    private int tiempo = 0;
    private String SQL;
    Fecha fecha = new Fecha();
    Interaccion atributos = new Interaccion();
    Comprobaciones comprobar = new Comprobaciones();

    public JFSanciones() {
        initComponents();
        setLocationRelativeTo(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEstructura = new javax.swing.JPanel();
        jPanelDatoCodPrestamo = new javax.swing.JPanel();
        jTFBusquedaCodPrestamo = new javax.swing.JTextField();
        jLabelCodLibro = new javax.swing.JLabel();
        jPanelDatosPrestamo = new javax.swing.JPanel();
        jLabelCodPres = new javax.swing.JLabel();
        jTFCodPrestamoDato = new javax.swing.JTextField();
        jLabelCodLib = new javax.swing.JLabel();
        jTFCodLibro = new javax.swing.JTextField();
        jLabelLib = new javax.swing.JLabel();
        jTFNombreLibro = new javax.swing.JTextField();
        jLabelCodEst = new javax.swing.JLabel();
        jTFCodEstudiante = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTFNomEst = new javax.swing.JTextField();
        jLabelFP = new javax.swing.JLabel();
        jTFFPrestamo = new javax.swing.JTextField();
        jLabelFD = new javax.swing.JLabel();
        jTFFDevolucion = new javax.swing.JTextField();
        jPanelDatosSancion = new javax.swing.JPanel();
        jLabelFD1 = new javax.swing.JLabel();
        jTFSancion = new javax.swing.JTextField();
        jLabelDiasRestantes = new javax.swing.JLabel();
        jTFDiasRetraso = new javax.swing.JTextField();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonSalirIcon = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBRPagar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(300, 508));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelEstructura.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEstructura.setMinimumSize(new java.awt.Dimension(295, 460));
        jPanelEstructura.setPreferredSize(new java.awt.Dimension(295, 460));

        jPanelDatoCodPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatoCodPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Prestamo"));

        jTFBusquedaCodPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBusquedaCodPrestamoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBusquedaCodPrestamoKeyTyped(evt);
            }
        });

        jLabelCodLibro.setText("Codigo prestamo:");

        javax.swing.GroupLayout jPanelDatoCodPrestamoLayout = new javax.swing.GroupLayout(jPanelDatoCodPrestamo);
        jPanelDatoCodPrestamo.setLayout(jPanelDatoCodPrestamoLayout);
        jPanelDatoCodPrestamoLayout.setHorizontalGroup(
            jPanelDatoCodPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoCodPrestamoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabelCodLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTFBusquedaCodPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelDatoCodPrestamoLayout.setVerticalGroup(
            jPanelDatoCodPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoCodPrestamoLayout.createSequentialGroup()
                .addGroup(jPanelDatoCodPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBusquedaCodPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodLibro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDatosPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la devolucion"));

        jLabelCodPres.setText("Codigo Prestamo:");

        jTFCodPrestamoDato.setEditable(false);
        jTFCodPrestamoDato.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCodLib.setText("Codigo Libro:");

        jTFCodLibro.setEditable(false);
        jTFCodLibro.setBackground(new java.awt.Color(255, 255, 255));

        jLabelLib.setText("Titulo Libro:");

        jTFNombreLibro.setEditable(false);
        jTFNombreLibro.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCodEst.setText("Codigo Estudiante:");

        jTFCodEstudiante.setEditable(false);
        jTFCodEstudiante.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNombre.setText("Nombre Estudiante:");

        jTFNomEst.setEditable(false);
        jTFNomEst.setBackground(new java.awt.Color(255, 255, 255));

        jLabelFP.setText("Fecha Prestamo:");

        jTFFPrestamo.setEditable(false);
        jTFFPrestamo.setBackground(new java.awt.Color(255, 255, 255));

        jLabelFD.setText("Fecha Devolucion:");

        jTFFDevolucion.setEditable(false);
        jTFFDevolucion.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelDatosPrestamoLayout = new javax.swing.GroupLayout(jPanelDatosPrestamo);
        jPanelDatosPrestamo.setLayout(jPanelDatosPrestamoLayout);
        jPanelDatosPrestamoLayout.setHorizontalGroup(
            jPanelDatosPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPrestamoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelDatosPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDatosPrestamoLayout.createSequentialGroup()
                        .addComponent(jLabelCodPres, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFCodPrestamoDato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDatosPrestamoLayout.createSequentialGroup()
                        .addComponent(jLabelLib, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDatosPrestamoLayout.createSequentialGroup()
                        .addComponent(jLabelCodEst, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jTFCodEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosPrestamoLayout.createSequentialGroup()
                        .addComponent(jLabelCodLib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFCodLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDatosPrestamoLayout.createSequentialGroup()
                        .addGroup(jPanelDatosPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelFD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelFP, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDatosPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFFPrestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jTFNomEst, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFFDevolucion, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanelDatosPrestamoLayout.setVerticalGroup(
            jPanelDatosPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPrestamoLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanelDatosPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodPres)
                    .addComponent(jTFCodPrestamoDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodLib)
                    .addComponent(jTFCodLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLib)
                    .addComponent(jTFNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodEst)
                    .addComponent(jTFCodEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTFNomEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFP)
                    .addComponent(jTFFPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFD)
                    .addComponent(jTFFDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDatosSancion.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosSancion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de la Sancion"));

        jLabelFD1.setText("Valor de sancion:");

        jTFSancion.setEditable(false);
        jTFSancion.setBackground(new java.awt.Color(255, 255, 255));

        jLabelDiasRestantes.setText("Dias de retraso:");

        jTFDiasRetraso.setEditable(false);
        jTFDiasRetraso.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelDatosSancionLayout = new javax.swing.GroupLayout(jPanelDatosSancion);
        jPanelDatosSancion.setLayout(jPanelDatosSancionLayout);
        jPanelDatosSancionLayout.setHorizontalGroup(
            jPanelDatosSancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosSancionLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanelDatosSancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDiasRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFD1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosSancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFDiasRetraso)
                    .addComponent(jTFSancion))
                .addContainerGap())
        );
        jPanelDatosSancionLayout.setVerticalGroup(
            jPanelDatosSancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosSancionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDatosSancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDiasRetraso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDiasRestantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosSancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFSancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFD1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelEstructuraLayout = new javax.swing.GroupLayout(jPanelEstructura);
        jPanelEstructura.setLayout(jPanelEstructuraLayout);
        jPanelEstructuraLayout.setHorizontalGroup(
            jPanelEstructuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstructuraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEstructuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDatoCodPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDatosPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDatosSancion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEstructuraLayout.setVerticalGroup(
            jPanelEstructuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstructuraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatoCodPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDatosPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDatosSancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelEstructura);
        jPanelEstructura.setBounds(0, 30, 300, 420);

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
        jButtonMinimizar.setBounds(240, 0, 30, 30);

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
        jButtonSalirIcon.setBounds(270, 0, 30, 30);

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
        jBCancelar.setBounds(150, 460, 110, 40);

        jBRPagar.setBackground(new java.awt.Color(255, 255, 255));
        jBRPagar.setForeground(new java.awt.Color(58, 160, 141));
        jBRPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar 32.png"))); // NOI18N
        jBRPagar.setText("pagar");
        jBRPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));
        jBRPagar.setBorderPainted(false);
        jBRPagar.setHideActionText(true);
        jBRPagar.setMaximumSize(new java.awt.Dimension(89, 32));
        jBRPagar.setMinimumSize(new java.awt.Dimension(89, 32));
        jBRPagar.setPreferredSize(new java.awt.Dimension(89, 32));
        jBRPagar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar 32.png"))); // NOI18N
        jBRPagar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar 32.png"))); // NOI18N
        jBRPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBRPagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBRPagarMouseExited(evt);
            }
        });
        jBRPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRPagarActionPerformed(evt);
            }
        });
        getContentPane().add(jBRPagar);
        jBRPagar.setBounds(30, 460, 110, 40);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Manejo de Sanciones");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 200, 30);

        jLabelFondo.setBackground(new java.awt.Color(58, 160, 141));
        jLabelFondo.setOpaque(true);
        jLabelFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelFondoMouseDragged(evt);
            }
        });
        jLabelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelFondoMousePressed(evt);
            }
        });
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 300, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(JFLogin.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonSalirIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirIconActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirIconActionPerformed

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        if (this.jBCancelar.getText().equalsIgnoreCase("cancelar")) {
            this.jBCancelar.setText("CANCELAR");
        }
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        if (this.jBCancelar.getText().equalsIgnoreCase("cancelar")) {
            this.jBCancelar.setText("cancelar");
        }
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        if (this.jBCancelar.getText().equalsIgnoreCase("cancelar")) {
            int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea cancelar la el pago?"
                    + "\n     -Los datos ingresados no seran guardados", "Canceclar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, ICONCANCELAR);
            if (seleccion == 0) {
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jLabelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFondoMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_jLabelFondoMousePressed

    private void jLabelFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFondoMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - x, posY - y);
    }//GEN-LAST:event_jLabelFondoMouseDragged

    private void jBRPagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRPagarMouseEntered
        this.jBRPagar.setText("PAGAR");
    }//GEN-LAST:event_jBRPagarMouseEntered

    private void jBRPagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRPagarMouseExited
        this.jBRPagar.setText("pagar");
    }//GEN-LAST:event_jBRPagarMouseExited

    private void jTFBusquedaCodPrestamoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaCodPrestamoKeyTyped
        char variable = evt.getKeyChar();
        if (Character.isLetter(variable)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese unicamente numeros", "ADVERTENCIA", HEIGHT, ICONCANCELAR);
        }
    }//GEN-LAST:event_jTFBusquedaCodPrestamoKeyTyped

    private void jTFBusquedaCodPrestamoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBusquedaCodPrestamoKeyReleased
        String datoBusqueda = this.jTFBusquedaCodPrestamo.getText();
        this.SQL = "SELECT count(*) FROM " + selectTabla + " where codigo_prestamo like " + datoBusqueda + ";";
        if (!datoBusqueda.isEmpty()) {
            if (atributos.busquedaCod("Prestamo", SQL, "count(*)") < 1) {
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "El prestamo al que hace referencia no existe", "ADVERTENCIA", HEIGHT, ICONCANCELAR);
            } else {
                this.SQL = "SELECT * FROM Estudiante"
                        + " inner join Prestamo ON (Estudiante.codigo_estudiante = Prestamo.codigo_estudiante)"
                        + " inner join Libro ON (Libro.codigo_libro = Prestamo.codigo_libro) where codigo_prestamo like " + datoBusqueda + ";";
                atributos.despliegueFields(SQL, "Prestamo",jTFCodPrestamoDato, jTFCodLibro, jTFNombreLibro,
                    jTFCodEstudiante, jTFNomEst, jTFFPrestamo, jTFFDevolucion, null, "prestar");
                String fechaPrevista = this.jTFFDevolucion.getText();
                if (!fechaPrevista.isEmpty()) {
                    fecha.fechaAuxiliar(fechaPrevista);
                    this.diasrestantes = fecha.diferenciaFechaDias();
                    if (diasrestantes > 0) {
                        this.jTFDiasRetraso.setText("No aplica");
                        this.jTFSancion.setText("No aplica");
                    }
                    if (diasrestantes < 0) {
                        int retraso = Math.toIntExact(-diasrestantes);
                        this.jTFDiasRetraso.setText(retraso + "");
                        double sancion = comprobar.sanciones(retraso);
                        this.jTFSancion.setText(sancion + "");
                    }
                }
            }
        }
    }//GEN-LAST:event_jTFBusquedaCodPrestamoKeyReleased

    private void jBRPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRPagarActionPerformed
        if (this.jTFBusquedaCodPrestamo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Advertencia", HEIGHT, ICONREVISION);
        } else {
            if (this.jTFDiasRetraso.getText().equalsIgnoreCase("no aplica")) {
                JOptionPane.showMessageDialog(null, "El estudiante no tiene sanciones pendientes", "Sanciones", HEIGHT, ICONCORRECTO);
            } else {
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea pagar la deuda del estudiante?", "Sanciones", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, ICONREVISION);
                if (seleccion == 0) {
                    int codPres = Integer.parseInt(this.jTFCodPrestamoDato.getText());
                    String fechaPrevista=this.jTFFDevolucion.getText();
                    fecha.fechaAuxiliar(fechaPrevista);
                    this.diasrestantes = fecha.diferenciaFechaDias();
                    
                    if ((diasrestantes) < 0) {
                        String nueva = fecha.fechaDevolucion(1, "nueva");
                        this.SQL = "UPDATE Prestamo SET fecha_devolucion = '" + nueva + "' WHERE codigo_prestamo like " + codPres + ";";
                        if (atributos.actualizarEliminarTablas(SQL) == true) {
                            String salida = "Se cancelo la deuda del estudiante con exito \n"
                                    + "     -El estudiante tiene un periodo de 24 horas para \n"
                                    + "      devolver el libro o se le aplicara otra sancion";
                            JOptionPane.showMessageDialog(null, salida, "RESULTADO", HEIGHT, ICONCORRECTO);
                            this.setVisible(false);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jBRPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBRPagar;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JLabel jLabelCodEst;
    private javax.swing.JLabel jLabelCodLib;
    private javax.swing.JLabel jLabelCodLibro;
    private javax.swing.JLabel jLabelCodPres;
    private javax.swing.JLabel jLabelDiasRestantes;
    private javax.swing.JLabel jLabelFD;
    private javax.swing.JLabel jLabelFD1;
    private javax.swing.JLabel jLabelFP;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLib;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelDatoCodPrestamo;
    private javax.swing.JPanel jPanelDatosPrestamo;
    private javax.swing.JPanel jPanelDatosSancion;
    private javax.swing.JPanel jPanelEstructura;
    public javax.swing.JTextField jTFBusquedaCodPrestamo;
    public javax.swing.JTextField jTFCodEstudiante;
    public javax.swing.JTextField jTFCodLibro;
    public javax.swing.JTextField jTFCodPrestamoDato;
    public javax.swing.JTextField jTFDiasRetraso;
    public javax.swing.JTextField jTFFDevolucion;
    public javax.swing.JTextField jTFFPrestamo;
    public javax.swing.JTextField jTFNomEst;
    public javax.swing.JTextField jTFNombreLibro;
    public javax.swing.JTextField jTFSancion;
    // End of variables declaration//GEN-END:variables

}
