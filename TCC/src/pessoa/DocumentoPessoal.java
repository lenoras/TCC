package pessoa;
import documento.Data;
import documento.Acesso;


public class DocumentoPessoal {
	private int id;
	private String numero;
	private int tipoDocumento;
	private String emissor;
	private Data dtEmissao;
	private Acesso nivelAcesso;
	public DocumentoPessoal(int id, String numero, int tipoDocumento, String emissor, Data dtEmissao,
			Acesso nivelAcesso) {
		this.id = id;
		this.numero = numero;
		this.tipoDocumento = tipoDocumento;
		this.emissor = emissor;
		this.dtEmissao = dtEmissao;
		this.nivelAcesso = nivelAcesso;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getEmissor() {
		return emissor;
	}
	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}
	public Data getDtEmissao() {
		return dtEmissao;
	}
	public void setDtEmissao(Data dtEmissao) {
		this.dtEmissao = dtEmissao;
	}
	public Acesso getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(Acesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
	
}
