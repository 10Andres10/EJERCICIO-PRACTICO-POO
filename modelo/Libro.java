package modelo;

public class Libro {

    // Atributos
    protected String nombreLibro;
    protected String nombreAutores;
    protected Integer anioEdicion;
    protected Boolean libroDeLujo;

    // Constructor
    public Libro(String nombreLibro, String nombreAutores, Integer anioEdicion, Boolean libroDeLujo) {

        this.nombreLibro = nombreLibro;
        this.nombreAutores = nombreAutores;
        this.anioEdicion = anioEdicion;
        this.libroDeLujo = libroDeLujo;

    }

    public Libro() {

        this.nombreLibro = "";
        this.nombreAutores = "";
        this.anioEdicion = 0;
        this.libroDeLujo = false;

    }

    // Getters

    public String getNombreLibro() {

        return nombreLibro;

    }

    public String getNombreAutores() {
            
        return nombreAutores;

    }

    public Integer getAnioEdicion() {

        return anioEdicion;

    }

    public Boolean getLibroDeLujo() {

        return libroDeLujo;

    }

    public String toString() {

        return "\nNombre: " + nombreLibro + "\nAutores: " + nombreAutores + "\nAño: " + anioEdicion + "\nEdición de lujo:" + libroDeLujo + "\n";

    }
    
}