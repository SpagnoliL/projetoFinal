package org.example.lucasfinal.repository;

import org.example.lucasfinal.entity.circuito;
import org.example.lucasfinal.entity.inscricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface inscricaoRep extends JpaRepository<inscricao, Long> {

}
