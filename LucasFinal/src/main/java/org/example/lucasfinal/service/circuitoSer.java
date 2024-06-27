package org.example.lucasfinal.service;

import org.example.lucasfinal.entity.circuito;
import org.example.lucasfinal.repository.circuitoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class circuitoSer {
    @Autowired
    circuitoRep circuitoRepository;

    public circuito cadastrarCircuito(circuito Circuito) {
        return circuitoRepository.save(Circuito);
    }

    public List<circuito> listaCircuitos() {
        return circuitoRepository.findAll();
    }

    public circuito updateCircuito(circuito Circuito) {
        return circuitoRepository.save(Circuito);
    }

    public void deleteCircuito(Long id) {
        circuitoRepository.deleteById(id);
    }
}
