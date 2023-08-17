package Negocio;
import javax.swing.ImageIcon;
/**
 * @author JEREMY
 */
public class Imagenes 
{
    ImageIcon ICONERROR=null;
    ImageIcon ICONCORRECTO=null;
    ImageIcon ICONREVISION=null;
    ImageIcon ICONCANCELAR=null;
    ImageIcon ICONACEPTAR=null;
    
    public ImageIcon getICONCANCELAR() {
        ICONCANCELAR=new ImageIcon(Imagenes.class.getResource("/Imagenes/warning 128.png"));
        ICONCANCELAR=new ImageIcon(ICONCANCELAR.getImage().getScaledInstance(128, -1, java.awt.Image.SCALE_DEFAULT));
        return ICONCANCELAR;
    }

    public ImageIcon getICONACEPTAR() {
        ICONACEPTAR=new ImageIcon(Imagenes.class.getResource("/Imagenes/regresar 32.png"));
        ICONACEPTAR=new ImageIcon(ICONACEPTAR.getImage().getScaledInstance(32, -1, java.awt.Image.SCALE_DEFAULT));
        return ICONACEPTAR;
    }
    
    public ImageIcon getICONERROR() {
        ICONERROR=new ImageIcon(Imagenes.class.getResource("/Imagenes/Acceso Denegado.png"));
        ICONERROR=new ImageIcon(ICONERROR.getImage().getScaledInstance(128, -1, java.awt.Image.SCALE_DEFAULT));
        return ICONERROR;
    }

    public ImageIcon getICONCORRECTO() {
        ICONCORRECTO=new ImageIcon(Imagenes.class.getResource("/Imagenes/conexion correcta.png"));
        ICONCORRECTO=new ImageIcon(ICONCORRECTO.getImage().getScaledInstance(128, -1, java.awt.Image.SCALE_DEFAULT));
        return ICONCORRECTO;
    }

    public ImageIcon getICONREVISION() {
        ICONREVISION=new ImageIcon(Imagenes.class.getResource("/Imagenes/Revision.png"));
        ICONREVISION=new ImageIcon(ICONREVISION.getImage().getScaledInstance(128, -1, java.awt.Image.SCALE_DEFAULT));
        return ICONREVISION;
    }   
}