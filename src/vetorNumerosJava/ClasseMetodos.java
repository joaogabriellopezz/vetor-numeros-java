package vetorNumerosJava;

public class ClasseMetodos {
	
	public int acharMaiorPar(int[]vetor) {
		
		int maiorPar = vetor[0];
		
		for(int x = 0; x < vetor.length; x++) {
			
			if(vetor[x] % 2 == 0) {
				
				//necessariamente será par
				
				if(maiorPar % 2 != 0 || vetor[x] > maiorPar) {
					maiorPar = vetor[x];
						
				}
			}
			
		}
			return maiorPar;
		
		
	}
	
	
	public int acharMenorImpar(int[] vetor) {
		
		int menorImpar = vetor[0];
		
		for(int x = 0; x < vetor.length; x++) {
			
			if(vetor[x] % 2 != 0) {
				//necessariamente sera ímpar
				if(menorImpar % 2 == 0 || vetor[x] < menorImpar) {
					menorImpar = vetor[x];
				}
				
			}
			
		}
		return menorImpar;
		
	}
	
	public int somarTudo(int[] vetor) {
		
		int soma = 0;
		
		for(int x = 0; x <vetor.length; x++) {
			
			soma = soma + vetor[x];
			
		}
		return soma;
		
	}
	
	
	public double calcularMedia(int[] vetor) {
		int soma = somarTudo(vetor);
		
		double media = (double) soma / vetor.length;
		
		return media;
		
	}

}
