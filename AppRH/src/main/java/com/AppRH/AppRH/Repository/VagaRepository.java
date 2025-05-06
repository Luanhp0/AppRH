package com.AppRH.AppRH.Repository;

import com.AppRH.AppRH.models.Vaga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VagaRepository extends CrudRepository<Vaga, String> {

    Vaga findByCodigo(long codigo);
    List<Vaga> findByNome(String nome);
}
