package np2;
import java.util.*;

public class Repositorio {
	
	public static void Menu(String [] args) {
		System.out.println("");
		System.out.println("O que voc� deseja fazer? Escolha um n�mero:");
		System.out.println("");
		System.out.println("1. Cadastrar empr�stimo");
		System.out.println("2. Alterar informa��es do empr�stimo");
		System.out.println("3. Excluir empr�stimos");
		System.out.println("4. Listar todos os empr�stimos");
		System.out.println("5. Sair da aplica��o");
	}
	
	
	public static void AddEmprestimo (String[] args) {
		
			Scanner entrada = new Scanner(System.in);
			Emprestimos e = new Emprestimos();
			AcessoArquivo acesso = new AcessoArquivo();
			String opt;
			
			//Chama os m�todos
		
		   System.out.println("Objeto para empr�stimo: ");
		   e.setNomeObj(entrada.next());
		   System.out.println("Insira o nome da pessoa: ");
		   e.setNomePessoa(entrada.next());
		   System.out.println("Insira o contato: ");
		   e.setContato(entrada.next());
		   System.out.println("Tipo de objeto: ");
		   e.setTipoObj(entrada.next());
		   System.out.println("Insira dia do emprestimo ");
		   e.setDiaEmprestimo(entrada.next());
		   System.out.println("Insira o dia de devolu��o: ");
		   e.setDiaDevolucao(entrada.next());
		   System.out.println("Insira uma descri��o - Anterior: ");
		   e.setDescricao(entrada.next());
		   System.out.println("");
		   AcessoArquivo.gravar(args); // chama o m�todo para gravar o arquivo
		   System.out.println("Novas informa��es adicionadas com sucesso!");
		   System.out.println("");
	}

	/*
	   System.out.println("Nome do Objeto: "+e.getNomeObj());
	   System.out.println("Pessoa "+e.getNomePessoa());
	   System.out.println("Contato "+e.getContato());
	   System.out.println("Tipo de objeto: "+e.getTipoObj());
	   System.out.println("Emprestado em: "+e.getDiaEmprestimo());
	   System.out.println("Dia de devolu��o "+e.getDiaDevolucao());
	   System.out.println("");
	   System.out.println("--------------------------");
	   System.out.println("Pressione Enter para sair.");	   
	   opt = entrada.nextLine();
	  */
}
