package br.com.consultorio.jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;

import br.com.consultorio.jdbc.ConnectionFactory;
import br.com.consultorio.model.Paciente;

public class PacienteDao {

	private Connection connection;

	public PacienteDao() {
		this.connection = new ConnectionFactory().getConnection();
	}


public void adicionar(Paciente paciente){
	String sql = "insert into paciente " +
			"(nome,rg,cpf)" +
			" values (?,?,?)";
	try {
		// prepared statement para inserção
		PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		
		// seta os valores
		stmt.setString(1,paciente.getNome());
		stmt.setString(2,paciente.getRg());
		stmt.setString(3,paciente.getCpf());
		//stmt.setString(4,paciente.getSexo());
		
		// executa
		stmt.execute();
		stmt.close();
		} catch (SQLException e) {
		throw new RuntimeException(e);
		}
}
}
