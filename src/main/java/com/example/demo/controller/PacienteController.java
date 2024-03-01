package com.example.demo.controller;

import com.example.demo.domain.model.paciente.PacienteRequest;
import com.example.demo.domain.model.paciente.PacienteResponse;
import com.example.demo.domain.model.pacienteresponsavel.PacienteResponsavelRequest;
import com.example.demo.domain.model.responsavel.ResponsavelRequest;
import com.example.demo.domain.service.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/paciente")
@RequiredArgsConstructor
public class PacienteController {
    private final PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<PacienteResponse> createPaciente(@RequestBody PacienteResponsavelRequest request){
        PacienteResponse pacienteResponse = pacienteService
                .createPaciente(request.getPacienteRequest(), request.getResponsavelRequest());

        return new ResponseEntity<>(pacienteResponse, HttpStatus.CREATED);
    }
}
