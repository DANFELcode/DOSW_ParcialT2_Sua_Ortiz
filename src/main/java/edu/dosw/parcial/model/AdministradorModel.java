package edu.dosw.parcial.model;

public class AdministradorModel {
    private String correoInstitucional;
    private String rol;
    private boolean activo;

    public AdministradorModel() {}

    public AdministradorModel(String correoInstitucional, String rol,
                              boolean activo) {
        this.correoInstitucional = correoInstitucional;
        this.rol = rol;
        this.activo = activo;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
