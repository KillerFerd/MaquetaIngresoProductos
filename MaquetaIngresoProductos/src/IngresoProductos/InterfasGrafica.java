package IngresoProductos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.plaf.DimensionUIResource;

public class InterfasGrafica extends JFrame{
    JButton b1;
    JButton b2;
    JLabel tag1;
    JLabel tag2;
    JLabel tag3;
    JPanel contenedor=new JPanel();
        
    public InterfasGrafica(String title) throws HeadlessException {
        super(title);
        //Dimension d=new Dimension(500,500); //Definir tamaño de las ventanas
        //this.setSize(d);                    //Complemento para el tamaño
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Cerrar el proceso al cerrar la ventana
        //this.setLocation(500, 200);
        this.setBounds(300, 300, 300, 300); //Definir Posición y Dimension de la ventana
        this.setLocationRelativeTo(null);
        this.getContentPane().add(contenedor);
        this.contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(null);
        iniciarBotones(); 
        iniciarCampos();
        inciarEtiquetas();
    }
    
    public void iniciarCampos() {
        JTextField campoText1=new JTextField();
        campoText1.setBounds(100, 20, 180, 30);
        this.contenedor.add(campoText1);
        
        JTextField campoText2=new JTextField();
        campoText2.setBounds(100, 70, 180, 30);
        this.contenedor.add(campoText2);
        
        JTextField campoText3=new JTextField();
        campoText3.setBounds(100, 120, 180, 30);
        this.contenedor.add(campoText3);
    }
    protected void iniciarBotones() {
        b1=new JButton("Guardar");
        b2=new JButton("Editar");
        contenedor.add(b1);
        contenedor.add(b2); 
        contenedor.setLayout(null); 
        b1.setBounds(40, 200, 100, 30);
        b2.setBounds(150, 200, 100, 30);
            } 

    private void inciarEtiquetas() {
        this.tag1=new JLabel("ID Producto");
        this.contenedor.add(tag1);
        this.tag1.setForeground(Color.black);
        this.contenedor.setLayout(null);
        this.tag1.setBounds(13, 13, 165, 40);
        this.tag2=new JLabel("Nombre");
        this.contenedor.add(tag2);
        this.tag2.setForeground(Color.black);
        this.contenedor.setLayout(null);
        this.tag2.setBounds(13, 63, 165, 40);
        this.tag3=new JLabel("Precio");
        this.contenedor.add(tag3);
        this.tag3.setForeground(Color.black);
        this.contenedor.setLayout(null);
        this.tag3.setBounds(13, 113, 165, 40);
    }

}
