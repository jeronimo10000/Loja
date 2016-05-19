package br.com.consultorio.model;

public class Paciente {
	private long id;
	private String nome;
	private String rg;
	private String cpf;

	private SexoType sexo;

	private Endereco endereco;

	private Contato contato;

	public Paciente(long id, String nome, String rg, String cpf, SexoType sexo, Endereco endereco, Contato contato) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		this.endereco = endereco;
		this.contato = contato;
	}

	public Paciente(String nome, String rg, String cpf) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
