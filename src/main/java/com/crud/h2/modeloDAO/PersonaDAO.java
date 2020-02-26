/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.h2.modeloDAO;

import com.crud.h2.modelo.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaDAO implements IPersona {

    @Autowired
    private JdbcTemplate template;

    @Override
    public List<Persona> listar() {
        String sql = "select * from persona";
        List<Persona> personas = template.query(sql, new BeanPropertyRowMapper<Persona>(Persona.class));
        return personas;
    }

    @Override
    public Persona listarPersonaId(int id) {
        String q = "SELECT * FROM PERSONA WHERE ID =?";
        Persona per = template.queryForObject(q, new Object[]{id}, new BeanPropertyRowMapper<Persona>(Persona.class));
        return per;
    }

    @Override
    public int agregar(Persona p) {
        String sql = "insert into persona(name) values(?)";
        int ret = template.update(sql, p.getName());
        return ret;
    }

    @Override
    public int editar(Persona p) {
        String q = "UPDATE PERSONA Set name = ? where id = ?";
        int ret = template.update(q, p.getName(), p.getId());

        return ret;

    }

    @Override
    public void delete(int id) {
       String q = "DELETE FROM PERSONA where id = ?";
        int ret = template.update(q, id);
    }

}
