package com.example.demo.domain.model.pacienteresponsavel;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PacienteReponsavelKey implements Serializable {
    @Column(name = "paciente_id")
    private Long pacienteId;

    @Column(name = "responsavelId")
    private Long responsavelId;
}
