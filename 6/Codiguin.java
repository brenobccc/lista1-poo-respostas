class Codiguin{
	public static void main(String[] str){
		//i Primeiro construtor padrão

		Estudante student = new Estudante();
		student.numero = "Desconhecido";
		student.nome = "Desconhecido";
		student.pontosTarifarios = 20;
		student.dataNascimento = "1 de Janeiro de 1995";

		//student.dataNascimento = "1 de janeiro de 1995";
		//System.out.println(student.dataNascimento.dia);


		Estudante student2 = new Estudante("4","Maria Cassandra","6 de Abril",21);
		//ii. O segundo leva 4 parâmetros, um para cada uma das variáveis de instância da classe.


	}
}

