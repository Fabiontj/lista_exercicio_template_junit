package org.listaalgoritmos.template;



public class RespostaListaExercicio {
	
	/*
	 * Utilize apenas o método main para testar a implementação dos métodos. 
	 * Não se faz necessário implementar dentro do escopo do método.
	 */
	public static void main(String[] args) {
		
		
	
	}	
	/**
	 * Método deve calcular o IMC utilizando peso e altura. Como resultado
	 * o método deve retornar uma variável resultado do tipo float.
	 * @param peso
	 * @param altura
	 * @return resultado
	 */
	public static float calcularImc(float peso, float altura) 
	{
		float resultado = (peso / (altura * altura));
		return resultado;
	}
	
	/**
	 * Método deve calcular a área do trapézio independente da unidade de medida.
	 * Como resultado, o método deve retornar a área calculada.
	 * @param baseMaior
	 * @param baseMenor
	 * @param altura
	 * @return areaTrapezio
	 */
	public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) 
	{	
		float areaTrapezio = (((baseMaior + baseMenor) * altura) / 2);
		return areaTrapezio;
	}
	
	/**
	 * O método deve calcular o maior entre dois inteiros, que são fornecidos
	 * como argumento do método. O retorno deve ser o maior valor dado
	 * como entrada, sendo do tipo inteiro.
	 * @param a
	 * @param b
	 * @return maiorValor
	 */
	public static int maiorEntreDoisInteiros(int a, int b) 
	{
	    int	maiorValor = 0;
	    
	    if(a > b) {
	    	maiorValor = a;
	    }else {
	    	maiorValor = b;
	    }
	    
		return maiorValor;
	}
	
	/**
	 * Método verifica se o número apresentado como argumento é ímpar ou par.
	 * caso seja par, o retorno do método deve ser verdadeiro. Caso contrário,
	 * o valor retornado deve ser falso.
	 * @param numero
	 * @return condicao
	 */
	public static boolean verificarParImpar(int numero) 
	{
		
		if(numero % 2 == 0) {
			return true;
		}else {
			return false;
		}
				
	}
	
	/**
	 * Método calcula a média aritmetica dos elementos float a partir de um array. 
	 * O retorno deve ser o resultado do cálculo da média.
	 * @param notas
	 * @return media
	 */
	public static float calcularMediaNotas(float[] notas) {
		
		float soma = 0f;
			
		for(var i = 0; i < notas.length; i++) {
			soma += notas[i];	
		}
			return soma / notas.length;
	}
	
	/**
	 * Método imprime array de inteiros no sentido inverso, separando os elementos por vírgula.
	 * O último elemento impresso não deve preceder vírgula. Use o System.out.print() para imprimir os valores.
	 * Os elementos devem ser impresso numa única linha.
	 * @param array
	 */
	public static void imprimirArrayInverso(int[] array)
	{
		
		    for (int i = array.length - 1; i >= 0; i--) {
		       
		    	if(i == 0){
		    		
		    		System.out.print(array[i]);
		    		
		    	}else if (i != 0){
		    		
		    			System.out.print(array[i] + ",");
		        }
		    }
		}
	
	/**
	 * Método deve imprimir os elementos primos de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPrimos(int[] array)
	{
		for(int i = 0; i < array.length; i++) {
	        if(array[i] <= 1) {
	            continue;
	        }
	        boolean primo = true;
	        if(array[i] == 2) {
	            primo = true;
	        } else {
	            for(int j = 2; j <= Math.sqrt(array[i]); j++) {
	                if(array[i] % j == 0) {
	                    primo = false;
	                    break;
	                }
	            }
	        }
	        if(primo) {
	            System.out.print(array[i] + " ");	
	        }
		}
		
	}
	
	/**
	 * Método deve imprimir os elementos ímpares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosImpares(int[] array) 
	{
		//OK
		for(int i = 0; i < array.length; i ++) {
			if(array[i] % 2 != 0) {
				
				System.out.print(array[i] + " ");
			}
			
		}
	}
	
	
	/**
	 * Método deve imprimir os elementos pares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPares(int[] array) {

		//OK
		for (int i = 0; i < array.length; i++) {
		        if (array[i] % 2 == 0) {
		            System.out.print(array[i] + " ");
		        }
		    }
		    
		}
	
	
	/**
	 * Método deve imprimir o maior e o menor elemento de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirMaiorMenorElemento(int[] array) 
	{	    
		
		//OK
		int maior = array[0];
		int menor = array[0];
		
			for(int i = 0; i < array.length; i++){
				if(array[i] > maior) {
					maior = array[i];
				}
				if(array[i] < menor) {
					menor = array[i];
				}
			}
			System.out.print(maior + " " + menor + " ");
		}
	
	/**
	 * O método calcula a média aritmética dos elementos de um array de inteiros. 
	 * Como resultado, o valor da média deve ser retornado no método.
	 * @param array
	 * @return media
	 */
	public static float calcularMediaAritmetica(int[] array) {
		 {
			 //OK
			 
		    int soma = 0;
		    
		    for (int i = 0; i < array.length; i++) {
		        soma += array[i];
		    }
		    
		    return (float) soma / array.length;
		}	
	}
	
}
