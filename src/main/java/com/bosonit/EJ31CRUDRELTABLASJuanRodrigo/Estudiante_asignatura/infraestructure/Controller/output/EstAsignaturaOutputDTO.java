package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Estudiante_asignatura.infraestructure.Controller.output;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Estudiante_asignatura.domain.EstudianteAsignatura;

import lombok.Data;

import java.util.Date;

@Data
public class EstAsignaturaOutputDTO {

    private String idAsignatura;
    private String asignatura;
    private String comments;
    private Date initialDate;
    private Date finishDate;
    private String idStudent;

    public EstAsignaturaOutputDTO(EstudianteAsignatura estudianteAsignatura){

        setIdStudent(estudianteAsignatura.getIdStudent());
        setIdAsignatura(estudianteAsignatura.getIdAsignatura());
        setAsignatura(estudianteAsignatura.getAsignatura());
        setComments(estudianteAsignatura.getComments());
        setInitialDate(estudianteAsignatura.getInitialDate());
        setFinishDate(estudianteAsignatura.getFinishDate());

    }
    public EstAsignaturaOutputDTO(){
    }

}
