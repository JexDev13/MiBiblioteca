package Vista.Prestamo;
import Negocio.Interaccion;
import java.awt.Color;
import java.awt.Font;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JPPrestamo extends javax.swing.JPanel {
    Interaccion inter = new Interaccion();
    JFPrestamoInsentar prestamo = new JFPrestamoInsentar();
    JFDevolucionLibro devolver= new JFDevolucionLibro();
    JFSanciones sancion = new JFSanciones();
    JFPlazos plazo = new JFPlazos();
    String Parametro_de_busqueda_prestamo;
    String selectTabla="Prestamo";
    String SQL;
    public JPPrestamo() {
        initComponents();
        Interaccion inter = new Interaccion();
        jTableTablaPrestamo.getTableHeader().setBackground(new Color(58,160,141));
        jTableTablaPrestamo.getTableHeader().setFont(new Font("Segoe UI Symbol",Font.BOLD,12));
        jTableTablaPrestamo.getTableHeader().setForeground(Color.WHITE);
        jScrollPane1.setBackground(Color.WHITE);
        jComboFiltrarPrestamos.setBackground(Color.WHITE);
//        ((DefaultTableCellHeaderRenderer)
//            jTableTablaPrestamo.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.LEFT);
        this.SQL="SELECT * FROM Estudiante"+
                            " inner join Prestamo ON (Estudiante.codigo_estudiante = Prestamo.codigo_estudiante)"+
                            " inner join Libro ON (Libro.codigo_libro = Prestamo.codigo_libro);";
        inter.busquedaDespliegue(jTableTablaPrestamo, selectTabla, SQL);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonNuevoPres = new javax.swing.JButton();
        jButtonActualizarPres = new javax.swing.JButton();
        jButtonSancionesPres = new javax.swing.JButton();
        jButtonPlazoPres = new javax.swing.JButton();
        jLabelLupaPres = new javax.swing.JLabel();
        jTextFieldBusquedaPrestamo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelTituloTabla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablaPrestamo = new javax.swing.JTable();
        jComboFiltrarPrestamos = new javax.swing.JComboBox<>();
        jLabelIconFiltro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(970, 630));
        setMinimumSize(new java.awt.Dimension(970, 630));
        setPreferredSize(new java.awt.Dimension(970, 630));

        jButtonNuevoPres.setBackground(new java.awt.Color(58, 160, 141));
        jButtonNuevoPres.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoPres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/devolucion 32.png"))); // NOI18N
        jButtonNuevoPres.setText("prestar");
        jButtonNuevoPres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevoPres.setBorderPainted(false);
        jButtonNuevoPres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonNuevoPres.setMaximumSize(new java.awt.Dimension(73, 40));
        jButtonNuevoPres.setMinimumSize(new java.awt.Dimension(73, 40));
        jButtonNuevoPres.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevoPres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon nuevo selected 32.png"))); // NOI18N
        jButtonNuevoPres.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon nuevo selected 32.png"))); // NOI18N
        jButtonNuevoPres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevoPresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevoPresMouseExited(evt);
            }
        });
        jButtonNuevoPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoPresActionPerformed(evt);
            }
        });

        jButtonActualizarPres.setBackground(new java.awt.Color(58, 160, 141));
        jButtonActualizarPres.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizarPres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamo devolucion 32.png"))); // NOI18N
        jButtonActualizarPres.setText("devolver");
        jButtonActualizarPres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonActualizarPres.setBorderPainted(false);
        jButtonActualizarPres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonActualizarPres.setMaximumSize(new java.awt.Dimension(73, 40));
        jButtonActualizarPres.setMinimumSize(new java.awt.Dimension(73, 40));
        jButtonActualizarPres.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonActualizarPres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon actualizar 32 selected.png"))); // NOI18N
        jButtonActualizarPres.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon actualizar 32 selected.png"))); // NOI18N
        jButtonActualizarPres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarPresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarPresMouseExited(evt);
            }
        });
        jButtonActualizarPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarPresActionPerformed(evt);
            }
        });

        jButtonSancionesPres.setBackground(new java.awt.Color(58, 160, 141));
        jButtonSancionesPres.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSancionesPres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton sancion 32.png"))); // NOI18N
        jButtonSancionesPres.setText("sanciones");
        jButtonSancionesPres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonSancionesPres.setBorderPainted(false);
        jButtonSancionesPres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonSancionesPres.setMaximumSize(new java.awt.Dimension(73, 40));
        jButtonSancionesPres.setMinimumSize(new java.awt.Dimension(73, 40));
        jButtonSancionesPres.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonSancionesPres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton sancion 32 selected.png"))); // NOI18N
        jButtonSancionesPres.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton sancion 32 selected.png"))); // NOI18N
        jButtonSancionesPres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSancionesPresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSancionesPresMouseExited(evt);
            }
        });
        jButtonSancionesPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSancionesPresActionPerformed(evt);
            }
        });

        jButtonPlazoPres.setBackground(new java.awt.Color(58, 160, 141));
        jButtonPlazoPres.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPlazoPres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plazo 32.png"))); // NOI18N
        jButtonPlazoPres.setText("plazo");
        jButtonPlazoPres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonPlazoPres.setBorderPainted(false);
        jButtonPlazoPres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonPlazoPres.setMaximumSize(new java.awt.Dimension(73, 40));
        jButtonPlazoPres.setMinimumSize(new java.awt.Dimension(73, 40));
        jButtonPlazoPres.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonPlazoPres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plazo 32 selected.png"))); // NOI18N
        jButtonPlazoPres.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plazo 32 selected.png"))); // NOI18N
        jButtonPlazoPres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonPlazoPresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonPlazoPresMouseExited(evt);
            }
        });
        jButtonPlazoPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlazoPresActionPerformed(evt);
            }
        });

        jLabelLupaPres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N

        jTextFieldBusquedaPrestamo.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldBusquedaPrestamo.setText("Buscar codigo");
        jTextFieldBusquedaPrestamo.setBorder(null);
        jTextFieldBusquedaPrestamo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldBusquedaPrestamoFocusLost(evt);
            }
        });
        jTextFieldBusquedaPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldBusquedaPrestamoMousePressed(evt);
            }
        });
        jTextFieldBusquedaPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBusquedaPrestamoKeyReleased(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jLabelTituloTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLabelTituloTabla.setForeground(new java.awt.Color(58, 160, 141));
        jLabelTituloTabla.setText("Prestamos");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 472));

        jTableTablaPrestamo.setAutoCreateRowSorter(true);
        jTableTablaPrestamo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));
        jTableTablaPrestamo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTableTablaPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id.Prestamo", "Id.Libro", "Titulo", "Id.Estudiante", "Nombre Est.", "Apellido. Est", "Fecha del Prestamo", "Fecha de la devolucion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTablaPrestamo.setGridColor(new java.awt.Color(120, 188, 176));
        jTableTablaPrestamo.setSelectionBackground(new java.awt.Color(180, 209, 203));
        jTableTablaPrestamo.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTableTablaPrestamo.getTableHeader().setResizingAllowed(false);
        jTableTablaPrestamo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableTablaPrestamo);
        if (jTableTablaPrestamo.getColumnModel().getColumnCount() > 0) {
            jTableTablaPrestamo.getColumnModel().getColumn(0).setResizable(false);
            jTableTablaPrestamo.getColumnModel().getColumn(1).setResizable(false);
            jTableTablaPrestamo.getColumnModel().getColumn(2).setResizable(false);
            jTableTablaPrestamo.getColumnModel().getColumn(3).setResizable(false);
            jTableTablaPrestamo.getColumnModel().getColumn(4).setResizable(false);
            jTableTablaPrestamo.getColumnModel().getColumn(5).setResizable(false);
            jTableTablaPrestamo.getColumnModel().getColumn(6).setResizable(false);
            jTableTablaPrestamo.getColumnModel().getColumn(7).setResizable(false);
        }

        jComboFiltrarPrestamos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Id.Prestamo", "Id.Libro", "Titulo", "Id.Estudiante", "Nombre Estudiante", "Apellido Estudiante", "Fecha Prestamo", "Fecha Devolucion" }));
        jComboFiltrarPrestamos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));

        jLabelIconFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNuevoPres, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonActualizarPres, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSancionesPres, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPlazoPres, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelLupaPres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldBusquedaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelIconFiltro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboFiltrarPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTituloTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNuevoPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonActualizarPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSancionesPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonPlazoPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelLupaPres)
                            .addComponent(jTextFieldBusquedaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIconFiltro)
                            .addComponent(jComboFiltrarPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addComponent(jLabelTituloTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoPresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoPresMouseEntered
        this.jButtonNuevoPres.setText("PRESTAR");
    }//GEN-LAST:event_jButtonNuevoPresMouseEntered

    private void jButtonNuevoPresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoPresMouseExited
        this.jButtonNuevoPres.setText("prestar");
    }//GEN-LAST:event_jButtonNuevoPresMouseExited

    private void jButtonNuevoPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoPresActionPerformed
        prestamo.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoPresActionPerformed

    private void jButtonActualizarPresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarPresMouseEntered
        this.jButtonActualizarPres.setText("DEVOLVER");
    }//GEN-LAST:event_jButtonActualizarPresMouseEntered

    private void jButtonActualizarPresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarPresMouseExited
        this.jButtonActualizarPres.setText("devolver");
    }//GEN-LAST:event_jButtonActualizarPresMouseExited

    private void jButtonSancionesPresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSancionesPresMouseEntered
        this.jButtonSancionesPres.setText("SANCIONES");
    }//GEN-LAST:event_jButtonSancionesPresMouseEntered

    private void jButtonSancionesPresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSancionesPresMouseExited
        this.jButtonSancionesPres.setText("sanciones");
    }//GEN-LAST:event_jButtonSancionesPresMouseExited

    private void jTextFieldBusquedaPrestamoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaPrestamoFocusLost
        if(jTextFieldBusquedaPrestamo.getText().equals("")||this.jTextFieldBusquedaPrestamo.getText().equals(" ")){
            this.jTextFieldBusquedaPrestamo.setText("Buscar codigo");
        }
    }//GEN-LAST:event_jTextFieldBusquedaPrestamoFocusLost

    private void jTextFieldBusquedaPrestamoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaPrestamoMousePressed
        if(jTextFieldBusquedaPrestamo.getText().equalsIgnoreCase("Buscar codigo")){
            jTextFieldBusquedaPrestamo.setText("");
        }
    }//GEN-LAST:event_jTextFieldBusquedaPrestamoMousePressed

    private void jTextFieldBusquedaPrestamoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaPrestamoKeyReleased
        String Busqueda;
        switch(this.jComboFiltrarPrestamos.getSelectedIndex()){
            case 0:{this.Parametro_de_busqueda_prestamo="codigo_prestamo"; break;}
            case 1:{this.Parametro_de_busqueda_prestamo="codigo_prestamo";break;}
            case 2:{this.Parametro_de_busqueda_prestamo="Libro.codigo_libro";break;}
            case 3:{this.Parametro_de_busqueda_prestamo="nombre_libro";break;}
            case 4:{this.Parametro_de_busqueda_prestamo="Estudiante.codigo_estudiante";break;}
            case 5:{this.Parametro_de_busqueda_prestamo="nombre_estudiante";break;}
            case 6:{this.Parametro_de_busqueda_prestamo="apellido_estudiante";break;}
            case 7:{this.Parametro_de_busqueda_prestamo="fecha_prestamo";break;}
            case 8:{this.Parametro_de_busqueda_prestamo="fecha_devolucion";break;}
        }
        Busqueda=this.jTextFieldBusquedaPrestamo.getText();
        this.SQL="SELECT * FROM Estudiante " + 
                            " inner join Prestamo ON (Estudiante.codigo_estudiante = Prestamo.codigo_estudiante)"+
                            " inner join Libro ON (Libro.codigo_libro = Prestamo.codigo_libro)"+
                            " WHERE " + Parametro_de_busqueda_prestamo + " like '%" + Busqueda+ "%';";
        inter.busquedaDespliegue(this.jTableTablaPrestamo,this.selectTabla,this.SQL);
    }//GEN-LAST:event_jTextFieldBusquedaPrestamoKeyReleased

    private void jButtonActualizarPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarPresActionPerformed
        devolver.setVisible(true);
    }//GEN-LAST:event_jButtonActualizarPresActionPerformed

    private void jButtonSancionesPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSancionesPresActionPerformed
        sancion.setVisible(true);
    }//GEN-LAST:event_jButtonSancionesPresActionPerformed

    private void jButtonPlazoPresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPlazoPresMouseEntered
        this.jButtonPlazoPres.setText("PLAZOS");
    }//GEN-LAST:event_jButtonPlazoPresMouseEntered

    private void jButtonPlazoPresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPlazoPresMouseExited
        this.jButtonPlazoPres.setText("plazos");
    }//GEN-LAST:event_jButtonPlazoPresMouseExited

    private void jButtonPlazoPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlazoPresActionPerformed
        plazo.setVisible(true);
    }//GEN-LAST:event_jButtonPlazoPresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarPres;
    private javax.swing.JButton jButtonNuevoPres;
    private javax.swing.JButton jButtonPlazoPres;
    private javax.swing.JButton jButtonSancionesPres;
    private javax.swing.JComboBox<String> jComboFiltrarPrestamos;
    private javax.swing.JLabel jLabelIconFiltro;
    private javax.swing.JLabel jLabelLupaPres;
    private javax.swing.JLabel jLabelTituloTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableTablaPrestamo;
    private javax.swing.JTextField jTextFieldBusquedaPrestamo;
    // End of variables declaration//GEN-END:variables
}
