package pessoa;

import documento.Acesso;

public class Raca {
	private int id;
	private int descricao;
	private Acesso nivelAcesso;
	public Raca(int id, int descricao,  Acesso nivelAcesso) {
		this.id = id;
		this.descricao = descricao;
		this.nivelAcesso = nivelAcesso;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDescricao() {
		return descricao;
	}
	public void setDescricao(int descricao) {
		this.descricao = descricao;
	}
	
	

}
