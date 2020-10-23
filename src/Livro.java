
public class Livro {
	private String titulo, autor, categoria;
	private int ano, posicaoEstante, posicaoPrateleira;
	private boolean emprestado;

	public void setTitulo(String novoTitulo) {
		titulo = novoTitulo;
	}

	public void setAutor(String novoAutor) {
		autor = novoAutor;
	}

	public void setCategoria(String novaCategoria) {
		categoria = novaCategoria;
	}

	public void setAno(int novoAno) {
		ano = novoAno;
	}

	public void setEstante(int novaEstante) {
		posicaoEstante = novaEstante;
	}

	public void setPrateleira(int novaPrateleira) {
		posicaoPrateleira = novaPrateleira;
	}

	public void setEmprestar() {
		emprestado = true;
	}

	public void setDevolver() {
		emprestado = false;
	}

	public void getEmprestado(boolean novoEmprestado) {
		emprestado = novoEmprestado;
	}

	public void exibirLivro() {
		System.out.println("Livro ---------------------------------------");
		System.out.println("Titulo     : " + titulo);
		System.out.println("Autor      : " + autor);
		System.out.println("Categoria  : " + categoria);
		System.out.println("Ano        : " + ano);
		System.out.println("Posicao    : " + posicaoEstante + "|" + posicaoPrateleira);
		if (emprestado) {
			System.out.println("Livro Emprestado ");
		} else {
			System.out.println("Livro Disponivel ");
		}
	}
}
