package org.example;

public class variables {

    private String nombre, apellido, nombreMadre, apellidoMadre, nombrePadre, apellidoPadre, ciudad, pais, nombreMascota, tipoMascota, respuestaMascota;
    private int edad, edadMascota;
    private double estatura;

    public variables(String nombre, String apellido, String nombreMadre, String apellidoMadre, String nombrePadre, String apellidoPadre, String ciudad, String pais, String nombreMascota, String tipoMascota, String respuestaMascota, int edad, int edadMascota, double estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreMadre = nombreMadre;
        this.apellidoMadre = apellidoMadre;
        this.nombrePadre = nombrePadre;
        this.apellidoPadre = apellidoPadre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.nombreMascota = nombreMascota;
        this.tipoMascota = tipoMascota;
        this.respuestaMascota = respuestaMascota;
        this.edad = edad;
        this.edadMascota = edadMascota;
        this.estatura = estatura;
    }

    public variables() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getApellidoMadre() {
        return apellidoMadre;
    }

    public void setApellidoMadre(String apellidoMadre) {
        this.apellidoMadre = apellidoMadre;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        this.apellidoPadre = apellidoPadre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getRespuestaMascota() {
        return respuestaMascota;
    }

    public void setRespuestaMascota(String respuestaMascota) {
        this.respuestaMascota = respuestaMascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
}
