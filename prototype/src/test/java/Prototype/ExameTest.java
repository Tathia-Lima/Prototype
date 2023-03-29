package Prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExameTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Endereco endereco = new Endereco("Rua A", 31, "Juiz de Fora");
        Exame exame = new Exame(123, "Paciente Original", "Convênio Original", "Especialidade Médico Original", 789, "Médico Original", endereco);

        Exame exameClone = exame.clone();
        exameClone.setCodExame(321);
        exameClone.setNomePaciente("Paciente Clonado");
        exameClone.setConvenio("Convênio Clonado");
        exameClone.setEspecialidadeMedico("Especialidade Médico Clonado");
        exameClone.setCrmMedico(2023);
        exameClone.setNomeMedico("Médico Clonado");
        exameClone.getEndereco().setNumero(53);

        assertEquals("Exame{codExame=123, nomePaciente='Paciente Original', convenio='Convênio Original', especialidadeMedico='Especialidade Médico Original', crmMedico=789, nomeMedico='Médico Original', endereco=Endereco{logradouro='Rua A', numero=31, cidade='Juiz de Fora'}}", exame.toString());
        assertEquals("Exame{codExame=321, nomePaciente='Paciente Clonado', convenio='Convênio Clonado', especialidadeMedico='Especialidade Médico Clonado', crmMedico=2023, nomeMedico='Médico Clonado', endereco=Endereco{logradouro='Rua A', numero=53, cidade='Juiz de Fora'}}", exameClone.toString());
    }
}