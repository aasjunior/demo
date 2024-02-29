package com.example.demo.domain.repository;

import com.example.demo.domain.model.paciente.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Long> {
}
