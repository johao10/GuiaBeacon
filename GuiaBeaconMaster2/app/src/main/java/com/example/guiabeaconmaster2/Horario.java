package com.example.guiabeaconmaster2;

import java.sql.Date;

public class Horario {

    private int id_horario;
    private String cod_beacon;
    private String nombre_beacon;
    private String fecha_inicio;
    private String fecha_fin;

    public Horario(){}

    public Horario(int id_horario, String cod_beacon, String nombre_beacon, String fecha_inicio, String fecha_fin) {
        this.id_horario = id_horario;
        this.cod_beacon = cod_beacon;
        this.nombre_beacon = nombre_beacon;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
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

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    /*@Override
    public String toString() {
        return nombre_beacon;
    }*/

    @Override
    public String toString() {
        return  id_horario + "|"+ fecha_inicio + "|"+ fecha_fin;
    }
}
