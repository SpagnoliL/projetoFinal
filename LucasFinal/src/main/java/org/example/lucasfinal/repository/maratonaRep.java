package org.example.lucasfinal.repository;

import org.example.lucasfinal.entity.circuito;
import org.example.lucasfinal.entity.maratona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface maratonaRep extends JpaRepository<maratona, Long> {

}
