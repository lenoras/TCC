package pessoa;

import documento.Acesso;

public class Nome {
	private int id;
	private String descricao;
	private Nome idMae;
	private Acesso nivelAcesso;
	public Nome(int id, String descricao, Nome idMae, Acesso nivelAcesso) {
		this.id = id;
		this.descricao = descricao;
		this.idMae = idMae;
		this.nivelAcesso = nivelAcesso;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Nome getIdMae() {
		return idMae;
	}
	public void setIdMae(Nome idMae) {
		this.idMae = idMae;
	}
	public Acesso getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(Acesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
}
