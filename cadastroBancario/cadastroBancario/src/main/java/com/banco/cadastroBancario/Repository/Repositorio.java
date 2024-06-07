package com.banco.cadastroBancario.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banco.cadastroBancario.Model.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer>{
    List<Pessoa> findAll();

    Pessoa findByCodigoID(int codigoID);
}
