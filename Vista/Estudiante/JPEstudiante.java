package Vista.Estudiante;
import Negocio.Comprobaciones;
import Negocio.Interaccion;
import Vista.Prestamo.JFPrestamoInsentar;
import java.awt.Color;
import java.awt.Font;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JPEstudiante extends javax.swing.JPanel {
    Interaccion atributos = new Interaccion();
    JFEstudianteInsentar insertar = new JFEstudianteInsentar();
    JFEstudianteActualizar actualizar = new JFEstudianteActualizar();
    JFEstudianteEliminar eliminar = new JFEstudianteEliminar();
    JFPrestamoInsentar prestar = new JFPrestamoInsentar();
    Comprobaciones name= new Comprobaciones();
    private String selectTabla="Estudiante";
    private String SQL;
    public JPEstudiante(){
        initComponents();
        jTableTablaEstudiantes.getTableHeader().setBackground(new Color(58,160,141));
        jTableTablaEstudiantes.getTableHeader().setFont(new Font("Segoe UI Symbol",Font.BOLD,12));
        jTableTablaEstudiantes.getTableHeader().setForeground(Color.WHITE);
        jComboBoxFiltrarEstudiante.setBackground(Color.WHITE);
//        ((DefaultTableCellHeaderRenderer)
//            jTableTablaEstudiantes.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.LEFT);
        this.SQL="select * from Estudiante";
        atributos.busquedaDespliegue(jTableTablaEstudiantes, selectTabla, SQL);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuVariables = new javax.swing.JPopupMenu();
        jMenuItemInsertar = new javax.swing.JMenuItem();
        jMenuItemActualizar = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jMenuItemPrestar = new javax.swing.JMenuItem();
        jLabelIconFiltro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jComboBoxFiltrarEstudiante = new javax.swing.JComboBox<>();
        jLabelLupaEstu = new javax.swing.JLabel();
        jButtonNuevoEstu = new javax.swing.JButton();
        jButtonActualizarEstu = new javax.swing.JButton();
        jButtonEliminarEstu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablaEstudiantes = new javax.swing.JTable();
        jLabelTituloTabla = new javax.swing.JLabel();

        jMenuItemInsertar.setText("Insertar");
        jMenuItemInsertar.setContentAreaFilled(false);
        jMenuItemInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInsertarActionPerformed(evt);
            }
        });
        jPopupMenuVariables.add(jMenuItemInsertar);

        jMenuItemActualizar.setText("Actualizar");
        jMenuItemActualizar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(58, 160, 141)));
        jMenuItemActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemActualizarActionPerformed(evt);
            }
        });
        jPopupMenuVariables.add(jMenuItemActualizar);

        jMenuItemEliminar.setText("Eliminar");
        jMenuItemEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(58, 160, 141), 1, true));
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        jPopupMenuVariables.add(jMenuItemEliminar);

        jMenuItemPrestar.setText("Prestar");
        jMenuItemPrestar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(58, 160, 141)));
        jMenuItemPrestar.setContentAreaFilled(false);
        jMenuItemPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrestarActionPerformed(evt);
            }
        });
        jPopupMenuVariables.add(jMenuItemPrestar);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(970, 630));
        setMinimumSize(new java.awt.Dimension(970, 630));
        setPreferredSize(new java.awt.Dimension(970, 630));

        jLabelIconFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar 24.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jTextFieldBusqueda.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldBusqueda.setText("Buscar nombre");
        jTextFieldBusqueda.setBorder(null);
        jTextFieldBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldBusquedaFocusLost(evt);
            }
        });
        jTextFieldBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldBusquedaMousePressed(evt);
            }
        });
        jTextFieldBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBusquedaActionPerformed(evt);
            }
        });
        jTextFieldBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBusquedaKeyReleased(evt);
            }
        });

        jComboBoxFiltrarEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Código del estudiante", "Nombre del estudiante", "Apellido del estudiante", "Celular", "Sector", "Facultad" }));
        jComboBoxFiltrarEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));
        jComboBoxFiltrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFiltrarEstudianteActionPerformed(evt);
            }
        });

        jLabelLupaEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon buscar 24.png"))); // NOI18N

        jButtonNuevoEstu.setBackground(new java.awt.Color(58, 160, 141));
        jButtonNuevoEstu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon estudiante 32.png"))); // NOI18N
        jButtonNuevoEstu.setText("nuevo");
        jButtonNuevoEstu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonNuevoEstu.setBorderPainted(false);
        jButtonNuevoEstu.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonNuevoEstu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon nuevo selected 32.png"))); // NOI18N
        jButtonNuevoEstu.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon nuevo selected 32.png"))); // NOI18N
        jButtonNuevoEstu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNuevoEstuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNuevoEstuMouseExited(evt);
            }
        });
        jButtonNuevoEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoEstuActionPerformed(evt);
            }
        });

        jButtonActualizarEstu.setBackground(new java.awt.Color(58, 160, 141));
        jButtonActualizarEstu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizarEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon actualizar.png"))); // NOI18N
        jButtonActualizarEstu.setText("actualizar");
        jButtonActualizarEstu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonActualizarEstu.setBorderPainted(false);
        jButtonActualizarEstu.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonActualizarEstu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon actualizar 32 selected.png"))); // NOI18N
        jButtonActualizarEstu.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon actualizar 32 selected.png"))); // NOI18N
        jButtonActualizarEstu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarEstuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarEstuMouseExited(evt);
            }
        });
        jButtonActualizarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarEstuActionPerformed(evt);
            }
        });

        jButtonEliminarEstu.setBackground(new java.awt.Color(58, 160, 141));
        jButtonEliminarEstu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarEstu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon eliminar estudiante 32.png"))); // NOI18N
        jButtonEliminarEstu.setText("eliminar");
        jButtonEliminarEstu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonEliminarEstu.setBorderPainted(false);
        jButtonEliminarEstu.setPreferredSize(new java.awt.Dimension(73, 40));
        jButtonEliminarEstu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon eliminar selected 32.png"))); // NOI18N
        jButtonEliminarEstu.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon eliminar selected 32.png"))); // NOI18N
        jButtonEliminarEstu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarEstuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarEstuMouseExited(evt);
            }
        });
        jButtonEliminarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarEstuActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));

        jTableTablaEstudiantes.setAutoCreateRowSorter(true);
        jTableTablaEstudiantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 160, 141)));
        jTableTablaEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTableTablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Celular", "Sector", "Facultad", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTablaEstudiantes.setComponentPopupMenu(jPopupMenuVariables);
        jTableTablaEstudiantes.setGridColor(new java.awt.Color(120, 188, 176));
        jTableTablaEstudiantes.setSelectionBackground(new java.awt.Color(180, 209, 203));
        jTableTablaEstudiantes.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTableTablaEstudiantes.getTableHeader().setResizingAllowed(false);
        jTableTablaEstudiantes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableTablaEstudiantes);
        if (jTableTablaEstudiantes.getColumnModel().getColumnCount() > 0) {
            jTableTablaEstudiantes.getColumnModel().getColumn(0).setResizable(false);
            jTableTablaEstudiantes.getColumnModel().getColumn(1).setResizable(false);
            jTableTablaEstudiantes.getColumnModel().getColumn(2).setResizable(false);
            jTableTablaEstudiantes.getColumnModel().getColumn(3).setResizable(false);
            jTableTablaEstudiantes.getColumnModel().getColumn(4).setResizable(false);
            jTableTablaEstudiantes.getColumnModel().getColumn(5).setResizable(false);
            jTableTablaEstudiantes.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabelTituloTabla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLabelTituloTabla.setForeground(new java.awt.Color(58, 160, 141));
        jLabelTituloTabla.setText("Estudiantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNuevoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonActualizarEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminarEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLupaEstu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBusqueda))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelIconFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFiltrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelLupaEstu)
                            .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIconFiltro)
                            .addComponent(jComboBoxFiltrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNuevoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonActualizarEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminarEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTituloTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoEstuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoEstuMouseEntered
        this.jButtonNuevoEstu.setText("NUEVO");
    }//GEN-LAST:event_jButtonNuevoEstuMouseEntered

    private void jButtonNuevoEstuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevoEstuMouseExited
        this.jButtonNuevoEstu.setText("nuevo");
    }//GEN-LAST:event_jButtonNuevoEstuMouseExited

    private void jButtonNuevoEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoEstuActionPerformed
        insertar.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoEstuActionPerformed

    private void jButtonActualizarEstuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarEstuMouseEntered
        this.jButtonActualizarEstu.setText("ACTUALIZAR");
    }//GEN-LAST:event_jButtonActualizarEstuMouseEntered

    private void jButtonActualizarEstuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarEstuMouseExited
        this.jButtonActualizarEstu.setText("actualizar");
    }//GEN-LAST:event_jButtonActualizarEstuMouseExited

    private void jButtonActualizarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarEstuActionPerformed
        actualizar.setVisible(true);
    }//GEN-LAST:event_jButtonActualizarEstuActionPerformed

    private void jButtonEliminarEstuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarEstuMouseEntered
        this.jButtonEliminarEstu.setText("ELIMINAR");
    }//GEN-LAST:event_jButtonEliminarEstuMouseEntered

    private void jButtonEliminarEstuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarEstuMouseExited
        this.jButtonEliminarEstu.setText("eliminar");
    }//GEN-LAST:event_jButtonEliminarEstuMouseExited

    private void jButtonEliminarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarEstuActionPerformed
        eliminar.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarEstuActionPerformed

    private void jTextFieldBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaMousePressed
        if(jTextFieldBusqueda.getText().equalsIgnoreCase("Buscar nombre")){jTextFieldBusqueda.setText("");}
    }//GEN-LAST:event_jTextFieldBusquedaMousePressed

    private void jTextFieldBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaFocusLost
        if(jTextFieldBusqueda.getText().isEmpty()){this.jTextFieldBusqueda.setText("Buscar nombre");}
    }//GEN-LAST:event_jTextFieldBusquedaFocusLost

    private void jTextFieldBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaKeyReleased
        String Parametro_de_busqueda_estudiante="nombre_estudiante";
        String Busqueda=this.jTextFieldBusqueda.getText();
        switch(this.jComboBoxFiltrarEstudiante.getSelectedIndex()){
            case 0:
            {
                if(name.comprobarExpresionRegular(Busqueda,"nombre")==true){
                    name = new Comprobaciones(Busqueda);
                    String nombre=name.getNombre();
                    String apellido=name.getApellido();
                    this.SQL="SELECT codigo_estudiante FROM Estudiante "+ 
                            "where nombre_estudiante like " + "'%"+nombre+"%' "+ 
                            "and apellido_estudiante like '%"+apellido+"%';";
                    Parametro_de_busqueda_estudiante="codigo_estudiante"; 
                    Busqueda=atributos.busquedaCod(selectTabla, SQL,"codigo_estudiante")+"";
                }
                break;
            }
            case 1:{Parametro_de_busqueda_estudiante="codigo_estudiante";break;}
            case 2:{Parametro_de_busqueda_estudiante="nombre_estudiante";break;}
            case 3:{Parametro_de_busqueda_estudiante="apellido_estudiante";break;}
            case 4:{Parametro_de_busqueda_estudiante="celular_estudiante";break;}
            case 5:{Parametro_de_busqueda_estudiante="sector";break;}
            case 6:{Parametro_de_busqueda_estudiante="facultad";break;}
        }
        this.SQL="SELECT * FROM " +selectTabla+ " WHERE " + Parametro_de_busqueda_estudiante + " like '%" + Busqueda+ "%'";
        atributos.busquedaDespliegue(this.jTableTablaEstudiantes,this.selectTabla,this.SQL);
    }//GEN-LAST:event_jTextFieldBusquedaKeyReleased

    private void jMenuItemActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemActualizarActionPerformed
        int seleccion=jTableTablaEstudiantes.getSelectedRow();
        if(seleccion>0){
            String codigo=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 0));
            String nombre=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 1));
            String apellido=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 2));
            String celular=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 3));
            String sector=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 4));
            String facultad=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 5));
            String correo=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 6));
            JFEstudianteActualizar.jTFBuscar_ActualizarEst.setText(codigo);
            JFEstudianteActualizar.jTFCodigo_ActualizarEst.setText(codigo);
            JFEstudianteActualizar.jTFNombres_ActualizarEst.setText(nombre);
            JFEstudianteActualizar.jTFApellidos_ActualizarEst.setText(apellido);
            JFEstudianteActualizar.jTFCelular_ActualizarEst.setText(celular);
            JFEstudianteActualizar.jTFSector_ActualizarEst.setText(sector);
            JFEstudianteActualizar.jTFFacultad_ActualizarEst.setText(facultad);
            JFEstudianteActualizar.jTFCorreo_ActualizarEst.setText(correo);
            actualizar.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemActualizarActionPerformed

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
        int seleccion=jTableTablaEstudiantes.getSelectedRow();
        if(seleccion>0){
            String codigo=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 0));
            String nombre=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 1));
            String apellido=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 2));
            String celular=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 3));
            String sector=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 4));
            String facultad=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 5));
            String correo=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 6));
            JFEstudianteEliminar.jTFBuscar_EliminarEst.setText(codigo);
            JFEstudianteEliminar.jTFCodigo_EliminarEst.setText(codigo);
            JFEstudianteEliminar.jTFNombres_EliminarEst.setText(nombre);
            JFEstudianteEliminar.jTFApellidos_EliminarEst.setText(apellido);
            JFEstudianteEliminar.jTFCelu_EliminarEst.setText(celular);
            JFEstudianteEliminar.jTFSectorEst_EliminarEst.setText(sector);
            JFEstudianteEliminar.jTFFacultad_EliminarEst.setText(facultad);
            JFEstudianteEliminar.jTFCorreo_EliminarEst.setText(correo);
            eliminar.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

    private void jMenuItemInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInsertarActionPerformed
        insertar.setVisible(true);
    }//GEN-LAST:event_jMenuItemInsertarActionPerformed

    private void jMenuItemPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrestarActionPerformed
        int seleccion=jTableTablaEstudiantes.getSelectedRow();
        if(seleccion>0){
            String codigo=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 0));
            String nombre=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 1));
            String apellido=String.valueOf(jTableTablaEstudiantes.getValueAt(seleccion, 2));
            JFPrestamoInsentar.jTextFieldCodEst.setText(codigo);
            JFPrestamoInsentar.jTFCod_NomEst.setText(codigo);
            JFPrestamoInsentar.jTextFieldNomEst.setText(nombre+" "+apellido);
            prestar.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemPrestarActionPerformed

    private void jTextFieldBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBusquedaActionPerformed

    private void jComboBoxFiltrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFiltrarEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFiltrarEstudianteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarEstu;
    private javax.swing.JButton jButtonEliminarEstu;
    private javax.swing.JButton jButtonNuevoEstu;
    private javax.swing.JComboBox<String> jComboBoxFiltrarEstudiante;
    private javax.swing.JLabel jLabelIconFiltro;
    private javax.swing.JLabel jLabelLupaEstu;
    private javax.swing.JLabel jLabelTituloTabla;
    private javax.swing.JMenuItem jMenuItemActualizar;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemInsertar;
    private javax.swing.JMenuItem jMenuItemPrestar;
    private javax.swing.JPopupMenu jPopupMenuVariables;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTablaEstudiantes;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
