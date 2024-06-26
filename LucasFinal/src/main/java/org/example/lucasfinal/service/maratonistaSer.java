package org.example.lucasfinal.service;

import org.example.lucasfinal.entity.maratona;
import org.example.lucasfinal.entity.maratonista;
import org.example.lucasfinal.repository.maratonaRep;
import org.example.lucasfinal.repository.maratonistaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class maratonistaSer {

    @Autowired
    maratonistaRep maratonistaRepository;

    public maratonista cadastrarMaratonista(maratonista Maratonista) {
        return maratonistaRepository.save(Maratonista);
    }

    public List<maratonista> listaMaratonistas() {
        return maratonistaRepository.findAll();
    }

    public maratonista updateMaratonista(maratonista Maratonista) {
        return maratonistaRepository.save(Maratonista);
    }

    public void deleteMaratonista(Long id) {
        maratonistaRepository.deleteById(id);
    }
}
