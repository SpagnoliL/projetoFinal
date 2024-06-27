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
    @Autowired
    private org.example.lucasfinal.repository.maratonistaRep maratonistaRep;
    @Autowired
    private org.example.lucasfinal.repository.circuitoRep circuitoRep;

    public String cadastrarInscricao(inscricao Inscricao) {
        maratonista Maratonista = maratonistaRep.findById(Inscricao.getMaratonista().getId()).get();
        circuito Circuito = circuitoRep.findById(Inscricao.getCircuito().getId()).get();

        if (Circuito.getCategoria().equalsIgnoreCase("Pequeno")) {
            if (Circuito.getDistancia() == 2000) {
                if (Maratonista.getIdade() >= 18) {
                    if (Inscricao.getValorPrecisao() == 1500) {
                        return "" + inscricaoRepository.save(Inscricao);
                    } else if (Inscricao.getValorPrecisao() != 1500) {
                        return "Preço errado";
                    }
                } else if (Maratonista.getIdade() < 18) {
                    if (Inscricao.getValorPrecisao() == 1300) {
                        return "" + inscricaoRepository.save(Inscricao);
                    } else if (Inscricao.getValorPrecisao() != 1300) {
                        return "Preço errado";
                    }
                }
            } else {
                return "Distância inválida";
            }
        }
        if (Circuito.getCategoria().equalsIgnoreCase("Médio")) {
            if (Circuito.getDistancia() == 5000) {
                if (Maratonista.getIdade() >= 18) {
                    if (Inscricao.getValorPrecisao() == 2300) {
                        return "" + inscricaoRepository.save(Inscricao);
                    } else if (Inscricao.getValorPrecisao() != 2300) {
                        return "Preço errado";
                    }
                } else if (Maratonista.getIdade() < 18) {
                    if (Inscricao.getValorPrecisao() == 2000) {
                        return "" + inscricaoRepository.save(Inscricao);
                    } else if (Inscricao.getValorPrecisao() != 2000) {
                        return "Preço errado";
                    }
                }
            } else {
                return "Distância inválida";
            }
        }
        if (Circuito.getCategoria().equalsIgnoreCase("Avançado")) {
            if (Circuito.getDistancia() == 10000) {
                if (Maratonista.getIdade() >= 18) {
                    if (Inscricao.getValorPrecisao() == 2800) {
                        return "" + inscricaoRepository.save(Inscricao);
                    } else if (Inscricao.getValorPrecisao() != 2800) {
                        return "Preço errado";
                    }
                } else if (Maratonista.getIdade() < 18) {
                    return "A maioridade é necessária para correr nessa categoria!";
                }
            } else {
                return "Distância inválida";
            }
        }
        return "vai, sacani do space today, enfia esse foguetão";
    }

    public List<inscricao> listaInscricoes() {
        return inscricaoRepository.findAll();
    }

    public inscricao updateInscricao(inscricao Inscricao) {
        return inscricaoRepository.save(Inscricao);
    }

    public void deleteInscricao(Long id) {
        inscricaoRepository.deleteById(id);
    }
}
