package edu.pe.DBautista.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "docente")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")

public class Profesor extends Persona{

    @Column(name = "cod_docente", length = 23)
    private String codProfesor;

    public Profesor() {
    }

    public String getCodDocente() {
        return codProfesor;
    }

    public void setCodDocente(String codDocente) {
        this.codProfesor = codDocente;
    }
}
