
public class SistemaBiblioteca {
	public static void main(String[] args) {
		Livro l1, l2, l3, l4, l5;
		
		l1 = new Livro();
		l2 = new Livro();
		l3 = new Livro();
		l4 = new Livro();
		l5 = new Livro();
		
		l1.setTitulo("Livro Java 1");
		l1.setAutor("Marcia 1");
		l1.setCategoria("Inovacao");
		l1.setEstante(1);
		l1.setPrateleira(1);
		l1.setAno(2001);
		l1.setDevolver();
		
		l2.setTitulo("Livro Java 2");
		l2.setAutor("Marcia 2");
		l2.setCategoria("Inovacao");
		l2.setEstante(1);
		l2.setPrateleira(2);
		l2.setAno(2002);
		l2.setDevolver();

		l3.setTitulo("Livro Java 3");
		l3.setAutor("Marcia 3");
		l3.setCategoria("Inovacao");
		l3.setEstante(1);
		l3.setPrateleira(3);
		l3.setAno(2003);
		l3.setDevolver();

		l4.setTitulo("Livro Java 4");
		l4.setAutor("Marcia 4");
		l4.setCategoria("Inovacao");
		l4.setEstante(1);
		l4.setPrateleira(4);
		l4.setAno(2004);
		l4.setDevolver();

		l5.setTitulo("Livro Java 5");
		l5.setAutor("Marcia 5");
		l5.setCategoria("Inovacao");
		l5.setEstante(1);
		l5.setPrateleira(5);
		l5.setAno(2005);
		l5.setEmprestar();
	
		l1.exibirLivro();
		l2.exibirLivro();
		l3.exibirLivro();
		l4.exibirLivro();
		l5.exibirLivro();
	}

}
