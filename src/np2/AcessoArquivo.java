package np2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AcessoArquivo {
	public static void gravar(String[] args) {		
		File arquivo = new File("D:/Desenvolvimento/eclipse_códigos/EmprestimosNp2/src/arquivo.txt");

		try {
			if (!arquivo.exists()){
				arquivo.createNewFile();
			}        
			//Escreve o aqruivo.
			FileWriter fw = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter (fw);
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader (fr);
			
			//conta quantas linhas tem para continuar o índice
			int qtd2 = 0;
			while (br.ready()){
				String linha = br.readLine();
				qtd2 = qtd2 + 1;
			}
			
			//Escreve as variáveis
			bw.write("\t\n"+"Item"+qtd2 + " | Objeto " + Emprestimos.getNomeObj() + " | Pessoa: " + Emprestimos.getNomePessoa() +
					" | Telefone: " +Emprestimos.getContato()+ " |Tipo: " + Emprestimos.getTipoObj() +
					"| Dia : " +Emprestimos.getDiaEmprestimo()+ " | Devolução: " + Emprestimos.getDiaDevolucao() +
					"| Descrição: " + Emprestimos.getDescricao());
			//bw.newLine();
			bw.close();
			fw.close();
			br.close();
			fr.close();
			
		}catch (IOException ex) {
			Logger.getLogger(AcessoArquivo.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public static void ler(String[] args) {
		File arquivo = new File("D:/Desenvolvimento/eclipse_códigos/EmprestimosNp2/src/arquivo.txt");

		//Faz a leitura
		try {if (!arquivo.exists()){
			arquivo.createNewFile();
		}            
		} catch (IOException ex) {
			Logger.getLogger(AcessoArquivo.class.getName()).log(Level.SEVERE, null, ex);
		}

		try {
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader (fr);

			// enquanto houver linhas Adiciona as elas nas variáveis

			while(br.ready()){
				String linha = br.readLine();
				System.out.println(linha);
			}
			br.close();
			fr.close();
		}catch (FileNotFoundException ex) {
			System.out.println("Não foram adicionados itens ainda!");
			Logger.getLogger(AcessoArquivo.class.getName()).log(Level.SEVERE, null, ex);
		}catch (IOException ex) {
			Logger.getLogger(AcessoArquivo.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public static void Alterar(String[] args) {
		File arquivo = new File("D:/Desenvolvimento/eclipse_códigos/EmprestimosNp2/src/arquivo.txt");

		//Faz a leitura

		try {
			if (!arquivo.exists()){
				arquivo.createNewFile();
			}
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader (fr);
			FileWriter fw = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter (fw);

			Scanner entrada = new Scanner(System.in);
			Emprestimos e = new Emprestimos();
			AcessoArquivo acesso = new AcessoArquivo();
			Repositorio repositorio = new Repositorio();
			String opt, opt2;
			String nomeObj, nomePessoa, contato, tipoObj,diaEmprestimo,
			diaDevolucao, descricao; // variáveis para novas informações

			//Armazena as novas informações
			System.out.println("Digite o número correspondente ao item para modificar: ");
			System.out.println("--------------------------------------");
			AcessoArquivo.ler(args);
			System.out.println("--------------------------------------");
			opt2=entrada.next();//Lê qual linha deseja modificar
			System.out.println("");
			System.out.println("Você escolheu o Item"+opt2);
			System.out.println("Objeto para empréstimo: ");
			nomeObj=entrada.next();
			System.out.println("Insira o nome da pessoa: ");
			nomePessoa=entrada.next();
			System.out.println("Insira o contato: ");
			contato=entrada.next();
			System.out.println("Tipo de objeto: ");
			tipoObj=entrada.next();
			System.out.println("Insira dia do emprestimo ");
			diaEmprestimo=entrada.next();
			System.out.println("Insira o dia de devolução: ");
			diaDevolucao=entrada.next();
			System.out.println("Insira uma descrição - Anterior: ");
			descricao=entrada.next();
			System.out.println("");

			String novoConteudo = ""; //Variável para receber todas as linhas do existentes

			while (br.ready()){
				String linha = br.readLine();

				//Lê todas as linhas do texto e adiciona a nova
				if (linha.contains("Item"+opt2)) {
					linha = "Item"+opt2+ " | Objeto: " + nomeObj + " | Pessoa: " + nomePessoa +
							" | Telefone: " +contato + " |Tipo: " + tipoObj+
							"| Dia : " +diaEmprestimo+" | Devolução: " + 
							diaDevolucao + "| Descrição: " + descricao;
				}
				//Aramazena o conteúdo com quebra de linha
				novoConteudo += linha + "\t\n";
			}

			// apaga o conteudo do arquivo...

			BufferedWriter clean = new BufferedWriter(new FileWriter(arquivo));
			clean.write("");
			clean.close();


			// escreve novoConteudo no arquivo
			//bw.newLine();
			bw.write(novoConteudo);

			//bw.newLine();
			bw.close();
			fr.close();        
			br.close();




		}catch (FileNotFoundException ex) {
			System.out.println("Não foram adicionados itens ainda!");
			Logger.getLogger(AcessoArquivo.class.getName()).log(Level.SEVERE, null, ex);
		}catch (IOException ex) {
			Logger.getLogger(AcessoArquivo.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public static void Apagar(String[] args) throws IOException {
		File arquivo = new File("D:/Desenvolvimento/eclipse_códigos/EmprestimosNp2/src/arquivo.txt");

		// apaga o conteudo do arquivo...

		BufferedWriter apagar = new BufferedWriter(new FileWriter(arquivo));
		apagar.write("");
		apagar.close();
	}

}
