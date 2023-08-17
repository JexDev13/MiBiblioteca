package Negocio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class Interaccion {

    Conexion con1 = new Conexion();
    Connection cn = con1.conectar();
    Connection conection;
    Fecha fecha = new Fecha();
    DefaultTableModel tabla;
    Statement st;
    ResultSet rs;

    //Insertar en tablas. Francisco
    public boolean insertarTabla(String SQL, String tabla, int codigoEstudiante, String nombre, String apellido, int celular,
            String sector, String facultad, String correo, int codigoLibro, String titulo, String fecha1, String edicion,
            String categoria, int stock, int disponibilidad, String fecha2, String codigoPrestamo) {
        try {
            PreparedStatement pps = cn.prepareStatement(SQL);
            if (tabla.equals("Estudiante")) {
                pps.setInt(1, codigoEstudiante);
                pps.setString(2, nombre);
                pps.setString(3, apellido);
                pps.setInt(4, celular);
                pps.setString(5, sector);
                pps.setString(6, facultad);
                pps.setString(7, correo);
                pps.executeUpdate();
                return true;
            }
            if (tabla.equals("Libro")) {
                pps.setInt(1, codigoLibro);
                pps.setString(2, titulo);
                pps.setString(3, fecha1);
                pps.setString(4, edicion);
                pps.setString(5, nombre);
                pps.setString(6, apellido);
                pps.setString(7, categoria);
                pps.setInt(8, stock);
                pps.setInt(9, disponibilidad);
                pps.executeUpdate();
                return true;
            }
            if (tabla.equals("Prestamo")) {
                pps.setString(1, codigoPrestamo);
                pps.setInt(2, codigoLibro);
                pps.setInt(3, codigoEstudiante);
                pps.setString(4, fecha1);
                pps.setString(5, fecha2);
                pps.executeUpdate();
                return true;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //Fin Insertar en tablas.

    //Actualizar y eliminar datos tablas. Jhonathan&&Marlow
    public String prepararActualizar(ArrayList<String> atributosActualizar) 
    {
        String parametroCambio="";
        Iterator i = atributosActualizar.iterator();
        while (i.hasNext()) {
            parametroCambio += i.next() + ",";
        }
        parametroCambio = parametroCambio.substring(0, parametroCambio.length() - 1);
        return parametroCambio;
    }

    public boolean actualizarEliminarTablas(String SQL) {
        int pos;
        try {
            PreparedStatement PS = con1.getConnection().prepareStatement(SQL);
            pos = PS.executeUpdate();
            System.out.println(pos);
            if (pos > 0) {
                return true;
                
            }
        } catch (SQLException e) {
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        
        return false;
    }
    //Fin Actualizar tablas.

    //Buscar, desplegar  y validar tablas. Santiago&&Jeremy&&Francisco
    public int busquedaCod(String tabla, String SQL, String columna) {
        int codigo = 0;
        try {
            conection = con1.getConnection();
            st = conection.createStatement();
            rs = st.executeQuery(SQL);
            if (tabla.equals("Estudiante")) {
                while (rs.next()) {
                    if(columna.equals("codigo_estudiante")) {codigo = rs.getInt("codigo_estudiante");}
                    if(columna.equals("count(*)")){codigo = rs.getInt("count(*)");}
                }
            }
            if (tabla.equals("Libro")) {
                while (rs.next()) {
                    if(columna.equals("disponibilidad")) {codigo = rs.getInt("disponibilidad");}
                    if(columna.equals("stock")) {codigo = rs.getInt("stock");}
                    if(columna.equals("codigo_libro")) {codigo = rs.getInt("codigo_libro");}
                    if(columna.equals("count(*)")){codigo = rs.getInt("count(*)");}
                }
            }
            if (tabla.equals("Prestamo")) {
                while (rs.next()) {
                    if(columna.equals("codigo_prestamo")){codigo = rs.getInt("codigo_prestamo");}
                    if(columna.equals("count(*)")){codigo = rs.getInt("count(*)");}
                    if(columna.equals("fecha")){
                        fecha.fechaAuxiliar(rs.getString("fecha_devolucion"));
                        codigo=((int)fecha.diferenciaFechaDias());
                    }
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, e);
        }
        return codigo;
    }

    public void busquedaDespliegue(JTable jTabla, String selectTabla, String SQL) {
        try {
            conection = con1.getConnection();
            st = conection.createStatement();
            rs = st.executeQuery(SQL);
            if (selectTabla.equals("Estudiante")) {
                Object[] estudiante = new Object[7];
                DefaultTableModel tabla = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Código", "Nombre", "Apellido", "Celular", "Sector", "Facultad", "Correo"});
                while (rs.next()) {
                    estudiante[0] = rs.getInt("codigo_estudiante");
                    estudiante[1] = rs.getString("nombre_estudiante");
                    estudiante[2] = rs.getString("apellido_estudiante");
                    estudiante[3] = rs.getInt("celular_estudiante");
                    estudiante[4] = rs.getString("sector");
                    estudiante[5] = rs.getString("facultad");
                    estudiante[6] = rs.getString("correo_estudiante");
                    tabla.addRow(estudiante);
                }
                jTabla.setModel(tabla);
            }
            if (selectTabla.equals("Libro")) {
                Object[] libro = new Object[9];
                DefaultTableModel tabla = new DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Código", "Título", "Fecha Publicación", "Edición",
                            "Nombre Autor", "Apellido Autor", "Categoria", "Stock", "Disponibilidad"});
                while (rs.next()) {
                    libro[0] = rs.getInt("codigo_libro");
                    libro[1] = rs.getString("nombre_libro");
                    libro[2] = rs.getString("fecha_publicacion");
                    libro[3] = rs.getString("edicion");
                    libro[4] = rs.getString("nombre_autor");
                    libro[5] = rs.getString("apellido_autor");
                    libro[6] = rs.getString("categoria");
                    libro[7] = rs.getInt("stock");
                    libro[8] = rs.getInt("disponibilidad");
                    tabla.addRow(libro);
                }
                jTabla.setModel(tabla);
            }
            if (selectTabla.equals("Prestamo")) {
                Object[] Prestamo = new Object[8];
                DefaultTableModel tabla = new DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Id.Prestamo", "Id.Libro", "Titulo", "Id.Estudiante", "Nombre Est.", "Apellido Est", "Fecha del Prestamo", "Fecha de Devolución"});
                while (rs.next()) {
                    Prestamo[0] = rs.getInt("codigo_prestamo");
                    Prestamo[1] = rs.getInt("codigo_libro");
                    Prestamo[2] = rs.getString("nombre_libro");
                    Prestamo[3] = rs.getInt("codigo_estudiante");
                    Prestamo[4] = rs.getString("nombre_estudiante");
                    Prestamo[5] = rs.getString("apellido_estudiante");
                    Prestamo[6] = rs.getString("fecha_prestamo");
                    Prestamo[7] = rs.getString("fecha_devolucion");
                    tabla.addRow(Prestamo);
                }
                jTabla.setModel(tabla);
            }
        } catch (SQLException e) {
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void despliegueFields(String SQL, String tabla, JTextField uno, JTextField dos, JTextField tres, JTextField cuatro,
                                JTextField cinco, JTextField seis, JTextField siete, JTextField ocho, String operacion) {
        try {
            conection = con1.getConnection();
            st = conection.createStatement();
            rs = st.executeQuery(SQL);
            if (tabla.equals("Estudiante")) {
                while (rs.next()) {
                    if(uno != null){uno.setText(""+rs.getInt("codigo_estudiante"));}
                    if (operacion != null && operacion.equalsIgnoreCase("actualizar")){
                        if(dos!=null){dos.setText(rs.getString("nombre_estudiante"));}
                        if(tres!=null){tres.setText(rs.getString("apellido_estudiante"));}
                    } else {
                        if(operacion!=null&&operacion.equalsIgnoreCase("prestar")){
                            if (dos!=null){dos.setText(rs.getString("nombre_estudiante")+" "+rs.getString("apellido_estudiante"));}
                        }
                    }
                    if (cuatro != null) {cuatro.setText("" + rs.getInt("celular_estudiante"));}
                    if(cinco!=null){cinco.setText("" + rs.getString("sector"));}
                    if(seis!=null){seis.setText("" + rs.getString("facultad"));}
                    if(siete!=null){siete.setText("" + rs.getString("correo_estudiante"));}
                }
            }
            if (tabla.equals("Libro")) {
                while (rs.next()) {
                    if(uno!=null){uno.setText("" + rs.getInt("codigo_libro"));}
                    if(dos!=null){dos.setText(rs.getString("nombre_libro"));}
                    if(tres!=null){tres.setText(rs.getString("fecha_publicacion"));}
                    if(cuatro!=null){cuatro.setText(rs.getString("edicion"));}
                    if(cinco!=null){cinco.setText(rs.getString("nombre_autor"));}
                    if(seis!=null){seis.setText(rs.getString("apellido_autor"));}
                    if(siete!=null){siete.setText(rs.getString("categoria"));}
                    if(ocho!=null){ocho.setText("" + rs.getInt("stock"));}
                }
            }
            if (tabla.equals("Prestamo")) {
                while (rs.next()) {
                    if(uno!=null){uno.setText("" + rs.getInt("codigo_prestamo"));}
                    if(dos!=null){dos.setText(""+rs.getInt("codigo_libro"));}
                    if(tres!=null){tres.setText(rs.getString("nombre_libro"));}
                    if(cuatro!=null){cuatro.setText(""+rs.getInt("codigo_estudiante"));}
                    if (operacion != null && operacion.equalsIgnoreCase("actualizar")){
                        if(cinco!=null){cinco.setText(rs.getString("nombre_estudiante"));}
                        if(seis!=null){seis.setText(rs.getString("apellido_estudiante"));}
                        if(siete!=null){seis.setText(rs.getString("fecha_prestamo"));}
                        if(ocho!=null){siete.setText(rs.getString("fecha_devolucion"));}
                    }
                    if(operacion!=null&&operacion.equalsIgnoreCase("prestar")){
                        if (cinco!=null){cinco.setText(rs.getString("nombre_estudiante")+" "+rs.getString("apellido_estudiante"));}
                        if(seis!=null){seis.setText(rs.getString("fecha_prestamo"));}
                        if(siete!=null){siete.setText(rs.getString("fecha_devolucion"));}
                    }
                }
            }
        }catch(SQLException e){
            Logger.getLogger(Interaccion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    //Fin Buscar en tablas.
}