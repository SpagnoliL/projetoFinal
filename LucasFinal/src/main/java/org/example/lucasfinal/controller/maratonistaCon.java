package org.example.lucasfinal.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.Valid;
import org.example.lucasfinal.entity.maratonista;
import org.example.lucasfinal.service.maratonistaSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("maratona")
public class maratonistaCon {
    @Autowired
    maratonistaSer maratonistaService;

    @PostMapping("/cadastrar")
    public String CadastrarMaratonista(@RequestBody @Valid maratonista Maratonista) {
        maratonistaService.cadastrarMaratonista(Maratonista);
        return "Maratonista cadastrado com sucesso";
    }

    @JsonIgnoreProperties
    @GetMapping("/maratonista")
    public List<maratonista> listaMaratonistas() {
        return maratonistaService.listaMaratonistas();
    }

    @JsonIgnoreProperties
    @PutMapping("/editar")
    public maratonista updateMaratonista(@RequestBody maratonista Maratonista) {
        return maratonistaService.updateMaratonista(Maratonista);
    }

    @DeleteMapping("/deletar")
    public String deleteMaratonista(@RequestParam long id) {
        maratonistaService.deleteMaratonista(id);
        return "Maratonista deletado com sucesso!";
    }
}
