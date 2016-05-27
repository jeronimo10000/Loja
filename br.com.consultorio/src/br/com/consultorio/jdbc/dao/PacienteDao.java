package br.com.consultorio.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.consultorio.jdbc.ConnectionFactory;
import br.com.consultorio.model.Paciente;

public class PacienteDao {
	
	private Connection connection;
	
	public PacienteDao() {
		this.connection = new ConnectionFactory().getConnection();
		}

	public void adiciona(Paciente paciente) {
		String sql = "insert into paciente " +
		"(id,nome,rg,cpf,sexo)" +
		" values (?,?,?,?,?)";
	
		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta os valores
			stmt.setLong(1,paciente.getId());
			stmt.setString(2,paciente.getNome());
			stmt.setString(3,paciente.getRg());
			stmt.setString(4, paciente.getCpf());
			stmt.setString(5, paciente.getSexo());
			
			// executa
			stmt.execute();
			stmt.close();
			} catch (SQLException e) {
			throw new RuntimeException(e);
			}
		
	}
	/*
	public static void main(String[] args) throws SQLException {
		
		// conectando
		Connection connection = new ConnectionFactory().getConnection();
		// cria um preparedStatement
		String sql = "insert into paciente" +
		" (id,nome,rg,cpf,sexo)" +
		" values (?,?,?,?,?)";
		java.sql.PreparedStatement stmt = connection.prepareStatement(sql);
		// preenche os valores
		stmt.setLong(1, 1);
		stmt.setString(2, "jeronimo");
		stmt.setString(3, "33256897");
		stmt.setString(4, "25689715");
		stmt.setString(5, "Masculino");
		//stmt.setString(6, "Maria Honorato");
		// executa
		stmt.execute();
		stmt.close();
		System.out.println("Gravado!");
		connection.close();
		
		
		}
		*/
}
