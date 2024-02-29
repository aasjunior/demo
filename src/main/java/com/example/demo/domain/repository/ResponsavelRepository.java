package com.example.demo.domain.repository;

import com.example.demo.domain.model.responsavel.Responsavel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelRepository extends CrudRepository<Responsavel, Long> {
}
