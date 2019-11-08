package examen.pkg1_gabrielvasquez;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
 
    private String user;
    private String password;
    private Date nacimiento;
    private int numero;
    private String correo;
    private String favorito;
    ArrayList<Libro> libros = new ArrayList();

    public Usuario() {
    }

    public Usuario(String user, String password, Date nacimiento, int numero, String correo, String favorito) {
        this.user = user;
        this.password = password;
        this.nacimiento = nacimiento;
        this.numero = numero;
        this.correo = correo;
        this.favorito = favorito;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFavorito() {
        return favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return user;
    }
    
}