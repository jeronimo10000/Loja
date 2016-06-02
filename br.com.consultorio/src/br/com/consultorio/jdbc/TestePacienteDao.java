package br.com.consultorio.jdbc;

import java.util.Scanner;

import br.com.consultorio.jdbc.dao.PacienteDao;
import br.com.consultorio.model.Paciente;

public class TestePacienteDao {

	public static void main(String[] args) {
		
//		Scanner gravar = new Scanner(System.in);
//		
//		System.out.println("Cadastro de Paciente");
//		System.out.println("Nome do Paciente: ");
//		String nome = gravar.nextLine();
//		System.out.println("Rg: ");
//		String rg = gravar.nextLine();
//		System.out.println("CPF: ");
//		String cpf = gravar.nextLine();
//		System.out.println("Sexo: ");
//		String sexo = gravar.nextLine();
//		
//		// pronto para gravar
//		Paciente paciente = new Paciente();
//		paciente.setId(0);
//		paciente.setNome(nome);
//		paciente.setRg(rg);
//		paciente.setCpf(cpf);
//		paciente.setSexo(sexo);
//
//		// grave nessa conexão!!!
//		PacienteDao dao = new PacienteDao();
//
//		// método elegante
//		dao.adiciona(paciente);
//
//		System.out.println("Gravado!");
		
//		Scanner atualizar = new Scanner(System.in);
//		
//		System.out.println("Atualizar Dados do Paciente!");
//		System.out.println("Nome: ");
//		String nome = atualizar.nextLine();
//		System.out.println("Rg: ");
//		String rg = atualizar.nextLine();
//		System.out.println("CPF: ");
//		String cpf = atualizar.nextLine();
//		System.out.println("Sexo: ");
//		String sexo = atualizar.nextLine();
//		System.out.println("Código do Paciente: ");
//		int id = atualizar.nextInt();
//		
//		//pronto para atualizar
//		
//		Paciente paciente = new Paciente();
//		paciente.setId(1);
//		paciente.setNome(nome);
//		paciente.setRg(rg);
//		paciente.setCpf(cpf);
//		paciente.setSexo(sexo);
//		paciente.setId(id);
//		
//		PacienteDao dao1 = new PacienteDao();
//		dao1.atualiza(paciente);
//		
//		System.out.println("Atulizado!");
		
		Scanner remover = new Scanner(System.in);
		
		System.out.println("Remover Paciente!");
		System.out.println("Digite o código do Paciente: ");
		int cod = remover.nextInt();
		
		//pronto para remover
		Paciente pacienteR = new Paciente();
		pacienteR.setId(cod);
		
		PacienteDao daoR = new PacienteDao();
		daoR.remover(pacienteR);
		
		System.out.println("Removido!");

	}
}
