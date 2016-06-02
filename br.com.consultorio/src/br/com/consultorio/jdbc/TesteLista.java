package br.com.consultorio.jdbc;

import java.util.List;

import br.com.consultorio.jdbc.dao.PacienteDao;
import br.com.consultorio.model.Paciente;

public class TesteLista {

	public static void main(String[] args) {

		PacienteDao dao = new PacienteDao();
		List<Paciente> pacientes = dao.getLista();

		for (Paciente paciente : pacientes) {
			System.out.println("id: " + paciente.getId());
			System.out.println("Nome: " + paciente.getNome());
			System.out.println("rg: " + paciente.getRg());
			System.out.println("cpf: " + paciente.getCpf());
			System.out.println("sexo: " + paciente.getSexo());
			System.out.println("_____________________________");

		}
	}

}
