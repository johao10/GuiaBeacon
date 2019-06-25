package com.example.guiabeaconmaster2;

import java.sql.Date;

public class Horario {
    //tbl_horario
    private int id_horario;
    private String cod_beacon;
    private String nombre_beacon;
    //tbl_hora
    private String hora_inicio;
    private String hora_fin;
    //tbl_curso
    private String nombre_curso;
    //tbl_docente
    private String nombre_docente;
    //tbl_ambiente
    private String imagen;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Horario(){}

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getNombre_docente() {
        return nombre_docente;
    }

    public void setNombre_docente(String nombre_docente) {
        this.nombre_docente = nombre_docente;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public String getNombre_beacon() {
        return nombre_beacon;
    }

    public void setNombre_beacon(String nombre_beacon) {
        this.nombre_beacon = nombre_beacon;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getCod_beacon() {
        return cod_beacon;
    }

    public void setCod_beacon(String cod_beacon) {
        this.cod_beacon = cod_beacon;
    }

    @Override
    public String toString() {
        return  "|"+hora_inicio+"|"+hora_fin+"|"+ nombre_curso+ "|"+ nombre_docente+"|";
    }
}
