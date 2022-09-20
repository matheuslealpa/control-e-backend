package com.control.e.modulo.colacao.repository;

import com.control.e.modulo.colacao.domain.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>, JpaSpecificationExecutor<Curso> {
    Optional<Curso> findCursoByNomeIgnoreCase(String nome);
}
