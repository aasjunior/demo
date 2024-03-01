package com.example.demo.domain.model.responsavel;

import com.example.demo.domain.model.pacienteresponsavel.PacienteResponsavel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;

    @OneToMany(mappedBy = "responsavel")
    @JsonIgnore
    private Set<PacienteResponsavel> pacienteResponsavel;

    public static Responsavel convert(ResponsavelRequest request){
        Responsavel responsavel = new Responsavel();
        responsavel.setNome(request.nome());
        responsavel.setSobrenome(request.sobrenome());

        return responsavel;
    }
}
