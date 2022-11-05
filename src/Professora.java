
public class Professora extends Pessoa {
	public String disciplina;
	public float salario;
	
	public void receberAumento(float aumento) {
		this.salario+=aumento;
	}
	
	
	public String getDisciplina() {
		return disciplina;
	}
	
	
	public void setDisciplina (String disciplina) {
		this.disciplina=disciplina;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario=salario;
	}
}
