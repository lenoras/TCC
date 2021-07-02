package documento;
import java.util.Date;

public class Documento {
	private int id;
	private int codigoTipo;
	private Date dataCriacao;
	public Documento(int id, int codigoTipo, Date dataCriacao) {
		this.id = id;
		this.codigoTipo = codigoTipo;
		this.dataCriacao = dataCriacao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodigoTipo() {
		return codigoTipo;
	}
	public void setCodigoTipo(int codigoTipo) {
		this.codigoTipo = codigoTipo;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	
	
}
