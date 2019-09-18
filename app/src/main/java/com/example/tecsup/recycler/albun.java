package com.example.tecsup.recycler;

public class albun {
    String titulo;
    String fecha_lanzamiento;
    String imagen;
    Boolean favorito;

    public albun(String titulo, String fecha_lanzamiento, String imagen, Boolean favorito) {
        this.titulo = titulo;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.imagen = imagen;
        this.favorito = favorito;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(String fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }
}
