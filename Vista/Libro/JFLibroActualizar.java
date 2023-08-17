package Vista.Libro;
import Negocio.Comprobaciones;
import Negocio.Interaccion;
import Negocio.Imagenes;
import Vista.Estructura.JFLogin;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class JFLibroActualizar extends javax.swing.JFrame {
    int x;
    int y;
    Imagenes imagen=new Imagenes();
    ImageIcon ICONERROR = imagen.getICONERROR();
    ImageIcon ICONCORRECTO = imagen.getICONCORRECTO();
    ImageIcon ICONREVISION = imagen.getICONREVISION();
    ImageIcon ICONCANCELAR=imagen.getICONCANCELAR();
    ImageIcon ICONACEPTAR=imagen.getICONACEPTAR();
    private String SQL;
    private String tablaActualizar="Libro";
    Interaccion atributos=new Interaccion();
    Comprobaciones name = new Comprobaciones();
    public JFLibroActualizar() {
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
        jBActualizar_libro = new javax.swing.JButton();
        jPDatosLibroActualizar = new javax.swing.JPanel();
        jLabelCodigoLib = new javax.swing.JLabel();
        jTFCodigo_ActualizarLib = new javax.swing.JTextField();
        jChBTituloLib = new javax.swing.JCheckBox();
        jTFTituloLib = new javax.swing.JTextField();
        jChBFechaPubliLib = new javax.swing.JCheckBox();
        jTFFechaPublicacionLib = new javax.swing.JTextField();
        jChBEdicionLib = new javax.swing.JCheckBox();
        jTFEdicionLib = new javax.swing.JTextField();
        jChBNombreALib = new javax.swing.JCheckBox();
        jTFNombreALib = new javax.swing.JTextField();
        jChBApellidoALib = new javax.swing.JCheckBox();
        jTFApellidoALib = new javax.swing.JTextField();
        jChBCategoriaLib = new javax.swing.JCheckBox();
        jTFCategoriaLib = new javax.swing.JTextField();
        jChBStockLib = new javax.swing.JCheckBox();
        jTFStockLib = new javax.swing.JTextField();
        jPanelLibroCodigo = new javax.swing.JPanel();
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
        jLabelTitulo.setText("Actualizar Libro");
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

        jBActualizar_libro.setBackground(new java.awt.Color(255, 255, 255));
        jBActualizar_libro.setForeground(new java.awt.Color(58, 160, 141));
        jBActualizar_libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar 32.png"))); // NOI18N
        jBActualizar_libro.setText("guardar");
        jBActualizar_libro.setBorder(null);
        jBActualizar_libro.setBorderPainted(false);
        jBActualizar_libro.setHideActionText(true);
        jBActualizar_libro.setMaximumSize(new java.awt.Dimension(89, 32));
        jBActualizar_libro.setMinimumSize(new java.awt.Dimension(89, 32));
        jBActualizar_libro.setPreferredSize(new java.awt.Dimension(89, 32));
        jBActualizar_libro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar 32.png"))); // NOI18N
        jBActualizar_libro.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar 32.png"))); // NOI18N
        jBActualizar_libro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBActualizar_libroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBActualizar_libroMouseExited(evt);
            }
        });
        jBActualizar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizar_libroActionPerformed(evt);
            }
        });
        getContentPane().add(jBActualizar_libro);
        jBActualizar_libro.setBounds(70, 420, 110, 40);

        jPDatosLibroActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jPDatosLibroActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos a Actualizar"));

        jLabelCodigoLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCodigoLib.setText("Codigo");

        jTFCodigo_ActualizarLib.setEditable(false);
        jTFCodigo_ActualizarLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBTituloLib.setBackground(new java.awt.Color(255, 255, 255));
        jChBTituloLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBTituloLib.setText("Titulo");
        jChBTituloLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBTituloLibActionPerformed(evt);
            }
        });

        jTFTituloLib.setEditable(false);
        jTFTituloLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBFechaPubliLib.setBackground(new java.awt.Color(255, 255, 255));
        jChBFechaPubliLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBFechaPubliLib.setText("Fecha Publicación");
        jChBFechaPubliLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBFechaPubliLibActionPerformed(evt);
            }
        });

        jTFFechaPublicacionLib.setEditable(false);
        jTFFechaPublicacionLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFFechaPublicacionLib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFFechaPublicacionLibKeyReleased(evt);
            }
        });

        jChBEdicionLib.setBackground(new java.awt.Color(255, 255, 255));
        jChBEdicionLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBEdicionLib.setText("Edicion");
        jChBEdicionLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBEdicionLibActionPerformed(evt);
            }
        });

        jTFEdicionLib.setEditable(false);
        jTFEdicionLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBNombreALib.setBackground(new java.awt.Color(255, 255, 255));
        jChBNombreALib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBNombreALib.setText("Nombre.Autor");
        jChBNombreALib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBNombreALibActionPerformed(evt);
            }
        });

        jTFNombreALib.setEditable(false);
        jTFNombreALib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBApellidoALib.setBackground(new java.awt.Color(255, 255, 255));
        jChBApellidoALib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBApellidoALib.setText("Apellido.Autor");
        jChBApellidoALib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBApellidoALibActionPerformed(evt);
            }
        });

        jTFApellidoALib.setEditable(false);
        jTFApellidoALib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBCategoriaLib.setBackground(new java.awt.Color(255, 255, 255));
        jChBCategoriaLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBCategoriaLib.setText("Categoria");
        jChBCategoriaLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBCategoriaLibActionPerformed(evt);
            }
        });

        jTFCategoriaLib.setEditable(false);
        jTFCategoriaLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jChBStockLib.setBackground(new java.awt.Color(255, 255, 255));
        jChBStockLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jChBStockLib.setText("Stock");
        jChBStockLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBStockLibActionPerformed(evt);
            }
        });

        jTFStockLib.setEditable(false);
        jTFStockLib.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTFStockLib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFStockLibKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPDatosLibroActualizarLayout = new javax.swing.GroupLayout(jPDatosLibroActualizar);
        jPDatosLibroActualizar.setLayout(jPDatosLibroActualizarLayout);
        jPDatosLibroActualizarLayout.setHorizontalGroup(
            jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLibroActualizarLayout.createSequentialGroup()
                        .addComponent(jChBStockLib, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jChBNombreALib, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChBApellidoALib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNombreALib)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLibroActualizarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTFFechaPublicacionLib, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFApellidoALib))
                        .addContainerGap())
                    .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                        .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                                        .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jChBTituloLib, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelCodigoLib, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFCodigo_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFTituloLib, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jChBFechaPubliLib, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jChBEdicionLib, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFStockLib, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPDatosLibroActualizarLayout.createSequentialGroup()
                                .addComponent(jChBCategoriaLib, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFCategoriaLib)))
                        .addGap(10, 10, 10))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLibroActualizarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTFEdicionLib, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPDatosLibroActualizarLayout.setVerticalGroup(
            jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLibroActualizarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigoLib))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBTituloLib)
                    .addComponent(jTFTituloLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFFechaPublicacionLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBFechaPubliLib))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFEdicionLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBEdicionLib))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBNombreALib)
                    .addComponent(jTFNombreALib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidoALib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBApellidoALib))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCategoriaLib, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChBCategoriaLib, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDatosLibroActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChBStockLib)
                    .addComponent(jTFStockLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPDatosLibroActualizar);
        jPDatosLibroActualizar.setBounds(10, 100, 360, 290);

        jPanelLibroCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLibroCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Libro"));

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

        javax.swing.GroupLayout jPanelLibroCodigoLayout = new javax.swing.GroupLayout(jPanelLibroCodigo);
        jPanelLibroCodigo.setLayout(jPanelLibroCodigoLayout);
        jPanelLibroCodigoLayout.setHorizontalGroup(
            jPanelLibroCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLibroCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxFiltrarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFBuscar_ActualizarLib, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelLibroCodigoLayout.setVerticalGroup(
            jPanelLibroCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLibroCodigoLayout.createSequentialGroup()
                .addGroup(jPanelLibroCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar_ActualizarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFiltrarLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelLibroCodigo);
        jPanelLibroCodigo.setBounds(10, 40, 360, 50);

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
        int seleccion=JOptionPane.showConfirmDialog(null,"¿Desea cancelar el ingreso?"+"\n     -Los datos ingresados no seran guardados",
            "Canceclar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,ICONCANCELAR);
        if(seleccion==0){this.setVisible(false);}
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBActualizar_libroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActualizar_libroMouseEntered
        this.jBActualizar_libro.setText("GUARDAR");
    }//GEN-LAST:event_jBActualizar_libroMouseEntered

    private void jBActualizar_libroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActualizar_libroMouseExited
        this.jBActualizar_libro.setText("guardar");
    }//GEN-LAST:event_jBActualizar_libroMouseExited

    private void jBActualizar_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizar_libroActionPerformed
        if(this.jTFBuscar_ActualizarLib.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Advertencia", HEIGHT, ICONREVISION);
        }else{
            ArrayList <String> atributosActualizar = new ArrayList<>();
            String parametroBusqueda =this.jTFCodigo_ActualizarLib.getText();
            if(this.jChBTituloLib.isSelected()){atributosActualizar.add("nombre_libro='"+jTFTituloLib.getText()+"'");}
            if(this.jChBFechaPubliLib.isSelected()){atributosActualizar.add("fecha_publicacion='"+jTFFechaPublicacionLib.getText()+"'");}
            if(this.jChBEdicionLib.isSelected()){atributosActualizar.add("edicion='"+jTFEdicionLib.getText()+"'");}
            if(this.jChBNombreALib.isSelected()){atributosActualizar.add("nombre_autor='"+jTFNombreALib.getText()+"'");}
            if(this.jChBApellidoALib.isSelected()){atributosActualizar.add("apellido_autor='"+jTFApellidoALib.getText()+"'");}
            if(this.jChBCategoriaLib.isSelected()){atributosActualizar.add("categoria='"+jTFCategoriaLib.getText()+"'");}
            if(this.jChBStockLib.isSelected()){atributosActualizar.add("stock="+jTFStockLib.getText());}
            if(this.jChBStockLib.isSelected()){atributosActualizar.add("disponibilidad="+jTFStockLib.getText());}
            String parametroCambio=atributos.prepararActualizar(atributosActualizar);
            this.SQL="UPDATE "+tablaActualizar+" SET "+parametroCambio+" WHERE codigo_libro LIKE "+ parametroBusqueda;
            if(atributos.actualizarEliminarTablas(SQL)){
                JOptionPane.showMessageDialog(null, "Datos Actualizados correctamente", "RESULTADO", HEIGHT, ICONCORRECTO);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar actualizar los datos", "RESULTADO", HEIGHT, ICONERROR);
            }
        }
    }//GEN-LAST:event_jBActualizar_libroActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX-x,posY-y);// TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jChBTituloLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBTituloLibActionPerformed
        if(jChBTituloLib.isSelected()){this.jTFTituloLib.setEditable(true);}
        else{this.jTFTituloLib.setEditable(false);}
    }//GEN-LAST:event_jChBTituloLibActionPerformed

    private void jChBFechaPubliLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBFechaPubliLibActionPerformed
        if(jChBFechaPubliLib.isSelected()){this.jTFFechaPublicacionLib.setEditable(true);}
        else{this.jTFFechaPublicacionLib.setEditable(false);}
    }//GEN-LAST:event_jChBFechaPubliLibActionPerformed

    private void jChBEdicionLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBEdicionLibActionPerformed
        if(jChBEdicionLib.isSelected()){this.jTFEdicionLib.setEditable(true);}
        else{this.jTFEdicionLib.setEditable(false);}
    }//GEN-LAST:event_jChBEdicionLibActionPerformed

    private void jChBCategoriaLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBCategoriaLibActionPerformed
        if(jChBCategoriaLib.isSelected()){this.jTFCategoriaLib.setEditable(true);}
        else{this.jTFCategoriaLib.setEditable(false);}
    }//GEN-LAST:event_jChBCategoriaLibActionPerformed

    private void jChBStockLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBStockLibActionPerformed
        if(jChBStockLib.isSelected()){this.jTFStockLib.setEditable(true);}
        else{this.jTFStockLib.setEditable(false);}
    }//GEN-LAST:event_jChBStockLibActionPerformed

    private void jChBNombreALibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBNombreALibActionPerformed
        if(this.jChBNombreALib.isSelected()){this.jTFNombreALib.setEditable(true);}
        else{this.jTFNombreALib.setEditable(false);}
    }//GEN-LAST:event_jChBNombreALibActionPerformed

    private void jTFBuscar_ActualizarLibKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarLibKeyTyped
        char variable=evt.getKeyChar();
        int select=this.jComboBoxFiltrarLib.getSelectedIndex();
        switch(select){
            case 0:
            {
                if(Character.isLetter(variable)){
                    getToolkit().beep();
                    evt.consume();
                    JOptionPane.showMessageDialog(null,"Ingrese unicamente numeros", "ADVERTENCIA", HEIGHT, ICONCANCELAR);
                }
                break;
            }
        }
    }//GEN-LAST:event_jTFBuscar_ActualizarLibKeyTyped

    private void jChBApellidoALibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBApellidoALibActionPerformed
        if(jChBApellidoALib.isSelected()){this.jTFApellidoALib.setEditable(true);}
        else{this.jTFApellidoALib.setEditable(false);}
    }//GEN-LAST:event_jChBApellidoALibActionPerformed

    private void jTFStockLibKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFStockLibKeyTyped
        char variable=evt.getKeyChar();
        if(Character.isLetter(variable)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Ingrese unicamente numeros","ADVERTENCIA", HEIGHT, ICONCANCELAR);
        }
    }//GEN-LAST:event_jTFStockLibKeyTyped

    private void jTFBuscar_ActualizarLibKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscar_ActualizarLibKeyReleased
        String datoBusqueda=this.jTFBuscar_ActualizarLib.getText();
        int select=jComboBoxFiltrarLib.getSelectedIndex();
        switch(select){
            case 0:{
                this.SQL="Select count(*) from Libro where codigo_libro like '%"+datoBusqueda+"%'";
                if(atributos.busquedaCod(tablaActualizar, SQL,"count(*)")<1){
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "El libro al que hace referencia no existe", "ADVERTENCIA", HEIGHT, ICONCANCELAR);
                }else{
                    this.SQL="SELECT * FROM " + tablaActualizar + " WHERE codigo_libro like '%"+datoBusqueda+"%';";
                    atributos.despliegueFields(SQL,tablaActualizar,jTFCodigo_ActualizarLib,jTFTituloLib,jTFFechaPublicacionLib,
                        jTFEdicionLib,jTFNombreALib,jTFApellidoALib,jTFCategoriaLib,jTFStockLib,"actualizar");
                }
                break;
            }
            case 1:{
                this.SQL="Select count(*) from Libro where nombre_libro like '%"+datoBusqueda+"%';";
                if(atributos.busquedaCod(tablaActualizar,SQL,"count(*)")<1){
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null,"El libro al que hace referencia no existe", "ADVERTENCIA", HEIGHT, ICONCANCELAR);
                }else{
                    this.SQL="SELECT codigo_libro FROM Libro where nombre_libro like " + "'%"+datoBusqueda+"%';";
                    int codLib=atributos.busquedaCod(tablaActualizar, SQL,"codigo_libro");
                    datoBusqueda="'%" + codLib + "%'";
                    this.SQL="SELECT * FROM Libro WHERE codigo_libro like "+datoBusqueda;
                    atributos.despliegueFields(SQL,tablaActualizar,jTFCodigo_ActualizarLib,jTFTituloLib,jTFFechaPublicacionLib,
                    jTFEdicionLib,jTFNombreALib,jTFApellidoALib,jTFCategoriaLib,jTFStockLib,"actualizar");
                }
                break;
            }
        }         
    }//GEN-LAST:event_jTFBuscar_ActualizarLibKeyReleased

    private void jTFFechaPublicacionLibKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFechaPublicacionLibKeyReleased
        String fecha=this.jTFFechaPublicacionLib.getText();
        if(name.comprobarExpresionRegular(fecha, "formatoFecha")==true){
            if(name.comprobarExpresionRegular(fecha, "fecha")==false){
                getToolkit().beep();
                JOptionPane.showMessageDialog(null,"Formato de fecha erroneo. "+ "\n     -Ingrese el formato adecuado (dd/mm/aaaa)","ERROR",HEIGHT,ICONCANCELAR);
                this.jTFFechaPublicacionLib.setText("");
                this.jTFFechaPublicacionLib.requestFocus();
            }
        }
    }//GEN-LAST:event_jTFFechaPublicacionLibKeyReleased

    public void limpiarCampos(){
        this.jTFBuscar_ActualizarLib.setText("");
        this.jTFCodigo_ActualizarLib.setText("");
        this.jTFTituloLib.setText("");
        this.jTFFechaPublicacionLib.setText("");
        this.jTFEdicionLib.setText("");
        this.jTFNombreALib.setText("");
        this.jTFApellidoALib.setText("");
        this.jTFCategoriaLib.setText("");
        this.jTFStockLib.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar_libro;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonSalirIcon;
    private javax.swing.JCheckBox jChBApellidoALib;
    private javax.swing.JCheckBox jChBCategoriaLib;
    private javax.swing.JCheckBox jChBEdicionLib;
    private javax.swing.JCheckBox jChBFechaPubliLib;
    private javax.swing.JCheckBox jChBNombreALib;
    private javax.swing.JCheckBox jChBStockLib;
    private javax.swing.JCheckBox jChBTituloLib;
    private javax.swing.JComboBox<String> jComboBoxFiltrarLib;
    private javax.swing.JLabel jLabelCodigoLib;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPDatosLibroActualizar;
    private javax.swing.JPanel jPanelLibroCodigo;
    public static javax.swing.JTextField jTFApellidoALib;
    public static javax.swing.JTextField jTFBuscar_ActualizarLib;
    public static javax.swing.JTextField jTFCategoriaLib;
    public static javax.swing.JTextField jTFCodigo_ActualizarLib;
    public static javax.swing.JTextField jTFEdicionLib;
    public static javax.swing.JTextField jTFFechaPublicacionLib;
    public static javax.swing.JTextField jTFNombreALib;
    public static javax.swing.JTextField jTFStockLib;
    public static javax.swing.JTextField jTFTituloLib;
    // End of variables declaration//GEN-END:variables
}