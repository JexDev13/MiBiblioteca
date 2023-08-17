package Vista.Libro;
import Negocio.Interaccion;
import Vista.Prestamo.JFPrestamoInsentar;
import java.awt.Color;
import java.awt.Font;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JPLibro extends javax.swing.JPanel {
    String Parametro_de_busqueda_libro;
    String selectTabla="Libro";
    String SQL;
    Interaccion inter = new Interaccion();
    JFLibroInsentar insertar = new JFLibroInsentar();
    JFLibroEliminar eliminar = new JFLibroEliminar();
    JFLibroActualizar actualizar = new JFLibroActualizar();
    JFPrestamoInsentar prestar = new JFPrestamoInsentar();
    public JPLibro() {
        initComponents();
        jTableTablaLibros.getTableHeader().setBackground(new Color(58,160,141));
        jTableTablaLibros.getTableHeader().setFont(new Font("Segoe UI Symbol",Font.BOLD,12));
        jTableTablaLibros.getTableHeader().setForeground(Color.WHITE);
        jComboFiltrarLibros.setBackground(Color.WHITE);
//        ((DefaultTableCellHeaderRenderer)
//            jTableTablaLibros.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.LEFT);
        this.SQL="Select * from Libro";
        inter.busquedaDespliegue(jTableTablaLibros, selectTabla, SQL);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuIteminsertar = new javax.swing.JMenuItem();
        jMenuItemActualizar = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jMenuItemPrestar = new javax.swing.JMenuItem();
        jLabelIconFiltro = new javax.swing.JLabel();
        jButtonNuevoLib = new javax.swing.JButton();
        jButtonActualizarLib = new javax.swing.JButton();
        jButtonEliminarLib = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelLupaLib = new javax.swing.JLabel();
        jTextFieldBusquedaLibro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablaLibros = new javax.swing.JTable();
        jLabelTituloTabla = new javax.swing.JLabel();
        jComboFiltrarLibros = new javax.swing.JComboBox<>();

        jMenuIteminsertar.setBackground(new java.awt.Color(255, 255, 255));
        jMenuIteminsertar.setText("Insertar");
        jMenuIteminsertar.setToolTipText("");
        jMenuIteminsertar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(58, 160, 141)));
        jMenuIteminsertar.setBorderPainted(true);
        jMenuIteminsertar.setContentAreaFilled(false);
        jMenuIteminsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIteminsertarActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuIteminsertar);

        jMenuItemActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemActualizar.setText("Actualizar");
        jMenuItemActualizar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(58, 160, 141)));
        jMenuItemActualizar.setBorderPainted(true);
        jMenuItemActualizar.setContentAreaFilled(false);
        jMenuItemActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemActualizarActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItemActualizar);

        jMenuItemEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemEliminar.setText("Eliminar");
        jMenuItemEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(58, 160, 141)));
        jMenuItemEliminar.setBorderPainted(true);
        jMenuItemEliminar.setContentAreaFilled(false);
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItemEliminar);

        jMenuItemPrestar.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemPrestar.setText("Prestar");
        jMenuItemPrestar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(58, 160, 141)));
        jMenuItemPrestar.setBorderPainted(true);
        jMenuItemPrestar.setContentAreaFilled(false);
        jMenuItemPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrestarActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItemPrestar);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(970, 630));
        setMinimumSize(new java.awt.Dimension(970, 630));

        jLabelIconFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

        jButtonNuevoLib.setBackground(new java.awt.Color(58, 160, 141));
        jButtonNuevoLib.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoLib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro nuevo 32.png"))); // NOI18N
        jButtonNuevoLib.setText("nuevo");
        jButtonNuevoLib.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevoLib.setBorderPainted(false);
        jButtonNuevoLib.setPreferredSize(new java.awt.Dimension(113, 40));
        jButtonNuevoLib.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon nuevo selected 32.png"))); // NOI18N
        jButtonNuevoLib.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon nuevo selected 32.png"))); // NOI18N
        jButtonNuevoLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevoLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevoLibMouseExited(evt);
            }
        });
        jButtonNuevoLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoLibActionPerformed(evt);
            }
        });

        jButtonActualizarLib.setBackground(new java.awt.Color(58, 160, 141));
        jButtonActualizarLib.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizarLib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro actualizar 32.png"))); // NOI18N
        jButtonActualizarLib.setText("actualizar");
        jButtonActualizarLib.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonActualizarLib.setBorderPainted(false);
        jButtonActualizarLib.setPreferredSize(new java.awt.Dimension(113, 40));
        jButtonActualizarLib.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon actualizar 32 selected.png"))); // NOI18N
        jButtonActualizarLib.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon actualizar 32 selected.png"))); // NOI18N
        jButtonActualizarLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarLibMouseExited(evt);
            }
        });
        jButtonActualizarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarLibActionPerformed(evt);
            }
        });

        jButtonEliminarLib.setBackground(new java.awt.Color(58, 160, 141));
        jButtonEliminarLib.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarLib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro eliminar 32.png"))); // NOI18N
        jButtonEliminarLib.setText("eliminar");
        jButtonEliminarLib.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonEliminarLib.setBorderPainted(false);
        jButtonEliminarLib.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminarLib.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon eliminar selected 32.png"))); // NOI18N
        jButtonEliminarLib.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon eliminar selected 32.png"))); // NOI18N
        jButtonEliminarLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarLibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarLibMouseExited(evt);
            }
        });
        jButtonEliminarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarLibActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jLabelLupaLib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N

        jTextFieldBusquedaLibro.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldBusquedaLibro.setText("Buscar titulo");
        jTextFieldBusquedaLibro.setBorder(null);
        jTextFieldBusquedaLibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldBusquedaLibroFocusLost(evt);
            }
        });
        jTextFieldBusquedaLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldBusquedaLibroMousePressed(evt);
            }
        });
        jTextFieldBusquedaLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBusquedaLibroKeyReleased(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));

        jTableTablaLibros.setAutoCreateRowSorter(true);
        jTableTablaLibros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));
        jTableTablaLibros.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTableTablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Fecha Publicacion", "Edicion", "Nombre Autor", "Apellido Autor", "Categoria", "Stock", "Disponibilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTablaLibros.setComponentPopupMenu(jPopupMenu);
        jTableTablaLibros.setGridColor(new java.awt.Color(120, 188, 176));
        jTableTablaLibros.setSelectionBackground(new java.awt.Color(180, 209, 203));
        jTableTablaLibros.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTableTablaLibros.getTableHeader().setResizingAllowed(false);
        jTableTablaLibros.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableTablaLibros);
        if (jTableTablaLibros.getColumnModel().getColumnCount() > 0) {
            jTableTablaLibros.getColumnModel().getColumn(0).setResizable(false);
            jTableTablaLibros.getColumnModel().getColumn(1).setResizable(false);
            jTableTablaLibros.getColumnModel().getColumn(2).setResizable(false);
            jTableTablaLibros.getColumnModel().getColumn(3).setResizable(false);
            jTableTablaLibros.getColumnModel().getColumn(4).setResizable(false);
            jTableTablaLibros.getColumnModel().getColumn(5).setResizable(false);
            jTableTablaLibros.getColumnModel().getColumn(6).setResizable(false);
            jTableTablaLibros.getColumnModel().getColumn(7).setResizable(false);
            jTableTablaLibros.getColumnModel().getColumn(8).setResizable(false);
        }
        jTableTablaLibros.getAccessibleContext().setAccessibleName("");
        jTableTablaLibros.getAccessibleContext().setAccessibleDescription("");

        jLabelTituloTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLabelTituloTabla.setForeground(new java.awt.Color(58, 160, 141));
        jLabelTituloTabla.setText("Libros");

        jComboFiltrarLibros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Código", "Titulo", "Fecha publicación", "Edición", "Nombre del autor", "Apellido del autor", "Categoría", "Stock", "Disponibilidad" }));
        jComboFiltrarLibros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNuevoLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEliminarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelTituloTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelLupaLib)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldBusquedaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelIconFiltro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboFiltrarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelLupaLib)
                            .addComponent(jTextFieldBusquedaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboFiltrarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIconFiltro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNuevoLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTituloTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoLibMouseEntered
        this.jButtonNuevoLib.setText("NUEVO");
    }//GEN-LAST:event_jButtonNuevoLibMouseEntered

    private void jButtonNuevoLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoLibMouseExited
        this.jButtonNuevoLib.setText("nuevo");
    }//GEN-LAST:event_jButtonNuevoLibMouseExited

    private void jButtonNuevoLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoLibActionPerformed
        insertar.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoLibActionPerformed

    private void jButtonActualizarLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarLibMouseEntered
        this.jButtonActualizarLib.setText("ACTUALIZAR");
    }//GEN-LAST:event_jButtonActualizarLibMouseEntered

    private void jButtonActualizarLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarLibMouseExited
        this.jButtonActualizarLib.setText("actualizar");
    }//GEN-LAST:event_jButtonActualizarLibMouseExited

    private void jButtonActualizarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarLibActionPerformed
        actualizar.setVisible(true);
    }//GEN-LAST:event_jButtonActualizarLibActionPerformed

    private void jButtonEliminarLibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarLibMouseEntered
        this.jButtonEliminarLib.setText("ELIMINAR");
    }//GEN-LAST:event_jButtonEliminarLibMouseEntered

    private void jButtonEliminarLibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarLibMouseExited
        this.jButtonEliminarLib.setText("eliminar");
    }//GEN-LAST:event_jButtonEliminarLibMouseExited

    private void jButtonEliminarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarLibActionPerformed
        eliminar.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarLibActionPerformed

    private void jTextFieldBusquedaLibroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaLibroFocusLost
        if(jTextFieldBusquedaLibro.getText().equals("")||this.jTextFieldBusquedaLibro.getText().equals(" ")){
            this.jTextFieldBusquedaLibro.setText("Buscar titulo");
        }
    }//GEN-LAST:event_jTextFieldBusquedaLibroFocusLost

    private void jTextFieldBusquedaLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaLibroMousePressed
        if(jTextFieldBusquedaLibro.getText().equalsIgnoreCase("Buscar titulo")){
            jTextFieldBusquedaLibro.setText("");
        }
    }//GEN-LAST:event_jTextFieldBusquedaLibroMousePressed

    private void jTextFieldBusquedaLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaLibroKeyReleased
        switch(this.jComboFiltrarLibros.getSelectedIndex()){
            case 0:{this.Parametro_de_busqueda_libro="nombre_libro"; break;}
            case 1:{this.Parametro_de_busqueda_libro="codigo_libro";break;}
            case 2:{this.Parametro_de_busqueda_libro="nombre_libro";break;}
            case 3:{this.Parametro_de_busqueda_libro="fecha_publicacion";break;}
            case 4:{this.Parametro_de_busqueda_libro="edicion";break;}
            case 5:{this.Parametro_de_busqueda_libro="nombre_autor";break;}
            case 6:{this.Parametro_de_busqueda_libro="apellido_autor";break;}
            case 7:{this.Parametro_de_busqueda_libro="categoria";break;}
            case 8:{this.Parametro_de_busqueda_libro="stock";break;}
            case 9:{this.Parametro_de_busqueda_libro="disponibilidad";break;}
        }
        String Busqueda=this.jTextFieldBusquedaLibro.getText();
        this.SQL="SELECT * FROM " +selectTabla+ " WHERE " + Parametro_de_busqueda_libro + " like '%" + Busqueda+ "%'";
        inter.busquedaDespliegue(this.jTableTablaLibros,this.selectTabla,this.SQL);
    }//GEN-LAST:event_jTextFieldBusquedaLibroKeyReleased

    private void jMenuIteminsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIteminsertarActionPerformed
        insertar.setVisible(true);
    }//GEN-LAST:event_jMenuIteminsertarActionPerformed

    private void jMenuItemActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemActualizarActionPerformed
        int seleccion=jTableTablaLibros.getSelectedRow();
        if(seleccion>0){
            String codigo=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 0));
            String titulo=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 1));
            String FechPublicacion=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 2));
            String Edicion=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 3));
            String NomAutor=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 4));
            String ApeAutor=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 5));
            String categoria=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 6));
            String stock=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 7));
            JFLibroActualizar.jTFBuscar_ActualizarLib.setText(codigo);
            JFLibroActualizar.jTFCodigo_ActualizarLib.setText(codigo);
            JFLibroActualizar.jTFTituloLib.setText(titulo);
            JFLibroActualizar.jTFFechaPublicacionLib.setText(FechPublicacion);
            JFLibroActualizar.jTFEdicionLib.setText(Edicion);
            JFLibroActualizar.jTFNombreALib.setText(NomAutor);
            JFLibroActualizar.jTFApellidoALib.setText(ApeAutor);
            JFLibroActualizar.jTFCategoriaLib.setText(categoria);
            JFLibroActualizar.jTFStockLib.setText(stock);
            actualizar.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemActualizarActionPerformed

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
        int seleccion=jTableTablaLibros.getSelectedRow();
        if(seleccion>0){
            String codigo=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 0));
            String titulo=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 1));
            String FechPublicacion=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 2));
            String Edicion=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 3));
            String NomAutor=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 4));
            String ApeAutor=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 5));
            String categoria=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 6));
            String stock=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 7));
            JFLibroEliminar.jTFBuscar_ActualizarLib.setText(codigo);
            JFLibroEliminar.jTFCodigo_EliminarLib.setText(codigo);
            JFLibroEliminar.jTFTitulo_EliminarLib.setText(titulo);
            JFLibroEliminar.jTFFechaPublicacionLib.setText(FechPublicacion);
            JFLibroEliminar.jTFEdicionLib.setText(Edicion);
            JFLibroEliminar.jTFNombreALib.setText(NomAutor);
            JFLibroEliminar.jTFApellidoALib.setText(ApeAutor);
            JFLibroEliminar.jTFCategoriaLib.setText(categoria);
            JFLibroEliminar.jTFStockLib.setText(stock);
            eliminar.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

    private void jMenuItemPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrestarActionPerformed
        int seleccion=jTableTablaLibros.getSelectedRow();
        if(seleccion>0){
            String codigo=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 0));
            String titulo=String.valueOf(jTableTablaLibros.getValueAt(seleccion, 1));
            JFPrestamoInsentar.jTextFieldCodLib.setText(codigo);
            JFPrestamoInsentar.jTFCod_NomLibro.setText(codigo);
            JFPrestamoInsentar.jTextFieldLibro.setText(titulo);
            prestar.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemPrestarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarLib;
    private javax.swing.JButton jButtonEliminarLib;
    private javax.swing.JButton jButtonNuevoLib;
    private javax.swing.JComboBox<String> jComboFiltrarLibros;
    private javax.swing.JLabel jLabelIconFiltro;
    private javax.swing.JLabel jLabelLupaLib;
    private javax.swing.JLabel jLabelTituloTabla;
    private javax.swing.JMenuItem jMenuItemActualizar;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemPrestar;
    private javax.swing.JMenuItem jMenuIteminsertar;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableTablaLibros;
    private javax.swing.JTextField jTextFieldBusquedaLibro;
    // End of variables declaration//GEN-END:variables
}