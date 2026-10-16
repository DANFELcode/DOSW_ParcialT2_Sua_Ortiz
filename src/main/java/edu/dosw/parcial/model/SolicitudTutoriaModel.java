package edu.dosw.parcial.model;

import java.time.LocalDateTime;

public class SolicitudTutoriaModel {
    private Long id;
    private String correoSolicitante;
    private LocalDateTime disponibilidad;
    private EstadoSolicitud estado;
    private LocalDateTime fechaCreacion;
    public SolicitudTutoriaModel() {
    }
    public SolicitudTutoriaModel(Long id, String correoSolicitante, LocalDateTime disponibilidad,
                                 EstadoSolicitud estado, LocalDateTime fechaCreacion) {
        this.id = id;
        this.correoSolicitante = correoSolicitante;
        this.disponibilidad = disponibilidad;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCorreoSolicitante() {
        return correoSolicitante;
    }
    public void setCorreoSolicitante(String correoSolicitante) {
        this.correoSolicitante = correoSolicitante;
    }
    public LocalDateTime getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(LocalDateTime disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public EstadoSolicitud getEstado() {
        return estado;
    }
    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
