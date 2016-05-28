package br.com.consultorio.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Paciente> getLista(){
		
		try {
			List<Paciente> pacientes = new ArrayList<Paciente>();
			PreparedStatement stmt = this.connection.
					prepareStatement("select * from paciente");
			ResultSet resultado = stmt.executeQuery();
					
			while (resultado.next()) {
				// criando o objeto Paciente
				Paciente paciente = new Paciente();
				paciente.setId(resultado.getLong("id"));
				paciente.setNome(resultado.getString("nome"));
				paciente.setRg(resultado.getString("rg"));
				paciente.setCpf(resultado.getString("cpf"));
				paciente.setSexo(resultado.getString("sexo"));
				
				// adicionando o objeto à lista
				pacientes.add(paciente);
			
			}
			resultado.close();
			stmt.close();
			return pacientes;
			}catch (SQLException e) {
				throw new RuntimeException(e);
			}
	}
}
