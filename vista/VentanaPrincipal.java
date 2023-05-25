package vista;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

    //----------------------
    // Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public PanelTitulo miPanelTitulo;

    //----------------------
    // Metodos
    //----------------------

    // Constructor
    public VentanaPrincipal(){

        // Orden
        this.setLayout(null);

        // Creación de colores mediante RGV para los páneles:
        Color color1=new Color(100, 227, 144);        

        //Creación y adición del PanelTitulo
        // miPanelTitulo = new PanelTitulo();
        // miPanelEntradaDatos.setBounds(10,130,765,190);
        // miPanelEntradaDatos.setBackground(color1);              

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,130,765,190);
        miPanelEntradaDatos.setBackground(color1);
        this.add(miPanelEntradaDatos);
        

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,330,765,120);
        miPanelOperaciones.setBackground(color1);
        this.add(miPanelOperaciones);

        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,460,765,190);
        miPanelResultados.setBackground(color1);
        this.add(miPanelResultados);

        //Caracteristicas de la ventana
        this.setTitle("Biblioteca Herencia");
        this.setSize(800,700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.CYAN);

    }    

}