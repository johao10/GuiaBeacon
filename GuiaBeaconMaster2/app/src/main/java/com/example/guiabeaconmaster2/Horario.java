package com.example.guiabeaconmaster2;

import java.sql.Date;

public class Horario {
    private int id_horario;
    private String cod_beacon,nombre_beacon;
    private Date fecha_inicio;
    private Date fecha_fin;

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

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}
