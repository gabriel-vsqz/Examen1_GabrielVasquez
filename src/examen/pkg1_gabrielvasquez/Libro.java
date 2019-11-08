package examen.pkg1_gabrielvasquez;

public class Libro {
 
    private String title;
    private String descripción;
    private int puntaje;
    private int copias;
    private String genero;
    private double valor;
    private String edicion;
    private String autor;
    private int año;

    public Libro() {
    }

    public Libro(String title, String descripción, int puntaje, int copias, String genero, double valor, String edicion, String autor, int año) {
        this.title = title;
        this.descripción = descripción;
        this.puntaje = puntaje;
        this.copias = copias;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.año = año;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return title;
    }
    
}