package org.example.lucasfinal.service;

import org.example.lucasfinal.repository.maratonaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.lucasfinal.entity.maratona;

import java.util.List;

@Service
public class maratonaSer {

    @Autowired
    maratonaRep maratonaRepository;

    public maratona cadastrarMaratona(maratona Maratona) {
        return maratonaRepository.save(Maratona);
    }

    public List<maratona> listaMaratonas() {
        return maratonaRepository.findAll();
    }

    public maratona updateMaratona(maratona Maratona) {
        return maratonaRepository.save(Maratona);
    }

    public void deleteMaratona(Long id) {
        maratonaRepository.deleteById(id);
    }
}
