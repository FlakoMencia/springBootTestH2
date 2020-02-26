package com.crud.h2.modeloDAO;

import com.crud.h2.modelo.Persona;
import java.util.List;

public interface IPersona {

    public List<Persona> listar();

    public Persona listarPersonaId(int id);

    public int agregar(Persona p);

    public int editar(Persona p);

    public void delete(int id);

}
