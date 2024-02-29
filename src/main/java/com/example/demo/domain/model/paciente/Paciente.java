package com.example.demo.domain.model.paciente;

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
@Table(name = "pacientes")
public class Paciente {
    @Id
    private Long id;
    private String nome;
    private String sobrenome;

    @OneToMany(mappedBy = "paciente")
    private Set<PacienteResponsavel> pacienteResponsavel;

    public static Paciente convert(PacienteRequest request){
        Paciente paciente = new Paciente();
        paciente.setNome(request.nome());
        paciente.setSobrenome(request.sobrenome());

        return paciente;
    }
}
