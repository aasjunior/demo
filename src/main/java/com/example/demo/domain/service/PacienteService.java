package com.example.demo.domain.service;

import com.example.demo.domain.model.paciente.Paciente;
import com.example.demo.domain.model.paciente.PacienteRequest;
import com.example.demo.domain.model.paciente.PacienteResponse;
import com.example.demo.domain.model.pacienteresponsavel.PacienteResponsavel;
import com.example.demo.domain.model.responsavel.Responsavel;
import com.example.demo.domain.model.responsavel.ResponsavelRequest;
import com.example.demo.domain.repository.PacienteRepository;
import com.example.demo.domain.repository.ResponsavelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class PacienteService {
    private final PacienteRepository pacienteRepository;
    private final ResponsavelRepository responsavelRepository;

    public PacienteResponse createPaciente(PacienteRequest pacienteRequest, ResponsavelRequest responsavelRequest){
        Paciente paciente = Paciente.convert(pacienteRequest);
        Responsavel responsavel = Responsavel.convert(responsavelRequest);

        // Salve as entidades Paciente e Responsavel primeiro
        Paciente savedPaciente = pacienteRepository.save(paciente);
        Responsavel savedResponsavel = responsavelRepository.save(responsavel);

        // Crie a relação PacienteResponsavel
        PacienteResponsavel pacienteResponsavel = new PacienteResponsavel();
        pacienteResponsavel.setPaciente(savedPaciente);
        pacienteResponsavel.setResponsavel(savedResponsavel);

        // Adicione a relação às entidades salvas
        savedPaciente.getPacienteResponsavel().add(pacienteResponsavel);
        savedResponsavel.getPacienteResponsavel().add(pacienteResponsavel);

        return PacienteResponse.convert(savedPaciente);
    }
}
