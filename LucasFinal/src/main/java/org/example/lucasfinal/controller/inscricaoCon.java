package org.example.lucasfinal.controller;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.Valid;
import org.example.lucasfinal.entity.inscricao;
import org.example.lucasfinal.service.inscricaoSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import java.util.List;

@RestController
@RequestMapping("inscricao")
public class inscricaoCon {
    @Autowired
    inscricaoSer inscricaoService;
    @PostMapping("/cadastrar")
    public String CadastrarInscricao(@RequestBody @Valid inscricao Inscricao) {
        inscricaoService.cadastrarInscricao(Inscricao);
        return "Inscrição cadastrada com sucesso";
    }
    @JsonIgnoreProperties
    @GetMapping("/inscricoes")
    public List<inscricao> listaInscricoes() {
        return inscricaoService.listaInscricoes();
    }
    @JsonIgnoreProperties
    @PutMapping("/editar")
    public inscricao updateInscricao(@RequestBody inscricao Inscricao) {
        return inscricaoService.updateInscricao(Inscricao);
    }
    @DeleteMapping("/deletar")
    public String deleteInscricao (@RequestParam long id){
        inscricaoService.deleteInscricao(id);
        return "Inscrição deletada com sucesso!";
    }
}
