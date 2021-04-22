class Estudante{
	public String numero;
	public String nome;
	public String dataNascimento;
	public int pontosTarifarios;

	//primeiro construtor sem parametros.
	Estudante(){
		//null
	}
	//segundo construtor, com parametros.
	Estudante(String number, String name, String birthDate, int tariffPoints){
		this.numero = number;//atribuicao dos atributos
		this.nome = name;
		this.dataNascimento = birthDate;
		this.pontosTarifarios = tariffPoints;
	}

	
}