class Livro{
	String titulo;
	String autor;
	String editor;
	String ISBN;
	public Livro(){
		/*
-getAuthor: para retornar o autor do livro.
-getBookISBN: para obter o ISBN do livro.*/
	}

	public setBookISBN(String ISBN){
		this.ISBN = ISBN;
	}
	public getAuthor(){
		return this.autor;
	}

	public getBookISBN(){
		return this.ISBN;
	}

	public printDetails(){
		System.out.println("Titulo do livro: "+this.titulo);
		System.out.println("Autor do livro: "+this.autor);
		System.out.println("Editor do livro: "+this.editor);
		System.out.println("ISBN do livro: "+this.ISBN);
	}
}