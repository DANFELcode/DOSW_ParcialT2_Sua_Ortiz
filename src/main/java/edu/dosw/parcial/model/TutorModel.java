package edu.dosw.parcial.model;

import java.util.List;

public class TutorModel {
    private String correoInstitucional;
    private TipoTutor tipo;

    private boolean activo;

    private List<String> materiasAsignadas;

    public TutorModel() {}

    public TutorModel(String correoInstitucional, TipoTutor tipo,
                      boolean activo, List<String> materiasAsignadas) {
        this.correoInstitucional = correoInstitucional;
        this.tipo = tipo;
        this.activo = activo;
        this.materiasAsignadas = materiasAsignadas;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public TipoTutor getTipo() {
        return tipo;
    }

    public void setTipo(TipoTutor tipo) {
        this.tipo = tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<String> getMateriasAsignadas() {
        return materiasAsignadas;
    }

    public void setMateriasAsignadas(List<String> materiasAsignadas) {
        this.materiasAsignadas = materiasAsignadas;
    }
}
