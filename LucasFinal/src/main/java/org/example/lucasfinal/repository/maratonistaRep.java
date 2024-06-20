package org.example.lucasfinal.repository;

import org.example.lucasfinal.entity.circuito;
import org.example.lucasfinal.entity.maratonista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface maratonistaRep extends JpaRepository<maratonista, Long> {

}
