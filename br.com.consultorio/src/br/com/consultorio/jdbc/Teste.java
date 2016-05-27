package br.com.consultorio.jdbc;

import br.com.consultorio.jdbc.dao.PacienteDao;
import br.com.consultorio.model.Paciente;

public class Teste {

	public static void main(String[] args) {
		// pronto para gravar
		Paciente paciente = new Paciente();
		paciente.setId(2);
		paciente.setNome("Mago");
		paciente.setRg("3302589");
		paciente.setCpf("021.258.365-01");
		paciente.setSexo("Masculino");

		// grave nessa conexão!!!
		PacienteDao dao = new PacienteDao();

		// método elegante
		dao.adiciona(paciente);

		System.out.println("Gravado!");

	}
}
