package com.example.demo.domain.model.paciente;

import com.example.demo.domain.model.pacienteresponsavel.PacienteResponsavel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pacientes")
public class Paciente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;

    @OneToMany(mappedBy = "paciente")
    @JsonIgnore
    private Set<PacienteResponsavel> pacienteResponsavel;

    public static Paciente convert(PacienteRequest request){
        Paciente paciente = new Paciente();
        paciente.setNome(request.nome());
        paciente.setSobrenome(request.sobrenome());

        return paciente;
    }
}
