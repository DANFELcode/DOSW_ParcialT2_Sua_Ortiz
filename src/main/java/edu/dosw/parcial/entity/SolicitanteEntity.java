package edu.dosw.parcial.model;

import java.util.List;

public class SolicitanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String correoInstitucional;

    @Column(nullable = false)
    private boolean activo;

    @Column(nullable = false)
    private List<String> materiasInscritas;

    public SolicitanteModel() {
    }
    public SolicitanteModel(String correoInstitucional,
                            boolean activo, List<String> materiasInscritas) {
        this.correoInstitucional = correoInstitucional;
        this.activo = activo;
        this.materiasInscritas = materiasInscritas;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<String> getMateriasInscritas() {
        return materiasInscritas;
    }

    public void setMateriasInscritas(List<String> materiasInscritas) {
        this.materiasInscritas = materiasInscritas;
    }
}
