package np2;
import java.io.IOException;
import java.util.*;
//import Emprestimos;

public class Principal {
	
	static Scanner scanner;

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		Emprestimos e = new Emprestimos();
		AcessoArquivo acesso = new AcessoArquivo();
		Repositorio repositorio = new Repositorio();
		String opt;

		System.out.println("PARA QUEM EMPRESTEI?");
		System.out.println("*******************************");
		System.out.println("");

		scanner = new Scanner(System.in);

		while (true) {
			//Chama o menu
			Repositorio.Menu(args);

			int Option = scanner.nextInt();

			if (Option == 5) {
				System.out.println("Sistema finalizado.");
				break;
			}
			
			switch (Option) {
			
			case 1:	
				//Cadastrar Usuário
				Repositorio.AddEmprestimo(args);				
				break;

			case 2:
				// Alterar
				AcessoArquivo.Alterar(args);
				break;

			case 3:
				// Excluir tudo
				int decisao = 0;
				System.out.println("Deseja excluir tudo? S= 1 / N=0");
				decisao=entrada.nextInt();
				if(decisao == 1) {
					AcessoArquivo.Apagar(args);
					System.out.println("Seus arquivos foram excluídos.");
				}
				break;

			case 4:
				// Exibir Empréstimo
				AcessoArquivo.ler(args);
				break;

			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
			
			
		}

		//scanner.close();
	}

		


