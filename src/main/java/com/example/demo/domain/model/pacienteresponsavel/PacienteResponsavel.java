package com.example.demo.domain.model.pacienteresponsavel;

import com.example.demo.domain.model.paciente.Paciente;
import com.example.demo.domain.model.responsavel.Responsavel;
import jakarta.persistence.*;

@Entity
public class PacienteResponsavel {
    @EmbeddedId
    private PacienteReponsavelKey id;

    @ManyToOne
    @MapsId("pacienteId")
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @ManyToOne
    @MapsId("responsavelId")
    @JoinColumn(name = "responsavel_id")
    private Responsavel responsavel;

    private String parentesco;
}
