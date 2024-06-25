package org.example.lucasfinal.service;

import org.example.lucasfinal.entity.inscricao;
import org.example.lucasfinal.repository.inscricaoRep;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class inscricaoSer {
    @Autowired
    inscricaoRep inscricaoRepository;

    public inscricao cadastrarInscricao(inscricao Inscricao) {
        return inscricaoRepository.save(Inscricao);
    }
    public List<inscricao> listaInscricoes(){
        return inscricaoRepository.findAll();
    }
    public inscricao updateInscricao(inscricao Inscricao) {
        return inscricaoRepository.save(Inscricao);
    }

    public void deleteInscricao(Long id) {
        inscricaoRepository.deleteById(id);
    }
}
