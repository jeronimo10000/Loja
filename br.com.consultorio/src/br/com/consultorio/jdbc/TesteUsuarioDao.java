package br.com.consultorio.jdbc;

import java.util.Scanner;

import br.com.consultorio.jdbc.dao.PacienteDao;
import br.com.consultorio.model.Paciente;

public class TesteUsuarioDao {

	public static void main(String[] args) {
		
		Scanner gravar = new Scanner(System.in);
		
		System.out.println("Cadastro de Paciente");
		System.out.println("Nome do Paciente: ");
		String nome = gravar.nextLine();
		System.out.println("Rg: ");
		String rg = gravar.nextLine();
		System.out.println("CPF: ");
		String cpf = gravar.nextLine();
		System.out.println("Sexo: ");
		String sexo = gravar.nextLine();
		
		// pronto para gravar
		Paciente paciente = new Paciente();
		paciente.setId(0);
		paciente.setNome(nome);
		paciente.setRg(rg);
		paciente.setCpf(cpf);
		paciente.setSexo(sexo);

		// grave nessa conexão!!!
		PacienteDao dao = new PacienteDao();

		// método elegante
		dao.adiciona(paciente);

		System.out.println("Gravado!");
		
//		Paciente paciente2 = new Paciente();
//		paciente2.setId(1);
//		paciente2.setNome("Mago");
//		paciente2.setRg("3365897");
//		paciente2.setCpf("523.689.564-58");
//		paciente2.setSexo("Masculino");
//		paciente2.setId(1);
//		
//		PacienteDao dao1 = new PacienteDao();
//		
//		dao1.atualiza(paciente2);
//		
//		System.out.println("Atulizado!");

	}
}
