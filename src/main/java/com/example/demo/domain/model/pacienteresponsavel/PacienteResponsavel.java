package com.example.demo.domain.model.pacienteresponsavel;

import com.example.demo.domain.model.paciente.Paciente;
import com.example.demo.domain.model.responsavel.Responsavel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class PacienteResponsavel {
    @EmbeddedId
    private PacienteReponsavelKey id;

    @ManyToOne
    @MapsId("pacienteId")
    @JoinColumn(name = "paciente_id")
    @JsonBackReference
    private Paciente paciente;

    @ManyToOne
    @MapsId("responsavelId")
    @JoinColumn(name = "responsavel_id")
    @JsonBackReference
    private Responsavel responsavel;

    private String parentesco;
}
