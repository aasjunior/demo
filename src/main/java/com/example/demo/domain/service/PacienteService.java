package com.example.demo.domain.service;

import com.example.demo.domain.model.paciente.Paciente;
import com.example.demo.domain.model.paciente.PacienteRequest;
import com.example.demo.domain.model.paciente.PacienteResponse;
import com.example.demo.domain.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PacienteService {
    private final PacienteRepository pacienteRepository;

    public PacienteResponse createPaciente(PacienteRequest request){
        Paciente paciente = Paciente.convert(request);

    }
}
