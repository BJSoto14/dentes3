package com.b.dentes3.Objetos;

public class Historial_Obj {

    private String Titulo;
    private String Fecha;
    private String Hora;
    private String Precio;
    private int Foto;

    public Historial_Obj(String Titulo, String Fecha, String Hora, String Precio, int Foto) {
        this.Titulo= Titulo;
        this.Fecha= Fecha;
        this.Hora=Hora;
        this.Precio= Precio;
        this.Foto= Foto;
    }


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public int getFoto() {
        return Foto;
    }

    public void setFoto(int foto) {
        Foto = foto;
    }

}
