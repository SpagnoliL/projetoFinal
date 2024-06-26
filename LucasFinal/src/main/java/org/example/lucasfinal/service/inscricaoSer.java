package org.example.lucasfinal.service;

import org.example.lucasfinal.entity.circuito;
import org.example.lucasfinal.entity.inscricao;
import org.example.lucasfinal.entity.maratonista;
import org.example.lucasfinal.repository.inscricaoRep;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class inscricaoSer {
    @Autowired
    inscricaoRep inscricaoRepository;

    public inscricao cadastrarInscricao(inscricao Inscricao, maratonista Maratonista, circuito Circuito) {
        if (Circuito.getCategoria().equalsIgnoreCase("Avancado")){
            if (Maratonista.getIdade()>=18){
                if (Inscricao.getValorPrecisao() == 2800){
                    return inscricaoRepository.save(Inscricao);
                }
            } throw new NullPointerException("É preciso ser maior de idade para participar!");

        }



































    public String cadastrarInscricao(inscricao Inscricao, maratonista Maratonista, circuito Circuito) {










    if (Circuito.getCategoria().equalsIgnoreCase("Pequeno")){
   if (Maratonista.getIdade()>=18){
       if (Inscricao.getValorPrecisao() == 1500){
           return ""+inscricaoRepository.save(Inscricao);
       } else if (Inscricao.getValorPrecisao() != 1500){
           return "Preço merrequento";
       }
       } else if (Maratonista.getIdade()<18) {
       if (Inscricao.getValorPrecisao() == 1300){
           return ""+inscricaoRepository.save(Inscricao);
       } else if (Inscricao.getValorPrecisao() != 1300){
           return "Preço merrequento";
       }
   }
    }
        if (Circuito.getCategoria().equalsIgnoreCase("Médio")){
            if (Maratonista.getIdade()>=18){
                if (Inscricao.getValorPrecisao() == 2300){
                    return ""+inscricaoRepository.save(Inscricao);
                } else if (Inscricao.getValorPrecisao() != 2300){
                    return "Preço merrequento";
                }
            } else if (Maratonista.getIdade()<18) {
                if (Inscricao.getValorPrecisao() == 2000){
                    return ""+inscricaoRepository.save(Inscricao);
                } else if (Inscricao.getValorPrecisao() != 2000){
                    return "Preço merrequento";
                }
            }
        }

    return "abubublé";
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
