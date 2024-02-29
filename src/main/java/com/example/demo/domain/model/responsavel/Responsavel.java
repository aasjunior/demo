package com.example.demo.domain.model.responsavel;

import com.example.demo.domain.model.pacienteresponsavel.PacienteResponsavel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "responsaveis")
public class Responsavel {
    @Id
    private Long id;
    private String nome;
    private String sobrenome;

    @OneToMany(mappedBy = "responsavel")
    private Set<PacienteResponsavel> pacienteResponsavel;
}
