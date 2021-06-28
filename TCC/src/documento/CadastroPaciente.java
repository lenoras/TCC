package documento;

import java.util.Date;

import pessoa.Nome;
import pessoa.DocumentoPessoal;
import pessoa.Raca;
import pessoa.Sexo;
import pessoa.Telefone;

public class CadastroPaciente {
	private int id;
	private Nome nome;
	private DocumentoPessoal cpf;
	private DocumentoPessoal identidade;
	private Nome nomeMae;
	private Date dtNascimento;
	private Raca raca;
	private Sexo sexo;
	private Telefone telefoneContato;
	private Telefone whattsApp;
	public CadastroPaciente(int id, Nome nome, DocumentoPessoal cpf,
			DocumentoPessoal identidade, Nome nomeMae, Date dtNascimento, Raca raca, Sexo sexo,
			Telefone telefoneContato, Telefone whattsApp) {
		this.id= id;
		this.nome = nome;
		this.cpf = cpf;
		this.identidade = identidade;
		this.nomeMae = nomeMae;
		this.dtNascimento = dtNascimento;
		this.raca = raca;
		this.sexo = sexo;
		this.telefoneContato = telefoneContato;
		this.whattsApp = whattsApp;
	}
	public Nome getNome() {
		return nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(Nome nome) {
		this.nome = nome;
	}
	public DocumentoPessoal getCpf() {
		return cpf;
	}
	public void setCpf(DocumentoPessoal cpf) {
		this.cpf = cpf;
	}
	public DocumentoPessoal getIdentidade() {
		return identidade;
	}
	public void setIdentidade(DocumentoPessoal identidade) {
		this.identidade = identidade;
	}
	public Nome getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(Nome nomeMae) {
		this.nomeMae = nomeMae;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public Raca getRaca() {
		return raca;
	}
	public void setRaca(Raca raca) {
		this.raca = raca;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Telefone getTelefoneContato() {
		return telefoneContato;
	}
	public void setTelefoneContato(Telefone telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	public Telefone getWhattsApp() {
		return whattsApp;
	}
	public void setWhattsApp(Telefone whattsApp) {
		this.whattsApp = whattsApp;
	}
	
	
	

}
