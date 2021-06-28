package pessoa;

public class Telefone {
	private int id;
	private int numero;
	private int tipo;
	public Telefone(int id, int numero, int tipo) {
		this.id = id;
		this.numero = numero;
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	

}
