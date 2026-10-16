package edu.dosw.parcial.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class TutoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tema;
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
    private EstadoTutoria estado;
    @Column(nullable = false)
    private TutorModel tutor;
    @Column(nullable = false)
    private SolicitanteModel solicitante;
    @Column(nullable = false)

    public TutoriaEntity() {
    }

    public TutoriaEntity(String tema, LocalDate fecha,
                        LocalTime horaInicio, LocalTime horaFin,
                        String lugar, Modalidad modalidad,
                        String materia, EstadoTutoria estado, TutorModel tutor,
                        SolicitanteModel solicitante){
        this.tema = tema;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.lugar = lugar;
        this.modalidad = modalidad;
        this.materia = materia;
        this.estado = estado;
        this.tutor = tutor;
        this.solicitante = solicitante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
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

    public EstadoTutoria getEstado() {
        return estado;
    }

    public void setEstado(EstadoTutoria estado) {
        this.estado = estado;
    }

    public TutorModel getTutor() {
        return tutor;
    }

    public void setTutor(TutorModel tutor) {
        this.tutor = tutor;
    }

    public SolicitanteModel getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(SolicitanteModel solicitante) {
        this.solicitante = solicitante;
    }
}
