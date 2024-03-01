package com.example.demo.domain.model.paciente;

public record PacienteResponse(
        Long id,
        String nome,
        String sobrenome
) {
    public static PacienteResponse convert(Paciente paciente){
        return new PacienteResponse(
                paciente.getId(),
                paciente.getNome(),
                paciente.getSobrenome()
        );
    }
}
