package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    
    private JLabel lbNombre;
    private JLabel lbAutor;
    private JLabel lbAnio;
    private JLabel lbEdicionDeLujo;
    
    private JTextField tfNombre;
    private JTextField tfAutor;
    private JTextField tfAnio;
    // private JComboBox comboBox;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        
        //Crear y agregar etiqueta Nombre
        lbNombre = new JLabel("Nombre: ");
        lbNombre.setBounds(15,30,150,30);
        lbNombre.setFont(new Font("Times New Roman", Font.BOLD, 30));
        this.add(lbNombre);

        //Crear y agregar etiqueta Autor
        lbAutor = new JLabel("Autor: ");
        lbAutor.setBounds(15,70,150,30);
        lbAutor.setFont(new Font("Times New Roman", Font.BOLD, 30));
        this.add(lbAutor);

        //Crear y agregar etiqueta Año
        lbAnio = new JLabel("Año: ");
        lbAnio.setBounds(15,110,150,30);
        lbAnio.setFont(new Font("Times New Roman", Font.BOLD, 30));
        this.add(lbAnio);

        // Crear y agregar etiqueta Edicion de lujo
        lbEdicionDeLujo = new JLabel("Edición de lujo: ");
        lbEdicionDeLujo.setBounds(15,150,300,30);
        lbEdicionDeLujo.setFont(new Font("Times New Roman", Font.BOLD, 30));
        this.add(lbEdicionDeLujo);

        // Crear y agregar la caja de texto del Nombre
        tfNombre = new JTextField();
        tfNombre.setBounds(90, 60, 260, 20);
        this.add(tfNombre);

        // Crear y agregar la caja de texto del Autor
        tfAutor = new JTextField();
        tfAutor.setBounds(90, 90, 260, 20);
        this.add(tfAutor);

        // Crear y agregar la caja de texto del Año
        tfAnio = new JTextField();
        tfAnio.setBounds(90, 120, 260, 20);
        this.add(tfAnio);
        
        // Crear y agregar la caja de texto del Nombre
        tfNombre = new JTextField();
        tfNombre.setBounds(90, 60, 260, 20);
        this.add(tfNombre);

        //Crear y agregar combo lista "combo box"
        // comboBox = new JComboBox();
        // comboBox.setBounds(90,30,260,20);
        // this.add(comboBox);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    // Getters y Setters

    public JTextField gettfNombre() {
        return tfNombre;
    }

    public void settfNombre(JTextField tfNombre) {
        this.tfNombre = tfNombre;
    }

    public JTextField gettfAutor() {
        return tfAutor;
    }

    public void settfAutor(JTextField tfAutor) {
        this.tfAutor = tfAutor;
    }

    public JTextField gettfAnio() {
        return tfAnio;
    }

    public void settfAnio(JTextField tfAnio) {
        this.tfAnio = tfAnio;
    }    

    // public JComboBox getComboBox() {
        // return comboBox;    }

    // public void setComboBox(JComboBox comboBox) {
        // this.comboBox = comboBox;    }

       

}