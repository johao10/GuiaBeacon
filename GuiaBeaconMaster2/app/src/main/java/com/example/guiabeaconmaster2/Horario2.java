package com.example.guiabeaconmaster2;

public class Horario2 {

    private String hora_ini;
    private String hora_fin;
    private String ubicacion;
    private String curso;
    private String docente;

    public Horario2(){}
    public Horario2(String hora_ini, String hora_fin, String ubicacion, String curso, String docente) {
        this.hora_ini = hora_ini;
        this.hora_fin = hora_fin;
        this.ubicacion = ubicacion;
        this.curso = curso;
        this.docente = docente;
    }

    public String getHora_ini() {
        return hora_ini;
    }

    public void setHora_ini(String hora_ini) {
        this.hora_ini = hora_ini;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "|"+hora_ini + "|"+hora_fin + "|"+ubicacion + "|"+curso + "|"+docente + "|";
    }
}
