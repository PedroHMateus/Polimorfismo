import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professora p3 = new Professora();
		Funcionário p4 = new Funcionário();
	
	
	

	
		try {
			System.out.println("Informe seu nome:");
		p2.setNome(new Scanner(System.in).nextLine());
	
	System.out.println("Informe sua idade:");
		p2.setIdade(new Scanner(System.in).nextInt());
	
	System.out.println("Informe seu genero:");
		p2.setGenero(new Scanner(System.in).nextLine());
	
	System.out.println("Cadastro do Aluno:"
				
			+ "\nidade:"+p2.getNome()
			+ "\nnome:"+p2.getIdade()
			+ "\nGenero:"+p2.getGenero());
		
		System.out.println("Deseja cancelar ? Digite 1 para sim e 2 para nao:");
			int opcao = scanf.nextInt();
		if(opcao==1) {
			System.out.println("Matricula cancelada com sucesso !");
		}
		else if (opcao==0){
			System.out.println("Matricula realizada com sucesso !");
		}	
		}
		
		catch(Exception e) //Neste bloco é descrita a ação que ocorrerá quando a exceção for capturada.
		{
			System.out.println("O sistema sobrecarregou, tente novamente !");
		}
			
		finally {
			System.out.println("Muito obrigado pela preferencia !");
		}
	
	
	
	
	
	
	
	
	}
}
