package org.example.lucasfinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class circuito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String categoria;
    int distancia;
    @ManyToOne
    maratona maratona;
}
