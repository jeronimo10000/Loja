package br.com.consultorio.jdbc;

import br.com.consultorio.jdbc.dao.PacienteDao;
import br.com.consultorio.model.Paciente;

public class TesteUsuarioDao {

	public static void main(String[] args) {
//		// pronto para gravar
//		Paciente paciente = new Paciente();
//		paciente.setId(2);
//		paciente.setNome("Mago");
//		paciente.setRg("3302589");
//		paciente.setCpf("021.258.365-01");
//		paciente.setSexo("Masculino");
//
//		// grave nessa conexão!!!
//		PacienteDao dao = new PacienteDao();
//
//		// método elegante
//		dao.adiciona(paciente);
//
//		System.out.println("Gravado!");
		
		Paciente paciente2 = new Paciente();
		paciente2.setId(2);
		paciente2.setNome("Jeronimo");
		paciente2.setRg("33044789");
		paciente2.setCpf("025.256.356-89");
		paciente2.setSexo("Masculino");
		paciente2.setId(2);
		
		PacienteDao dao1 = new PacienteDao();
		
		dao1.atualiza(paciente2);
		
		System.out.println("Atulizado!");

	}
}
