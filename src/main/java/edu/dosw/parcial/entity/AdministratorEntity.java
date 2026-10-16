package edu.dosw.parcial.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Entity
@Table(name = "administrator")
public class AdministradorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String correoInstitucional;

    @Column(nullable = false)
    private String rol;

    @Column(nullable = false)
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
