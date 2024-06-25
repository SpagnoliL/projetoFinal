package org.example.lucasfinal.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.Valid;
import org.example.lucasfinal.entity.circuito;
import org.example.lucasfinal.service.circuitoSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("circuito")
public class circuitoCon {
    @Autowired
    circuitoSer circuitoService;
    @PostMapping("/cadastrar")
    public String CadastrarCircuito(@RequestBody @Valid circuito Circuito) {
        circuitoService.cadastrarCircuito(Circuito);
        return "Circuito cadastrado com sucesso";
    }
    @JsonIgnoreProperties
    @GetMapping("/circuitos")
    public List<circuito> listaCircuitos() {
        return circuitoService.listaCircuitos();
    }
    @JsonIgnoreProperties
    @PutMapping("/editar")
    public circuito updateCircuito(@RequestBody circuito Circuito) {
        return circuitoService.updateCircuito(Circuito);
    }
    @DeleteMapping("/deletar")
    public String deleteCircuito (@RequestParam long id){
        circuitoService.deleteCircuito(id);
        return "Circuito deletado com sucesso!";
    }
}
