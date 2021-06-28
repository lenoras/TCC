package pessoa;

public class Nome {
	private int id;
	private String descricao;
	private int idMae;
	public Nome(int id, String descricao, int idMae) {
		this.id = id;
		this.descricao = descricao;
		this.idMae = idMae;
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
	public int getIdMae() {
		return idMae;
	}
	public void setIdMae(int idMae) {
		this.idMae = idMae;
	}
	

}
