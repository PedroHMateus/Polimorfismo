
public class Funcionário extends Pessoa{
	public String setor;
	public boolean trabalhando;
	
	public void mudarTrabalho() {
		this.trabalhando =! trabalhando;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor=setor;
	}
	public boolean getTrabalhando() {
		return trabalhando;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
}

