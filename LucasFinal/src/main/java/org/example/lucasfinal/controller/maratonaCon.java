package org.example.lucasfinal.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.Valid;
import org.example.lucasfinal.entity.maratona;
import org.example.lucasfinal.service.maratonaSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("maratona")
public class maratonaCon {
    @Autowired
    maratonaSer maratonaService;

    @PostMapping("/cadastrar")
    public String CadastrarMaratona(@RequestBody @Valid maratona Maratona) {
        maratonaService.cadastrarMaratona(Maratona);
        return "Maratona cadastrado com sucesso";
    }

    @JsonIgnoreProperties
    @GetMapping("/maratonas")
    public List<maratona> listaMaratonas() {
        return maratonaService.listaMaratonas();
    }

    @JsonIgnoreProperties
    @PutMapping("/editar")
    public maratona updateMaratona(@RequestBody maratona Maratona) {
        return maratonaService.updateMaratona(Maratona);
    }

    @DeleteMapping("/deletar")
    public String deleteMaratona(@RequestParam long id) {
        maratonaService.deleteMaratona(id);
        return "Maratonista deletado com sucesso!";
    }
}
