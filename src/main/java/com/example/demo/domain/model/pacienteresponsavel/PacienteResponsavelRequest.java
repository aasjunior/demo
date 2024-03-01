package com.example.demo.domain.model.pacienteresponsavel;

import com.example.demo.domain.model.paciente.PacienteRequest;
import com.example.demo.domain.model.responsavel.ResponsavelRequest;
import lombok.Data;

@Data
public class PacienteResponsavelRequest {
    private PacienteRequest pacienteRequest;
    private ResponsavelRequest responsavelRequest;
}
