
public class Pessoa {
	public String nome, genero;
	public int idade;
	
	public void fazeraniversario(){
		this.idade ++;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade=idade;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero=genero;
	}
}
