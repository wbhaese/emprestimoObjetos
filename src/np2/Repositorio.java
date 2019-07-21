package np2;
import java.util.*;

public class Repositorio {
	
	public static void Menu(String [] args) {
		System.out.println("");
		System.out.println("O que você deseja fazer? Escolha um número:");
		System.out.println("");
		System.out.println("1. Cadastrar empréstimo");
		System.out.println("2. Alterar informações do empréstimo");
		System.out.println("3. Excluir empréstimos");
		System.out.println("4. Listar todos os empréstimos");
		System.out.println("5. Sair da aplicação");
	}
	
	
	public static void AddEmprestimo (String[] args) {
		
			Scanner entrada = new Scanner(System.in);
			Emprestimos e = new Emprestimos();
			AcessoArquivo acesso = new AcessoArquivo();
			String opt;
			
			//Chama os métodos
		
		   System.out.println("Objeto para empréstimo: ");
		   e.setNomeObj(entrada.next());
		   System.out.println("Insira o nome da pessoa: ");
		   e.setNomePessoa(entrada.next());
		   System.out.println("Insira o contato: ");
		   e.setContato(entrada.next());
		   System.out.println("Tipo de objeto: ");
		   e.setTipoObj(entrada.next());
		   System.out.println("Insira dia do emprestimo ");
		   e.setDiaEmprestimo(entrada.next());
		   System.out.println("Insira o dia de devolução: ");
		   e.setDiaDevolucao(entrada.next());
		   System.out.println("Insira uma descrição - Anterior: ");
		   e.setDescricao(entrada.next());
		   System.out.println("");
		   AcessoArquivo.gravar(args); // chama o método para gravar o arquivo
		   System.out.println("Novas informações adicionadas com sucesso!");
		   System.out.println("");
	}

	/*
	   System.out.println("Nome do Objeto: "+e.getNomeObj());
	   System.out.println("Pessoa "+e.getNomePessoa());
	   System.out.println("Contato "+e.getContato());
	   System.out.println("Tipo de objeto: "+e.getTipoObj());
	   System.out.println("Emprestado em: "+e.getDiaEmprestimo());
	   System.out.println("Dia de devolução "+e.getDiaDevolucao());
	   System.out.println("");
	   System.out.println("--------------------------");
	   System.out.println("Pressione Enter para sair.");	   
	   opt = entrada.nextLine();
	  */
}
