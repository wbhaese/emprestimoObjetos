package np2;
import java.util.Scanner;

public class Emprestimos {
	
	Scanner entrada = new Scanner(System.in);
	private static String nomeObj;
	private static String nomePessoa;
	private static String contato;
	private static String tipoObj;
	private static String diaEmprestimo;
	private static String diaDevolucao;
	private static String descricao;
	String opt = "S";
	
	public static String getNomeObj() {
		return nomeObj;
	}
	public void setNomeObj(String nomeObj) {
		this.nomeObj = nomeObj;
	}
	public static String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public static String getContato() {
		return contato;
	}
	public  void setContato(String contato) {
		this.contato = contato;
	}
	public static String getTipoObj() {
		return tipoObj;
	}
	public void setTipoObj(String tipoObj) {
		this.tipoObj = tipoObj;
	}
	public static String getDiaEmprestimo() {
		return diaEmprestimo;
	}
	public void setDiaEmprestimo(String diaEmprestimo) {
		this.diaEmprestimo = diaEmprestimo;
	}
	public static String getDiaDevolucao() {
		return diaDevolucao;
	}
	public void setDiaDevolucao(String diaDevelucao) {
		this.diaDevolucao = diaDevelucao;
	}
	public static String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
