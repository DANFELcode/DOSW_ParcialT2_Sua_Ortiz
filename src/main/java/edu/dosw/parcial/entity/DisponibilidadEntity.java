package edu.dosw.parcial.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class DisponibilidadModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate fecha;
    @Column(nullable = false)
    private LocalTime horaInicio;
    @Column(nullable = false)
    private LocalTime horaFin;
    @Column(nullable = false)
    private String lugar;
    @Column(nullable = false)
    private Modalidad modalidad;
    @Column(nullable = false)
    private String materia;
    @Column(nullable = false)
    private EstadoDisponibilidad estado;
    public DisponibilidadModel() {
    }

    public DisponibilidadModel(Long id, LocalDate fecha, LocalTime horaInicio,
                               LocalTime horaFin, String lugar,
                               Modalidad modalidad, String materia,
                               EstadoDisponibilidad estado) {
        this.id = id;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.lugar = lugar;
        this.modalidad = modalidad;
        this.materia = materia;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public EstadoDisponibilidad getEstado() {
        return estado;
    }

    public void setEstado(EstadoDisponibilidad estado) {
        this.estado = estado;
    }
}
