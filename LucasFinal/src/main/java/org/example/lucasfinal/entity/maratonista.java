package org.example.lucasfinal.entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class maratonista {
    int idade;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String sangue;
    String nome;
    String numero;
    String numeroE;
    String rg;
    String sobrenome;
}
