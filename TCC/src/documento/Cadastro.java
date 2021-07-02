package documento;

import pessoa.Nome;

import java.util.Date;

import pessoa.DocumentoPessoal;
import pessoa.Raca;
import pessoa.Sexo;
import pessoa.Telefone;

public class Cadastro extends Documento {
	private Nome nome;
	private DocumentoPessoal cpf;
	private DocumentoPessoal identidade;
	private Nome nomeMae;
	private Data dtNascimento;
	private Raca raca;
	private Sexo sexo;
	private Telefone telefoneContato;
	private Telefone whattsApp;
	public Cadastro(int id, int codigoTipo, Date dataCriacao, Nome nome, DocumentoPessoal cpf,
			DocumentoPessoal identidade, Nome nomeMae, Data dtNascimento, Raca raca, Sexo sexo,
			Telefone telefoneContato, Telefone whattsApp) {
		super(id, codigoTipo, dataCriacao);
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
	public Data getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Data dtNascimento) {
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
