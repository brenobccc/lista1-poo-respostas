/*
8. Projete uma classe chamada ISBN para representar um Número de Livro Padrão 
Internacional, ou

ISBN para breve. O ISBN consiste em 10 dígitos divididos em 4 partes.
 Por exemplo, o ISBN 0
941831 39 6 representa as seguintes informações:
A primeira parte: O primeiro dígito "0" significa que o livro é 
de um país de língua inglesa.
A segunda parte: "941831" identifica o editor.
A terceira parte: "39" é o número do título do livro.
A quarta parte: "6" é um dígito de verificação para indi
cate que a soma dos dígitos do ISBN é 10.
A classe deve ter um construtor e métodos para definir e obter o ISBN 
como uma String.
*/


public class Isbn {
    int idLingua;//ok
    int idEditor;//atual
    int idTitulo;
    int idIndicate;
	//0 941831 39 6 
    public Isbn(String codeISBN){
    	int i=0, j=0;

    	

    	for(; i<10; i++){
    		if(i==0){
    			this.idLingua = Character.getNumericValue(codeISBN.charAt(i));
    		}else if(i>0 && i <=5){
    			this.idEditor += Character.getNumericValue(codeISBN.charAt(i));
    			j++;
    		}
    	}
    	System.out.println("id Lingua "+this.idLingua);
       // System.out.println(codeISBN.charAt(0));
    	System.out.println("id Lingua "+this.idEditor);
    }
}
