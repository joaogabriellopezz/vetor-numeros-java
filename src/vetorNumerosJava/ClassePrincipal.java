package vetorNumerosJava;

import javax.swing.JOptionPane;

public class ClassePrincipal {

	public static void main(String[] args) {
	
		int numeros [] = new int[5];
		
		 ClasseMetodos metodos = new ClasseMetodos();
		 
		 for(int x = 0; x < 5; x++) {
			String texto = JOptionPane.showInputDialog("Digite o " + (x + 1) + "° número inteiro: ");
			 numeros[x] = Integer.parseInt(texto);
		 }
		 
		 int maiorPar = metodos.acharMaiorPar(numeros);
		 
		 int menorImpar = metodos.acharMenorImpar(numeros);
	     
		 int soma = metodos.somarTudo(numeros);
	     
		 double media = metodos.calcularMedia(numeros);
	     
		 String resultado = "===== R E S U L T A D O S ===== \n\n";
		 
		 if (maiorPar % 2 != 0) {
	            resultado = resultado + "Maior número par: Nenhum número par foi digitado.\n\n";
	        } else {
	            resultado = resultado + "Maior número par: " + maiorPar + "\n\n";
	        }
		 
		 
		 if (menorImpar % 2 == 0) {
	            resultado = resultado + "Menor número ímpar: Nenhum número ímpar foi digitado.\n\n";
	        } else {
	            resultado = resultado + "Menor número ímpar: " + menorImpar + "\n\n";
	        }
		 
		 resultado = resultado + "Somatório de todos os valores: " + soma + "\n\n";
	     resultado = resultado + "Média de todos os valores: " + media + "\n\n";
	     
	     JOptionPane.showMessageDialog(null, resultado);
		
		
	}

}
