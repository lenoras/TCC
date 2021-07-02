package documento;

import java.util.Date;

public class Exame extends Documento {
	private int tipoExame;
	private String resultado;
	private String parametro;
	public Exame(int id, int codigoTipo, Date dataCriacao, int tipoExame, String resultado, String parametro) {
		super(id, codigoTipo, dataCriacao);
		this.tipoExame = tipoExame;
		this.resultado = resultado;
		this.parametro = parametro;
	}
	public int getTipoExame() {
		return tipoExame;
	}
	public void setTipoExame(int tipoExame) {
		this.tipoExame = tipoExame;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public String getParametro() {
		return parametro;
	}
	public void setParametro(String parametro) {
		this.parametro = parametro;
	}
	
}
