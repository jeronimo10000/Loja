package br.com.consultorio.model;

public class Dentista {
	private long id;
	private String cro;
	private String nome;
	private String rg;
	private String cpf;

	private Endereco endereco;

	private Contato contato;

	public Dentista() {
		super();
	}

	public Dentista(long id, String cro, String nome, String rg, String cpf, Endereco endereco, Contato contato) {

		this(id, cro, nome, rg, cpf);
		this.endereco = endereco;
		this.contato = contato;
	}

	public Dentista(long id, String cro, String nome, String rg, String cpf) {
		this();
		this.id = id;
		this.cro = cro;
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

	public String getCro() {
		return cro;
	}

	public void setCro(String cro) {
		this.cro = cro;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((cro == null) ? 0 : cro.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dentista other = (Dentista) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (cro == null) {
			if (other.cro != null)
				return false;
		} else if (!cro.equals(other.cro))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dentista [id=").append(id).append(", cro=").append(cro).append(", nome=").append(nome)
				.append(", rg=").append(rg).append(", cpf=").append(cpf).append(", endereco=").append(endereco)
				.append(", contato=").append(contato).append("]");
		return builder.toString();
	}

}
