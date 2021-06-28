package documento;
import java.util.Date;

public class Documento {
	private int id;
	private int codigoTipo;
	private Date dataCriacao;
	private int codPaciente;
	public Documento(int id, int codigoTipo, Date dataCriacao, int codPaciente) {
		this.id = id;
		this.codigoTipo = codigoTipo;
		this.dataCriacao = dataCriacao;
		this.codPaciente = codPaciente;
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
	

	public int getCodPaciente() {
		return codPaciente;
	}
	public void setCodPaciente(int codPaciente) {
		this.codPaciente = codPaciente;
	}
}
