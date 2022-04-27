package edu.pe.DBautista.service.impl;

import edu.pe.DBautista.entity.Persona;

import java.util.List;

public interface IPersonaService {
    //Metodo_listar_persona
    List<Persona> listaPersonas();
    //Buscar Persona por DNI
    Persona obtenerPersonaByDni(String dni);
}